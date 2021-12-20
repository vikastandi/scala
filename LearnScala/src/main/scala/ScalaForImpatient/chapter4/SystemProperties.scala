package ScalaForImpatient.chapter4

import scala.jdk.CollectionConverters._

object SystemProperties extends App {
  val props = System.getProperties().asScala
  val maxKeyLength = props.keys.maxBy(k => k.length).length
  for((k,v) <- props) println(f"$k${" "*(maxKeyLength-k.length)}| $v")
}
