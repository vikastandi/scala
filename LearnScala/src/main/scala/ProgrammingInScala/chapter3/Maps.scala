package ProgrammingInScala.chapter3

import scala.collection.mutable

object Maps {
  def main(args: Array[String]): Unit = {
    val treasureMap = mutable.HashMap[Int, String]()
    treasureMap += (1 -> "Go to Island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap)
  }
}
