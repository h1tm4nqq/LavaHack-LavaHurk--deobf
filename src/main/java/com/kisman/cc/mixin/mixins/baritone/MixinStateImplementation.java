/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Overwrite
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins.baritone;

import com.google.common.collect.ImmutableMap;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets={"net.minecraft.block.state.BlockStateContainer$StateImplementation"})
public class MixinStateImplementation {
    @Shadow
    @Final
    private ImmutableMap Field8448;
    @Unique
    private int Field8449;

    @Overwrite
    @Overwrite
    public int hashCode() {
        return this.Field8449;
    }

    @Inject(method={"<init>*"}, at={@At(value="RETURN")})
    @Inject(method={"<init>*"}, at={@At(value="RETURN")})
    private void Method867(CallbackInfo callbackInfo) {
        MixinStateImplementation mixinStateImplementation = this;
        this.Field8449 = ((ImmutableMap)null).hashCode();
    }
}

