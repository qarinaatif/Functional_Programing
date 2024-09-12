object equation {

  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7

    val numList = List.range(-3, 3)
    for (elem <- numList) {
      val results = a * (elem * elem) + b * elem + c
      val newlist = numList.map(x => x)
      
    val zIplist = numList zip newlist  

      println(results)
      println(newlist)
      println(zIplist)
    }
  }
}