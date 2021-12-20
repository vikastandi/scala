package ScalaForImpatient.chapter2

object power  extends App {

  def get(x: Double, n: Int): Double = {
    if(n == 0) 1
    else if(n < 0) 1/get(x, -n)
    else if(n % 2 == 0) get(x, n/2) * get(x, n/2)
    else x * get(x, n - 1)
  }

  println(f"result: ${get(5, 0)}")
  println(f"result: ${get(5, 2)}")
  println(f"result: ${get(5, 3)}")
  println(f"result: ${get(5, -3)}")
}





