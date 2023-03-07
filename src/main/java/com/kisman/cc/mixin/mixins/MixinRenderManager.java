/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.RenderManager
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.LocalCapture
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.MjqPPsIgrrFE8smKJhGdj08A51foRyqE;
import lavahack.client.MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={RenderManager.class}, priority=114514)
public class MixinRenderManager {
    @Inject(method={"renderEntity"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/entity/Render;setRenderOutlines(Z)V", shift=At.Shift.BEFORE)}, cancellable=true, locals=LocalCapture.CAPTURE_FAILHARD)
    @Inject(method={"renderEntity"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/renderer/entity/Render;setRenderOutlines(Z)V", shift=At.Shift.BEFORE)}, cancellable=true, locals=LocalCapture.CAPTURE_FAILHARD)
    public void Method3249(Entity entity, double d, double d2, double d3, float f, float f2, boolean bl, CallbackInfo callbackInfo) {
        if (entity == null) return;
        if (!MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2089()) {
            return;
        }
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf mjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf = new MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(entity, d, d2, d3, f, f2);
        mjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method167();
        if (!mjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method159()) return;
        callbackInfo.cancel();
    }

    @Inject(method={"renderEntity"}, at={@At(value="RETURN")}, locals=LocalCapture.CAPTURE_FAILHARD)
    @Inject(method={"renderEntity"}, at={@At(value="RETURN")}, locals=LocalCapture.CAPTURE_FAILHARD)
    public void Method3250(Entity entity, double d, double d2, double d3, float f, float f2, boolean bl, CallbackInfo callbackInfo) {
        if (entity == null) return;
        if (!MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2089()) {
            return;
        }
        MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi mjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new MjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entity, d, d2, d3, f, f2);
        mjqPPsIgrrFE8smKJhGdj08A51foRyqE$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method167();
    }
}

