
/*publishTo := {
  if (isSnapshot.value){
    bintrayReleaseOnPublish := false //TODO remove after testing to automatically release
    Some("snapshots" at "http://oss.jfrog.org/artifactory/oss-snapshot-local")
  }
  else {
    publishTo.value
  }
}*/

//credentials := List(Path.userHome / ".bintray" / ".artifactory").filter(_.exists).map(Credentials(_)) //TODO

organization := "com.weightwatchers"
pomIncludeRepository := { _ => false } //remove optional dependencies from our pom
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))
homepage := Some(url("http://www.weightwatchers.com"))
scmInfo := Some(ScmInfo(url("https://github.com/WW-Digital/reactive-kinesis"), "scm:git@github.com:WW-Digital/reactive-kinesis.git"))
developers := List(Developer("markglh", "Mark Harrison", "markglh@gmail.com", url("https://github.com/markglh")))
publishArtifact in Test := false
bintrayReleaseOnPublish := false
publishMavenStyle := true
bintrayRepository := "oss"
bintrayOrganization in bintray := None
