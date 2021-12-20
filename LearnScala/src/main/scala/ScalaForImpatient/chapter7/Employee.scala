package ScalaForImpatient.chapter7

class Person(val name: String, val age: Int) {
  override def toString: String = s"${getClass.getName}[name=$name]"
}

final class Employee(name: String, age: Int, val salary: Double) extends Person(name, age) {
  final override def toString: String = s"${super.toString}[salary=$salary]"
}

object Employee extends App {
  val person = new Employee("vikas", 38, 100)
  println(person)
  if(person.isInstanceOf[Employee]) {
    val employee = person.asInstanceOf[Employee]
    println(employee)
  }
}
