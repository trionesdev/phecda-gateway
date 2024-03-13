package com.trionesdev.phecda.gateway.process.http;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
public class Ta {
    protected final KafkaTemplate<String,byte[]> kafkaTemplate;
}
