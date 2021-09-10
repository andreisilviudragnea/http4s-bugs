name := "http4s-bugs"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-core" % "0.21.28",
  //  "org.http4s" %% "http4s-core" % "0.22.0-M1",
  //  "org.http4s" %% "http4s-core" % "0.23.3",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)
