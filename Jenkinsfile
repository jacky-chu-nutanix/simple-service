pipeline {
    agent { docker { image 'maven:3-openjdk-11' } }
    stages {
        stage('Checkout Code'){
           steps{
             checkout scm
             sh 'env'
           }
        }

        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('Build Docker Image') {
            steps {
                sh "mvn dockerfile:build"
            }
        }
        stage('Push Docker Image') {
            steps {
                sh "docker images"
            }
        }
    }
    post {
       failure {
           mail to: "jacky.chu@nutanix.com",
           subject: "Jenkins Build Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) has failed.",
           body: "Please go to ${env.BUILD_URL} and verify the build log why it failed. Error recorded is ${err}"
       }
    }
}