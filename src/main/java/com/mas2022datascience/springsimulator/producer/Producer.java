package com.mas2022datascience.springsimulator.producer;

import com.mas2022datascience.avro.v1.playerMetrics;
import java.time.Duration;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component
public class Producer {
  private final KafkaTemplate<String, playerMetrics> template;

  private @Value("${topic.name}") String kafkaTopic;

  public void send(String key, playerMetrics value) {

  }

  @EventListener(ApplicationStartedEvent.class)
  public void generate() {
//    faker = Faker.instance();
//    final Flux<Long> interval = Flux.interval(Duration.ofMillis(1_000));
//
//    final Flux<String> quotes = Flux.fromStream(Stream.generate(() -> faker.hobbit().quote()));
//
//    Flux.zip(interval, quotes)
//        .map(it -> template.send("hobbit-avro",
//            Integer.toString(faker.random().nextInt(42)),
//            new HobbitQuote(it.getT2()))).blockLast();

  }
}
