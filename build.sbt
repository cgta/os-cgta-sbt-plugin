import bintray.Keys._

sbtPlugin := true

name := "os-cgta-sbt-plugin"

organization := "biz.cgta"

publishMavenStyle := false

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

bintrayPublishSettings

releaseSettings

repository in bintray := "sbt-plugins"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

bintrayOrganization in bintray := Some("cgta")

addSbtPlugin("biz.cgta" % "sbt-x-sjs-plugin" % "0.1.0")

addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.5.0-RC1")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.3")