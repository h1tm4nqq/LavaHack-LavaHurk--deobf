//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.layers.*;
import java.awt.*;
import lavahack.client.*;
import net.minecraft.client.renderer.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ LayerArmorBase.class })
public class MixinLayerArmorBase
{
    @Redirect(method = { "renderEnchantedGlint" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V"))
    @Redirect(method = { "renderEnchantedGlint" }, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V"))
    private static void Method3750(final float n, final float n2, final float n3, final float n4) {
        final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E ibonRcQCNUBg2NBpVpVQf61ykmVfU03E = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16490, new Color(Math.round(n * 255.0f), Math.round(n2 * 255.0f), Math.round(n3 * 255.0f), Math.round(n4 * 255.0f)));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)ibonRcQCNUBg2NBpVpVQf61ykmVfU03E);
        if (ibonRcQCNUBg2NBpVpVQf61ykmVfU03E.Method159()) {
            final Color method5370 = ibonRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5370();
            GlStateManager.color(method5370.getRed() / 255.0f, method5370.getGreen() / 255.0f, method5370.getBlue() / 255.0f, method5370.getAlpha() / 255.0f);
            return;
        }
        GlStateManager.color(n, n2, n3, n4);
    }
}
