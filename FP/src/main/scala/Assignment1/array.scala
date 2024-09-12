//assignment1/task1/exercise1
object array {
  val a = Array(1, 2, 3, 4, 5, 6)
  val b = Array.fill(5)(0)
  val c = Array.tabulate(6)(n => n + 1)
  val d = Array.range(1, 6)
//  val e = Array[Int] = Array(1, 2, 3)

  def main(args: Array[String]): Unit = {
    println(a.mkString(", "))
    println(b.mkString(", "))
    println(c.mkString(", "))
    println(d.mkString(", "))
//    println(e)
  }
}
