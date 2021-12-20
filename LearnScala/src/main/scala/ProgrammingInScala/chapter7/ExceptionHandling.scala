package ProgrammingInScala.chapter7

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

class ExceptionHandling {
  def readFile(fileName: String) = {
    try {
      val file = new FileReader(fileName)
    }
    catch {
      case ex: FileNotFoundException => println(s"FileNotFoundException: ${ex.getMessage}")
      case ex: IOException => println(s"IOException: ${ex.getMessage}")
    }
  }

  def yieldingValue(url: String) =
    try {
      new URL(url)
    }
    catch {
      case ex: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }
}

object ExceptionHandling {
  def main(args: Array[String]): Unit = {
    val ex = new ExceptionHandling
    ex.readFile("randomfile.txt")
    println(ex.yieldingValue("malformedurl"))
  }
}