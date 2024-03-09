package com.trionesdev.phecda.gateway.process.http

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.*

@Configuration
class HttpConfiguration {

    @Bean
    fun routes(): RouterFunction<ServerResponse> {
        return RouterFunctions.route(
            RequestPredicates.all()
        ) { request: ServerRequest? ->
            System.out.println(request?.path())
            ServerResponse.ok().build()
        }
    }

}