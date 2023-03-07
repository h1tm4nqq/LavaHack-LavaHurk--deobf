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
import lavahack.client.EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN;
import lavahack.client.OP4La13R7rceTBm7QSP7XXXyRxZD1Op3;
import lavahack.client.cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn;
import lavahack.client.l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4;
import lavahack.client.pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX;
import lavahack.client.vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.x4nUIRAJlZw1QLw3fZFmPOQ7t5iN2Gwb;
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

public class vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7 {
    private String Field14122 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public List Method5398(EntityPlayer entityPlayer, OP4La13R7rceTBm7QSP7XXXyRxZD1Op3 oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, World world) {
        ArrayList arrayList = new ArrayList();
        if (oP4La13R7rceTBm7QSP7XXXyRxZD1Op3 == null) {
            return arrayList;
        }
        RayTraceResult rayTraceResult = new RayTraceResult((Entity)entityPlayer);
        EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN = new EI9c6zIVRmilhn2cqdchMfsqYAcbxWRN();
        for (Object object : l4F3kNJrRkvk5vOACVrLHwT9L3irQkR4.Method3238(BlockPos.ORIGIN, new BlockPos(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getWidth() - ((int)-259945301L ^ 0xF0818CAA), oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getHeight() - (int)((long)-545536582 ^ (long)-545536581), oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getLength() - ((int)-1265967085L ^ 0xB48AE012)))) {
            ItemStack itemStack;
            IFluidHandler iFluidHandler;
            vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
            IBlockState iBlockState;
            Block block;
            if (!oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14898.Method1104(oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, object.getY()) || (block = (iBlockState = oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.getBlockState((BlockPos)object)).getBlock()) == Blocks.AIR || oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.isAirBlock((BlockPos)object)) continue;
            eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN.set((Vec3i)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3.Field14896.add((Vec3i)object));
            IBlockState iBlockState2 = world.getBlockState((BlockPos)eI9c6zIVRmilhn2cqdchMfsqYAcbxWRN);
            boolean bl = cIAjj5fxyHQ1yGwizsmBfFYabOVTjMHn.Method5242(iBlockState, iBlockState2);
            ItemStack itemStack2 = ItemStack.EMPTY;
            itemStack2 = block.getPickBlock(iBlockState, rayTraceResult, (World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, (BlockPos)object, entityPlayer);
            if ((block instanceof IFluidBlock || block instanceof BlockLiquid) && (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = FluidUtil.tryFillContainer((ItemStack)new ItemStack(Items.BUCKET), (IFluidHandler)(iFluidHandler = FluidUtil.getFluidHandler((World)oP4La13R7rceTBm7QSP7XXXyRxZD1Op3, (BlockPos)object, null)), (int)(((int)-867046620L ^ 0xCC51EB59) << 3), null, ((int)-1910135785L ^ 0x8E25A417) != 0)).isSuccess() && !(itemStack = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getResult()).isEmpty()) {
                itemStack2 = itemStack;
            }
            if (itemStack2 == null) {
                pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.error("Could not find the item for: {} (getPickBlock() returned null, this is a bug)", (Object)iBlockState);
                continue;
            }
            if (itemStack2.isEmpty()) {
                pXAAWVGOB4aEwEg6dbu5gWaXJZyCcAFX.Field10314.warn("Could not find the item for: {}", (Object)iBlockState);
                continue;
            }
            int n = (int)-1474361758L ^ 0xA81F0663;
            if (block instanceof BlockSlab && ((BlockSlab)block).isDouble()) {
                n = ((int)-1474796259L ^ 0xA818651C) << 1;
            }
            vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = this.Method5399(arrayList, itemStack2);
            if (bl) {
                vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16998 += n;
            }
            vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16999 += n;
        }
        Iterator<Object> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object object;
            object = (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)iterator.next();
            if (entityPlayer.capabilities.isCreativeMode) {
                ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object).Field17000 = (int)268120587L ^ 0xF004CDF4;
                continue;
            }
            ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object).Field17000 = x4nUIRAJlZw1QLw3fZFmPOQ7t5iN2Gwb.Method1719((IInventory)entityPlayer.inventory, ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object).Field16997.getItem(), ((vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object).Field16997.getItemDamage());
        }
        return arrayList;
    }

    private vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5399(List list, ItemStack itemStack) {
        vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        Object object = list.iterator();
        do {
            if (!object.hasNext()) {
                object = new vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(itemStack.copy());
                list.add(object);
                return object;
            }
            vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)object.next();
        } while (!vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16997.isItemEqual(itemStack));
        return vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    private static String Method5400(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)960806874 ^ (long)960806874);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1528100980L ^ 0x5B14F88B);
            int n2 = (int)-617099113L ^ 0xDB37D032;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1329467471 ^ (long)-1329474120) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

