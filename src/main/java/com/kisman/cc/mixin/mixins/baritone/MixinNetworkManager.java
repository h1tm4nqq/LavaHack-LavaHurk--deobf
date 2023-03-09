//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.PacketEvent
 *  baritone.api.event.events.type.EventState
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.util.concurrent.GenericFutureListener
 *  net.minecraft.network.EnumPacketDirection
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.Packet
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.type.EventState;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Iterator;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={NetworkManager.class})
public class MixinNetworkManager {
    @Shadow
    private Channel Field11830;
    @Shadow
    @Final
    private EnumPacketDirection Field11831;

    @Inject(method={"dispatchPacket"}, at={@At(value="HEAD")})
    @Inject(method={"dispatchPacket"}, at={@At(value="HEAD")})
    private void Method3755(Packet packet, GenericFutureListener[] genericFutureListenerArray, CallbackInfo callbackInfo) {
        MixinNetworkManager mixinNetworkManager = this;
        if (null != EnumPacketDirection.CLIENTBOUND) {
            return;
        }
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            if (iBaritone.getPlayerContext().player() == null || iBaritone.getPlayerContext().player().connection.getNetworkManager() != (NetworkManager)this) continue;
            iBaritone.getGameEventHandler().onSendPacket(new PacketEvent((NetworkManager)this, EventState.PRE, packet));
        }
    }

    @Inject(method={"dispatchPacket"}, at={@At(value="RETURN")})
    @Inject(method={"dispatchPacket"}, at={@At(value="RETURN")})
    private void Method3756(Packet packet, GenericFutureListener[] genericFutureListenerArray, CallbackInfo callbackInfo) {
        MixinNetworkManager mixinNetworkManager = this;
        if (null != EnumPacketDirection.CLIENTBOUND) {
            return;
        }
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            if (iBaritone.getPlayerContext().player() == null || iBaritone.getPlayerContext().player().connection.getNetworkManager() != (NetworkManager)this) continue;
            iBaritone.getGameEventHandler().onSendPacket(new PacketEvent((NetworkManager)this, EventState.POST, packet));
        }
    }

    @Inject(method={"channelRead0"}, at={@At(value="INVOKE", target="net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V")})
    @Inject(method={"channelRead0"}, at={@At(value="INVOKE", target="net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V")})
    private void Method3757(ChannelHandlerContext channelHandlerContext, Packet packet, CallbackInfo callbackInfo) {
        MixinNetworkManager mixinNetworkManager = this;
        if (null != EnumPacketDirection.CLIENTBOUND) {
            return;
        }
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            if (iBaritone.getPlayerContext().player() == null || iBaritone.getPlayerContext().player().connection.getNetworkManager() != (NetworkManager)this) continue;
            iBaritone.getGameEventHandler().onReceivePacket(new PacketEvent((NetworkManager)this, EventState.PRE, packet));
        }
    }

    /*
     * Exception decompiling
     */
    @Inject(method={"channelRead0"}, at={@At(value="RETURN")})
    @Inject(method={"channelRead0"}, at={@At(value="RETURN")})
    private void Method3758(ChannelHandlerContext var1, Packet var2, CallbackInfo var3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9 : RETURN - null : trying to set 1 previously set to 2
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:207)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.populateStackInfo(Op02WithProcessedDataAndRefs.java:1559)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:434)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         *     at the.bytecode.club.bytecodeviewer.decompilers.impl.CFRDecompiler.decompileToZip(CFRDecompiler.java:306)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.decompileSaveAll(ResourceDecompiling.java:262)
         *     at the.bytecode.club.bytecodeviewer.resources.ResourceDecompiling.lambda$decompileSaveAll$0(ResourceDecompiling.java:127)
         *     at java.base/java.lang.Thread.run(Thread.java:833)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

