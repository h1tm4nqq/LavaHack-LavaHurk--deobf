/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.connection.UserConnectionImpl
 *  com.viaversion.viaversion.protocol.ProtocolPipelineImpl
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.socket.SocketChannel
 *  lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D
 *  lavahack.client.iWACEjh6uHFmRs7hOXCgQ22DgRv2LPPq
 *  lavahack.client.zKUy8ckeoemeCxufJ57OvHP2HAqZz1NM
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.viaforge;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.connection.UserConnectionImpl;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.socket.SocketChannel;
import lavahack.client.FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D;
import lavahack.client.iWACEjh6uHFmRs7hOXCgQ22DgRv2LPPq;
import lavahack.client.zKUy8ckeoemeCxufJ57OvHP2HAqZz1NM;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets={"net.minecraft.network.NetworkManager$5"})
public class MixinNetworkManagerChInit {
    @Inject(method={"initChannel"}, at={@At(value="TAIL")}, remap=false)
    @Inject(method={"initChannel"}, at={@At(value="TAIL")}, remap=false)
    private void Method738(Channel channel, CallbackInfo callbackInfo) {
        if (!(channel instanceof SocketChannel)) return;
        if (FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330() == 340) return;
        UserConnectionImpl userConnectionImpl = new UserConnectionImpl(channel, true);
        new ProtocolPipelineImpl((UserConnection)userConnectionImpl);
        channel.pipeline().addBefore("encoder", "via-encoder", (ChannelHandler)new zKUy8ckeoemeCxufJ57OvHP2HAqZz1NM((UserConnection)userConnectionImpl)).addBefore("decoder", "via-decoder", (ChannelHandler)new iWACEjh6uHFmRs7hOXCgQ22DgRv2LPPq((UserConnection)userConnectionImpl));
    }
}

