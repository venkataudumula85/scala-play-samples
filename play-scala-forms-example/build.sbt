lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "play-scala-forms-example",
    version := "2.8.x",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )

//import sbtsonar.SonarPlugin.autoImport.sonarProperties
//sonarProperties ++= Map(sonar.scoverage.reportPath="target/scala-2.13/scoverage-report/scoverage.xml")

version := sys.env("VERSION")
rpmVendor := "typesafe"
rpmLicense := Some("BSD")
