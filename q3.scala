object q3 extends App {
    def findAverage(num1: Int, num2: Int): Float = {
    var avg = (num1.toFloat + num2.toFloat) / 2
    val roundedAverage =
      BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
    roundedAverage
  }

  println(findAverage(4, 12))
}
