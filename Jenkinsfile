pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "cd play-scala-anorm-example && sbt compile"
            }
        }

        stage('Test') {
            steps {
                echo "Testing..."
                sh "cd play-scala-anorm-example && sbt test"
            }
        }

        stage('Package') {
            steps {
                echo "Packaging..."
                sh "cd play-scala-anorm-example && sbt package"
            }
        }

    }
}
