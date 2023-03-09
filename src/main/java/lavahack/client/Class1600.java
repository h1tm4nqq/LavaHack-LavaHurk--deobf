//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.WorldClient
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.ChunkCache
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.Class16;
import lavahack.client.Class32;
import lavahack.client.Class46;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.World;

public class Class1600
extends ChunkCache {
    private final Minecraft Field15493 = Minecraft.getMinecraft();
    private int Field15494;

    public Class1600(World world, BlockPos blockPos, BlockPos blockPos2, int n) {
        super(world, blockPos, blockPos2, n);
    }

    public IBlockState getBlockState(BlockPos blockPos) {
        Class16 class16 = Class46.Field8122.Field14896;
        if (class16 == null) {
            return Blocks.AIR.getDefaultState();
        }
        BlockPos blockPos2 = blockPos.add((Vec3i)class16);
        WorldClient worldClient = this.Field15493.world;
        if (worldClient == null) return Blocks.AIR.getDefaultState();
        if (worldClient.isAirBlock(blockPos2)) return super.getBlockState(blockPos);
        if (Class32.Method265(worldClient.getBlockState(blockPos2).getBlock())) return super.getBlockState(blockPos);
        return Blocks.AIR.getDefaultState();
    }
}

