node{
    stage('Git Clone'){
        git credentialsId: '44b1cd11-d66d-4ab0-9267-8e3e7f18fd59', url: 'git@github.com:rahulkalithkar/DevOps_CI-CD.git'
    }
    
    stage('Build & Test'){
        def mavenHome = tool name: 'maven-3', type: 'maven'
        def mavenCMD = "${mavenHome}/bin/mvn"
        sh "${mavenCMD} clean package"
    }
    
    stage('Docker Build'){
        sh 'sudo docker build -t kalithkar/spring_app:2.0 .'
    }
    
    stage('Docker Image push'){
        withCredentials([string(credentialsId: 'docker_creds', variable: 'docker_pwd')]) {
        sh 'sudo docker login -u kalithkar -p ${docker_pwd}'
        sh 'sudo docker push kalithkar/tomcat_webapp:2.0'
        }
    }
    
    stage('Docker Run'){
        sh 'sudo docker run -p 8585:8082 -d kalithkar/spring_app:2.0'
    }
    
}