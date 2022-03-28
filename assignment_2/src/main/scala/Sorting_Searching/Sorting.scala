package Sorting_Searching
class Sorting {
  def bubble_sort(arr: Array[Int]): Any = {
    if(arr.isEmpty == true)
       return "Empty array found"
    for(i <- 0 until arr.length-1; j <- 0 until arr.length-1-i){
      if (arr(j) > arr(j+1)){
        val temp = arr(j)
        arr(j) = arr(j+1)
        arr(j+1) = temp
      }
    }
    arr
  }

  def selection_sort(arr:Array[Int]): Any= {
    if(arr.isEmpty == true){
      return "Empty array found"
    }
    for (i <- 0 until arr.length) {
      var min_idx = i
      for (j <- i + 1 until arr.length) {
        if (arr(min_idx) > arr(j))
          min_idx = j
      }
      val temp = arr(i)
      arr(i) = arr(min_idx)
      arr(min_idx) = temp
    }
    arr
  }

  def insertion_sort(arr: Array[Int]): Any = {
    if(arr.isEmpty == true){
      return "Empty array found"
    }
    for(i <- 1 until arr.length){
      val key = arr(i)
      var j = i-1
      while( j>=0 && key<= arr(j)){
        arr(j+1) = arr(j)
        j-=1
      }
      arr(j+1) = key
    }
    arr
  }
}

