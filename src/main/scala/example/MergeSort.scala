package example

object MergeSort {

  def sort(list: List[Int]): List[Int] = {
    val n = list.size / 2
    if (n == 0) {
      list
    } else {
      val (left, right) = list.splitAt(n)
      merge(sort(left), sort(right))
    }
  }

  def merge(left: List[Int], right: List[Int]): List[Int] =
    (left, right) match {
      case (x, Nil) => left
      case (Nil, y) => right
      case (x :: xs, y :: ys) =>
        if (x < y) {
          x :: merge(xs, right)
        } else {
          y :: merge(ys, left)
        }
    }

}
