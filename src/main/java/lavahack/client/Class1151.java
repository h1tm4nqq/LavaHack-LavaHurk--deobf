//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.world.*;
import net.minecraft.util.math.*;
import net.minecraft.block.state.*;
import net.minecraft.world.chunk.*;
import net.minecraft.tileentity.*;

public class Class1151 extends Chunk
{
    private final World Field13196;
    private int Field13197;
    
    public Class1151(final World field13196, final int n, final int n2) {
        super(field13196, n, n2);
        this.Field13196 = field13196;
    }
    
    protected void generateHeightMap() {
    }
    
    public void generateSkylightMap() {
    }
    
    public IBlockState getBlockState(final BlockPos blockPos) {
        return this.Field13196.getBlockState(blockPos);
    }
    
    public boolean isEmptyBetween(final int n, final int n2) {
        return false;
    }
    
    public TileEntity getTileEntity(final BlockPos blockPos, final Chunk$EnumCreateEntityType chunk$EnumCreateEntityType) {
        return this.Field13196.getTileEntity(blockPos);
    }
}
