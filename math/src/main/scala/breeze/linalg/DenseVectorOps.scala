package breeze.linalg
import breeze.linalg.operators._
import breeze.linalg.support._
import breeze.numerics._
/** This is an auto-generated trait providing operators for DenseVector. */
trait DenseVectorOps_Double { this: DenseVector.type =>

  def pureFromUpdate_Double[Other,Op<:OpType](op: BinaryUpdateOp[DenseVector[Double], Other, Op])(implicit copy: CanCopy[DenseVector[Double]]):BinaryOp[DenseVector[Double], Other, Op, DenseVector[Double]] = {
    new BinaryOp[DenseVector[Double], Other, Op, DenseVector[Double]] {
      override def apply(a : DenseVector[Double], b : Other) = {
        val c = copy(a)
        op(c, b)
        c
      }
    }
  }
        

  implicit val canPowInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = scala.math.pow(ad(aoff), bd(boff))
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canPowInto_V_V_Double.register(canPowInto_DV_DV_Double)

  implicit val canPow_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpPow, DenseVector[Double]] = pureFromUpdate_Double(canPowInto_DV_DV_Double)
  Vector.canPow_V_V_Double.register(canPow_DV_DV_Double)


  implicit val canPowInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = scala.math.pow(ad(aoff), b)
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canPowInto_V_S_Double.register(canPowInto_DV_S_Double)

  implicit val canPow_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpPow, DenseVector[Double]] = pureFromUpdate_Double(canPowInto_DV_S_Double)
  Vector.canPow_V_S_Double.register(canPow_DV_S_Double)


  implicit val canPowInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = scala.math.pow(a(i), v)
        }
        
      }
    }
  }

  Vector.canPowInto_V_V_Double.register(canPowInto_DV_V_Double)

  implicit val canPow_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpPow, DenseVector[Double]] = pureFromUpdate_Double(canPowInto_DV_V_Double)
  Vector.canPow_V_V_Double.register(canPow_DV_V_Double)


  implicit val canModInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) % bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canModInto_V_V_Double.register(canModInto_DV_DV_Double)

  implicit val canMod_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpMod, DenseVector[Double]] = pureFromUpdate_Double(canModInto_DV_DV_Double)
  Vector.canMod_V_V_Double.register(canMod_DV_DV_Double)


  implicit val canModInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) % b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canModInto_V_S_Double.register(canModInto_DV_S_Double)

  implicit val canMod_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpMod, DenseVector[Double]] = pureFromUpdate_Double(canModInto_DV_S_Double)
  Vector.canMod_V_S_Double.register(canMod_DV_S_Double)


  implicit val canModInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) % v
        }
        
      }
    }
  }

  Vector.canModInto_V_V_Double.register(canModInto_DV_V_Double)

  implicit val canMod_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpMod, DenseVector[Double]] = pureFromUpdate_Double(canModInto_DV_V_Double)
  Vector.canMod_V_V_Double.register(canMod_DV_V_Double)


  implicit val canSetInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSetInto_V_V_Double.register(canSetInto_DV_DV_Double)

  implicit val canSet_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpSet, DenseVector[Double]] = pureFromUpdate_Double(canSetInto_DV_DV_Double)
  Vector.canSet_V_V_Double.register(canSet_DV_DV_Double)


  implicit val canSetInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSetInto_V_S_Double.register(canSetInto_DV_S_Double)

  implicit val canSet_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpSet, DenseVector[Double]] = pureFromUpdate_Double(canSetInto_DV_S_Double)
  Vector.canSet_V_S_Double.register(canSet_DV_S_Double)


  implicit val canSetInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = v
        }
        
      }
    }
  }

  Vector.canSetInto_V_V_Double.register(canSetInto_DV_V_Double)

  implicit val canSet_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpSet, DenseVector[Double]] = pureFromUpdate_Double(canSetInto_DV_V_Double)
  Vector.canSet_V_V_Double.register(canSet_DV_V_Double)


  implicit val canSubInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) - bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSubInto_V_V_Double.register(canSubInto_DV_DV_Double)

  implicit val canSub_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpSub, DenseVector[Double]] = pureFromUpdate_Double(canSubInto_DV_DV_Double)
  Vector.canSub_V_V_Double.register(canSub_DV_DV_Double)


  implicit val canSubInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) - b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSubInto_V_S_Double.register(canSubInto_DV_S_Double)

  implicit val canSub_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpSub, DenseVector[Double]] = pureFromUpdate_Double(canSubInto_DV_S_Double)
  Vector.canSub_V_S_Double.register(canSub_DV_S_Double)


  implicit val canSubInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.activeIterator) {
          a(i) = a(i) - v
        }
        
      }
    }
  }

  Vector.canSubInto_V_V_Double.register(canSubInto_DV_V_Double)

  implicit val canSub_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpSub, DenseVector[Double]] = pureFromUpdate_Double(canSubInto_DV_V_Double)
  Vector.canSub_V_V_Double.register(canSub_DV_V_Double)


  implicit val canDivInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) / bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canDivInto_V_V_Double.register(canDivInto_DV_DV_Double)

  implicit val canDiv_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpDiv, DenseVector[Double]] = pureFromUpdate_Double(canDivInto_DV_DV_Double)
  Vector.canDiv_V_V_Double.register(canDiv_DV_DV_Double)


  implicit val canDivInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) / b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canDivInto_V_S_Double.register(canDivInto_DV_S_Double)

  implicit val canDiv_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpDiv, DenseVector[Double]] = pureFromUpdate_Double(canDivInto_DV_S_Double)
  Vector.canDiv_V_S_Double.register(canDiv_DV_S_Double)


  implicit val canDivInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) / v
        }
        
      }
    }
  }

  Vector.canDivInto_V_V_Double.register(canDivInto_DV_V_Double)

  implicit val canDiv_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpDiv, DenseVector[Double]] = pureFromUpdate_Double(canDivInto_DV_V_Double)
  Vector.canDiv_V_V_Double.register(canDiv_DV_V_Double)


  implicit val canAddInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) + bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canAddInto_V_V_Double.register(canAddInto_DV_DV_Double)

  implicit val canAdd_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpAdd, DenseVector[Double]] = pureFromUpdate_Double(canAddInto_DV_DV_Double)
  Vector.canAdd_V_V_Double.register(canAdd_DV_DV_Double)


  implicit val canAddInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) + b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canAddInto_V_S_Double.register(canAddInto_DV_S_Double)

  implicit val canAdd_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpAdd, DenseVector[Double]] = pureFromUpdate_Double(canAddInto_DV_S_Double)
  Vector.canAdd_V_S_Double.register(canAdd_DV_S_Double)


  implicit val canAddInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.activeIterator) {
          a(i) = a(i) + v
        }
        
      }
    }
  }

  Vector.canAddInto_V_V_Double.register(canAddInto_DV_V_Double)

  implicit val canAdd_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpAdd, DenseVector[Double]] = pureFromUpdate_Double(canAddInto_DV_V_Double)
  Vector.canAdd_V_V_Double.register(canAdd_DV_V_Double)


  implicit val canMulScalarInto_DV_DV_Double: BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Double], b: DenseVector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) * bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_V_Double.register(canMulScalarInto_DV_DV_Double)

  implicit val canMulScalar_DV_DV_Double: BinaryOp[DenseVector[Double], DenseVector[Double], breeze.linalg.operators.OpMulScalar, DenseVector[Double]] = pureFromUpdate_Double(canMulScalarInto_DV_DV_Double)
  Vector.canMulScalar_V_V_Double.register(canMulScalar_DV_DV_Double)


  implicit val canMulScalarInto_DV_S_Double: BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Double], Double, breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Double], b: Double) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) * b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_S_Double.register(canMulScalarInto_DV_S_Double)

  implicit val canMulScalar_DV_S_Double: BinaryOp[DenseVector[Double], Double, breeze.linalg.operators.OpMulScalar, DenseVector[Double]] = pureFromUpdate_Double(canMulScalarInto_DV_S_Double)
  Vector.canMulScalar_V_S_Double.register(canMulScalar_DV_S_Double)


  implicit val canMulScalarInto_DV_V_Double: BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Double], b: Vector[Double]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) * v
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_V_Double.register(canMulScalarInto_DV_V_Double)

  implicit val canMulScalar_DV_V_Double: BinaryOp[DenseVector[Double], Vector[Double], breeze.linalg.operators.OpMulScalar, DenseVector[Double]] = pureFromUpdate_Double(canMulScalarInto_DV_V_Double)
  Vector.canMulScalar_V_V_Double.register(canMulScalar_DV_V_Double)

}
/** This is an auto-generated trait providing operators for DenseVector. */
trait DenseVectorOps_Float { this: DenseVector.type =>

