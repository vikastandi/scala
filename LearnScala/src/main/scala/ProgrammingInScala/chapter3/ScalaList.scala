package ProgrammingInScala.chapter3

object ScalaList {
  def main(args: Array[String]): Unit = {
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    //val oneTwoThreeFour = oneTwo ::: threeFour
    val oneTwoThreeFour = oneTwo.:::(threeFour)
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")

    val twoThree = List(2,3)
    //val oneTwoThree = 1 :: twoThree
    val oneTwoThree = twoThree.::(1)
    println(oneTwoThree)

    val thrill = "Will" :: "fill" :: "until" :: Nil
    println(thrill(2))
    println("count with length 4 = " + thrill.count(s => s.length == 4))
    println(thrill.drop(2))
    println(thrill.dropRight(2))
    println(thrill.exists(s => s == "until"))
    println(thrill.filter(s => s.length == 4))
    println(thrill.forall(s => s.endsWith("l")))
    println(thrill.head)
    println(thrill.init)
    println(thrill.map(s => s + "y"))
    println(thrill.mkString(", "))
    println(thrill.filterNot(s => s.length == 4))
    println(thrill.reverse)
    println(thrill.sortWith((s,t) => s.charAt(0).toLower < t.charAt(0).toLower))
    println(thrill.tail)
  }
}
