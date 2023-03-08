//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.model.*;
import net.minecraft.entity.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ ModelBook.class })
public class MixinModelBook
{
    @Inject(method = { "render" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "render" }, at = { @At("HEAD") }, cancellable = true)
    private void Method7679(final Entity entity, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final CallbackInfo callbackInfo) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16380.Method365()) {
            callbackInfo.cancel();
        }
    }
}
