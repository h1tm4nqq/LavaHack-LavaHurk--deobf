//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;

@Mixin(value = { RenderManager.class }, priority = 114514)
public class MixinRenderManager
{
    @Inject(method = { "renderEntity" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render;setRenderOutlines(Z)V", shift = At.Shift.BEFORE) }, cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    @Inject(method = { "renderEntity" }, at = { @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render;setRenderOutlines(Z)V", shift = At.Shift.BEFORE) }, cancellable = true, locals = LocalCapture.CAPTURE_FAILHARD)
    public void Method3249(final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5, final boolean b, final CallbackInfo callbackInfo) {
        if (entity == null || !MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2089()) {
            return;
        }
        final MjqPPsIgrrFE8smKJhGdj08A51foRyqE.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf ylFSugLHQAjzunVBKfamPjSRsvHTy3jf = new MjqPPsIgrrFE8smKJhGdj08A51foRyqE.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(entity, n, n2, n3, n4, n5);
        ((MjqPPsIgrrFE8smKJhGdj08A51foRyqE)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method167();
        if (((MjqPPsIgrrFE8smKJhGdj08A51foRyqE)ylFSugLHQAjzunVBKfamPjSRsvHTy3jf).Method159()) {
            callbackInfo.cancel();
        }
    }
    
    @Inject(method = { "renderEntity" }, at = { @At("RETURN") }, locals = LocalCapture.CAPTURE_FAILHARD)
    @Inject(method = { "renderEntity" }, at = { @At("RETURN") }, locals = LocalCapture.CAPTURE_FAILHARD)
    public void Method3250(final Entity entity, final double n, final double n2, final double n3, final float n4, final float n5, final boolean b, final CallbackInfo callbackInfo) {
        if (entity == null || !MjqPPsIgrrFE8smKJhGdj08A51foRyqE.Method2089()) {
            return;
        }
        ((MjqPPsIgrrFE8smKJhGdj08A51foRyqE)new MjqPPsIgrrFE8smKJhGdj08A51foRyqE.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(entity, n, n2, n3, n4, n5)).Method167();
    }
}
