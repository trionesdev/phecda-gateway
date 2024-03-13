package com.trionesdev.phecda.gateway.process.http;

import com.trionesdev.phecda.gateway.core.GatewayProcessComponent;
import com.trionesdev.phecda.gateway.core.model.PhecdaEvent;
import com.trionesdev.phecda.gateway.http.process.HttpGatewayProcess;
import kotlin.Unit;
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

    @Nullable
    @Override
    public Object doProcess(@Nullable ServerRequest request) {
        PhecdaEvent event =  new PhecdaEvent();
        event.setId("sss");
        postProperties(event);
        return event;
    }
}
