object Q1 extends App {

  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  println(reverseString("Hello world"))

}
