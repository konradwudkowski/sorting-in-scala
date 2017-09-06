import sbt._

object Dependencies {
  lazy val cats       = "org.typelevel" %% "cats" % "0.9.0"
  lazy val scalaTest  = "org.scalatest" %% "scalatest" % "3.0.3" % "test"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

  lazy val deps = cats :: scalaTest :: scalaCheck :: Nil
}
