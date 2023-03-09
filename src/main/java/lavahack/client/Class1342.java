//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockLiquid
 *  net.minecraft.block.BlockSlab
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.init.Blocks
 *  net.minecraft.init.Items
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraftforge.fluids.FluidUtil
 *  net.minecraftforge.fluids.IFluidBlock
 *  net.minecraftforge.fluids.capability.IFluidHandler
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1290;
import lavahack.client.Class1479;
import lavahack.client.Class16;
import lavahack.client.Class1947;
import lavahack.client.Class346;
import lavahack.client.Class542;
import lavahack.client.Class777;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fluids.capability.IFluidHandler;

public class Class1342 {
    private String Field14122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public List Method5398(EntityPlayer entityPlayer, Class1479 class1479, World world) {
        ArrayList arrayList = new ArrayList();
        if (class1479 == null) {
            return arrayList;
        }
        RayTraceResult rayTraceResult = new RayTraceResult((Entity)entityPlayer);
        Class16 class16 = new Class16();
        for (Object object : Class777.Method3238(BlockPos.ORIGIN, new BlockPos(class1479.getWidth() - 1, class1479.getHeight() - 1, class1479.getLength() - 1))) {
            ItemStack itemStack;
            IFluidHandler iFluidHandler;
            Object object2;
            IBlockState iBlockState;
            Block block;
            if (!class1479.Field14898.Method1104(class1479, object.getY()) || (block = (iBlockState = class1479.getBlockState((BlockPos)object)).getBlock()) == Blocks.AIR || class1479.isAirBlock((BlockPos)object)) continue;
            class16.set((Vec3i)class1479.Field14896.add((Vec3i)object));
            IBlockState iBlockState2 = world.getBlockState((BlockPos)class16);
            boolean bl = Class1290.Method5242(iBlockState, iBlockState2);
            ItemStack itemStack2 = ItemStack.EMPTY;
            itemStack2 = block.getPickBlock(iBlockState, rayTraceResult, (World)class1479, (BlockPos)object, entityPlayer);
            if ((block instanceof IFluidBlock || block instanceof BlockLiquid) && (object2 = FluidUtil.tryFillContainer((ItemStack)new ItemStack(Items.BUCKET), (IFluidHandler)(iFluidHandler = FluidUtil.getFluidHandler((World)class1479, (BlockPos)object, null)), (int)1000, null, (boolean)false)).isSuccess() && !(itemStack = object2.getResult()).isEmpty()) {
                itemStack2 = itemStack;
            }
            if (itemStack2 == null) {
                Class542.Field10314.error("Could not find the item for: {} (getPickBlock() returned null, this is a bug)", (Object)iBlockState);
                continue;
            }
            if (itemStack2.isEmpty()) {
                Class542.Field10314.warn("Could not find the item for: {}", (Object)iBlockState);
                continue;
            }
            int n = 1;
            if (block instanceof BlockSlab && ((BlockSlab)block).isDouble()) {
                n = 2;
            }
            object2 = this.Method5399(arrayList, itemStack2);
            if (bl) {
                object2.Field16998 += n;
            }
            object2.Field16999 += n;
        }
        Iterator<Object> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (Class1947)iterator.next();
            if (entityPlayer.capabilities.isCreativeMode) {
                ((Class1947)object).Field17000 = -1;
                continue;
            }
            ((Class1947)object).Field17000 = Class346.Method1719((IInventory)entityPlayer.inventory, ((Class1947)object).Field16997.getItem(), ((Class1947)object).Field16997.getItemDamage());
        }
        return arrayList;
    }

    private Class1947 Method5399(List list, ItemStack itemStack) {
        Class1947 class1947;
        Object object = list.iterator();
        do {
            if (!object.hasNext()) {
                object = new Class1947(itemStack.copy());
                list.add(object);
                return object;
            }
            class1947 = (Class1947)object.next();
        } while (!class1947.Field16997.isItemEqual(itemStack));
        return class1947;
    }

    private static String Method5400(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 165;
            cArray2[n] = (char)(cArray[n] ^ (0x7412 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