  def pureFromUpdate_Float[Other,Op<:OpType](op: BinaryUpdateOp[DenseVector[Float], Other, Op])(implicit copy: CanCopy[DenseVector[Float]]):BinaryOp[DenseVector[Float], Other, Op, DenseVector[Float]] = {
    new BinaryOp[DenseVector[Float], Other, Op, DenseVector[Float]] {
      override def apply(a : DenseVector[Float], b : Other) = {
        val c = copy(a)
        op(c, b)
        c
      }
    }
  }
        

  implicit val canPowInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = scala.math.pow(ad(aoff), bd(boff)).toFloat
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canPowInto_V_V_Float.register(canPowInto_DV_DV_Float)

  implicit val canPow_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpPow, DenseVector[Float]] = pureFromUpdate_Float(canPowInto_DV_DV_Float)
  Vector.canPow_V_V_Float.register(canPow_DV_DV_Float)


  implicit val canPowInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = scala.math.pow(ad(aoff), b).toFloat
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canPowInto_V_S_Float.register(canPowInto_DV_S_Float)

  implicit val canPow_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpPow, DenseVector[Float]] = pureFromUpdate_Float(canPowInto_DV_S_Float)
  Vector.canPow_V_S_Float.register(canPow_DV_S_Float)


  implicit val canPowInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = scala.math.pow(a(i), v).toFloat
        }
        
      }
    }
  }

  Vector.canPowInto_V_V_Float.register(canPowInto_DV_V_Float)

  implicit val canPow_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpPow, DenseVector[Float]] = pureFromUpdate_Float(canPowInto_DV_V_Float)
  Vector.canPow_V_V_Float.register(canPow_DV_V_Float)


  implicit val canModInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) % bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canModInto_V_V_Float.register(canModInto_DV_DV_Float)

  implicit val canMod_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpMod, DenseVector[Float]] = pureFromUpdate_Float(canModInto_DV_DV_Float)
  Vector.canMod_V_V_Float.register(canMod_DV_DV_Float)


  implicit val canModInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) % b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canModInto_V_S_Float.register(canModInto_DV_S_Float)

  implicit val canMod_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpMod, DenseVector[Float]] = pureFromUpdate_Float(canModInto_DV_S_Float)
  Vector.canMod_V_S_Float.register(canMod_DV_S_Float)


  implicit val canModInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) % v
        }
        
      }
    }
  }

  Vector.canModInto_V_V_Float.register(canModInto_DV_V_Float)

  implicit val canMod_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpMod, DenseVector[Float]] = pureFromUpdate_Float(canModInto_DV_V_Float)
  Vector.canMod_V_V_Float.register(canMod_DV_V_Float)


  implicit val canSetInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSetInto_V_V_Float.register(canSetInto_DV_DV_Float)

  implicit val canSet_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpSet, DenseVector[Float]] = pureFromUpdate_Float(canSetInto_DV_DV_Float)
  Vector.canSet_V_V_Float.register(canSet_DV_DV_Float)


  implicit val canSetInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSetInto_V_S_Float.register(canSetInto_DV_S_Float)

  implicit val canSet_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpSet, DenseVector[Float]] = pureFromUpdate_Float(canSetInto_DV_S_Float)
  Vector.canSet_V_S_Float.register(canSet_DV_S_Float)


  implicit val canSetInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = v
        }
        
      }
    }
  }

  Vector.canSetInto_V_V_Float.register(canSetInto_DV_V_Float)

  implicit val canSet_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpSet, DenseVector[Float]] = pureFromUpdate_Float(canSetInto_DV_V_Float)
  Vector.canSet_V_V_Float.register(canSet_DV_V_Float)


  implicit val canSubInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) - bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSubInto_V_V_Float.register(canSubInto_DV_DV_Float)

  implicit val canSub_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpSub, DenseVector[Float]] = pureFromUpdate_Float(canSubInto_DV_DV_Float)
  Vector.canSub_V_V_Float.register(canSub_DV_DV_Float)


  implicit val canSubInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) - b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSubInto_V_S_Float.register(canSubInto_DV_S_Float)

  implicit val canSub_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpSub, DenseVector[Float]] = pureFromUpdate_Float(canSubInto_DV_S_Float)
  Vector.canSub_V_S_Float.register(canSub_DV_S_Float)


  implicit val canSubInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.activeIterator) {
          a(i) = a(i) - v
        }
        
      }
    }
  }

  Vector.canSubInto_V_V_Float.register(canSubInto_DV_V_Float)

  implicit val canSub_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpSub, DenseVector[Float]] = pureFromUpdate_Float(canSubInto_DV_V_Float)
  Vector.canSub_V_V_Float.register(canSub_DV_V_Float)


  implicit val canDivInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) / bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canDivInto_V_V_Float.register(canDivInto_DV_DV_Float)

  implicit val canDiv_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpDiv, DenseVector[Float]] = pureFromUpdate_Float(canDivInto_DV_DV_Float)
  Vector.canDiv_V_V_Float.register(canDiv_DV_DV_Float)


  implicit val canDivInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) / b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canDivInto_V_S_Float.register(canDivInto_DV_S_Float)

  implicit val canDiv_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpDiv, DenseVector[Float]] = pureFromUpdate_Float(canDivInto_DV_S_Float)
  Vector.canDiv_V_S_Float.register(canDiv_DV_S_Float)


  implicit val canDivInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) / v
        }
        
      }
    }
  }

  Vector.canDivInto_V_V_Float.register(canDivInto_DV_V_Float)

  implicit val canDiv_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpDiv, DenseVector[Float]] = pureFromUpdate_Float(canDivInto_DV_V_Float)
  Vector.canDiv_V_V_Float.register(canDiv_DV_V_Float)


  implicit val canAddInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) + bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canAddInto_V_V_Float.register(canAddInto_DV_DV_Float)

  implicit val canAdd_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpAdd, DenseVector[Float]] = pureFromUpdate_Float(canAddInto_DV_DV_Float)
  Vector.canAdd_V_V_Float.register(canAdd_DV_DV_Float)


  implicit val canAddInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) + b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canAddInto_V_S_Float.register(canAddInto_DV_S_Float)

  implicit val canAdd_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpAdd, DenseVector[Float]] = pureFromUpdate_Float(canAddInto_DV_S_Float)
  Vector.canAdd_V_S_Float.register(canAdd_DV_S_Float)


  implicit val canAddInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.activeIterator) {
          a(i) = a(i) + v
        }
        
      }
    }
  }

  Vector.canAddInto_V_V_Float.register(canAddInto_DV_V_Float)

  implicit val canAdd_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpAdd, DenseVector[Float]] = pureFromUpdate_Float(canAddInto_DV_V_Float)
  Vector.canAdd_V_V_Float.register(canAdd_DV_V_Float)


  implicit val canMulScalarInto_DV_DV_Float: BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Float], b: DenseVector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) * bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_V_Float.register(canMulScalarInto_DV_DV_Float)

  implicit val canMulScalar_DV_DV_Float: BinaryOp[DenseVector[Float], DenseVector[Float], breeze.linalg.operators.OpMulScalar, DenseVector[Float]] = pureFromUpdate_Float(canMulScalarInto_DV_DV_Float)
  Vector.canMulScalar_V_V_Float.register(canMulScalar_DV_DV_Float)


  implicit val canMulScalarInto_DV_S_Float: BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Float], Float, breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Float], b: Float) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) * b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_S_Float.register(canMulScalarInto_DV_S_Float)

  implicit val canMulScalar_DV_S_Float: BinaryOp[DenseVector[Float], Float, breeze.linalg.operators.OpMulScalar, DenseVector[Float]] = pureFromUpdate_Float(canMulScalarInto_DV_S_Float)
  Vector.canMulScalar_V_S_Float.register(canMulScalar_DV_S_Float)


  implicit val canMulScalarInto_DV_V_Float: BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Float], b: Vector[Float]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) * v
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_V_Float.register(canMulScalarInto_DV_V_Float)

  implicit val canMulScalar_DV_V_Float: BinaryOp[DenseVector[Float], Vector[Float], breeze.linalg.operators.OpMulScalar, DenseVector[Float]] = pureFromUpdate_Float(canMulScalarInto_DV_V_Float)
  Vector.canMulScalar_V_V_Float.register(canMulScalar_DV_V_Float)

}
/** This is an auto-generated trait providing operators for DenseVector. */
trait DenseVectorOps_Int { this: DenseVector.type =>

