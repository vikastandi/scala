package ProgrammingInScala.chapter4

import scala.collection.mutable

// companion class of the singleton object
class CheckSumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def checkSum(): Int = ~(sum & 0xFF) + 1
}

// companion object. Must be defined in same source file
// singleton objects extend a superclass and can mix in traits
object CheckSumAccumulator {
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs
    }

  def main(args: Array[String]): Unit = {
    println("checksum = " + CheckSumAccumulator.calculate("vikas tandi"))
  }
}

// both class and singleton object can access each others private members