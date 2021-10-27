import com.knoldus.Nat.{Succ, Zero}
import org.scalatest.funsuite.AnyFunSuite

class NatTestCase extends AnyFunSuite {

  trait NatTest {
    val zero = Zero
    val one = new Succ(Zero)
    val two = new Succ(one)
  }

  test("zero isZero is true") {
    assert(Zero.isZero)
  }

  test("zero predecessor throws an error") {
    assertThrows[Error] {
      Zero.predecessor
    }
  }

  test("successor of zero is one") {
    new NatTest {
      assert(Zero.successor == one)
    }
  }

  test("zero plus zero is zero") {
    assert((Zero + Zero) === Zero)
  }

  test("zero plus one is one") {
    new NatTest {
      assert((Zero + one) === one)
    }
  }

  test("zero minus zero is zero") {
    assert((Zero - Zero) === Zero)
  }

  test("zero minus one throws an error") {
    new NatTest {
      assertThrows[Error] {
        Zero - one
      }
    }
  }

  test("one isZero is false") {
    new NatTest {
      assert(!one.isZero)
    }
  }

  test("predecessor of one is zero") {
    new NatTest {
      assert(one.predecessor === Zero)
    }
  }

  test("successor of one is two") {
    new NatTest {
      assert(one.successor == two)
    }
  }

  test("one plus zero is one") {
    new NatTest {
      assert((one + Zero) === one)
    }
  }

  test("one plus one is two") {
    new NatTest {
      assert((one + one) === two)
    }
  }

  test("one minus zero is one") {
    new NatTest {
      assert((one - Zero) === one)
    }
  }

  test("one minus one is zero") {
    new NatTest {
      assert((one - one) === Zero)
    }
  }

  test("two minus one is one") {
    new NatTest {
      assert((two - one) === one)
    }
  }

}