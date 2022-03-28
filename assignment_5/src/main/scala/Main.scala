object Main extends App {
  val list = List(1, 2, 3, 4)
  println(ShortImpl.add(2, 3))
  println(ShortImpl.sumOfList(list))
  println(ShortImpl.higherOrderFunction(num => num * num, 3))

  println(ExpandImpl.add.apply(2, 3))
  println(ExpandImpl.sumOfList.apply(list))
  println(ExpandImpl.higherOrderFunction(num => num * num, 3))
}