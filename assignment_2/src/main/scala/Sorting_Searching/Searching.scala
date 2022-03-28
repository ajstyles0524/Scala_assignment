package Sorting_Searching
class Searching{
  def linear_search(arr: Array[Int], given_element: Int): Any = {
    if(arr.isEmpty == true)
      return "empty array found"
    for(i <- 0 until arr.length){
      if(arr(i) == given_element)
        return i
    }
    return "Element is not Present"
  }

  def binary_search(arr: Array[Int], given_element: Int): Any = {
    if(arr.isEmpty == true)
      return "empty array found"
    @scala.annotation.tailrec
    def binarySearchHelper(array: Array[Int],
                           given_element: Int,
                           low: Int,
                           high: Int): Any =
      if (low > high) {
        return "Element is not Present"}
      else {
        val middle = low + (high - low) / 2
        array match {
          case array if array(middle) == given_element => middle
          case array if array(middle) < given_element =>
            binarySearchHelper(array, given_element, middle + 1, high)
          case array if array(middle) > given_element =>
            binarySearchHelper(array, given_element, low, middle - 1)
        }
      }
    binarySearchHelper(arr, given_element, 0, arr.length - 1)
  }
}