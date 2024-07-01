object q4 extends App {
    def evenSum(arr: Array[Int]): Int = {
    var sum = 0
    for (num <- arr) {
      if (num % 2 == 0) sum += num
    }

    sum
  }

  println(evenSum(Array(1, 4, 2, 6, 5, 78, 9, 56)))
}
