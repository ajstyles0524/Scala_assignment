package Sets

class SetOperations {
  def union(A: Set[Int], B: Set[Int]): Set[Int] = {
    var new_set: Set[Int] = Set()
    if(A.isEmpty && B.isEmpty){
      new_set
    }
    else{
      new_set = A ++ B
      new_set
    }
  }

  def intersection(A: Set[Int], B: Set[Int]): Set[Int] = {
    var new_set: Set[Int] = Set()
    if(A.isEmpty && B.isEmpty){
      new_set
    }
    else{
      var diff_1 = A.diff(B)
      var diff_2 =B.diff(A)
      new_set= B.diff(diff_2)
      new_set
    }
  }

}
