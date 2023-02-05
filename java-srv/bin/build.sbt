lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "(java-cli-sb)",

  // orgnization name (e.g., the package name of the project)
  organization := "com.treasure-data",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  // javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines"),

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
      "org.joinfaces" % "primefaces-spring-boot-starter" % "4.3.12",
      "javax.enterprise" % "cdi-api" % "1.2" % "provided"
   ),

  mainClass := Some("example.Main")
)
