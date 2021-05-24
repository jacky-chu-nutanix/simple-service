pipeline {
    agent { docker { image 'maven:3.3.3' } }
    environment {
      GIT_SHORT_COMMIT = GIT_COMMIT.take(7)
    }

    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                echo "${PROJECT_VERSION}"
                echo "${GIT_SHORT_COMMIT}"
            }
        }
    }
}