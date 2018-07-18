import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.6"
)

lazy val root = (project in file(".")).
  settings(
    inThisBuild(
      commonSettings,
    ),
    name := "Hello1",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3",
  )
  .enablePlugins(JavaAppPackaging)
  .aggregate(util)

lazy val util = (project in file("util")).
  settings(
    inThisBuild(
      commonSettings,
    ),
    name := "util",
  )