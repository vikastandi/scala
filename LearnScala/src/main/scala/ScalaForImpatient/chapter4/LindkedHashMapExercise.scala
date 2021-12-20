package ScalaForImpatient.chapter4

import java.util.Calendar
import scala.collection.mutable

object LindkedHashMapExercise extends App {
  val weekdaysMap = mutable.LinkedHashMap(
    "Sunday" -> Calendar.SUNDAY,
    "Monday" -> Calendar.MONDAY,
    "Tuesday" -> Calendar.TUESDAY,
    "Wednesday" -> Calendar.WEDNESDAY,
    "Thursday" -> Calendar.THURSDAY,
    "Friday" -> Calendar.FRIDAY,
    "Saturday" -> Calendar.SATURDAY)

  for((k,v) <- weekdaysMap) println(s"$k:$v")
}
