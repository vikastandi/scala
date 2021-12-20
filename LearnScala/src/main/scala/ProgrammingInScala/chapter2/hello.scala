package ProgrammingInScala.chapter2

object hello {
  def main(args: Array[String]): Unit = {
    println("Hello," + args(0) + "!")
    args.foreach(arg => println(arg))
  }
}
