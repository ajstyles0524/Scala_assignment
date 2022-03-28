package Recursion
import scala. annotation. tailrec
class TailRecursion {
  def factorial(num: Int): BigInt = {
    @tailrec
    def factHelper(num: Int, accumulator: BigInt): BigInt = {
      if(num<=1) accumulator
      else factHelper(num-1, num * accumulator)
    }
    factHelper(num, 1)
  }
}
