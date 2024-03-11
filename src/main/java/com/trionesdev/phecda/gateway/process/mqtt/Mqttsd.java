package com.trionesdev.phecda.gateway.process.mqtt;

import com.trionesdev.phecda.gateway.core.GatewayProcessComponent;
import com.trionesdev.phecda.gateway.core.model.PhecdaCommand;
import com.trionesdev.phecda.gateway.mqtt.process.MqttGatewayProcess;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@GatewayProcessComponent(productKeys = {"sd"})
public class Mqttsd extends MqttGatewayProcess {

    @Override
    public boolean requestMatch(@Nullable String topic, @Nullable MqttMessage message) {
        return false;
    }

    @Override
    public void requestProcess(@Nullable String topic, @Nullable MqttMessage message) {

    }

    @Override
    public void sendCommand(@NotNull PhecdaCommand command) {

    }
}
