package ProgrammingInScala.chapter7

class NoBreakContinue {
  def searchFrom(i: Int, files: Array[String]): Int = {
    if(i >= files.length) -1
    else if(files(i).startsWith("_")) searchFrom(i + 1, files)
    else if(files(i).endsWith(".scala")) i
    else searchFrom(i + 1, files)
  }
}

object NoBreakContinue {
  def main(args: Array[String]): Unit = {
    val nbc = new NoBreakContinue
    println(s"index: ${nbc.searchFrom(0, args)}")
  }
}