  def pureFromUpdate_Int[Other,Op<:OpType](op: BinaryUpdateOp[DenseVector[Int], Other, Op])(implicit copy: CanCopy[DenseVector[Int]]):BinaryOp[DenseVector[Int], Other, Op, DenseVector[Int]] = {
    new BinaryOp[DenseVector[Int], Other, Op, DenseVector[Int]] {
      override def apply(a : DenseVector[Int], b : Other) = {
        val c = copy(a)
        op(c, b)
        c
      }
    }
  }
        

  implicit val canPowInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = IntMath.ipow(ad(aoff), bd(boff))
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canPowInto_V_V_Int.register(canPowInto_DV_DV_Int)

  implicit val canPow_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpPow, DenseVector[Int]] = pureFromUpdate_Int(canPowInto_DV_DV_Int)
  Vector.canPow_V_V_Int.register(canPow_DV_DV_Int)


  implicit val canPowInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = IntMath.ipow(ad(aoff), b)
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canPowInto_V_S_Int.register(canPowInto_DV_S_Int)

  implicit val canPow_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpPow, DenseVector[Int]] = pureFromUpdate_Int(canPowInto_DV_S_Int)
  Vector.canPow_V_S_Int.register(canPow_DV_S_Int)


  implicit val canPowInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpPow] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpPow] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = IntMath.ipow(a(i), v)
        }
        
      }
    }
  }

  Vector.canPowInto_V_V_Int.register(canPowInto_DV_V_Int)

  implicit val canPow_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpPow, DenseVector[Int]] = pureFromUpdate_Int(canPowInto_DV_V_Int)
  Vector.canPow_V_V_Int.register(canPow_DV_V_Int)


  implicit val canModInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) % bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canModInto_V_V_Int.register(canModInto_DV_DV_Int)

  implicit val canMod_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpMod, DenseVector[Int]] = pureFromUpdate_Int(canModInto_DV_DV_Int)
  Vector.canMod_V_V_Int.register(canMod_DV_DV_Int)


  implicit val canModInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) % b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canModInto_V_S_Int.register(canModInto_DV_S_Int)

  implicit val canMod_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpMod, DenseVector[Int]] = pureFromUpdate_Int(canModInto_DV_S_Int)
  Vector.canMod_V_S_Int.register(canMod_DV_S_Int)


  implicit val canModInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpMod] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpMod] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) % v
        }
        
      }
    }
  }

  Vector.canModInto_V_V_Int.register(canModInto_DV_V_Int)

  implicit val canMod_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpMod, DenseVector[Int]] = pureFromUpdate_Int(canModInto_DV_V_Int)
  Vector.canMod_V_V_Int.register(canMod_DV_V_Int)


  implicit val canSetInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSetInto_V_V_Int.register(canSetInto_DV_DV_Int)

  implicit val canSet_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpSet, DenseVector[Int]] = pureFromUpdate_Int(canSetInto_DV_DV_Int)
  Vector.canSet_V_V_Int.register(canSet_DV_DV_Int)


  implicit val canSetInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSetInto_V_S_Int.register(canSetInto_DV_S_Int)

  implicit val canSet_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpSet, DenseVector[Int]] = pureFromUpdate_Int(canSetInto_DV_S_Int)
  Vector.canSet_V_S_Int.register(canSet_DV_S_Int)


  implicit val canSetInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpSet] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpSet] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = v
        }
        
      }
    }
  }

  Vector.canSetInto_V_V_Int.register(canSetInto_DV_V_Int)

  implicit val canSet_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpSet, DenseVector[Int]] = pureFromUpdate_Int(canSetInto_DV_V_Int)
  Vector.canSet_V_V_Int.register(canSet_DV_V_Int)


  implicit val canSubInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) - bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSubInto_V_V_Int.register(canSubInto_DV_DV_Int)

  implicit val canSub_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpSub, DenseVector[Int]] = pureFromUpdate_Int(canSubInto_DV_DV_Int)
  Vector.canSub_V_V_Int.register(canSub_DV_DV_Int)


  implicit val canSubInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) - b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canSubInto_V_S_Int.register(canSubInto_DV_S_Int)

  implicit val canSub_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpSub, DenseVector[Int]] = pureFromUpdate_Int(canSubInto_DV_S_Int)
  Vector.canSub_V_S_Int.register(canSub_DV_S_Int)


  implicit val canSubInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpSub] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpSub] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.activeIterator) {
          a(i) = a(i) - v
        }
        
      }
    }
  }

  Vector.canSubInto_V_V_Int.register(canSubInto_DV_V_Int)

  implicit val canSub_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpSub, DenseVector[Int]] = pureFromUpdate_Int(canSubInto_DV_V_Int)
  Vector.canSub_V_V_Int.register(canSub_DV_V_Int)


  implicit val canDivInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) / bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canDivInto_V_V_Int.register(canDivInto_DV_DV_Int)

  implicit val canDiv_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpDiv, DenseVector[Int]] = pureFromUpdate_Int(canDivInto_DV_DV_Int)
  Vector.canDiv_V_V_Int.register(canDiv_DV_DV_Int)


  implicit val canDivInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) / b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canDivInto_V_S_Int.register(canDivInto_DV_S_Int)

  implicit val canDiv_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpDiv, DenseVector[Int]] = pureFromUpdate_Int(canDivInto_DV_S_Int)
  Vector.canDiv_V_S_Int.register(canDiv_DV_S_Int)


  implicit val canDivInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpDiv] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpDiv] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) / v
        }
        
      }
    }
  }

  Vector.canDivInto_V_V_Int.register(canDivInto_DV_V_Int)

  implicit val canDiv_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpDiv, DenseVector[Int]] = pureFromUpdate_Int(canDivInto_DV_V_Int)
  Vector.canDiv_V_V_Int.register(canDiv_DV_V_Int)


  implicit val canAddInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) + bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canAddInto_V_V_Int.register(canAddInto_DV_DV_Int)

  implicit val canAdd_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpAdd, DenseVector[Int]] = pureFromUpdate_Int(canAddInto_DV_DV_Int)
  Vector.canAdd_V_V_Int.register(canAdd_DV_DV_Int)


  implicit val canAddInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) + b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canAddInto_V_S_Int.register(canAddInto_DV_S_Int)

  implicit val canAdd_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpAdd, DenseVector[Int]] = pureFromUpdate_Int(canAddInto_DV_S_Int)
  Vector.canAdd_V_S_Int.register(canAdd_DV_S_Int)


  implicit val canAddInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpAdd] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpAdd] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.activeIterator) {
          a(i) = a(i) + v
        }
        
      }
    }
  }

  Vector.canAddInto_V_V_Int.register(canAddInto_DV_V_Int)

  implicit val canAdd_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpAdd, DenseVector[Int]] = pureFromUpdate_Int(canAddInto_DV_V_Int)
  Vector.canAdd_V_V_Int.register(canAdd_DV_V_Int)


  implicit val canMulScalarInto_DV_DV_Int: BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Int], b: DenseVector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        val ad = a.data
        val bd = b.data
        var aoff = a.offset
        var boff = b.offset

        var i = 0
        while(i < a.length) {
          ad(aoff) = ad(aoff) * bd(boff)
          aoff += a.stride
          boff += b.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_V_Int.register(canMulScalarInto_DV_DV_Int)

  implicit val canMulScalar_DV_DV_Int: BinaryOp[DenseVector[Int], DenseVector[Int], breeze.linalg.operators.OpMulScalar, DenseVector[Int]] = pureFromUpdate_Int(canMulScalarInto_DV_DV_Int)
  Vector.canMulScalar_V_V_Int.register(canMulScalar_DV_DV_Int)


  implicit val canMulScalarInto_DV_S_Int: BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Int], Int, breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Int], b: Int) {
        val ad = a.data

        var i = 0
        var aoff = a.offset
        while(i < a.length) {
          ad(aoff) = ad(aoff) * b
          aoff += a.stride
          i += 1
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_S_Int.register(canMulScalarInto_DV_S_Int)

  implicit val canMulScalar_DV_S_Int: BinaryOp[DenseVector[Int], Int, breeze.linalg.operators.OpMulScalar, DenseVector[Int]] = pureFromUpdate_Int(canMulScalarInto_DV_S_Int)
  Vector.canMulScalar_V_S_Int.register(canMulScalar_DV_S_Int)


  implicit val canMulScalarInto_DV_V_Int: BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpMulScalar] = {
    new BinaryUpdateOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpMulScalar] {
      def apply(a: DenseVector[Int], b: Vector[Int]) {
        require(b.length == a.length, "Vectors must be the same length!")

        for( (i,v) <- b.iterator) {
          a(i) = a(i) * v
        }
        
      }
    }
  }

  Vector.canMulScalarInto_V_V_Int.register(canMulScalarInto_DV_V_Int)

  implicit val canMulScalar_DV_V_Int: BinaryOp[DenseVector[Int], Vector[Int], breeze.linalg.operators.OpMulScalar, DenseVector[Int]] = pureFromUpdate_Int(canMulScalarInto_DV_V_Int)
  Vector.canMulScalar_V_V_Int.register(canMulScalar_DV_V_Int)

}
