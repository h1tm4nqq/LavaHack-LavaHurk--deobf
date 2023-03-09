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

import lavahack.client.Class1479;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

@MethodsReturnNonnullByDefault
public class Class208 {
    private int Field8900;

    public static ItemStack Method1238(IBlockState iBlockState, RayTraceResult rayTraceResult, Class1479 class1479, BlockPos blockPos, EntityPlayer entityPlayer) {
        Block block = iBlockState.getBlock();
        ItemStack itemStack = block.getPickBlock(iBlockState, rayTraceResult, (World)class1479, blockPos, entityPlayer);
        if (itemStack.isEmpty()) return ItemStack.EMPTY;
        return itemStack;
    }

    private static String Method1239(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 63;
            cArray2[n] = (char)(cArray[n] ^ (0x14A3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

