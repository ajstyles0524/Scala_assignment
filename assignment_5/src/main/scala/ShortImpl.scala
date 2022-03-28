object ShortImpl {
  val add: (Int, Int) => Int = (x: Int, y: Int) => x+y

  val sumOfList: List[Int] => Int = (list: List[Int]) => list.sum

  val higherOrderFunction: (Int => Int, Int) => Int = (f: Int => Int, num: Int) => f(num)
}
