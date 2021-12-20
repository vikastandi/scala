package ScalaForImpatient.chapter5

class Constructors {
  private var name = ""
  private var age = 0

  def this(name: String) = {
    this()
    this.name = name
  }

  def this(name: String, age: Int) = {
    this(name)
    this.age = age
  }
}

class Person(name: String, age: Int) {
  println("Just constructed another person")
  def description = s"$name is $age years old"
}

object Constructors extends App {
  val a = new Constructors
  val b = new Constructors("Vikas")
  val c = new Constructors("Vikas", 39)

  val person = new Person("Vikas Tandi",  39)
}
