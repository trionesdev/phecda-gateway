package com.trionesdev.phecda.gateway.core.handle.mqtt;

import com.alibaba.fastjson2.JSON;
import com.trionesdev.phecda.gateway.core.GatewayHandlerComponent;
import com.trionesdev.phecda.gateway.core.model.PhecdaCommand;
import com.trionesdev.phecda.gateway.core.model.PhecdaEvent;
import com.trionesdev.phecda.gateway.mqtt.handle.MqttGatewayHandler;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.jetbrains.annotations.NotNull;

@GatewayHandlerComponent(productKeys = {"mqtt1"})
public class MqttDemoHandler extends MqttGatewayHandler {


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
