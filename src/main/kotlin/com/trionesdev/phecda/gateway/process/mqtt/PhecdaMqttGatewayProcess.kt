package com.trionesdev.phecda.gateway.process.mqtt

import org.eclipse.paho.client.mqttv3.MqttMessage

class PhecdaMqttGatewayProcess: MqttGatewayProcess() {
    override fun match(topic: String, message: MqttMessage): Boolean {
        TODO("Not yet implemented")
    }

    override fun responseMatch() {
        TODO("Not yet implemented")
    }

}