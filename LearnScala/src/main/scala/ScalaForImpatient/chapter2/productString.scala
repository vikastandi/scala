package ScalaForImpatient.chapter2

class productString {
  def productRec(s: String): Long = {
    if(s.length == 1) s.head.toLong
    else s.head.toLong * productRec(s.tail)
  }
}

object productString {
  def main(args: Array[String]): Unit = {
    val ps = new productString
    val result = ps.productRec("Hello")
    println(f"product: $result")
  }
}
