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

  }
}
