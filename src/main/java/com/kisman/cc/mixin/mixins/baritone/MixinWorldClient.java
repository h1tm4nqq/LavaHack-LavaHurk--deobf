//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.multiplayer.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import baritone.api.*;
import baritone.api.event.events.type.*;
import baritone.api.event.events.*;
import java.util.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ WorldClient.class })
public class MixinWorldClient
{
    @Inject(method = { "doPreChunk" }, at = { @At("HEAD") })
    @Inject(method = { "doPreChunk" }, at = { @At("HEAD") })
    private void Method3763(final int n, final int n2, final boolean b, final CallbackInfo callbackInfo) {
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (baritone.getPlayerContext().world() == (WorldClient)this) {
                baritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, b ? ChunkEvent.Type.LOAD : ChunkEvent.Type.UNLOAD, n, n2));
            }
        }
    }
    
    @Inject(method = { "doPreChunk" }, at = { @At("RETURN") })
    @Inject(method = { "doPreChunk" }, at = { @At("RETURN") })
    private void Method3764(final int n, final int n2, final boolean b, final CallbackInfo callbackInfo) {
        for (final IBaritone baritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (baritone.getPlayerContext().world() == (WorldClient)this) {
                baritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, b ? ChunkEvent.Type.LOAD : ChunkEvent.Type.UNLOAD, n, n2));
            }
        }
    }
}
