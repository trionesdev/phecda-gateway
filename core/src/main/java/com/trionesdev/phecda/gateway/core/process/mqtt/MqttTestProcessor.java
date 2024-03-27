package com.trionesdev.phecda.gateway.core.process.mqtt;

import com.alibaba.fastjson2.JSON;
import com.trionesdev.phecda.gateway.core.GatewayProcessorComponent;
import com.trionesdev.phecda.gateway.core.model.PhecdaCommand;
import com.trionesdev.phecda.gateway.core.model.PhecdaEvent;
import com.trionesdev.phecda.gateway.mqtt.process.MqttGatewayProcessor;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.jetbrains.annotations.NotNull;

@GatewayProcessorComponent(productKeys = {"mqtt1"})
public class MqttTestProcessor extends MqttGatewayProcessor {


    @Override
    public void sendCommand(@NotNull PhecdaCommand command) {
        this.publish("mqtt-test-command", new MqttMessage(JSON.toJSONBytes(command)));
    }

    @Override
    public void onConnectComplete(boolean reconnect) {
        this.subscribe("mqtt-test-properties", 0, (topic, message) -> {
            postProperties(JSON.parseObject(message.getPayload(), PhecdaEvent.class));
        });
        this.subscribe("mqtt-test-events", 0, (topic, message) -> {
            postProperties(JSON.parseObject(message.getPayload(), PhecdaEvent.class));
        });
    }
}
