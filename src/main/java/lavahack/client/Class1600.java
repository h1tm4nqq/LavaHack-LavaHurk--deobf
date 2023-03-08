//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.world.*;
import net.minecraft.block.state.*;
import net.minecraft.init.*;
import net.minecraft.util.math.*;
import net.minecraft.client.multiplayer.*;

public class Class1600 extends ChunkCache
{
    private final Minecraft Field15493;
    private int Field15494;
    
    public Class1600(final World world, final BlockPos blockPos, final BlockPos blockPos2, final int n) {
        super(world, blockPos, blockPos2, n);
        this.Field15493 = Minecraft.getMinecraft();
    }
    
    public IBlockState getBlockState(final BlockPos blockPos) {
        final Class16 field14896 = Class46.Field8122.Field14896;
        if (field14896 == null) {
            return Blocks.AIR.getDefaultState();
        }
        final BlockPos add = blockPos.add((Vec3i)field14896);
        final WorldClient world = this.Field15493.world;
        if (world == null || (!((World)world).isAirBlock(add) && !Class32.Method265(((World)world).getBlockState(add).getBlock()))) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getBlockState(blockPos);
    }
}
