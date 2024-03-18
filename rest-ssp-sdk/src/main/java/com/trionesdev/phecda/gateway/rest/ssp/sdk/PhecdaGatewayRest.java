package com.trionesdev.phecda.gateway.rest.ssp.sdk;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface PhecdaGatewayRest {

    @PostMapping("send-command")
    Object sendCommand(@RequestBody CommandReqSO commandReqSO);

}
