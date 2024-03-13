package com.trionesdev.phecda.gateway.process.http;

import com.trionesdev.phecda.gateway.core.GatewayProcessComponent;
import com.trionesdev.phecda.gateway.http.process.HttpGatewayProcess;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@GatewayProcessComponent(productKeys = {"sdsss"})
public class TestHttpGatewayProcess extends HttpGatewayProcess {

    @Override
    public boolean requestMatch(@Nullable ServerRequest request) {
        return true;
    }

    @NotNull
    @Override
    public Mono<ServerResponse> requestProcess(@Nullable ServerRequest request) {
        return null;
    }
}
