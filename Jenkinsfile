pipeline{
    agent any
    stages {
        stage("Clean"){
            steps{
                deleteDir()
            }
        }
        stage("Checkout"){
            steps{
                sh "git clone https://github.com/uyanda-shezi/loans.git"
                dir("loans"){
                    sh "git checkout develop"
                }
            }
        }
        stage("Build"){
            steps{
                dir("loans"){
                    sh "mvn clean install -Denforcer.skip=true"
                }
            }
        }
        stage("Test"){
            steps{
                dir("loans"){
                    sh "mvn test -Denforcer.skip=true"
                }
            }
        }
    }
}