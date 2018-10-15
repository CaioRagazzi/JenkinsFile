pipeline {
    agent any

    stages {
         stage('Load Parameters') {
            steps {
                script{
                    println "=======Load Parameters============"
                    dir('Caioooo'){
                        checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/CaioRagazzi/ConsultaCredito.git']]])
                    }
                }
            }
        }
        stage('Restore') {
            steps {
                echo 'Restoringgg...'
                dir('Caioooo'){
                bat "dir"
                }
            }
        }
        stage('Pwd') {
            steps {
                echo 'Pwding...'
                println(pwd())
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                bat "dotnet clean"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
