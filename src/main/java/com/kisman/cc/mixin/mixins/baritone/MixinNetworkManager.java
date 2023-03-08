//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import org.spongepowered.asm.mixin.*;
import net.minecraft.network.*;
import io.netty.util.concurrent.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import baritone.api.*;
import baritone.api.event.events.type.*;
import baritone.api.event.events.*;
import java.util.*;
import org.spongepowered.asm.mixin.injection.*;
import io.netty.channel.*;

@Mixin({ NetworkManager.class })
public class MixinNetworkManager
{
    @Shadow
    private Channel Field11830;
    @Shadow
    @Final
    private EnumPacketDirection Field11831;
    
    @Inject(method = { "dispatchPacket" }, at = { @At("HEAD") })
    @Inject(method = { "dispatchPacket" }, at = { @At("HEAD") })
    private void Method3755(final Packet packet, final GenericFutureListener[] array, final CallbackInfo callbackInfo) {
        if (null != EnumPacketDirection.CLIENTBOUND) {
            return;
        }
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (baritone.getPlayerContext().player() != null && baritone.getPlayerContext().player().connection.getNetworkManager() == (NetworkManager)this) {
                baritone.getGameEventHandler().onSendPacket(new PacketEvent((NetworkManager)this, EventState.PRE, packet));
            }
        }
    }
    
    @Inject(method = { "dispatchPacket" }, at = { @At("RETURN") })
    @Inject(method = { "dispatchPacket" }, at = { @At("RETURN") })
    private void Method3756(final Packet packet, final GenericFutureListener[] array, final CallbackInfo callbackInfo) {
        if (null != EnumPacketDirection.CLIENTBOUND) {
            return;
        }
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (baritone.getPlayerContext().player() != null && baritone.getPlayerContext().player().connection.getNetworkManager() == (NetworkManager)this) {
                baritone.getGameEventHandler().onSendPacket(new PacketEvent((NetworkManager)this, EventState.POST, packet));
            }
        }
    }
    
    @Inject(method = { "channelRead0" }, at = { @At(value = "INVOKE", target = "net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V") })
    @Inject(method = { "channelRead0" }, at = { @At(value = "INVOKE", target = "net/minecraft/network/Packet.processPacket(Lnet/minecraft/network/INetHandler;)V") })
    private void Method3757(final ChannelHandlerContext channelHandlerContext, final Packet packet, final CallbackInfo callbackInfo) {
        if (null != EnumPacketDirection.CLIENTBOUND) {
            return;
        }
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (baritone.getPlayerContext().player() != null && baritone.getPlayerContext().player().connection.getNetworkManager() == (NetworkManager)this) {
                baritone.getGameEventHandler().onReceivePacket(new PacketEvent((NetworkManager)this, EventState.PRE, packet));
            }
        }
    }
    
    @Inject(method = { "channelRead0" }, at = { @At("RETURN") })
    @Inject(method = { "channelRead0" }, at = { @At("RETURN") })
    private void Method3758(final ChannelHandlerContext p0, final Packet p1, final CallbackInfo p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aconst_null    
        //     2: invokeinterface io/netty/channel/Channel.isOpen:()Z
        //     7: ifeq            18
        //    10: aload_0        
        //    11: aconst_null    
        //    12: getstatic       net/minecraft/network/EnumPacketDirection.CLIENTBOUND:Lnet/minecraft/network/EnumPacketDirection;
        //    15: if_acmpeq       19
        //    18: return         
        //    19: invokestatic    baritone/api/BaritoneAPI.getProvider:()Lbaritone/api/IBaritoneProvider;
        //    22: invokeinterface baritone/api/IBaritoneProvider.getAllBaritones:()Ljava/util/List;
        //    27: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    32: astore          4
        //    34: aload           4
        //    36: invokeinterface java/util/Iterator.hasNext:()Z
        //    41: ifeq            126
        //    44: aload           4
        //    46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    51: checkcast       Lbaritone/api/IBaritone;
        //    54: astore          5
        //    56: aload           5
        //    58: invokeinterface baritone/api/IBaritone.getPlayerContext:()Lbaritone/api/utils/IPlayerContext;
        //    63: invokeinterface baritone/api/utils/IPlayerContext.player:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //    68: ifnull          123
        //    71: aload           5
        //    73: invokeinterface baritone/api/IBaritone.getPlayerContext:()Lbaritone/api/utils/IPlayerContext;
        //    78: invokeinterface baritone/api/utils/IPlayerContext.player:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //    83: getfield        net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //    86: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.getNetworkManager:()Lnet/minecraft/network/NetworkManager;
        //    89: aload_0        
        //    90: checkcast       Lnet/minecraft/network/NetworkManager;
        //    93: if_acmpne       123
        //    96: aload           5
        //    98: invokeinterface baritone/api/IBaritone.getGameEventHandler:()Lbaritone/api/event/listener/IEventBus;
        //   103: new             Lbaritone/api/event/events/PacketEvent;
        //   106: dup            
        //   107: aload_0        
        //   108: checkcast       Lnet/minecraft/network/NetworkManager;
        //   111: getstatic       baritone/api/event/events/type/EventState.POST:Lbaritone/api/event/events/type/EventState;
        //   114: aload_2        
        //   115: invokespecial   baritone/api/event/events/PacketEvent.<init>:(Lnet/minecraft/network/NetworkManager;Lbaritone/api/event/events/type/EventState;Lnet/minecraft/network/Packet;)V
        //   118: invokeinterface baritone/api/event/listener/IEventBus.onReceivePacket:(Lbaritone/api/event/events/PacketEvent;)V
        //   123: goto            34
        //   126: return         
        //   127: aload_0        
        //   128: aconst_null    
        //   129: invokeinterface io/netty/channel/Channel.isOpen:()Z
        //   134: ifeq            145
        //   137: aload_0        
        //   138: aconst_null    
        //   139: getstatic       net/minecraft/network/EnumPacketDirection.CLIENTBOUND:Lnet/minecraft/network/EnumPacketDirection;
        //   142: if_acmpeq       146
        //   145: return         
        //   146: invokestatic    baritone/api/BaritoneAPI.getProvider:()Lbaritone/api/IBaritoneProvider;
        //   149: invokeinterface baritone/api/IBaritoneProvider.getAllBaritones:()Ljava/util/List;
        //   154: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   159: astore          4
        //   161: aload           4
        //   163: invokeinterface java/util/Iterator.hasNext:()Z
        //   168: ifeq            253
        //   171: aload           4
        //   173: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   178: checkcast       Lbaritone/api/IBaritone;
        //   181: astore          5
        //   183: aload           5
        //   185: invokeinterface baritone/api/IBaritone.getPlayerContext:()Lbaritone/api/utils/IPlayerContext;
        //   190: invokeinterface baritone/api/utils/IPlayerContext.player:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   195: ifnull          250
        //   198: aload           5
        //   200: invokeinterface baritone/api/IBaritone.getPlayerContext:()Lbaritone/api/utils/IPlayerContext;
        //   205: invokeinterface baritone/api/utils/IPlayerContext.player:()Lnet/minecraft/client/entity/EntityPlayerSP;
        //   210: getfield        net/minecraft/client/entity/EntityPlayerSP.connection:Lnet/minecraft/client/network/NetHandlerPlayClient;
        //   213: invokevirtual   net/minecraft/client/network/NetHandlerPlayClient.getNetworkManager:()Lnet/minecraft/network/NetworkManager;
        //   216: aload_0        
        //   217: checkcast       Lnet/minecraft/network/NetworkManager;
        //   220: if_acmpne       250
        //   223: aload           5
        //   225: invokeinterface baritone/api/IBaritone.getGameEventHandler:()Lbaritone/api/event/listener/IEventBus;
        //   230: new             Lbaritone/api/event/events/PacketEvent;
        //   233: dup            
        //   234: aload_0        
        //   235: checkcast       Lnet/minecraft/network/NetworkManager;
        //   238: getstatic       baritone/api/event/events/type/EventState.POST:Lbaritone/api/event/events/type/EventState;
        //   241: aload_2        
        //   242: invokespecial   baritone/api/event/events/PacketEvent.<init>:(Lnet/minecraft/network/NetworkManager;Lbaritone/api/event/events/type/EventState;Lnet/minecraft/network/Packet;)V
        //   245: invokeinterface baritone/api/event/listener/IEventBus.onReceivePacket:(Lbaritone/api/event/events/PacketEvent;)V
        //   250: goto            161
        //   253: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Inconsistent stack size at #0018 (coming from #0015).
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2183)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.Decompiler.decompile(Decompiler.java:70)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompile(Deobfuscator3000.java:538)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.decompileAndDeobfuscate(Deobfuscator3000.java:552)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.processMod(Deobfuscator3000.java:510)
        //     at org.ugp.mc.deobfuscator.Deobfuscator3000.lambda$21(Deobfuscator3000.java:329)
        //     at java.base/java.lang.Thread.run(Thread.java:833)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
