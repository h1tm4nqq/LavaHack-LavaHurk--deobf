//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.ChunkEvent
 *  baritone.api.event.events.ChunkEvent$Type
 *  baritone.api.event.events.type.EventState
 *  baritone.cache.CachedChunk
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.network.NetHandlerPlayClient
 *  net.minecraft.network.NetworkManager
 *  net.minecraft.network.play.server.SPacketBlockChange
 *  net.minecraft.network.play.server.SPacketChunkData
 *  net.minecraft.network.play.server.SPacketCombatEvent
 *  net.minecraft.network.play.server.SPacketMultiBlockChange
 *  net.minecraft.network.play.server.SPacketMultiBlockChange$BlockUpdateData
 *  net.minecraft.util.math.ChunkPos
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.type.EventState;
import baritone.cache.CachedChunk;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.network.play.server.SPacketCombatEvent;
import net.minecraft.network.play.server.SPacketMultiBlockChange;
import net.minecraft.util.math.ChunkPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={NetHandlerPlayClient.class})
public class MixinNetHandlerPlayClient
extends NetHandlerPlayClient {
    public MixinNetHandlerPlayClient(Minecraft minecraft, GuiScreen guiScreen, NetworkManager networkManager, GameProfile gameProfile) {
        super(minecraft, guiScreen, networkManager, gameProfile);
    }

    @Inject(method={"handleChunkData"}, at={@At(value="INVOKE", target="net/minecraft/world/chunk/Chunk.read(Lnet/minecraft/network/PacketBuffer;IZ)V")})
    @Inject(method={"handleChunkData"}, at={@At(value="INVOKE", target="net/minecraft/world/chunk/Chunk.read(Lnet/minecraft/network/PacketBuffer;IZ)V")})
    private void preRead(SPacketChunkData sPacketChunkData, CallbackInfo callbackInfo) {
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            EntityPlayerSP entityPlayerSP = iBaritone.getPlayerContext().player();
            if (entityPlayerSP == null || entityPlayerSP.connection != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, sPacketChunkData.isFullChunk() ? ChunkEvent.Type.POPULATE_FULL : ChunkEvent.Type.POPULATE_PARTIAL, sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ()));
        }
    }

    @Inject(method={"handleChunkData"}, at={@At(value="RETURN")})
    @Inject(method={"handleChunkData"}, at={@At(value="RETURN")})
    private void postHandleChunkData(SPacketChunkData sPacketChunkData, CallbackInfo callbackInfo) {
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            EntityPlayerSP entityPlayerSP = iBaritone.getPlayerContext().player();
            if (entityPlayerSP == null || entityPlayerSP.connection != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, sPacketChunkData.isFullChunk() ? ChunkEvent.Type.POPULATE_FULL : ChunkEvent.Type.POPULATE_PARTIAL, sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ()));
        }
    }

    @Inject(method={"handleBlockChange"}, at={@At(value="RETURN")})
    @Inject(method={"handleBlockChange"}, at={@At(value="RETURN")})
    private void postHandleBlockChange(SPacketBlockChange sPacketBlockChange, CallbackInfo callbackInfo) {
        if (!((Boolean)Baritone.settings().repackOnAnyBlockChange.value).booleanValue()) {
            return;
        }
        if (!CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains(sPacketBlockChange.getBlockState().getBlock())) {
            return;
        }
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            EntityPlayerSP entityPlayerSP = iBaritone.getPlayerContext().player();
            if (entityPlayerSP == null || entityPlayerSP.connection != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, ChunkEvent.Type.POPULATE_FULL, sPacketBlockChange.getBlockPosition().getX() >> 4, sPacketBlockChange.getBlockPosition().getZ() >> 4));
        }
    }

    @Inject(method={"handleMultiBlockChange"}, at={@At(value="RETURN")})
    @Inject(method={"handleMultiBlockChange"}, at={@At(value="RETURN")})
    private void postHandleMultiBlockChange(SPacketMultiBlockChange sPacketMultiBlockChange, CallbackInfo callbackInfo) {
        SPacketMultiBlockChange.BlockUpdateData blockUpdateData;
        ChunkPos chunkPos;
        block5: {
            if (!((Boolean)Baritone.settings().repackOnAnyBlockChange.value).booleanValue()) {
                return;
            }
            if (sPacketMultiBlockChange.getChangedBlocks().length == 0) {
                return;
            }
            chunkPos = sPacketMultiBlockChange.getChangedBlocks();
            int n = ((SPacketMultiBlockChange.BlockUpdateData[])chunkPos).length;
            int n2 = 0;
            while (n2 < n) {
                blockUpdateData = chunkPos[n2];
                if (!CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains(blockUpdateData.getBlockState().getBlock())) {
                    ++n2;
                    continue;
                }
                break block5;
            }
            return;
        }
        chunkPos = new ChunkPos(sPacketMultiBlockChange.getChangedBlocks()[0].getPos());
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            blockUpdateData = iBaritone.getPlayerContext().player();
            if (blockUpdateData == null || blockUpdateData.connection != this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, ChunkEvent.Type.POPULATE_FULL, chunkPos.x, chunkPos.z));
        }
    }

    @Inject(method={"handleCombatEvent"}, at={@At(value="INVOKE", target="net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V")})
    @Inject(method={"handleCombatEvent"}, at={@At(value="INVOKE", target="net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V")})
    private void onPlayerDeath(SPacketCombatEvent sPacketCombatEvent, CallbackInfo callbackInfo) {
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            EntityPlayerSP entityPlayerSP = iBaritone.getPlayerContext().player();
            if (entityPlayerSP == null || entityPlayerSP.connection != this) continue;
            iBaritone.getGameEventHandler().onPlayerDeath();
        }
    }
}

