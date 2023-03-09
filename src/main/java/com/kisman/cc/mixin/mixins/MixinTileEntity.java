/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu
 *  net.minecraft.tileentity.TileEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu;
import net.minecraft.tileentity.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={TileEntity.class})
public class MixinTileEntity {
    @Inject(method={"getMaxRenderDistanceSquared"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"getMaxRenderDistanceSquared"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method1667(CallbackInfoReturnable callbackInfoReturnable) {
        if (uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089 == null) return;
        if (!uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Method35()) return;
        callbackInfoReturnable.setReturnValue((Object)uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Field17085.Method367());
    }
}

