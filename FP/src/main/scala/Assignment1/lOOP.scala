//assignment1/task2/task4
import scala.util.Random
object lOOP {
  val largeArray: Array[Int] = Array.fill( 100 )( Random.nextInt (100))
  def evens1(arr: Array[Int]): Int = {
    var count = 0
    for (num <- arr) {
      if (num % 2 == 0) count += 1
    }
    count
  }
  def evens2(arr: Array[Int]): Int = {
    arr.count(_ % 2 == 0)
  }
  def evens3(arr: Array[Int]): Int = {
    arr.count(num => num % 2 == 0)
  }
  def evens4(arr: Array[Int]): Int = {
    var count = 0
    arr.foreach { num =>
      if (num % 2 == 0) count += 1
    }
    count
  }
  def main(args: Array[String]): Unit = {
    println({evens1(largeArray)})
    println({evens2(largeArray)})
    println({evens3(largeArray)})
    println({evens4(largeArray)})
  }
}
