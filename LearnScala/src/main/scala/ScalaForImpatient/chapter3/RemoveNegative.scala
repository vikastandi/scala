package ScalaForImpatient.chapter3

import scala.collection.mutable.ArrayBuffer

object RemoveNegative extends App {
  def perform(a: ArrayBuffer[Int]) = {
    val negativeElementIndexes = (for(i <- 0 until a.length if a(i) < 0) yield i).toBuffer
    negativeElementIndexes.dropInPlace(1)
    for(i <- negativeElementIndexes.reverse) a.remove(i)
  }

  val ab = ArrayBuffer(51,-42,30,-4,25,-51,8,42)
  perform(ab)
  println(f"result: $ab")
}
