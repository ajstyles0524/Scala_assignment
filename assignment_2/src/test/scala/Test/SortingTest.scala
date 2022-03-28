package Test
import org.scalatest.funsuite.AnyFunSuite
import Sorting_Searching.Sorting

class SortingTest extends AnyFunSuite{
  val sorting = new Sorting

  test("Test Insertion Sort") {
    val array: Array[Int] = Array(3, 4, 5, 3, 2, 1)
    assert(sorting.insertion_sort(array) === array.sortBy(a => a))
  }

  test("Test Insertion Sort with empty array") {
    val array: Array[Int] = Array()
    assert(sorting.insertion_sort(array) === "Empty array found")
  }

  test("Test Selection Sort") {
    val array: Array[Int] = Array(3, 4, 5, 3, 2, 1)
    assert(sorting.selection_sort(array) === array.sortBy(a => a))
  }

  test("Test Selection Sort with empty array") {
    val array: Array[Int] = Array()
    assert(sorting.selection_sort(array) === "Empty array found")
  }

  test("Test Bubble Sort") {
    val array: Array[Int] = Array(3, 4, 5, 3, 2, 1)
    assert(sorting.bubble_sort(array) === array.sortBy(a => a))
  }

  test("Test Bubble Sort with empty array") {
    val array: Array[Int] = Array()
    assert(sorting.bubble_sort(array) === "Empty array found")
  }
}
