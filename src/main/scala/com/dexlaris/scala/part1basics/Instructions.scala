package com.dexlaris.scala.part1basics

object Instructions {
  // Instructions vs. Expressions: Instructions are executed step-by-step (imperative programming),
  // while expressions are evaluated to a value (functional programming).
  // expr
  val printing: Unit = println("asdasd")

  // instr
  val aCodeBlock = {
    val aLocalValue = 45
    println("Instruction 1")
    println("Instruction 2")
  }

  // Variables: Variables in Scala can be declared using var (mutable) or val (immutable)
  // Reassigning a val causes a compile error.

  var aVariable = 10
  val reass: Unit = aVariable += 1

  // Unit Type: Instructions that perform side effects (like printing to the console)
  // return a special type called Unit, which has a single value ().

  // Loops: Scala supports loops like while,
  // which are often used with mutable variables.

  def main(args: Array[String]): Unit = {
    var theNumber = 1
    while (theNumber <= 10) {
      println(theNumber)
      theNumber += 1
    }
  }
}
