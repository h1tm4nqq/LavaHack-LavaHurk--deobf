/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.state.IBlockState
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.state.IBlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={BlockLiquid.class})
public class MixinBlockLiquid {
    @Inject(method={"canCollideCheck"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"canCollideCheck"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method6715(IBlockState iBlockState, boolean bl, CallbackInfoReturnable callbackInfoReturnable) {
        DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr dzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr = new DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr(iBlockState, bl);
        if (!dzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr.Method159()) return;
        callbackInfoReturnable.setReturnValue((Object)true);
    }
}

