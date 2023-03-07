/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.gen.structure.template.Template
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package com.kisman.cc.mixin.mixins.accessor;

import java.util.List;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.structure.template.Template;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={Template.class})
public interface ITemplate {
    @Accessor(value="blocks")
    @Accessor(value="blocks")
    public List Method58();

    @Accessor(value="size")
    @Accessor(value="size")
    public void Method59(BlockPos var1);

    @Accessor(value="entities")
    @Accessor(value="entities")
    public List Method60();
}

