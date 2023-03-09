//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo
 *  lavahack.client.TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.resources.Locale
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo;
import lavahack.client.TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.Locale;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Locale.class})
public class MixinLocale {
    @Inject(method={"isUnicode"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"isUnicode"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method6951(CallbackInfoReturnable callbackInfoReturnable) {
        if (!TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E.Field12992.Method35()) return;
        if (Minecraft.getMinecraft().gameSettings.forceUnicodeFont) return;
        if (!Minecraft.getMinecraft().gameSettings.language.equalsIgnoreCase("ru_ru")) return;
        callbackInfoReturnable.setReturnValue((Object)false);
        callbackInfoReturnable.cancel();
    }

    @Inject(method={"translateKeyPrivate"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"translateKeyPrivate"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method6952(String string, CallbackInfoReturnable callbackInfoReturnable) {
        String string2 = (String)Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17566.get(string);
        if (string2 == null) return;
        callbackInfoReturnable.setReturnValue((Object)string2);
        callbackInfoReturnable.cancel();
    }
}

