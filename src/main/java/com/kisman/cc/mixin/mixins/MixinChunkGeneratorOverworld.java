/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h
 *  net.minecraft.world.World
 *  net.minecraft.world.gen.ChunkGeneratorOverworld
 *  net.minecraft.world.gen.structure.MapGenStronghold
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.structure.MapGenStronghold;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ChunkGeneratorOverworld.class})
public class MixinChunkGeneratorOverworld {
    @Shadow
    private MapGenStronghold Field11329;

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    public void Method3278(World world, long l, boolean bl, String string, CallbackInfo callbackInfo) {
        MixinChunkGeneratorOverworld mixinChunkGeneratorOverworld = this;
        VwUAM5BP3f9hRWxA7Cgi90LOO1UdJV1h.Field12169 = null;
    }
}

