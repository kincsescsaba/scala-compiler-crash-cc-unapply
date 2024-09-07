ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.5.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala-compiler-crash-cc-unapply"
  )
  .aggregate(crossScala3Scala2, libCompiledAsScala2)


lazy val crossScala3Scala2 = (project in file("crossScala3Scala2"))
  .settings(
    scalaVersion := "3.5.0",
    name := "crossScala3Scala2"
  )
  .dependsOn(libCompiledAsScala2)

lazy val libCompiledAsScala2 = (project in file("libCompiledAsScala2"))
  .settings(
    scalaVersion := "2.13.14",
    name := "libCompiledAsScala2"
  )
