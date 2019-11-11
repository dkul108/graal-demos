name := "graal-demos"

version := "0.1"

scalaVersion := "2.12.10"

lazy val helloworld = (project in file("helloworld"))
  .settings(
    name := "helloworld",
    crossScalaVersions := Seq("2.12.10", "2.13.1")
  )

lazy val akka = (project in file("akka"))
  .settings(
    name := "akka",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.1.10"
    )
  )

lazy val lucene = (project in file("lucene"))
  .settings(
    name := "lucene",
    libraryDependencies ++= Seq(
      "org.apache.lucene" % "lucene-core" % "8.3.0",
      "org.apache.lucene" % "lucene-analyzers-common" % "8.3.0",
      "com.oracle.substratevm" % "svm" % "19.2.1" % Provided
    )
  )

lazy val benchmark = (project in file("benchmark"))
  .settings(
    name := "benchmark"
  ).enablePlugins(JmhPlugin)