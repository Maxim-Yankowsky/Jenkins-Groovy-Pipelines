pipeline {
    agent { label 'Slave-1'}

    stages {
        stage('Create') {
            steps {
                echo "Dubl-1"
                sh "mkdir test"
                sh "touch test-file"
            }
        }
        stage('rules') {
            steps {
                echo "ne pon"
                sh "chmod 700 test-file"
                echo "rabotaet"
            }
        }
        stage('final') {
            steps {
                sh "rm -rf test"
                sh "chmod 600 test-file"
                echo "gotovo"
            }
        }
    }
}
