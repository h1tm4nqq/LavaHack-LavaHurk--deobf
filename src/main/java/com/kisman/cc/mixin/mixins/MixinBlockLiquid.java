//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.block.*;
import net.minecraft.block.state.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ BlockLiquid.class })
public class MixinBlockLiquid
{
    @Inject(method = { "canCollideCheck" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "canCollideCheck" }, at = { @At("HEAD") }, cancellable = true)
    private void Method6715(final IBlockState blockState, final boolean b, final CallbackInfoReturnable callbackInfoReturnable) {
        if (new DzwjBE8RERWn2Hx16JS1tCkbgfnz8aHr(blockState, b).Method159()) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}
