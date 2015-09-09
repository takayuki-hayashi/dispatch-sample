lazy val commonSettings = Seq(
  organization := "hayassh",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
	settings(commonSettings: _*).
	settings(
	    name := "dispatch-sample",
	    version := "1.0",
	    scalaVersion := "2.11.7",
	    resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
	    libraryDependencies ++= Seq(
        "net.databinder.dispatch" % "dispatch-core_2.11" % "0.11.3",
        "net.databinder.dispatch" % "dispatch-json4s-native_2.11" % "0.11.3",
	    	"org.specs2" % "specs2_2.11" % "3.3.1",
	    	"org.specs2" % "specs2-core_2.11" % "3.6.4-20150901013911-1f41c5e",
	    	"org.specs2" % "specs2-junit_2.11" % "3.6.4-20150901013911-1f41c5e"
	    )
	)