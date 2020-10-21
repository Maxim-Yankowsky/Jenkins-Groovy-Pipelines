pipeline {
    agent { label 'Slave-1'}

    stages {
        stage('Nemnojko teks po dibilnomy napisan') {
            steps {
                echo "Dubl-1"
                sh "mkdir test"
                sh "touch test-file"
            }
        }
        stage('do sih por nihuya ne ponjal') {
            steps {
                echo "ne pon"
                sh "chmod 700 test-file"
                echo "rabotaet blet"
            }
        }
        stage('nu bolee menee ponjal') {
            steps {
                sh "rm -rf test"
                sh "chmod 600 test-file"
                echo "gotovo"
            }
        }
    }
}
