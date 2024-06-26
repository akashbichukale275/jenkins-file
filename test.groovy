pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/sharadrathod/studentapp-ui.git'
            }
        }
        stage('Build') {
            steps { 
                sh 'mvn clean package '
            }
        }
        stage('Test') {
            steps {
                
            }
        }
        stage('Deploy') {
            steps {
                echo '"Deploy successfully"'
            }
        }
    }
} 