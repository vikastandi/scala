package ScalaForImpatient.chapter6

abstract class UnitConversion {
  def convert(value: Double): Double
}

object InchesToCentimeter extends UnitConversion {
  override def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(value: Double): Double = value * 3.78541
}

object MilesToKilometers extends UnitConversion {
  override def convert(value: Double): Double = value * 1.60934
}

object ConversionApp extends App {
  assert(InchesToCentimeter.convert(1.0) == 2.54)
}
