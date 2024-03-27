package com.trionesdev.phecda.gateway.rest.controller.impl;

import com.trionesdev.phecda.gateway.core.GatewayProcessor;
import com.trionesdev.phecda.gateway.core.GatewayProcessFactory;
import com.trionesdev.phecda.gateway.core.model.PhecdaCommand;
import com.trionesdev.phecda.gateway.rest.ssp.sdk.CommandReqSO;
import com.trionesdev.phecda.gateway.rest.ssp.sdk.PhecdaGatewayRest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

import static com.trionesdev.phecda.gateway.rest.support.RestConstants.CONTEXT_PATH;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(CONTEXT_PATH)
public class PhecdaGatewayController implements PhecdaGatewayRest {
    private final GatewayProcessFactory gatewayProcessFactory;

    @Override
    public Map<String,Object> sendCommand(CommandReqSO commandReqSO) {
        GatewayProcessor gatewayProcessor = gatewayProcessFactory.getGatewayProcess(commandReqSO.getProductKey());
        if (Objects.isNull(gatewayProcessor)) {
            throw new RuntimeException("[PhecdaGatewayController] Gateway process not found");
        }
        PhecdaCommand command = new PhecdaCommand();
        command.setVersion(commandReqSO.getVersion());
        command.setMethod(commandReqSO.getMethod());
        command.setDeviceName(commandReqSO.getDeviceName());
        command.setCommandName(commandReqSO.getCommandName());
        command.setParams(commandReqSO.getParams());
        command.setBody(commandReqSO.getBody());
        gatewayProcessor.sendCommand(command);
        return null;
    }
}
