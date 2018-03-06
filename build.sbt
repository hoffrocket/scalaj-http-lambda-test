javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

lazy val root = (project in file(".")).
  settings(
    name := "scalaj-http-lambda-test",
    version := "1.0",
    scalaVersion := "2.12.4",
    libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.4",
    libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.3.0"
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}