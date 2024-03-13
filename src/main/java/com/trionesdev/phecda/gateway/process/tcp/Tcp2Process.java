package com.trionesdev.phecda.gateway.process.tcp;

import com.trionesdev.phecda.gateway.core.GatewayProcessComponent;
import com.trionesdev.phecda.gateway.core.model.PhecdaCommand;
import com.trionesdev.phecda.gateway.tcp.process.TcpGatewayProcess;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@RequiredArgsConstructor
@GatewayProcessComponent(productKeys = {"a"})
public class Tcp2Process extends TcpGatewayProcess {


    @Override
    public boolean match(@Nullable byte[] data) {
        if (new String(data).equals("2\n")){
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
        return ("2"+ UUID.randomUUID()).getBytes();
    }

    @Nullable
    @Override
    public byte[] commandTransform(@NotNull PhecdaCommand command) {
        return new byte[0];
    }
}
