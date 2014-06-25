
sbtPlugin := true

name := "os-cgta-sbt-plugin"

organization := "biz.cgta"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

Seq[Setting[_]](shellPrompt <<= (thisProjectRef, version) {
  (id, v) => _ => "%s:%s> ".format(id.project, v)
})
