package io.github.kincsescsaba.crossscala3scala2

import io.github.kincsescsaba.libcompiledasscala2.Scala2CC

object Main extends App:
  case class Scala3CC(a: String)
  println("Scala 2:")
  Scala2CC.getClass.getDeclaredMethods.toList.filter(_.getName == "unapply").foreach(println)
  println("Scala 3:")
  Scala3CC.getClass.getDeclaredMethods.toList.filter(_.getName == "unapply").foreach(println)

