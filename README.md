# Spark-Scala Maven project

This is a minimal Maven project configuration to run Spark with Scala. This project has a docker to run the spark apps.

## Requirements

* [Docker engine](https://docs.docker.com/engine/install/ubuntu/)
* [Docker compose](https://docs.docker.com/compose/install/#install-compose-on-linux-systems)
* [Maven](https://linuxize.com/post/how-to-install-apache-maven-on-ubuntu-20-04/) 

## How to generate jar from scala

Inside the project folder (spark-scala-project-model-maven):
```
mvn compile
mvn package
```

## How to run the Spark docker container
To start the docker container:
```
cd spark-scala-project-model-maven/docker-spark

docker-compose up -d
```

After started the container, you can access the Spark UI at http://localhost:8080/

## How to run the Spark application

To submit the application:
```
cd spark-scala-project-model-maven/docker-spark

docker exec -it spark_master spark-submit --master spark://spark:7077 --class SampleApp /home/spark-apps/SparkSample-1.0-SNAPSHOT.jar
```

## How to stop the Spark docker container
```
cd spark-scala-project-model-maven/docker-spark

docker-compose down --remove-orphans
```