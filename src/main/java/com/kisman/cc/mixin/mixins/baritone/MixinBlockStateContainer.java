//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.utils.accessor.IBitArray
 *  baritone.utils.accessor.IBlockStateContainer
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.util.BitArray
 *  net.minecraft.world.chunk.BlockStateContainer
 *  net.minecraft.world.chunk.IBlockStatePalette
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 */
package com.kisman.cc.mixin.mixins.baritone;

import baritone.utils.accessor.IBitArray;
import baritone.utils.accessor.IBlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BitArray;
import net.minecraft.world.chunk.BlockStateContainer;
import net.minecraft.world.chunk.IBlockStatePalette;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={BlockStateContainer.class})
public class MixinBlockStateContainer
implements IBlockStateContainer {
    @Shadow
    protected BitArray Field16370;
    @Shadow
    protected IBlockStatePalette Field16371;

    public IBlockState getAtPalette(int n) {
        MixinBlockStateContainer mixinBlockStateContainer = this;
        return null.getBlockState(n);
    }

    public int[] storageArray() {
        MixinBlockStateContainer mixinBlockStateContainer = this;
        return ((IBitArray)null).toArray();
    }
}

