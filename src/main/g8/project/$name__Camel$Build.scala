import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      libraryDependencies ++= Seq(
          "com.imageworks.scala-migrations" %% "scala-migrations" % "1.1.1"
      ),
      giter8.ScaffoldPlugin.scaffoldSettings:_*
      // add other settings here
    )
  )
}

