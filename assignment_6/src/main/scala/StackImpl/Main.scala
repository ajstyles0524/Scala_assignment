package StackImpl

object Main extends App {

  val intStack = new Generic()

  val res0 = intStack.isEmpty

  intStack.push(2)
  intStack.push(3)
  intStack.push(5)
  intStack.push(6)

  val res1 = intStack.isEmpty
  val res2 = intStack.top
  val res3 = intStack.pop()
  val res4 = intStack.pop()
  val res5 = intStack.top
  val res6 = intStack.isEmpty

  println(res0)
  println(res1)
  println(res2)
  println(res3)
  println(res4)
  println(res5)
  println(res6)

}