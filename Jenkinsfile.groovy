pipeline {
    agent any
    stages {
        stage('Git Checkout') {
            steps {
                script{
                    git branch: 'main',
                    credentialsId : "4328481",
                    url : 'git@github.com:NileshChauhan-CHOCOS/doc-cicd.git'
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