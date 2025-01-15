package com.dexlaris.scala.part1basics

object StringOperations {

  val aString = "Scala Rocks"
  val length: Int = aString.length
  val stWith = aString.startsWith("Scala")
  val findIndex = aString.indexOf("Astronaut")
  // interpolation
  val name = "Joshua"
  val age = 21
  val greeting = s"Hi, my name is $name and I am $age years old."
  val splittedGr: Array[String] = greeting.split(" ")

  val speech =
    """Four score and
      | seven years ago
      | our fathers""".stripMargin.replaceAll("\n", "")


  def main(args: Array[String]): Unit = {
    val productsStr = "eggs, milk, butter, Coco Puffs"
    val products: Array[String] = productsStr.split(",")
    println(products.mkString("Array(", ", ", ")"))
    println(productsStr.split(",").map(_.trim).mkString("Array(", ", ", ")"))

    val name = "Joshua"
    val age = 21
    val weight = 95.3
    println(s"$name is $age years old, and weighs ${weight + 1} kilos.")

    val upper = "Hello, world".filter(_ != 'l').map(_.toUpper)
    for (c <- upper) println(c)
    val upper1 = for (c <- upper) yield c.toUpper

    val res = upper1.increment
    println(res)
  }

  // Custom methods
  // package object utils {
  implicit class StringImprovements(s: String) {
    def increment: String = s.map(c => (c +1).toChar)
  }
}
