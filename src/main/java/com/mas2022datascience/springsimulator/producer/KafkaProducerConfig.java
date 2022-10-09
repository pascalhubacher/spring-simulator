package com.mas2022datascience.springsimulator.producer;

import static io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG;
import static org.apache.kafka.clients.CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG;
import static org.apache.kafka.clients.CommonClientConfigs.RETRIES_CONFIG;
import static org.apache.kafka.clients.producer.ProducerConfig.BUFFER_MEMORY_CONFIG;
import static org.apache.kafka.clients.producer.ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG;
import static org.apache.kafka.clients.producer.ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG;

import com.mas2022datascience.avro.v1.playerMetrics;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import java.util.Map;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProducerConfig {

  private @Value("${spring.kafka.bootstrap-servers}") String bootstrapServers;
  private @Value("${spring.kafka.properties.schema.registry.url}") String schemaRegistryURL;

  @Bean
  public ProducerFactory<String, playerMetrics> producerFactory() {
    return new DefaultKafkaProducerFactory<>(
        Map.of(BOOTSTRAP_SERVERS_CONFIG, bootstrapServers,
        RETRIES_CONFIG, "${spring.kafka.producer.retries}",
        BUFFER_MEMORY_CONFIG, "${spring.kafka.producer.buffer-memory}",
        KEY_SERIALIZER_CLASS_CONFIG, "${spring.kafka.producer.key-serializer}.class",
        VALUE_SERIALIZER_CLASS_CONFIG, "${spring.kafka.producer.value-serializer}.class",
        SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryURL
        ));
  }

  @Bean
  public KafkaTemplate<String, playerMetrics> kafkaTemplate() {
    return new KafkaTemplate<>(producerFactory());
  }

}
