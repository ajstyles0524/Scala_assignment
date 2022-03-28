package StackImplTest

import StackImpl.Generic
import org.scalatest.funsuite.AnyFunSuite

class IntStackSpec extends AnyFunSuite{

  val intStack = new Generic()

  test("On initialize stack should be empty"){
    assert(intStack.isEmpty)
  }
  test("Element push to the empty stack"){
    intStack.push(2)
  }
  test("After push a element stack is not empty"){
    intStack.push(2)
    assert(!intStack.isEmpty)
  }

  test("Stack return the top element"){
    intStack.push(2)
    intStack.push(3)
    assert(intStack.top == 3)
  }
  test("Stack pop off  the top element"){
    intStack.push(2)
    intStack.push(3)
    intStack.pop()
    assert(intStack.top == 2)
  }
}
