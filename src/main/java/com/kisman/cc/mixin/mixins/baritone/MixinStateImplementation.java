//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import com.google.common.collect.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(targets = { "net.minecraft.block.state.BlockStateContainer$StateImplementation" })
public class MixinStateImplementation
{
    @Shadow
    @Final
    private ImmutableMap Field8448;
    @Unique
    private int Field8449;
    
    @Overwrite
    @Overwrite
    @Override
    public int hashCode() {
        return this.Field8449;
    }
    
    @Inject(method = { "<init>*" }, at = { @At("RETURN") })
    @Inject(method = { "<init>*" }, at = { @At("RETURN") })
    private void Method867(final CallbackInfo callbackInfo) {
        this.Field8449 = null.hashCode();
    }
}
