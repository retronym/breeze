package breeze.linalg.operators
import breeze.generic.{MMRegistry2, Multiproc2}


trait BinaryUpdateOp[A, B, Op<:OpType] {
  def apply(a: A, b: B)
}


object BinaryUpdateOp {
  type Bind[Op <:OpType] = { type Sig[A, B] = BinaryUpdateOp[A, B, Op]}
}


// This trait could reuse code from Multimethod2, but not doing so allows us to reduce code size a lot
// because we don't need BinaryOp's to inherit from Function2, which has a lot of @specialzied cruft.
trait BinaryUpdateRegistry[A<:AnyRef, B, Op<:OpType] extends BinaryUpdateOp[A, B, Op] with MMRegistry2[BinaryUpdateOp[_ <: A, _ <: B, Op]] {
  protected def bindingMissing(a: A, b: B):Unit = throw new UnsupportedOperationException("Types not found!" + a + b + " " + ops)
  protected def multipleOptions(a: A, b: B, m: Map[(Class[_],Class[_]),BinaryUpdateOp[_ <: A, _ <: B, Op]]):Unit = {
    throw new RuntimeException("Multiple bindings for method: " + m)
  }

  def apply(a: A, b: B) {
    val ac = a.asInstanceOf[AnyRef].getClass
    val bc = b.asInstanceOf[AnyRef].getClass

    val cached = cache.get(ac -> bc)
    if(cached != null) {
      cached match {
        case None => bindingMissing(a, b)
        case Some(m) =>
          m.asInstanceOf[BinaryUpdateOp[A, B, Op]].apply(a, b)
      }
    } else {
      val options = resolve(ac, bc.asInstanceOf[Class[_<:B]])
      options.size match {
        case 0 =>
          cache.put(ac -> bc, None)
          bindingMissing(a, b)
        case 1 =>
          val method = options.values.head
          cache.put(ac -> bc, Some(method))
          method.asInstanceOf[BinaryUpdateOp[A, B, Op]].apply(a, b)
        case _ =>
          val selected = selectBestOption(options)
          if(selected.size != 1)
            multipleOptions(a, b, options)
          else {
            val method = selected.values.head
            cache.put(ac -> bc, Some(method))
            method.asInstanceOf[BinaryUpdateOp[A, B, Op]].apply(a, b)
          }
      }
    }
  }

  def register[AA<:A, BB<:B](op: BinaryUpdateOp[AA, BB, Op])(implicit manA: Manifest[AA], manB: Manifest[BB]) {
    super.register(manA.erasure, manB.erasure, op)
  }
}
