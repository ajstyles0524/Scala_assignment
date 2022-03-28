package RecursionTest
import Recursion.Log
import org.scalatest.funsuite.AnyFunSuite
class LogTest extends AnyFunSuite {
  val log = new Log

  test("When level argument is not provided") {
    assert(log.setLog("warning") == "[INFO]: warning")
  }

  test("When level argument is  provided") {
    assert(log.setLog("warning","success") == "[SUCCESS]: warning")
  }

}
