package com.trionesdev.phecda.gateway.rest.ssp.sdk;

import lombok.Data;

import java.util.Map;

@Data
public class CommandReqSO {
    private String version;
    private String id;
    private String method;
    private String productKey;
    private String deviceName;
    private String commandName;
    private Map<String, String> params;
    private Map<String, Object> body;
}
