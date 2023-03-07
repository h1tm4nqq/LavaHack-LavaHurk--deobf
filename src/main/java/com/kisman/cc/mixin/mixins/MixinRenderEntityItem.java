/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.renderer.entity.RenderEntityItem
 *  net.minecraft.entity.item.EntityItem
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.kisman.cc.mixin.mixins;

import lavahack.client.o9lanP0gHU278cwDFs7XEsyWoBrJVe44;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={RenderEntityItem.class})
public class MixinRenderEntityItem {
    @Inject(method={"doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    @Inject(method={"doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void Method6023(EntityItem entityItem, double d, double d2, double d3, float f, float f2, CallbackInfo callbackInfo) {
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35()) return;
        if (!o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16386.Method365()) return;
        callbackInfo.cancel();
    }
}

