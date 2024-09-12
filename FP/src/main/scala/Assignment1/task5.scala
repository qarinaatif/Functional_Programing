//assignment1/task2/task5
object task5 {
  def buildMap [ A , B ]( data : Seq [ A ] , f : A => B ): Map[B, Seq[ A ]] = {
    data.groupBy(f)
  }
  val lst = Array (1, 2, 3, 4, 5)
  def func ( x: Int ) : Boolean = x % 2 == 0
  val result = buildMap( lst , func )

  def main(args: Array[String]): Unit = {
  println( result )
  }
}
