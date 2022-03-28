package Recursion

object Main extends App{
  val head_recursion = new HeadRecursion
  val tail_recursion = new TailRecursion
  val log = new Log

  println(head_recursion.factorial(10))
  println(tail_recursion.factorial(25))

  println(log.setLog("Total time: 4 s, completed 20 Oct, 2021 7:56:21 PM", "success"))
  println(log.setLog("Total time: 4 s, completed 20 Oct, 2021 7:56:21 PM"))
}
