/*
 See the documentation for more options:
 https://github.com/jenkins-infra/pipeline-library/
*/
@Library('pipeline-library@pull/615/head') _
buildPlugin(
  useContainerAgent: true,
  configurations: [
    [platform: 'linux', jdk: 17],
    [platform: 'windows', jdk: 11],
])
