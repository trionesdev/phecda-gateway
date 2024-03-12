package com.trionesdev.phecda.gateway.process.tcp;

import com.trionesdev.phecda.gateway.core.GatewayProcessComponent;
import com.trionesdev.phecda.gateway.tcp.process.TcpGatewayProcess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@GatewayProcessComponent(productKeys = {"a"})
public class Tcp1Process extends TcpGatewayProcess {

    @Override
    public boolean match(@Nullable byte[] data) {
        if (new String(data).equals("1\n")){
            return true;
        }
        return false;
    }

    @Override
    public boolean authentication(@Nullable byte[] data) {
        return true;
    }

    @Nullable
    @Override
    public byte[] process(@NotNull byte[] data) {
        System.out.println(new String(data)+ UUID.randomUUID());
        return ("1"+ UUID.randomUUID()).getBytes();
    }
}
