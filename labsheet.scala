import scala.math._

object Q1 extends App {

  // Question 01
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  println(reverseString("Hello world"))

  // Question 02
  def newStringArray(arr: List[String]): List[String] = {
    var newArr = List[String]()

    for (string <- arr) {
      if (string.length() > 5) newArr = newArr :+ string
    }
    newArr
  }

  var array = List("Apple", "Orange", "Pears", "Cherry", "Kiwi", "Banana")

  val resultarr = newStringArray(array)

  println(resultarr)

  // Question 03
  def findAverage(num1: Int, num2: Int): Float = {
    var avg = (num1.toFloat + num2.toFloat) / 2
    val roundedAverage =
      BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
    roundedAverage
  }

  println(findAverage(4, 12))

  // Question 04

  def evenSum(arr: Array[Int]): Int = {
    var sum = 0
    for (num <- arr) {
      if (num % 2 == 0) sum += num
    }

    sum
  }

  println(evenSum(Array(1, 4, 2, 6, 5, 78, 9, 56)))

}
