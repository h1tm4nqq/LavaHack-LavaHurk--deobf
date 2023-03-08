//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.resources.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import net.minecraft.client.*;
import org.spongepowered.asm.mixin.injection.*;
import lavahack.client.*;

@Mixin({ Locale.class })
public class MixinLocale
{
    @Inject(method = { "isUnicode" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "isUnicode" }, at = { @At("HEAD") }, cancellable = true)
    private void Method6951(final CallbackInfoReturnable callbackInfoReturnable) {
        if (TZTAvU2oczpyS7cgp1J8Nrxb52Pczp4E.Field12992.Method35() && !Minecraft.getMinecraft().gameSettings.forceUnicodeFont && Minecraft.getMinecraft().gameSettings.language.equalsIgnoreCase("ru_ru")) {
            callbackInfoReturnable.setReturnValue((Object)false);
            callbackInfoReturnable.cancel();
        }
    }
    
    @Inject(method = { "translateKeyPrivate" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "translateKeyPrivate" }, at = { @At("HEAD") }, cancellable = true)
    private void Method6952(final String key, final CallbackInfoReturnable callbackInfoReturnable) {
        final String returnValue = Fz0OqVKY8GJZAvGUwAhJ2MNHGLdLpSVo.Field17566.get(key);
        if (returnValue != null) {
            callbackInfoReturnable.setReturnValue((Object)returnValue);
            callbackInfoReturnable.cancel();
        }
    }
}
