object ExpandImpl {
  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int): Int = x + y
  }

  val sumOfList: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    def apply(x: List[Int]): Int = x.sum
  }

  def higherOrderFunction(f: Int => Int, b: Int): Int = {
    def apply(b: Int) = f(b)
    apply(b)
  }
}
