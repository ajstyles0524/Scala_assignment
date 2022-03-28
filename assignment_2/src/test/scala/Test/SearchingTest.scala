package Test
import org.scalatest.funsuite.AnyFunSuite
import Sorting_Searching.Searching
class SearchingTest extends AnyFunSuite {
  val searching = new Searching

  val array: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val array_2: Array[Int] = Array()

  test("linear Search when element exist") {
    assert(searching.linear_search(array, 7) == 6)
  }

  test("linear Search when element not exist") {
    assert(searching.linear_search(array, 17) == "Element is not Present")
  }

  test("linear Search when array is empty") {
    assert(searching.linear_search(array_2, 7) == "empty array found")
  }

  test("Binary Search when element exist") {
    assert(searching.binary_search(array, 7) == 6)
  }

  test("Binary Search when element not exist") {
    assert(searching.binary_search(array, 17) == "Element is not Present")
  }

  test("Binary Search when array is empty") {
    assert(searching.binary_search(array_2, 7) == "empty array found")
  }

}
