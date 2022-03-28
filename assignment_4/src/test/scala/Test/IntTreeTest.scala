package Test
import Tree.IntTreeImp
import org.scalatest.funsuite.AnyFunSuite
class IntTreeTest extends AnyFunSuite {

  val obj = IntTreeImp
  val tree = obj.Node(3, obj.Node(1, obj.Node(8, obj.EmptyTree, obj.EmptyTree), obj.EmptyTree), obj.Node(5, obj.EmptyTree, obj.Node(9, obj.EmptyTree, obj.EmptyTree)))

  test("check tree contains an element") {
    assert(obj.contains(tree, 8))
  }

  test("check tree not contains an element") {
    assert(!obj.contains(tree, 2))
  }

  test("insert node to existing Tree") {
    val tree = obj.Node(2, IntTreeImp.Node(8,
      obj.Node(4,obj.EmptyTree,obj.EmptyTree),obj.EmptyTree),obj.EmptyTree)
    assert(obj.contains(tree,8))
  }

  test("insert node to Empty tree") {
    val treeNode = obj.EmptyTree
    val res = obj.insert(treeNode, "5".toInt)
    assert(obj.contains(res,5))
  }

}
