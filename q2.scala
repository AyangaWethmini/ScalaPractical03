object q2 extends App{
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
}
