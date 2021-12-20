package ScalaForImpatient.chapter5

class PrivateFields {
  private var value = 0
  def increment(): Unit = {
    value += 1
  }

  def lessThan(other: PrivateFields) = {
    value < other.value
  }
}

class ObjectPrivateFields {
  private[this] var value = 0
  def increment(): Unit = {
    value += 1
  }

  def lessThan(other: ObjectPrivateFields) = {
    //Not allowed
    //value < other.value
  }
}

object PrivateFields {
  def main(args: Array[String]): Unit = {
    val pf1 = new PrivateFields
    val pf2 = new PrivateFields

    pf1.increment()
    pf2.increment()
    pf2.increment()

    assert(pf1.lessThan(pf2) == true)
  }
}
