package com.trionesdev.phecda.gateway.process.mqtt

import com.trionesdev.phecda.gateway.process.GatewayProcess
import org.eclipse.paho.client.mqttv3.MqttMessage

abstract class MqttGatewayProcess : GatewayProcess {

    abstract fun match(topic: String,message: MqttMessage):Boolean
}