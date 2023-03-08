//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;
import io.netty.channel.*;
import net.minecraft.util.text.*;
import lavahack.client.*;

@Mixin(value = { NetworkManager.class }, priority = 10000)
public class MixinNetworkManager
{
    @Shadow
    @Shadow
    public boolean Method7032() {
        return false;
    }
    
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7033(final Packet packet, final CallbackInfo callbackInfo) {
        final vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK = new vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK);
        if (vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7034(final Packet packet, final CallbackInfo callbackInfo) {
        final TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV);
        if (vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "channelRead0*" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "channelRead0*" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7035(final ChannelHandlerContext channelHandlerContext, final Packet packet, final CallbackInfo callbackInfo) {
        final TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("TAIL") }, cancellable = true)
    @Inject(method = { "sendPacket(Lnet/minecraft/network/Packet;)V" }, at = { @At("TAIL") }, cancellable = true)
    private void Method7036(final Packet packet, final CallbackInfo callbackInfo) {
        final TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (ylFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "channelRead0*" }, at = { @At("TAIL") }, cancellable = true)
    @Inject(method = { "channelRead0*" }, at = { @At("TAIL") }, cancellable = true)
    private void Method7037(final ChannelHandlerContext channelHandlerContext, final Packet packet, final CallbackInfo callbackInfo) {
        final TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(packet);
        lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        if (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "closeChannel" }, at = { @At(value = "INVOKE", target = "Lio/netty/channel/Channel;isOpen()Z", remap = false) })
    @Inject(method = { "closeChannel" }, at = { @At(value = "INVOKE", target = "Lio/netty/channel/Channel;isOpen()Z", remap = false) })
    public void Method7038(final ITextComponent textComponent, final CallbackInfo callbackInfo) {
        if (this.Method7032()) {
            leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro(textComponent));
        }
    }
}
