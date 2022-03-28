package RecursionTest
import Recursion.HeadRecursion
import org.scalatest.flatspec.AnyFlatSpec

class HeadRecursionTest extends  AnyFlatSpec {
  val recursion = new HeadRecursion

  "condition" should "be valid as 0 will return 1" in {
    assert(1==recursion.factorial(0))
  }

  "condition" should "be valid as 8 will return 40320" in {
    assert(40320==recursion.factorial(8))
  }
}
