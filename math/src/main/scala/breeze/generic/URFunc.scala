package breeze.generic

/**
 * A "Universal Reducer" Function that can support reduction-type operations
 * on a collection or some such.
 * At a minimum, it has to specify the three ops suppled to
 * aggregate. Other implementations may provide more efficient
 * implementations for certain common implementations of vectors and such
 *
 * @author dlwh
 */
trait URFunc[@specialized A, +B] {
  def apply(cc: TraversableOnce[A]):B


  def apply[T](c: T)(implicit urable: UReduceable[T, A]):B = {
    urable(c, this)
  }

  def apply(arr: Array[A]):B = apply(arr, arr.length)
  def apply(arr: Array[A], length: Int):B = apply(arr, length, {_ => true})
  def apply(arr: Array[A], length: Int, isUsed: Int=>Boolean):B = {
    apply(arr.toStream.take(length).zipWithIndex.collect { case (v, i) if isUsed(i) => v})
  }

  def apply(as: A*):B = apply(as)

}

/**
 * An object is UReduceable (Universally Reduceable) if it can
 * deal with URFuncs in an intelligent manner.
 *
 * @author dlwh
 */
trait UReduceable[T, @specialized A] extends {
  def apply[Final](c: T, f: URFunc[A, Final]):Final
}

object UReduceable {
  implicit def traversableIsUReduceable[A, T](implicit ev: T <:< Traversable[A]):UReduceable[T, A] = {
    new UReduceable[T, A] {
      def apply[Final](c: T, f: URFunc[A, Final]) = {
        f(c)
      }
    }
  }

  implicit def arrayIsUReduceable[A]:UReduceable[Array[A], A] = {
    new UReduceable[Array[A], A] {
      def apply[Final](c: Array[A], f: URFunc[A, Final]) = {
        f(c)
      }
    }
  }
}