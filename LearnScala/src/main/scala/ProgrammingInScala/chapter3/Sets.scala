package ProgrammingInScala.chapter3

import scala.collection.mutable

object Sets {
  def main(args: Array[String]): Unit = {
    var jetSet = mutable.Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    println(jetSet.getClass)
  }
}
