package ProgrammingInScala.chapter8

import scala.io.Source

object longLines {
  def processFile(filename: String, width: Int): Unit = {

    def processLine(line: String) = {
      if(line.length > width)
        println(filename + ": " + line.trim)
    }
    val source = Source.fromFile(filename)
    for(line <- source.getLines())
      processLine(line)
  }

  def main(args: Array[String]): Unit = {
    longLines.processFile("src/main/scala/chapter3/parameterize.scala", 35)
  }
}

