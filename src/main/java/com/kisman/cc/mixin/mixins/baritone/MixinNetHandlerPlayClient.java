//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import net.minecraft.client.network.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.client.*;
import net.minecraft.client.gui.*;
import net.minecraft.network.*;
import com.mojang.authlib.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import baritone.api.*;
import baritone.api.event.events.type.*;
import baritone.api.event.events.*;
import java.util.*;
import net.minecraft.client.entity.*;
import org.spongepowered.asm.mixin.injection.*;
import baritone.*;
import baritone.cache.*;
import net.minecraft.util.math.*;
import net.minecraft.network.play.server.*;

@Mixin({ NetHandlerPlayClient.class })
public class MixinNetHandlerPlayClient extends NetHandlerPlayClient
{
    public MixinNetHandlerPlayClient(final Minecraft minecraft, final GuiScreen guiScreen, final NetworkManager networkManager, final GameProfile gameProfile) {
        super(minecraft, guiScreen, networkManager, gameProfile);
    }
    
    @Inject(method = { "handleChunkData" }, at = { @At(value = "INVOKE", target = "net/minecraft/world/chunk/Chunk.read(Lnet/minecraft/network/PacketBuffer;IZ)V") })
    @Inject(method = { "handleChunkData" }, at = { @At(value = "INVOKE", target = "net/minecraft/world/chunk/Chunk.read(Lnet/minecraft/network/PacketBuffer;IZ)V") })
    private void preRead(final SPacketChunkData sPacketChunkData, final CallbackInfo callbackInfo) {
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            final EntityPlayerSP player = baritone.getPlayerContext().player();
            if (player != null && player.connection == this) {
                baritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, sPacketChunkData.isFullChunk() ? ChunkEvent.Type.POPULATE_FULL : ChunkEvent.Type.POPULATE_PARTIAL, sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ()));
            }
        }
    }
    
    @Inject(method = { "handleChunkData" }, at = { @At("RETURN") })
    @Inject(method = { "handleChunkData" }, at = { @At("RETURN") })
    private void postHandleChunkData(final SPacketChunkData sPacketChunkData, final CallbackInfo callbackInfo) {
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            final EntityPlayerSP player = baritone.getPlayerContext().player();
            if (player != null && player.connection == this) {
                baritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, sPacketChunkData.isFullChunk() ? ChunkEvent.Type.POPULATE_FULL : ChunkEvent.Type.POPULATE_PARTIAL, sPacketChunkData.getChunkX(), sPacketChunkData.getChunkZ()));
            }
        }
    }
    
    @Inject(method = { "handleBlockChange" }, at = { @At("RETURN") })
    @Inject(method = { "handleBlockChange" }, at = { @At("RETURN") })
    private void postHandleBlockChange(final SPacketBlockChange sPacketBlockChange, final CallbackInfo callbackInfo) {
        if (!(boolean)Baritone.settings().repackOnAnyBlockChange.value) {
            return;
        }
        if (!CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains((Object)sPacketBlockChange.getBlockState().getBlock())) {
            return;
        }
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            final EntityPlayerSP player = baritone.getPlayerContext().player();
            if (player != null && player.connection == this) {
                baritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, ChunkEvent.Type.POPULATE_FULL, sPacketBlockChange.getBlockPosition().getX() >> 4, sPacketBlockChange.getBlockPosition().getZ() >> 4));
            }
        }
    }
    
    @Inject(method = { "handleMultiBlockChange" }, at = { @At("RETURN") })
    @Inject(method = { "handleMultiBlockChange" }, at = { @At("RETURN") })
    private void postHandleMultiBlockChange(final SPacketMultiBlockChange sPacketMultiBlockChange, final CallbackInfo callbackInfo) {
        if (!(boolean)Baritone.settings().repackOnAnyBlockChange.value) {
            return;
        }
        if (sPacketMultiBlockChange.getChangedBlocks().length == 0) {
            return;
        }
        final SPacketMultiBlockChange.BlockUpdateData[] getChangedBlocks = sPacketMultiBlockChange.getChangedBlocks();
        for (int length = getChangedBlocks.length, i = 0; i < length; ++i) {
            if (CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains((Object)getChangedBlocks[i].getBlockState().getBlock())) {
                final ChunkPos chunkPos = new ChunkPos(sPacketMultiBlockChange.getChangedBlocks()[0].getPos());
                for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
                    final EntityPlayerSP player = baritone.getPlayerContext().player();
                    if (player != null && player.connection == this) {
                        baritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, ChunkEvent.Type.POPULATE_FULL, chunkPos.x, chunkPos.z));
                    }
                }
                return;
            }
        }
    }
    
    @Inject(method = { "handleCombatEvent" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V") })
    @Inject(method = { "handleCombatEvent" }, at = { @At(value = "INVOKE", target = "net/minecraft/client/Minecraft.displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V") })
    private void onPlayerDeath(final SPacketCombatEvent sPacketCombatEvent, final CallbackInfo callbackInfo) {
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            final EntityPlayerSP player = baritone.getPlayerContext().player();
            if (player != null && player.connection == this) {
                baritone.getGameEventHandler().onPlayerDeath();
            }
        }
    }
}
