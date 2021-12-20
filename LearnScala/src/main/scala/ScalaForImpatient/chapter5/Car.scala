package ScalaForImpatient.chapter5

class Car(val manufacturer: String, val modelName: String){
  private var _modelYear = -1
  var licensePlate = ""

  def this(manufacturer: String, modelName: String, modelyear: Int) = {
    this(manufacturer, modelName)
    _modelYear = modelyear
  }

  def this(manufacturer: String, modelName: String, licensePlate: String) = {
    this(manufacturer, modelName)
    this.licensePlate = licensePlate
  }

  def this(manufacturer: String, modelName: String, modelYear: Int, licensePlate: String) = {
    this(manufacturer, modelName)
    _modelYear = modelYear
    this.licensePlate = licensePlate
  }

  def modelyear = _modelYear
}
