name := "pecman"

version := "1.0"

scalaVersion := "2.11.8"


scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "spray" at "http://repo.spray.io/"

val sprayVersion = "1.3.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.8",
  "com.typesafe.akka" %% "akka-http-experimental" % "0.7",
  "io.spray" %% "spray-routing" % sprayVersion,
  "io.spray" %% "spray-client" % sprayVersion,
  "io.spray" %% "spray-testkit" % sprayVersion % "test",
  "org.json4s" %% "json4s-native" % "3.2.10",
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "com.typesafe.akka" % "akka-slf4j_2.11" % "2.4.8",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)



