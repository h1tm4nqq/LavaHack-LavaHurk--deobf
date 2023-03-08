//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.viaforge;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import io.netty.channel.socket.*;
import com.viaversion.viaversion.connection.*;
import com.viaversion.viaversion.protocol.*;
import com.viaversion.viaversion.api.connection.*;
import io.netty.channel.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(targets = { "net.minecraft.network.NetworkManager$5" })
public class MixinNetworkManagerChInit
{
    @Inject(method = { "initChannel" }, at = { @At("TAIL") }, remap = false)
    @Inject(method = { "initChannel" }, at = { @At("TAIL") }, remap = false)
    private void Method738(final Channel channel, final CallbackInfo callbackInfo) {
        if (channel instanceof SocketChannel && FhLz4BFGdUZSlxEydtAGWmNr3cGJl86D.Method7320().Method7330() != 340) {
            final UserConnectionImpl userConnectionImpl = new UserConnectionImpl(channel, true);
            new ProtocolPipelineImpl((UserConnection)userConnectionImpl);
            channel.pipeline().addBefore("encoder", "via-encoder", (ChannelHandler)new zKUy8ckeoemeCxufJ57OvHP2HAqZz1NM((UserConnection)userConnectionImpl)).addBefore("decoder", "via-decoder", (ChannelHandler)new iWACEjh6uHFmRs7hOXCgQ22DgRv2LPPq((UserConnection)userConnectionImpl));
        }
    }
}
