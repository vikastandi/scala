package ProgrammingInScala.chapter7

import java.io.File

class ForExpressions {
  def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList
  def grep(filesHere: Array[File], pattern: String) =
    for(
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala");
      line <- fileLines(file);
      trimmed = line.trim
      if trimmed.matches(pattern)
    ) println(file + ": " + trimmed)

  def grepYield(filesHere: Array[File], pattern: String) = {
    val trimmedLengths = for(
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala");
      line <- fileLines(file);
      trimmed = line.trim
      if trimmed.matches(pattern)
    ) yield trimmed.length

    for (length <- trimmedLengths)
      println(s"length: $length")
  }
}

object ForExpressions {
  def main(args: Array[String]): Unit = {
    val filesHere = (new File("src/main/scala/chapter3")).listFiles()
    val forExpressions = new ForExpressions
    forExpressions.grepYield(filesHere, ".*greet.*")
  }
}