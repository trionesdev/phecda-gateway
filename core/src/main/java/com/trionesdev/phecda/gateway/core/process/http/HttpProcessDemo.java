package com.trionesdev.phecda.gateway.core.process.http;

import com.trionesdev.phecda.gateway.core.GatewayProcessComponent;
import com.trionesdev.phecda.gateway.http.process.HttpGatewayProcess;
import org.jetbrains.annotations.Nullable;
import reactor.netty.http.server.HttpServerRequest;

@GatewayProcessComponent(productKeys = {"http1"})
public class HttpProcessDemo extends HttpGatewayProcess {
    @Override
    public boolean requestMatch(@Nullable HttpServerRequest request) {
        return true;
    }


    @Nullable
    @Override
    public String doProcess(@Nullable HttpServerRequest request) {
        return "http test";
    }
}
