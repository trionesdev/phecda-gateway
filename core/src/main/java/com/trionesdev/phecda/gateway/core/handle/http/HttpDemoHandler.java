package com.trionesdev.phecda.gateway.core.handle.http;

import com.trionesdev.phecda.gateway.core.GatewayHandlerComponent;
import com.trionesdev.phecda.gateway.http.handle.HttpGatewayHandler;
import org.jetbrains.annotations.Nullable;
import reactor.netty.http.server.HttpServerRequest;

@GatewayHandlerComponent(productKeys = {"http1"})
public class HttpDemoHandler extends HttpGatewayHandler {
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
