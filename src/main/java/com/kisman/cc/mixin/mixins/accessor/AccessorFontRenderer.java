/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.util.ResourceLocation
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={FontRenderer.class})
public interface AccessorFontRenderer {
    @Accessor(value="locationFontTexture")
    @Accessor(value="locationFontTexture")
    public void Method6040(ResourceLocation var1);
}

