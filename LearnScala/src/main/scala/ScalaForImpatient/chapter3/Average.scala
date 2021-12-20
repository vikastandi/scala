package ScalaForImpatient.chapter3

object Average extends App {
  def sum(a: Array[Double]): Double = {
    if(a.length == 0) 0.0
    else a.head + sum(a.tail)
  }

  def calc(a: Array[Double]) = {
    sum(a)/a.length
  }

  val a = Array(2.4,2.5,2.6)
  a.distinct
  println(f"average: ${calc(a)}")
}
