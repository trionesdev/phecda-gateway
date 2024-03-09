package com.trionesdev.phecda.gateway.process.http;

import org.springframework.web.reactive.function.server.*;

public class HttpConfiguration2 {

    RouterFunction<ServerResponse> ss(){
        return RouterFunctions.route(RequestPredicates.all(), request -> ServerResponse.ok().build());
    }

}
