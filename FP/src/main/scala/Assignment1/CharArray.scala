//assignment1/task2/task2
object CharArray {

  def Letters(letter: Char, end: Char): List[Char] = {
    if (letter <= end) {
      letter :: Letters ((letter + 1) . toChar, end)
    } else {
      Nil
    }
  }

  def main(args: Array[String]): Unit = {
    val letters = Letters('A', 'Z')
    letters.foreach(println)
  }
}