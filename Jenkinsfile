@Library('qaradigmaPipelineLibrary@master') _

node('docker-jenkinsslave-base') {

config {
buildTool = [
name : 'maven',
version : '3.3.9'
]
gitSCM = [
name : 'gitLab'
]
java : 'JDK 1.8'
pathSonarProperties = 'sonar-project.properties'
}
//test
doInitTools()
doCheckout()
doBuild()
doUnitTests()
doAcceptanceTest()
doStaticAnalysis()
doGenerateArtifact()
doUploadArtifacts()
//doIntegrationTest()
//doUploadDockerImage()
//doDeploy()

}
