package example

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpec}

class MergeSortSpec extends WordSpec with Matchers with PropertyChecks {
  "Merge sort" should {
    "sort values" in {
      forAll { list: List[Int] =>
        val res      = MergeSort.sort(list)
        val expected = list.sorted

        res shouldBe expected
      }
    }
  }
}
