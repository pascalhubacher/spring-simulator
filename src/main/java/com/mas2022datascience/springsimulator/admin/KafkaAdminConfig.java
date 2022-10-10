package com.mas2022datascience.springsimulator.admin;

import java.util.Map;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class KafkaAdminConfig {

    //private @Value("${spring.kafka.bootstrap-servers}") String bootstrapServers;

    @Bean
    public KafkaAdmin admin() {
        return new KafkaAdmin((Map.of(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "${spring.kafka.bootstrap-servers}")));
    }

}
