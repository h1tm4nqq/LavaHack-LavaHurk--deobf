//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E
 *  lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.entity.layers.LayerArmorBase
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package com.kisman.cc.mixin.mixins;

import java.awt.Color;
import lavahack.client.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={LayerArmorBase.class})
public class MixinLayerArmorBase {
    @Redirect(method={"renderEnchantedGlint"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V"))
    @Redirect(method={"renderEnchantedGlint"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/renderer/GlStateManager;color(FFFF)V"))
    private static void Method3750(float f, float f2, float f3, float f4) {
        int n = Math.round(f * 255.0f);
        int n2 = Math.round(f2 * 255.0f);
        int n3 = Math.round(f3 * 255.0f);
        int n4 = Math.round(f4 * 255.0f);
        IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E(IBONRcQCNUBg2NBpVpVQf61ykmVfU03E.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16490, new Color(n, n2, n3, n4));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method715((Object)iBONRcQCNUBg2NBpVpVQf61ykmVfU03E);
        if (iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method159()) {
            Color color = iBONRcQCNUBg2NBpVpVQf61ykmVfU03E.Method5370();
            GlStateManager.color((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
            return;
        }
        GlStateManager.color((float)f, (float)f2, (float)f3, (float)f4);
    }
}

