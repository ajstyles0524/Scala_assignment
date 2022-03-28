package SortedListTest
import SortedList.Sorting
import org.scalatest.funsuite.AnyFunSuite
class SortingTest extends AnyFunSuite {

  val unsortedList = List(3,5,3,1,9)
  val sortedList = List(1,3,3,5,9)
  val sorting  = new Sorting()

  test("Sort the list in ascending order"){
    assert(sorting.isort(unsortedList) === (sortedList))
  }

  test("Nil return on empty list"){
    assert(sorting.isort(List()) === Nil)
  }

}
