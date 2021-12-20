package ScalaForImpatient.chapter4

import java.io.File
import java.util.Scanner
import scala.collection.mutable.Map
import scala.jdk.CollectionConverters._
import java.util

object WordCount extends App {

  def mutableWay(): Unit = {
    val in = new Scanner(new File("src/main/scala/ScalaForImpatient/chapter4/input.txt"))
    val wordCountMap = Map[String, Int]()
    while(in.hasNext()) {
      val word = in.next()
      // check if the word exists in the dictionary
      if(wordCountMap.contains(word)) {
        wordCountMap(word) += 1
      }
      else {
        wordCountMap += (word -> 1)
      }
    }

    for((k, v) <- wordCountMap if v > 3) println(s"$k:$v")
  }

  def immutableWay(): Unit = {
    val in = new Scanner(new File("src/main/scala/ScalaForImpatient/chapter4/input.txt"))
    var wordCountMap = scala.collection.immutable.Map[String, Int]()
    while(in.hasNext()) {
      val word = in.next()
      // check if the word exists in the dictionary
      if(wordCountMap.contains(word)) {
        wordCountMap += (word -> (wordCountMap(word) + 1))
      }
      else {
        wordCountMap += (word -> 1)
      }
    }

    for((k, v) <- wordCountMap if v > 3) println(s"$k:$v")
  }

  def sortedMapWay(): Unit = {
    val in = new Scanner(new File("src/main/scala/ScalaForImpatient/chapter4/input.txt"))
    var wordCountMap = scala.collection.immutable.SortedMap[String, Int]()
    while(in.hasNext()) {
      val word = in.next()
      // check if the word exists in the dictionary
      if(wordCountMap.contains(word)) {
        wordCountMap += (word -> (wordCountMap(word) + 1))
      }
      else {
        wordCountMap += (word -> 1)
      }
    }

    for((k, v) <- wordCountMap if v > 3) println(s"$k:$v")
  }

  def javaTreeMapWay() = {
    val in = new Scanner(new File("src/main/scala/ScalaForImpatient/chapter4/input.txt"))
    var wordCountMap = new util.TreeMap[String, Int].asScala
    while(in.hasNext()) {
      val word = in.next()
      // check if the word exists in the dictionary
      if(wordCountMap.contains(word)) {
        wordCountMap(word) += 1
      }
      else {
        wordCountMap += (word -> 1)
      }
    }

    for((k, v) <- wordCountMap if v > 3) println(s"$k:$v")
  }

  javaTreeMapWay()
}
