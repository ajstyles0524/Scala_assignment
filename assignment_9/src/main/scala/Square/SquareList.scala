package Square
import scala.annotation.tailrec

class SquareList {
  @tailrec
  final def squareList(list: List[Int], acc: List[Int] = List()): List[Int] = {
    list match{
      case List() => acc
      case list => squareList(list.tail, acc :+ (list.head*list.head))
    }
  }

  def squareListMap(xs: List[Int]): List[Int] = {
    xs.map( x => x * x)
  }
}
