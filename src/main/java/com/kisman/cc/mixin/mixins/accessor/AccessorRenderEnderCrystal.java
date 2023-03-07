/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.renderer.entity.RenderEnderCrystal
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderEnderCrystal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={RenderEnderCrystal.class})
public interface AccessorRenderEnderCrystal {
    @Accessor(value="modelEnderCrystal")
    @Accessor(value="modelEnderCrystal")
    public void Method3251(ModelBase var1);

    @Accessor(value="modelEnderCrystalNoBase")
    @Accessor(value="modelEnderCrystalNoBase")
    public void Method3252(ModelBase var1);
}

