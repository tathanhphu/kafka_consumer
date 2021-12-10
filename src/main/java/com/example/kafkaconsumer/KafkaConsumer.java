package com.example.kafkaconsumer;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnBean(KafkaConsumerConfig.class)
public class KafkaConsumer {

  @Value("${kafka.groupId}")
  private String kafkaGroupId;

  public KafkaConsumer() {
  }

  @KafkaListener(
      topics = "${kafka.topic.name}",
      containerFactory = "kafkaListenerContainerFactory"
  )
  public void receiveMessage(String message) {
    System.out.println("Received Message in group: " + kafkaGroupId + "\nMessage: " + message);
  }
}
