//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.tileentity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ TileEntity.class })
public class MixinTileEntity
{
    @Inject(method = { "getMaxRenderDistanceSquared" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "getMaxRenderDistanceSquared" }, at = { @At("HEAD") }, cancellable = true)
    public void Method1667(final CallbackInfoReturnable callbackInfoReturnable) {
        if (uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089 != null && uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Method35()) {
            callbackInfoReturnable.setReturnValue((Object)uMfEtw4TfDofnkM30Gh2n5bH4HfzL3Wu.Field17089.Field17085.Method367());
        }
    }
}
