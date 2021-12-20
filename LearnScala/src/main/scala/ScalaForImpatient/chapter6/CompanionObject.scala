package ScalaForImpatient.chapter6

class CompanionObject {
  val id = CompanionObject.uniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double): Unit = balance += amount
}

object CompanionObject {
  private var lastNumber = 0
  private def uniqueNumber(): Unit = {
    lastNumber += 1
    lastNumber
  }
}
