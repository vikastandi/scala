package ScalaForImpatient.chapter5

class Time(val hours: Int, val minutes: Int) {
  private val minutesSinceMidnight = hours * 60 + minutes

  def before(other: Time) = {
    minutesSinceMidnight < other.minutesSinceMidnight
  }
}

object Time extends App {
  val t1 = new Time(22,36)
  val t2 = new Time(13, 45)

  assert(t1.before(t2) == false)
  assert(t2.before(t1) == true)
  assert(t1.before(t1) == false)
  t1.hours
  t2.minutes
}
