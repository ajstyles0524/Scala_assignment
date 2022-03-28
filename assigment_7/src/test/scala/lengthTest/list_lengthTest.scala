package lengthTest
import length.list_length
import org.scalatest.funsuite.AnyFunSuite
class list_lengthTest extends AnyFunSuite {
  val tailRecursion = new list_length
  val list = List(1,3,5,7,8,89,8,0,8,8,9,9,9,9)

  test("Length of a list" ) {
    assert(tailRecursion.recursivelengthlist(list,0) == 14)
  }

  test("Length of a empty list be zero" ) {
    assert(tailRecursion.recursivelengthlist(List(),0) == 0)
  }
}
