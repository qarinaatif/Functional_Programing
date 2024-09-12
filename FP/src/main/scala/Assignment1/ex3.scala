//assignment1/task1/exercise3
object ex3 {
  def calculateDonutCostWithDefaultOptionValue(donutName: String, quantity: Int, couponCode: Option[String] = None): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 
        val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case _ => 2.50 * quantity
    }
  }

  def main(args: Array[String]): Unit = {
    println(s"""Total cost = ${calculateDonutCostWithDefaultOptionValue("Glazed Donut", 5)}""")
  }
}
