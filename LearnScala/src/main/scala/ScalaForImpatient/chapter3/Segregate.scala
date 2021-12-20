package ScalaForImpatient.chapter3

object Segregate extends App {
  def perform(a: Array[Int]) = {
    (for(p <- a if p > 0) yield p) ++ (for(q <- a if q <= 0) yield q)
  }

  println(perform(Array(-2, 8, 0, 4, -8, -1, 0, 9)).mkString(","))
}
