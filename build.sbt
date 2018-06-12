scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.11", "2.12.6")

organization := "com.1on1development"

name := "slick-migration-api-flyway"

version := "0.5.0-SNAPSHOT"

scalacOptions += "-deprecation"

libraryDependencies += "io.github.nafg" %% "slick-migration-api" % "0.4.2"

libraryDependencies += "org.flywaydb" % "flyway-core" % "5.1.1"

libraryDependencies += "com.h2database" % "h2" % "1.4.197" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

resolvers += Resolver.jcenterRepo

credentials ++= sys.env.get("BINTRAYKEY").toSeq.map(Credentials(
  "Bintray API Realm",
  "api.bintray.com",
  "naftoligug",
  _
))

publishTo := Some("slick-migration-api-flyway @ bintray" at "https://api.bintray.com/maven/1on1development/maven/slick-migration-api-flyway")
