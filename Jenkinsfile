pipeline {
    agent { docker { image 'maven:3-openjdk-11' } }
    environment {
      GIT_SHORT_COMMIT = GIT_COMMIT.take(7)
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }
        stage('Build Docker Image') {
            steps {
                sh "mvn dockerfile:build -DPROJECT_VERSION=${PROJECT_VERSION} -DGIT_SHORT_COMMIT=$GIT_SHORT_COMMIT"
            }
        }
        stage('Push Docker Image') {
            steps {
                sh "docker images"
            }
        }
    }
}