import mill._, scalalib._
import mill.scalanativelib._

object hello extends ScalaNativeModule {
  def scalaVersion = "2.13.6"
  def scalaNativeVersion = "0.4.0"
  def nativeMode = "release"

  override def resources = T.sources {
    millSourcePath / "resources"
  }

  object test extends Tests {
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
