package com.trionesdev.phecda.gateway.process.http;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class Tass extends Ta{

    public Tass(KafkaTemplate<String, byte[]> kafkaTemplate) {
        super(kafkaTemplate);
    }
}
