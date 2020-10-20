##Getting started
1-export CONFLUENT_HOME=<path-to-confluent>
2-export PATH=$PATH:$CONFLUENT_HOME/bin
3-confluent local start
4-mvn clean install
5-java -jar kafka-avro-0.0.1-SNAPSHOT.jar
6-curl -X POST -d 'name=Green&age=99' http://localhost:9080/user/publish
