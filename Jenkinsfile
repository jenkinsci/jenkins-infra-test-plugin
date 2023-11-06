#!/usr/bin/env groovy
@Library('pipeline-library@pull/783/head') _

stage('test') {
    node('windows-2019') {
        infra.withDockerCredentials {
            echo "OK"
        }
    }
}
