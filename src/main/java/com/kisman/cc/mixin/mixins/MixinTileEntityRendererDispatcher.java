/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
 *  lavahack.client.wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher
 *  net.minecraft.tileentity.TileEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={TileEntityRendererDispatcher.class})
public class MixinTileEntityRendererDispatcher {
    @Inject(method={"render(Lnet/minecraft/tileentity/TileEntity;FI)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"render(Lnet/minecraft/tileentity/TileEntity;FI)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method2509(TileEntity tileEntity, float f, int n, CallbackInfo callbackInfo) {
        wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(tileEntity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf);
        if (!ylFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"render(Lnet/minecraft/tileentity/TileEntity;FI)V"}, at={@At(value="RETURN")})
    @Inject(method={"render(Lnet/minecraft/tileentity/TileEntity;FI)V"}, at={@At(value="RETURN")})
    private void Method2510(TileEntity tileEntity, float f, int n, CallbackInfo callbackInfo) {
        wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = new wfvlmGcrJ5jyY54Dj5cZA2ucJ3pFMwQ8.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(tileEntity);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
    }
}

