import org.scalatest._
import Chapter2._

class Chapter2Spec extends FlatSpec with Matchers{
  "fib" should "return first 10 values 0, 1, 1, 2, 3, 5, 8, 13, 21, 34" in {
    assert(fib(1)==0)
    assert(fib(2)==1)
    assert(fib(3)==1)
    assert(fib(4)==2)
    assert(fib(5)==3)
    assert(fib(6)==5)
  }

  "isSorted" should "return be true or false" in {
    isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x < y) shouldBe true
    isSorted(Array(7, 5, 1, 3), (x: Int, y: Int) => x > y) shouldBe false
    isSorted(Array("Scala", "Exercises"), (x: String, y: String) => x.length < y.length) shouldBe true
  }
}
