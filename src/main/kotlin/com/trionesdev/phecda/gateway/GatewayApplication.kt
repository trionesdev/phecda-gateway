package com.trionesdev.phecda.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PhecdaGatewayApplication

fun main(args: Array<String>) {
	runApplication<PhecdaGatewayApplication>(*args)
}
