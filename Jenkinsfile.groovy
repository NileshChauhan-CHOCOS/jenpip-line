pipeline {
    agent any
    stages {

        stage('checkout') {
            steps {
                echo "This is checkout step"
            }
        }
        stage('Build') {
            steps {
                echo "This is build step"
            }
        }
        stage('Test') {
            steps {
                echo "This is test step"
            }
        }
        stage('Deploy') {
            steps {
                echo "Successfully deployed Thank you !!!"
            }
        }
    }
}