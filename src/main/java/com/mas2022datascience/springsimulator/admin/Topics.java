package com.mas2022datascience.springsimulator.admin;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class Topics {

  private @Value("${topic.name}") String topicName;
  private @Value("${topic.replication-factor}") Integer topicReplicationFactor;
  private @Value("${topic.partitions}") Integer topicPartitions;

  // creates or alters the topic
  @Bean
  NewTopic main() {
    return TopicBuilder.name(topicName)
        .partitions(topicPartitions)
        .replicas(topicReplicationFactor)
        .build();
  }

}
