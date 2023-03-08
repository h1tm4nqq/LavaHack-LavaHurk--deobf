//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.tileentity.*;
import net.minecraft.tileentity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ TileEntityRendererDispatcher.class })
public class MixinTileEntityRendererDispatcher
{
    @Inject(method = { "render(Lnet/minecraft/tileentity/TileEntity;FI)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "render(Lnet/minecraft/tileentity/TileEntity;FI)V" }, at = { @At("HEAD") }, cancellable = true)
    private void Method2509(final TileEntity tileEntity, final float n, final int n2, final CallbackInfo callbackInfo) {
        final wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(tileEntity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (((wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "render(Lnet/minecraft/tileentity/TileEntity;FI)V" }, at = { @At("RETURN") })
    @Inject(method = { "render(Lnet/minecraft/tileentity/TileEntity;FI)V" }, at = { @At("RETURN") })
    private void Method2510(final TileEntity tileEntity, final float n, final int n2, final CallbackInfo callbackInfo) {
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)new wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(tileEntity));
    }
}
