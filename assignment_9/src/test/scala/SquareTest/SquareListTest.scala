package SquareTest
import Square.SquareList
import org.scalatest.funsuite.AnyFunSuite
class SquareListTest extends AnyFunSuite {

  val square = new SquareList()
  val list = List(2,3,4,5,6,7)

  test("Square the element of list using Tail Recursion") {
    assert(square.squareList(list) == List(4,9,16,25,36,49))
  }

  test("Square of empty list using using Tail Recursion") {
    assert(square.squareList(List()) == Nil)
  }

  test("Square the element of list using HOF map") {
    assert(square.squareListMap(list) == List(4,9,16,25,36,49))
  }

  test("Square of empty list using using HOF map") {
    assert(square.squareList(List()) == Nil)
  }

  test("Square should be same using both HOF map and tail recursion") {
    assert(square.squareListMap(list) == square.squareList(list) )
  }

}
