//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import mcp.*;
import net.minecraft.block.state.*;
import net.minecraft.util.math.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;

@MethodsReturnNonnullByDefault
public class Class208
{
    private int Field8900;
    
    public static ItemStack Method1238(final IBlockState blockState, final RayTraceResult rayTraceResult, final Class1479 class1479, final BlockPos blockPos, final EntityPlayer entityPlayer) {
        final ItemStack pickBlock = blockState.getBlock().getPickBlock(blockState, rayTraceResult, (World)class1479, blockPos, entityPlayer);
        if (!pickBlock.isEmpty()) {
            return pickBlock;
        }
        return ItemStack.EMPTY;
    }
    
    private static String Method1239(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x14A3 ^ 0x3F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
