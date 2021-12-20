package ScalaForImpatient.chapter6

object PlayingCard extends Enumeration {
  type PlayingCard = Value
  val spades = Value("\u2660")
  val diamonds = Value("\u2666")
  val hearts = Value("\u2665")
  val clubs = Value("\u2663")

  def isColorRed(suit: PlayingCard): Boolean = {
    suit == PlayingCard.diamonds || suit == PlayingCard.hearts
  }

  def main(args: Array[String]): Unit = {
    for(suit <- PlayingCard.values) println(suit)
    println(isColorRed(PlayingCard.hearts))
  }
}
