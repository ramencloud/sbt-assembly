scalaVersion := "2.12.7"

lazy val scala211 = "2.11.12"
lazy val scala212 = "2.12.14"
lazy val scala213 = "2.13.6"

ThisBuild / crossScalaVersions := List(scalaVersion.value, scala211, scala212, scala213)

assembly / assemblyShadeRules := Seq(
  ShadeRule.rename("example.A" -> "example.C").inProject
)
