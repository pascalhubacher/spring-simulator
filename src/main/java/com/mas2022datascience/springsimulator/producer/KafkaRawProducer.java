package com.mas2022datascience.springsimulator.producer;

import com.mas2022datascience.avro.v1.rawMetrics;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

@Component
public class KafkaRawProducer {
  @Autowired
  private KafkaTemplate<String, rawMetrics> kafkaTemplate;

  @Value(value = "${topic.raw.name}")
  private String rawTopic;

  public void produce(String key, rawMetrics value) {

    long time = System.currentTimeMillis();

    SendResult<String, rawMetrics> result = null;
    try {
      result = kafkaTemplate.send(rawTopic, key, value).get(10, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    } catch (TimeoutException e) {
      e.printStackTrace();
    }

    long elapsedTime = System.currentTimeMillis() - time;
    System.out.printf("sent record(key=%s value=%s) "
            + "meta(partition=%d, offset=%d) time=%d\n",
        key, value, result.getRecordMetadata().partition(),
        result.getRecordMetadata().offset(), elapsedTime);
  }

}
