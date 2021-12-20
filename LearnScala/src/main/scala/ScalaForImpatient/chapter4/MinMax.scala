package ScalaForImpatient.chapter4

object MinMax extends App {
  def get(values: Array[Int]) = {
    (values.min, values.max)
  }

  val result = get(Array(1,2,3,4,5,6))
  println(s"min: ${result._1}, max: ${result._2}")
}
