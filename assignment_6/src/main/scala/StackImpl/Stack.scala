package StackImpl
import scala.sys.error
trait Stack[A] {
  def push(x: A)
  def isEmpty: Boolean
  def top: A
  def pop():A
}

class Generic extends Stack[Int] {
  var stack:List[Int] = List()

  def isEmpty: Boolean = {
    if (stack==Nil)
      true
    else
      false
  }

  def top: Int = stack.head

  def push(element: Int): Unit = {
    stack = element +: stack
    print(stack)
  }

  def pop():Int = {
    if (stack.isEmpty)
      error("stack Underflow")
    else {
      val remove = stack.head
      stack = stack.tail
      remove
    }
  }
}
