package com.trionesdev.phecda.gateway.core.process.http;

import com.trionesdev.phecda.gateway.core.GatewayProcessorComponent;
import com.trionesdev.phecda.gateway.http.process.HttpGatewayProcessor;
import org.jetbrains.annotations.Nullable;
import reactor.netty.http.server.HttpServerRequest;

@GatewayProcessorComponent(productKeys = {"http1"})
public class HttpProcessorDemo extends HttpGatewayProcessor {
    @Override
    public boolean match(@Nullable HttpServerRequest request) {
        return true;
    }


    @Nullable
    @Override
    public String doProcess(@Nullable HttpServerRequest request) {
        return "http test";
    }
}
