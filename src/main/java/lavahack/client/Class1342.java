//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraft.entity.*;
import net.minecraft.util.math.*;
import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.util.*;
import net.minecraft.inventory.*;
import java.util.*;
import net.minecraft.block.state.*;
import net.minecraft.block.*;
import net.minecraftforge.fluids.*;

public class Class1342
{
    private String Field14122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public List Method5398(final EntityPlayer entityPlayer, final Class1479 class1479, final World world) {
        final ArrayList<Class1947> list = new ArrayList<Class1947>();
        if (class1479 == null) {
            return list;
        }
        final RayTraceResult rayTraceResult = new RayTraceResult((Entity)entityPlayer);
        final Class16 class1480 = new Class16();
        for (final Class16 class1481 : Class777.Method3238(BlockPos.ORIGIN, new BlockPos(class1479.getWidth() - 1, class1479.getHeight() - 1, class1479.getLength() - 1))) {
            if (!class1479.Field14898.Method1104(class1479, class1481.getY())) {
                continue;
            }
            final IBlockState getBlockState = class1479.getBlockState(class1481);
            final Block getBlock = getBlockState.getBlock();
            if (getBlock == Blocks.AIR) {
                continue;
            }
            if (class1479.isAirBlock(class1481)) {
                continue;
            }
            class1480.set((Vec3i)class1479.Field14896.add((Vec3i)class1481));
            final boolean method5242 = Class1290.Method5242(getBlockState, world.getBlockState((BlockPos)class1480));
            final ItemStack EMPTY = ItemStack.EMPTY;
            ItemStack pickBlock = getBlock.getPickBlock(getBlockState, rayTraceResult, (World)class1479, (BlockPos)class1481, entityPlayer);
            if (getBlock instanceof IFluidBlock || getBlock instanceof BlockLiquid) {
                final FluidActionResult tryFillContainer = FluidUtil.tryFillContainer(new ItemStack(Items.BUCKET), FluidUtil.getFluidHandler((World)class1479, (BlockPos)class1481, (EnumFacing)null), 1000, (EntityPlayer)null, false);
                if (tryFillContainer.isSuccess()) {
                    final ItemStack result = tryFillContainer.getResult();
                    if (!result.isEmpty()) {
                        pickBlock = result;
                    }
                }
            }
            if (pickBlock == null) {
                Class542.Field10314.error("Could not find the item for: {} (getPickBlock() returned null, this is a bug)", (Object)getBlockState);
            }
            else if (pickBlock.isEmpty()) {
                Class542.Field10314.warn("Could not find the item for: {}", (Object)getBlockState);
            }
            else {
                int n = 1;
                if (getBlock instanceof BlockSlab && ((BlockSlab)getBlock).isDouble()) {
                    n = 2;
                }
                final Class1947 method5243 = this.Method5399(list, pickBlock);
                if (method5242) {
                    final Class1947 class1482 = method5243;
                    class1482.Field16998 += n;
                }
                final Class1947 class1483 = method5243;
                class1483.Field16999 += n;
            }
        }
        for (final Class1947 class1484 : list) {
            if (entityPlayer.capabilities.isCreativeMode) {
                class1484.Field17000 = -1;
            }
            else {
                class1484.Field17000 = Class346.Method1719((IInventory)entityPlayer.inventory, class1484.Field16997.getItem(), class1484.Field16997.getItemDamage());
            }
        }
        return list;
    }
    
    private Class1947 Method5399(final List list, final ItemStack itemStack) {
        for (final Class1947 class1947 : list) {
            if (class1947.Field16997.isItemEqual(itemStack)) {
                return class1947;
            }
        }
        final Class1947 class1948 = new Class1947(itemStack.copy());
        list.add(class1948);
        return class1948;
    }
    
    private static String Method5400(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7412 ^ 0xA5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
