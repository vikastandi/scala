package ScalaForImpatient.chapter3

object SwapAdjacent extends App {
  def swapInPlace(a: Array[Int]) = {
    for(i <- 1 until a.length by 2) {
      val temp = a(i)
      a(i) = a(i-1)
      a(i-1) = temp
    }
  }

  def swap(a: Array[Int]) = {
    for(i <- 0 until a.length) yield {
      if(i % 2 == 0 && i == (a.length - 1)) a(i)
      else if(i % 2 == 0) a(i+1)
      else a(i-1)
    }
  }

  val a = Array(1,2,3,4,5,6)
  val swapped = swap(a)
  println(f"original array after swapping: ${a.mkString(",")}")
  println(f"resulted swapped array after swapping: ${swapped.mkString(",")}")

  //val b = swapInPlace(a)
  swapInPlace(a)
  println(f"original array after in place swapping: ${a.mkString(",")}")
  //println(f"resulted swapped array after in place swapping: ${b.mkString(",")}")
}
