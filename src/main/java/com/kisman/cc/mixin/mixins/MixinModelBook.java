/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBook
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import net.minecraft.client.model.ModelBook;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ModelBook.class})
public class MixinModelBook {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void Method7679(Entity entity, float f, float f2, float f3, float f4, float f5, float f6, CallbackInfo callbackInfo) {
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) return;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16380.Method365()) return;
        callbackInfo.cancel();
    }
}

