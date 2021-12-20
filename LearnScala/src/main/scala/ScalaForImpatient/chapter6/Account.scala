package ScalaForImpatient.chapter6

class Account private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = balance += amount
}

object Account {
  var lastNumber = 0

  def uniqueNumber() = {
    lastNumber += 1
    lastNumber
  }

  def apply(initialBalance: Double) = {
    new Account(uniqueNumber(), initialBalance)
  }

  def main(args: Array[String]): Unit = {
    var account = Account(1000.0)
    account.deposit(100.0)
  }
}
