pipeline {
    agent any
    stages {

        stage('stage1') {
            steps {
                echo "This is checkout step"
            }
        }
        stage('stage2') {
            steps {
                echo "This is build step"
            }
        }
        stage('stage3') {
            steps {
                echo "This is test step"
            }
        }
        stage('stage4') {
            steps {
                echo "Successfully deployed Thank you !!!"
            }
        }
    }
}