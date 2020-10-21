package io.confluent.developer.spring.avro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import io.confluent.developer.User;

@Service
public class Producer {
  @Autowired
  private KafkaTemplate<String, User> kafkaTemplate;


  void sendMessage(User user) {
    this.kafkaTemplate.send("users", user.getName(), user);
  }
}
