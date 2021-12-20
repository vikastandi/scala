package ScalaForImpatient.chapter3

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.jdk.CollectionConverters._
import java.awt.datatransfer._

object Interoperability extends App {
  val command = ArrayBuffer("ls", "-al", "/home/cay")
  val pb = new ProcessBuilder(command.asJava) // Scala to Java

  val cmd : mutable.Buffer[String] = pb.command().asScala
  println(cmd.toString())

  val flavor = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val imageFlavor = flavor.getNativesForFlavor(DataFlavor.imageFlavor).asScala
  imageFlavor.foreach(println)
}
