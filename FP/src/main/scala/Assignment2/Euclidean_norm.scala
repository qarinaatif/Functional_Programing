import math._
object Euclidean_norm {
  def distance(xs: Array[Double], ys: Array[Double]) = {
    sqrt((xs zip ys).map { case (x,y) => pow(y - x, 2) }.sum)
  }
  val testInstances = Array(Array(5.0, 4.8, 7.5, 10.0), Array(3.2, 2.1, 4.3, 2.8))
  val trainPoints = Array(Array(3.9, 4.1, 6.2, 7.3), Array(4.5, 6.1, 8.3, 3.8), Array(5.2, 4.6, 7.4, 9.8), Array(5.1, 7.1, 4.4, 6.9))

  distance(testInstances.head, trainPoints.head)


}
