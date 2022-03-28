package Tree

object IntTreeImp{
  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(element: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(tree: IntTree, value: Int): Boolean = {
    tree match{
      case EmptyTree                                     => false
      case Node(element, left, right) if element > value => contains(right, value)
      case Node(element, left, right) if element < value => contains(left, value)
      case _                                              => true
    }
  }

  def insert(tree: IntTree, value: Int): IntTree = {
      tree match {
        case EmptyTree => Node(value, EmptyTree, EmptyTree)
        case Node(element, left, right) if (element < value) => Node(element, insert(left, value), right)
        case Node(element, left, right) if (element > value) => Node(element, left, insert(right, value))
        case _ => tree
      }
  }
}
