package com.mas2022datascience.springsimulator.admin;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class Topics {

  @Value(value = "${topic.name}")
  private String mainTopic;

  @Value(value = "${topic.partitions}")
  private Integer testTopicPartitions;

  @Value(value = "${topic.replication-factor}")
  private short testTopicReplicationFactor;

  // creates or alters the topic
  @Bean
  public NewTopic main() {
    return TopicBuilder.name(mainTopic)
        .partitions(testTopicPartitions)
        .replicas(testTopicReplicationFactor)
        .build();
  }
}
