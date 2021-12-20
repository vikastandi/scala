package ScalaForImpatient.chapter2

import scala.io.StdIn

class Console {
  def printAge() = {
    val name = StdIn.readLine("your name: ")
    print("your age: ")
    val age = StdIn.readInt()
    println(f"Hello $name, next year you will be ${age + 1} years old")
  }
}

object Console {
  def main(args: Array[String]): Unit = {
    val console = new Console
    console.printAge()
  }
}
