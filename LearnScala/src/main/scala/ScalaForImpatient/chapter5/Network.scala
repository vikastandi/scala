package ScalaForImpatient.chapter5

import ScalaForImpatient.chapter5.NetworkCompanion.MemberCross

import scala.collection.mutable.ArrayBuffer

// In Scala, each instance has its own class Member, just like each instance has its own
// field members. That is, chatter.Member and myFace.Member are different classes.
class Network {
  class Member(val name: String) {
    //val contacts = new ArrayBuffer[Network#Member]
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name: String): Member = {
    val m = new Member(name)
    members += m
    m
  }
}

object Network extends App {
  val chatter = new Network
  val myFace = new Network

  val vikas = chatter.join("Vikas")
  val neha = chatter.join("Neha")
  vikas.contacts += neha

  val nimish = myFace.join("Nimish")
  // vikas.contacts += nimish //type mismatch error
}

class NetworkCompanion {
  private val members = new ArrayBuffer[MemberCross]

  def join(name: String): MemberCross = {
    val m = new MemberCross(name)
    members += m
    m
  }
}

object NetworkCompanion extends App {
  class MemberCross(val name: String) {
    val contacts = new ArrayBuffer[MemberCross]
  }

  val chatter = new NetworkCompanion
  val myFace = new NetworkCompanion

  val vikas = chatter.join("Vikas")
  val neha = chatter.join("Neha")
  vikas.contacts += neha

  val nimish = myFace.join("Nimish")
  vikas.contacts += nimish // no type mismatch error
}