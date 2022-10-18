package com.mas2022datascience.springsimulator.admin;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class Topics {

  @Value(value = "${topic.raw.name}")
  private String rawTopic;
  @Value(value = "${topic.raw.partitions}")
  private Integer rawTopicPartitions;
  @Value(value = "${topic.raw.replication-factor}")
  private Integer rawTopicReplicationFactor;

  // creates or alters the topic
  @Bean
  public NewTopic raw() {
    return TopicBuilder.name(rawTopic)
        .partitions(rawTopicPartitions)
        .replicas(rawTopicReplicationFactor)
        .build();
  }

  @Value(value = "${topic.tracab.name}")
  private String tracabTopic;
  @Value(value = "${topic.tracab.partitions}")
  private Integer tracabTopicPartitions;
  @Value(value = "${topic.tracab.replication-factor}")
  private Integer tracabTopicReplicationFactor;

  // creates or alters the topic
  @Bean
  public NewTopic tracab() {
    return TopicBuilder.name(tracabTopic)
        .partitions(tracabTopicPartitions)
        .replicas(tracabTopicReplicationFactor)
        .build();
  }
}
