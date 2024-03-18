package com.trionesdev.phecda.gateway.rest.ssp.sdk;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "${phecda.gateway.ssp.name:phecda-gateway}",
        url = "${phecda.gateway.ssp.url:}",
        path = "${phecda.gateway.ssp.path:ssp-api/gateway}"
)
public interface PhecdaGatewayFeignClient extends PhecdaGatewayRest {
}
