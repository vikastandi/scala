package ScalaForImpatient.chapter4

import java.awt.Font
import java.util
import scala.jdk.CollectionConverters._
import scala.collection.mutable.Map
import java.awt.font.TextAttribute._

object Interoperability extends App {

  // java to scala
  val scores: Map[String, Int] = new util.TreeMap[String, Int].asScala
  val props = System.getProperties().asScala

  // scala to java
  val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
  val font = new Font(attrs.asJava)

}
