@Library('pipeline-library@pull/1008/head') _

buildPlugin(
  useContainerAgent: true,
  configurations: [
    [platform: 'linux', jdk: 25],
    [platform: 'windows', jdk: 25],
])
// test
node('docker || linux-amd64-docker') {
  stage('Test publishBuildStatusReport') {
    publishBuildStatusReport()
  }
}
