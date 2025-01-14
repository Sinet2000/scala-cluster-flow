package com.dexlaris.scala.part1basics

object Functions {

  // Defining Functions: Functions in Scala are defined using the def keyword, followed by the function name, parameters, and return type.
  // For example: def functionName(param1: Type1, param2: Type2): ReturnType = { ... }.
  def aFunction(a: String, b: Int): String =
    a + " " + b

  // Function Invocation: Functions are called by their name and passing the required parameters. For example: functionName(arg1, arg2).
  val anInvocation = aFunction("Scala", 999)

  // Return Types: The return type of a function can often be inferred by the compiler, but must be explicitly stated if the function is recursive.

  def main(args: Array[String]): Unit = {

  }
}
