//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IItemTool
 *  net.minecraft.item.Item$ToolMaterial
 *  net.minecraft.item.ItemTool
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.IItemTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={ItemTool.class})
public class MixinItemTool
implements IItemTool {
    @Shadow
    protected Item.ToolMaterial Field15123;

    public int getHarvestLevel() {
        MixinItemTool mixinItemTool = this;
        return null.getHarvestLevel();
    }
}

