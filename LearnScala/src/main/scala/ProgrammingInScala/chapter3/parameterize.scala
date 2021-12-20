package ProgrammingInScala.chapter3

object parameterize {
  def main(args: Array[String]): Unit = {
    val greetString = new Array[String](3)

    greetString(0) = "Hello, "
    greetString(1) = "world"

    //greetString(2) = "!"
    greetString.update(2, "!")

    for(i <- 0 to 2) {
      // Console print greetString(i) - this is allowed. similar to 0 to 2
      //print(greetString(i))
      print(greetString.apply(i))
    }

    println()
    println(1.+(2))

    val numNames = Array("one","two", "three", "four")
    numNames.foreach(numName => println(numName))

    val familyNames = Array.apply("Anaya", "Neha", "Vikas", "Sushila", "Banwari", "Anupriya")
    familyNames.foreach(name => println(name))
  }
}
