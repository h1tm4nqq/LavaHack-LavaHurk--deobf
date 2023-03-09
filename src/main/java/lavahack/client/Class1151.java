//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.tileentity.TileEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.Chunk
 *  net.minecraft.world.chunk.Chunk$EnumCreateEntityType
 */
package lavahack.client;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;

public class Class1151
extends Chunk {
    private final World Field13196;
    private int Field13197;

    public Class1151(World world, int n, int n2) {
        super(world, n, n2);
        this.Field13196 = world;
    }

    protected void generateHeightMap() {
    }

    public void generateSkylightMap() {
    }

    public IBlockState getBlockState(BlockPos blockPos) {
        return this.Field13196.getBlockState(blockPos);
    }

    public boolean isEmptyBetween(int n, int n2) {
        return false;
    }

    public TileEntity getTileEntity(BlockPos blockPos, Chunk.EnumCreateEntityType enumCreateEntityType) {
        return this.Field13196.getTileEntity(blockPos);
    }
}

