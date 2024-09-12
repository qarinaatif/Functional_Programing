//assignment1/task2/task1
import scala.util.Random
object task1 {
    def main(args: Array[String]): Unit = {
      val random = new Random()
      val randomIntegers = List.fill(15)(random.nextInt(50-500))

      def Prime(i :Int) : Boolean = {
           if (i <= 1)
             false
           else if (i == 2)
             true
           else
               !(2 to (i-1)).exists(x => i % x == 0)
      }
      val primes = randomIntegers.filter(Prime)
      val sortedPrimes = primes.sorted
      val primeMap = sortedPrimes.zipWithIndex.toMap

      println(randomIntegers)
      println({primes.mkString(", ")})
      println({sortedPrimes.mkString(", ")})
      println( primeMap)
}
}
