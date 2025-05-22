pipeline {
    agent any
    tools { 
        maven 'MAVEN_3_9_5' 
        jdk 'JDK_1_17' 
    }
	
    stages {
        stage ('Compile Stage 2024-02') {

            steps {
                withMaven(maven : 'MAVEN_3_9_5') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage 2024-02') {

            steps {
                withMaven(maven : 'MAVEN_3_9_5') {
                    bat 'mvn test'
                }
            }
        }

	 /*stage ('sonarQube Analysis') {
		steps {
			withSonarQubeEnv('sonarLocal') {
				sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=one'
			}
		}
	}*/

        stage ('package Stage 2024-2') {
            steps {
                withMaven(maven : 'MAVEN_3_9_5') {
                    bat 'mvn package'
                }
            }
        }
		 // Descomentar cuando se tenga instalado en Tomcat
		stage('Deploy tomcat') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL} direcion ${env.WORKSPACE}"	
                withMaven(maven : 'MAVEN_3_9_5') {
					bat '"C:\\Program Files\\Git\\mingw64\\bin\\curl.exe" -T ".\\target\\sistemaventas.war" "http://tomcat:tomcat@localhost:9090/manager/text/deploy?path=/sistema-ventas-spring&update=true"'
                } 
            }
        }

    }
}
