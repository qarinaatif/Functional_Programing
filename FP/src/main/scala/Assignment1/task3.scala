//assignment1/task2/task3
object task3 {
  def arraysum(arr1: Array[Double], arr2: Array[Double]): Array[Double] = {
    require(arr1.length == arr2.length)
    arr1.zip(arr2).map { case (x, y) => x + y }
  }
  
  def main(args: Array[String]): Unit = {
    val array1 = Array( 1.0, 2.0, 3.0 )
    val array2 = Array( 4.0, 5.0, 6.0 )
    val result = arraysum ( array1, array2 )

    def main(args: Array[String]): Unit = {
    println(result.mkString(", "))
  }
}
}

