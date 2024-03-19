package com.trionesdev.phecda.gateway.rest.ssp.sdk;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface PhecdaGatewayRest {

    @PostMapping("send-command")
    Map<String, Object> sendCommand(@RequestBody CommandReqSO commandReqSO);

}
