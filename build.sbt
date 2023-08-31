ThisBuild / scalaVersion := "3.3.0"
ThisBuild / version := "0.0.1"
ThisBuild / organization := "com.stulsoft"
ThisBuild / organizationName := "stulsoft"

lazy val root = (project in file("."))
  .settings(
    name := "ys-doodle",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.7",
    libraryDependencies += "org.creativescala" %% "doodle" % "0.20.0",

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )