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

import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.Z59nFS7fzGt9MllssMcgOsEYj1a2guaH;
import lavahack.client.sYSQwf2xD3nukbcGapT2KmEMESaueLHM;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.ChunkCache;
import net.minecraft.world.World;

public class uXWGyY3E4UqFIIGfViLB1sRjvxZ3O8Wg
extends ChunkCache {
    private final Minecraft Field15493 = Minecraft.getMinecraft();
    private int Field15494;

    public uXWGyY3E4UqFIIGfViLB1sRjvxZ3O8Wg(World world, BlockPos blockPos, BlockPos blockPos2, int n) {
        super(world, blockPos, blockPos2, n);
    }

    public IBlockState getBlockState(BlockPos blockPos) {
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = sYSQwf2xD3nukbcGapT2KmEMESaueLHM.Field8122.Field14896;
        if (eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN == null) {
            return Blocks.AIR.getDefaultState();
        }
        BlockPos blockPos2 = blockPos.add((Vec3i)eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN);
        WorldClient worldClient = this.Field15493.world;
        if (worldClient == null) return Blocks.AIR.getDefaultState();
        if (worldClient.isAirBlock(blockPos2)) return super.getBlockState(blockPos);
        if (Z59nFS7fzGt9MllssMcgOsEYj1a2guaH.Method265(worldClient.getBlockState(blockPos2).getBlock())) return super.getBlockState(blockPos);
        return Blocks.AIR.getDefaultState();
    }
}

