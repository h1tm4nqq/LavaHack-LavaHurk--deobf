/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.ChunkEvent
 *  baritone.api.event.events.ChunkEvent$Type
 *  baritone.api.event.events.type.EventState
 *  net.minecraft.client.multiplayer.WorldClient
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.type.EventState;
import java.util.Iterator;
import net.minecraft.client.multiplayer.WorldClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={WorldClient.class})
public class MixinWorldClient {
    @Inject(method={"doPreChunk"}, at={@At(value="HEAD")})
    @Inject(method={"doPreChunk"}, at={@At(value="HEAD")})
    private void Method3763(int n, int n2, boolean bl, CallbackInfo callbackInfo) {
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            if (iBaritone.getPlayerContext().world() != (WorldClient)this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, bl ? ChunkEvent.Type.LOAD : ChunkEvent.Type.UNLOAD, n, n2));
        }
    }

    @Inject(method={"doPreChunk"}, at={@At(value="RETURN")})
    @Inject(method={"doPreChunk"}, at={@At(value="RETURN")})
    private void Method3764(int n, int n2, boolean bl, CallbackInfo callbackInfo) {
        Iterator iterator = BaritoneAPI.getProvider().getAllBaritones().iterator();
        while (iterator.hasNext()) {
            IBaritone iBaritone = (IBaritone)iterator.next();
            if (iBaritone.getPlayerContext().world() != (WorldClient)this) continue;
            iBaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, bl ? ChunkEvent.Type.LOAD : ChunkEvent.Type.UNLOAD, n, n2));
        }
    }
}

