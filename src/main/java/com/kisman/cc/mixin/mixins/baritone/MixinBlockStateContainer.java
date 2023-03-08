//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.mixin.mixins.baritone;

import net.minecraft.util.*;
import org.spongepowered.asm.mixin.*;
import net.minecraft.world.chunk.*;
import net.minecraft.block.state.*;
import baritone.utils.accessor.*;

@Mixin({ BlockStateContainer.class })
public class MixinBlockStateContainer implements IBlockStateContainer
{
    @Shadow
    protected BitArray Field16370;
    @Shadow
    protected IBlockStatePalette Field16371;
    
    public IBlockState getAtPalette(final int n) {
        return null.getBlockState(n);
    }
    
    public int[] storageArray() {
        return null.toArray();
    }
}
