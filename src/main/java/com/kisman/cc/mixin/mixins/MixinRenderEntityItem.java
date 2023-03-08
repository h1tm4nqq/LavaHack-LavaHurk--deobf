//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins;

import org.spongepowered.asm.mixin.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.entity.item.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import lavahack.client.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin({ RenderEntityItem.class })
public class MixinRenderEntityItem
{
    @Inject(method = { "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true)
    @Inject(method = { "doRender(Lnet/minecraft/entity/item/EntityItem;DDDFF)V" }, at = { @At("HEAD") }, cancellable = true)
    public void Method6023(final EntityItem entityItem, final double n, final double n2, final double n3, final float n4, final float n5, final CallbackInfo callbackInfo) {
        if (o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Method35() && o9lanP0gHU278cwDFs7XEsyWoBrJVe44.Field16374.Field16386.Method365()) {
            callbackInfo.cancel();
        }
    }
}
