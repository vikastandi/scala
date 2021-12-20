package ScalaForImpatient.chapter6

class Point(val x: Int, val y: Int) {

}

object Point {
  def apply(x: Int, y: Int) = {
    new Point(x, y)
  }

  def main(args: Array[String]): Unit = {
    val point = Point(3,4)
  }
}
