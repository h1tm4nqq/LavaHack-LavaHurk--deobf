/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  lavahack.client.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro
 *  lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
 *  lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 *  lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  net.minecraft.util.text.ITextComponent
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import io.netty.channel.ChannelHandlerContext;
import lavahack.client.Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro;
import lavahack.client.TAt7QzOqrfY8P9hNnkrnImm9scdhYm72;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={NetworkManager.class}, priority=10000)
public class MixinNetworkManager {
    @Shadow
    @Shadow
    public boolean Method7032() {
        return false;
    }

    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7033(Packet packet, CallbackInfo callbackInfo) {
        vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2 = new vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2);
        if (!vpp6Qgo9XgeI4Edpcgu816Ot6FDu0qjK2.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7034(Packet packet, CallbackInfo callbackInfo) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2 = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2);
        if (!vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"channelRead0*"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"channelRead0*"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7035(ChannelHandlerContext channelHandlerContext, Packet packet, CallbackInfo callbackInfo) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV);
        if (!uCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="TAIL")}, cancellable=true)
    @Inject(method={"sendPacket(Lnet/minecraft/network/Packet;)V"}, at={@At(value="TAIL")}, cancellable=true)
    private void Method7036(Packet packet, CallbackInfo callbackInfo) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (!ylFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"channelRead0*"}, at={@At(value="TAIL")}, cancellable=true)
    @Inject(method={"channelRead0*"}, at={@At(value="TAIL")}, cancellable=true)
    private void Method7037(ChannelHandlerContext channelHandlerContext, Packet packet, CallbackInfo callbackInfo) {
        TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new TAt7QzOqrfY8P9hNnkrnImm9scdhYm72.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(packet);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
        if (!leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"closeChannel"}, at={@At(value="INVOKE", target="Lio/netty/channel/Channel;isOpen()Z", remap=false)})
    @Inject(method={"closeChannel"}, at={@At(value="INVOKE", target="Lio/netty/channel/Channel;isOpen()Z", remap=false)})
    public void Method7038(ITextComponent iTextComponent, CallbackInfo callbackInfo) {
        if (!this.Method7032()) return;
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new Jr8nWqrYxTiol8BzNjKMcZ3tq67MmWro(iTextComponent));
    }
}

