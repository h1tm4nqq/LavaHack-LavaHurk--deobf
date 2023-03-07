//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcp.MethodsReturnNonnullByDefault
 *  net.minecraft.block.Block
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.world.World
 */
package lavahack.client;

import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

@MethodsReturnNonnullByDefault
public class HYJBaHuHohzh6cKuoYprXexIDWip4amG {
    private int Field8900;

    public static ItemStack Method1238(IBlockState iBlockState, RayTraceResult rayTraceResult, OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, BlockPos blockPos, EntityPlayer entityPlayer) {
        Block block = iBlockState.getBlock();
        ItemStack itemStack = block.getPickBlock(iBlockState, rayTraceResult, (World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, blockPos, entityPlayer);
        if (itemStack.isEmpty()) return ItemStack.EMPTY;
        return itemStack;
    }

    private static String Method1239(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)273234005L ^ 0x10493855;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1306626149 ^ (long)1306626202);
            int n2 = (int)((long)-1124914416 ^ (long)-1124914385);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1211143991 ^ (long)-1211138966) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

