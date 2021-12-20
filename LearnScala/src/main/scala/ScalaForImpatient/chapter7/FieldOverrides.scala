package ScalaForImpatient.chapter7

abstract class Fields {
  val x: Int = 0

  val z: Int

  override def toString: String = super.toString

  var y: Int
}

class FieldOverrides extends Fields {
  override val x: Int = 1

  val z: Int = 1

  // This is allowed
  // override val toString = "dummy"

  // This is also allowed
  override def toString: String = super.toString

  override var y: Int = 1
}
