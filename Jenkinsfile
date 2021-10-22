node {
//     env.JAVA_HOME = tool 'JDK11'
    sh 'java -version'

    try {
        stage('Checkout') {
            checkout scm
        }

        stage('Application Build') {
            def mvnHome = tool 'Maven'
            sh "mvn -version"
            sh "${mvnHome}/bin/mvn clean package -DskipTests=true"
        }

        stage('Artifacts archive') {
            step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
        }

        stage('Loading common script') {
            def common = load "/var/lib/jenkins/common.groovy"
            common.build()
        }
    }
    catch (err) {
        stage 'Sending the error.'
        mail to: "jacky.chu@nutanix.com",
        subject: "Jenkins Build Job '${env.JOB_NAME}' (${env.BUILD_NUMBER}) has failed.",
        body: "Please go to ${env.BUILD_URL} and verify the build log why it failed. Error recorded is ${err}"
        throw err
    }
}