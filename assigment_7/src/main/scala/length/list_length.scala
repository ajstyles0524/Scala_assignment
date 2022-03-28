package length
import scala.annotation.tailrec
class list_length {
  @tailrec
  final def recursivelengthlist(list: List[Int], accum: Int): Int = list match{
    case Nil => accum
    case _ =>recursivelengthlist(list.tail, 1 + accum)
  }
}
object main extends App{
  val obj= new list_length
  val nums: List[Int] = List(6,4,3,2)
  println(obj.recursivelengthlist(nums,0))
}