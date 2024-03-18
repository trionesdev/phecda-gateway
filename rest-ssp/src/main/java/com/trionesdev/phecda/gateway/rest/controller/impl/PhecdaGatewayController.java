package com.trionesdev.phecda.gateway.rest.controller.impl;

import com.trionesdev.phecda.gateway.rest.ssp.sdk.CommandReqSO;
import com.trionesdev.phecda.gateway.rest.ssp.sdk.PhecdaGatewayRest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.trionesdev.phecda.gateway.rest.support.RestConstants.CONTEXT_PATH;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(CONTEXT_PATH)
public class PhecdaGatewayController implements PhecdaGatewayRest {
    @Override
    public Object sendCommand(CommandReqSO commandReqSO) {
        return null;
    }
}
