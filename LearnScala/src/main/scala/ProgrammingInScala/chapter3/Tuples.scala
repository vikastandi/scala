package ProgrammingInScala.chapter3

object Tuples {
  def main(args: Array[String]): Unit = {
    val pair = (99, "vikas")
    println(pair._1)
    println(pair._2)
    println(pair.getClass)
  }
}
