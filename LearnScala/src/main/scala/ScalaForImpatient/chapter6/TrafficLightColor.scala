package ScalaForImpatient.chapter6

object TrafficLightColor extends Enumeration {
  //val Red, Yellow, Green = Value
  val Red = Value(0, "Stop")
  val Yellow = Value(10)
  val Green = Value("Go")

  def main(args: Array[String]): Unit = {
    for (c <- TrafficLightColor.values) println(s"${c.id}: $c")
  }
}
