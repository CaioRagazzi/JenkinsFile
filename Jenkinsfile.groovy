pipeline {
    agent any

    stages {
         stage('Load Parameters') {
            steps {
                script{
                    println "=======Load Parameters============"
                    dir('Caioooo'){
                        checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[url: 'https://github.com/CaioRagazzi/TesteHotel.git']]])
                    }
                }
            }
        }
        stage('teste') {
            steps {
                script{
                    dir('Caioooo'){
                        println(dir)
                    }
                }
            }
        }
        // stage('Pwd') {
        //     steps {
        //         echo 'Pwding...'
        //         println(pwd())
        //     }
        // }
        // stage('Build') {
        //     steps {
        //         echo 'Building..'
        //         dir('Caioooo'){
        //         bat "dotnet clean ConsultaCredito.sln"
        //         }
        //     }
        // }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deploying....'
        //     }
        // }
    
    }
}