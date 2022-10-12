package com.mas2022datascience.springsimulator.admin;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class Topics {

  @Value(value = "${topic.player.name}")
  private String playerTopic;

  @Value(value = "${topic.player.partitions}")
  private Integer playerTopicPartitions;

  @Value(value = "${topic.player.replication-factor}")
  private short playerTopicReplicationFactor;

  @Value(value = "${topic.ball.name}")
  private String ballTopic;

  @Value(value = "${topic.ball.partitions}")
  private Integer ballTopicPartitions;

  @Value(value = "${topic.ball.replication-factor}")
  private short ballTopicReplicationFactor;


  // creates or alters the topic
  @Bean
  public NewTopic player() {
    return TopicBuilder.name(playerTopic)
        .partitions(playerTopicPartitions)
        .replicas(playerTopicReplicationFactor)
        .build();
  }

  @Bean
  public NewTopic ball() {
    return TopicBuilder.name(ballTopic)
        .partitions(ballTopicPartitions)
        .replicas(ballTopicReplicationFactor)
        .build();
  }
}
