# kafka_consumer
## Prerequisite
A Kafka broker installed and running on local machine at default port 9092 (configurable) 

## Execute the first consumer with groupId: group1
```
java -jar -Dkafka.groupId=group1 <path/to/jar/file>
```

## Execute the second consumer with groupId: group2
```
java -jar -Dkafka.groupId=group2 <path/to/jar/file>
```
