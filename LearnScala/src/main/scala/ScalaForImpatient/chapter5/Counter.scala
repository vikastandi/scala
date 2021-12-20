package ScalaForImpatient.chapter5

class Counter {
  private var value = 0 // You must initialize the field

  def increment() {
    if(value == Int.MaxValue) {
      value = 0
    }
    else value += 1
  } // Methods are public by default

  def current() = value
}

object Counter extends App {
  val myCounter = new Counter // Or new Counter()
  myCounter.increment()
  println(myCounter.current)
}
