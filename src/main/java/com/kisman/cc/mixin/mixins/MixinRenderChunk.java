//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.chunk.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.util.math.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderChunk.class })
public class MixinRenderChunk
{
    @Inject(method = { "setPosition" }, at = { @At("RETURN") })
    @Inject(method = { "setPosition" }, at = { @At("RETURN") })
    private void Method2148(final int n, final int n2, final int n3, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new l6yKOMt7SVcyIzts9W2dZyllrA36dUBL((RenderChunk)this, new BlockPos(n, n2, n3)));
    }
}
