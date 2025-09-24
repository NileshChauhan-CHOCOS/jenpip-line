pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                script{
                    git branch: 'main',
                    credentialsId : "",
                    url : ''
                }
                echo "This is checkout step"
            }
        }
        stage('build') {
            steps {
                echo "This is build step"
            }
        }
        stage('test') {
            steps {
                echo "This is test step"
            }
        }
        stage('deploy') {
            steps {
                echo "Successfully deployed Thank you !!!"
            }
        }
    }
}