package ScalaForImpatient.chapter5

class BankAccount(private var _balance: Double = 0.0) {
  def deposit(amount: Double) = {
    _balance += amount
  }

  def withdraw(amount: Double) = {
    if(amount > _balance) throw new Exception("no enough balance")
    else _balance -= amount
  }

  def balance = _balance
}
