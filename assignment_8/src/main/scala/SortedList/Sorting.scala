package SortedList

class Sorting {
  def isort(list: List[Int]): List[Int] = {
    if (list.isEmpty) Nil
    else insert(list.head, isort(list.tail))
  }
  def insert(num: Int, list: List[Int]): List[Int] = {
    if(list.isEmpty || num<= list.head) num::list
    else list.head :: insert(num, list.tail)
  }
}
