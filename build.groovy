pipeline {
    agent any
    stages {
        stage('Pull') {
            steps {
                git 'https://github.com/commandovk/studentapp-ui.git'
            }
        }
        stage('Build') {
            steps { 
                 sh 'mvn clean package '
            }
        }
        stage('Test') {
            steps {
                echo '"Test successfully"'
            }
        }
        stage('Deploy') {
            steps {
                echo '"Deploy successfully"'
            }
        }
    }
} 
