// commented out until the plugin is pushed out the maven
//safetySoftOnCompilerWarning := true

// Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

// https://github.com/scoverage/sbt-scoverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0-M3")
//

// ASSEMBLY
addSbtPlugin("com.eed3si9n"      % "sbt-assembly" % "0.14.9")
addSbtPlugin("se.marcuslonnberg" % "sbt-docker"   % "1.5.0")
///

// For SourceClear
// https://github.com/jrudolph/sbt-dependency-graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")

// SCALA STYLE

// https://github.com/scalacenter/sbt-scalafix-example/blob/master/project/plugins.sbt
resolvers += Resolver.sonatypeRepo("releases")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.1")

resolvers += Resolver.bintrayRepo("scalameta", "maven")
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.6.0-RC4")

// http://www.scalastyle.org/sbt.html
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// TODO: Remove when plugin is added to itself
scalacOptions ++= Seq(
  "-feature",
  "-Yrangepos",
  "-Ywarn-dead-code",
  "-Ywarn-inaccessible",
  "-Ywarn-unused",
  "-Ywarn-unused-import",
  "-Ywarn-value-discard",
  "-deprecation",
  "-encoding",
  "utf8"
)
