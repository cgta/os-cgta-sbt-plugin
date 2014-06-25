package cgta.osbt

import sbt._
import sbt.Keys._


object OsCgtaSbtPlugin {
  sys.props("scalac.patmat.analysisBudget") = "512"

  object Compiler {
    lazy val settings = Seq[Setting[_]](
      scalacOptions += "-deprecation",
      scalacOptions += "-unchecked",
      scalacOptions += "-feature",
      scalacOptions += "-language:implicitConversions",
      scalacOptions += "-language:higherKinds"
    )
  }

  object Prompt {
    lazy val settings = Seq[Setting[_]](shellPrompt <<= (thisProjectRef, version) {
      (id, v) => _ => "otest-build:%s:%s> ".format(id.project, v)
    })
  }

  lazy val basicSettings =
    Seq[Setting[_]](organization := "biz.cgta") ++
      Compiler.settings ++
      Prompt.settings

}


//
//  object SbtPlugins {
//    lazy val scalaJs = addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % Versions.scalaJs)
//  }
//
//  object CompilerPlugins {
//    lazy val macrosPlugin = addCompilerPlugin("org.scalamacros" %% "paradise" % "2.0.0" cross CrossVersion.full)
//  }
//
//  object Libs {
//    lazy val macrosQuasi      = Seq("org.scalamacros" %% "quasiquotes" % "2.0.0")
//    lazy val sbtTestInterface = Seq("org.scala-sbt" % "test-interface" % "1.0")
//    lazy val scalaJsTools     = Seq("org.scala-lang.modules.scalajs" %% "scalajs-tools" % Versions.scalaJs)
//    //    lazy val scalaJsPlugin     = Seq("org.scala-lang.modules.scalajs" %% "scalajs-plugin" % Versions.scalaJs)
//    val scalaReflect = "org.scala-lang" % "scala-reflect"
//  }
