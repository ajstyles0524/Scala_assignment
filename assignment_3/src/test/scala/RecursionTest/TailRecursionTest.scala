package RecursionTest
import org.scalatest.flatspec.AnyFlatSpec
import Recursion.TailRecursion
class TailRecursionTest extends AnyFlatSpec {
  val recursion = new TailRecursion

  "condition" should "be valid as 11 will return 39916800" in {
    assert(39916800== recursion.factorial(11))
  }
  "condition" should "be invalid as 12 will return 3991600" in {
    assert(39916800!= recursion.factorial(12))
  }
}
