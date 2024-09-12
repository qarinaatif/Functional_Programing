object list {
  val uList = List(1,2,3,4,5)

  val uList_Twice =uList.map( x => x*2)
  println(s"List element doubled -$uList_Twice")

  def f(x: Int) = if (x > 2) x * x else None
  val uList_Squared = uList.map( y => f(y))
  println(s"List element squared selectively -$uList_Squared")


  def g(v: Int) = List(v-1 , v , v+1)
  val uList_Extended = uList.map( z => g(z))
  println(s"Extended List using map -$uList_Extended")

  val uList_Extended_flatmap = uList.flatMap( q => g(q))
  println(s"Extended List using flatmap -$uList_Extended_flatmap")


  def h(x: Int) = if (x > 2) Some (x) else None
  val uList_selective = uList.map(p => h(p))
  println(s"Selective elements of List with .map - $uList_selective")

  val uList_Selective_flatmap = uList.flatMap( r => f(r))
  println(s"Selective elements of List with .flatMap -$uList_Selective_flatmap ")


  val uMap = Map('a' -> 2,'b' -> 4,'c' -> 6)

  val uMap_mapValues = uMap.mapValues(s => s*2)
  println(s"Map values doubled using .mapValues -$uMap_mapValues ")

  def i(k:Char , v:Int) = Some(k-> v*2)

  val uMap_map = uMap.map{
    case (k, v) => i(k , v)
  }
  println(s"Map values doubled using .map -$uMap_map ")

  val uMap_flatMap = uMap.flatMap{
    case (l, m) -> i(l,m)
  }
  println(s"Map values doubled using .flatMap -$uMap_flatMap ")
}
