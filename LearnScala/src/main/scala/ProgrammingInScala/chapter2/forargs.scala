package ProgrammingInScala.chapter2

object forargs {
  def main(args: Array[String]): Unit = {
    for(arg <- args)
      println(arg)
  }
}
