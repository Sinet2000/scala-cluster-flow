package com.dexlaris.scala.part1basics

object Expressions {
  val meaningOfLife: Int = 40 + 2
  private val age = 65
  val isOld: Boolean = age > 64
  val anIfExpression: Int = if (isOld) 1 else 0
  val anIfExpression_2: Int = if isOld then 1 else 0

  // code blocks are also expressions
  val aCodeBlock: Int = {
    val localValue = 78

    localValue + 99
  }

  val aCodeBlock_2: Int =
    val localValue = 200
    localValue

  // Pattern matching
  val someValue = 43
  val description: String = someValue match {
    case 1 => "the first"
    case 2 => "second"
    case 42 => "Alien"
    case _ => "Sth Elsior"
  }

  def main(args: Array[String]): Unit = {
    println(description)
  }
}
