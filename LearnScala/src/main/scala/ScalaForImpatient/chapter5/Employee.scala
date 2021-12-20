package ScalaForImpatient.chapter5

class Employee(val name: String, var salary: Double) {
  def this() = {
    this("Vikas Tandi", 0.0)
  }
}
