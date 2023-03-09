//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lavahack.client.Class1111;
import lavahack.client.Class1120;
import lavahack.client.Class1960;
import lavahack.client.Class2155;
import lavahack.client.Class792;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Class1510 {
    private static final Minecraft Field15072 = Minecraft.getMinecraft();
    private String Field15073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static List Method6031(double d) {
        List list = Class2155.Method7758((float)d, true, false);
        ArrayList<Class1960> arrayList = new ArrayList<Class1960>();
        HashSet hashSet = new HashSet();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Class1960 class1960;
            BlockPos blockPos = (BlockPos)iterator.next();
            if (hashSet.contains(blockPos) || (class1960 = Class1510.Method6032(blockPos)) == null) continue;
            hashSet.addAll(class1960.Method7276());
            arrayList.add(class1960);
        }
        return arrayList;
    }

    public static Class1960 Method6032(BlockPos blockPos) {
        BlockPos blockPos2;
        if (Class1510.Method6038(blockPos, true)) {
            return null;
        }
        if (!Class1510.Method6038(blockPos.down(), false)) {
            return null;
        }
        List list = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(Class1510::Method6035).collect(Collectors.toList());
        if (list.size() <= 1) {
            return null;
        }
        if (list.size() >= 4) {
            if (!Class1510.Method6037(blockPos)) {
                return null;
            }
            Class1120 class1120 = null;
            Iterator iterator = list.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    return new Class1960(Arrays.asList(blockPos), new AxisAlignedBB(blockPos), Class792.Field11374, class1120);
                }
                BlockPos blockPos3 = (BlockPos)iterator.next();
                class1120 = Class1510.Method6034(Class1510.Method6036(blockPos3), class1120);
            }
        }
        if (list.size() >= 3) {
            BlockPos blockPos4 = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).filter(arg_0 -> Class1510.Method6039(list, arg_0)).findFirst().orElse(null);
            if (blockPos4 == null) {
                return null;
            }
            if (!Class1510.Method6037(blockPos) && !Class1510.Method6037(blockPos4)) {
                return null;
            }
            Class792 class792 = Class792.Field11375;
            if (!Class1510.Method6038(blockPos4.down(), false)) {
                class792 = Class792.Field11376;
            }
            Class1120 class1120 = null;
            List list2 = Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).collect(Collectors.toList());
            list2.addAll(Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos4).offset(arg_0)).collect(Collectors.toList()));
            list2.remove(blockPos);
            list2.remove(blockPos4);
            for (BlockPos blockPos5 : list2) {
                if (Class1510.Method6035(blockPos5)) continue;
                return null;
            }
            for (BlockPos blockPos5 : list2) {
                class1120 = Class1510.Method6034(Class1510.Method6036(blockPos5), class1120);
            }
            if (class1120 == null) {
                return null;
            }
            AxisAlignedBB axisAlignedBB = new AxisAlignedBB((double)Math.min(blockPos.getX(), blockPos4.getX()), (double)Math.min(blockPos.getY(), blockPos4.getY()), (double)Math.min(blockPos.getZ(), blockPos4.getZ()), (double)(Math.max(blockPos.getX(), blockPos4.getX()) + 1), (double)(Math.max(blockPos.getY(), blockPos4.getY()) + 1), (double)(Math.max(blockPos.getZ(), blockPos4.getZ()) + 1));
            return new Class1960(Arrays.asList(blockPos, blockPos4), axisAlignedBB, class792, class1120);
        }
        EnumFacing enumFacing = Class1510.Method6033(blockPos, (BlockPos)list.get(0));
        EnumFacing enumFacing2 = Class1510.Method6033(blockPos, (BlockPos)list.get(1));
        if (enumFacing == null) return null;
        if (enumFacing2 == null) {
            return null;
        }
        enumFacing = enumFacing.getOpposite();
        enumFacing2 = enumFacing2.getOpposite();
        List<BlockPos> list3 = Arrays.asList(blockPos, blockPos.offset(enumFacing), blockPos.offset(enumFacing2), blockPos.offset(enumFacing).offset(enumFacing2));
        boolean bl = false;
        Iterator<BlockPos> iterator = list3.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!Class1510.Method6037(blockPos2 = iterator.next()));
        return null;
    }

    public static EnumFacing Method6033(BlockPos blockPos, BlockPos blockPos2) {
        EnumFacing[] enumFacingArray = EnumFacing.HORIZONTALS;
        int n = enumFacingArray.length;
        int n2 = 0;
        while (n2 < n) {
            EnumFacing enumFacing = enumFacingArray[n2];
            if (blockPos.offset(enumFacing) == blockPos2) {
                return enumFacing;
            }
            ++n2;
        }
        return null;
    }

    public static Class1120 Method6034(Class1111 class1111, Class1120 class1120) {
        if (class1120 == null) {
            return class1111.Method4542();
        }
        if (class1120 == Class1120.Field13036) {
            if (class1111 != Class1111.Field13001) return Class1120.Field13038;
            return Class1120.Field13036;
        }
        if (class1120 != Class1120.Field13037) return Class1120.Field13038;
        if (class1111 != Class1111.Field13001) return Class1120.Field13037;
        return Class1120.Field13038;
    }

    public static boolean Method6035(BlockPos blockPos) {
        if (Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.BEDROCK) return true;
        if (Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.OBSIDIAN) return true;
        return false;
    }

    public static Class1111 Method6036(BlockPos blockPos) {
        if (Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.OBSIDIAN) {
            return Class1111.Field13002;
        }
        if (Class1510.Field15072.world.getBlockState(blockPos).getBlock() != Blocks.BEDROCK) return null;
        return Class1111.Field13001;
    }

    public static boolean Method6037(BlockPos blockPos) {
        boolean bl = false;
        int n = 0;
        while (true) {
            bl |= Class1510.Method6038(blockPos.up(n + 1), true);
            ++n;
        }
    }

    public static boolean Method6038(BlockPos blockPos, boolean bl) {
        IBlockState iBlockState = Class1510.Field15072.world.getBlockState(blockPos);
        return iBlockState.getBlock().canCollideCheck(iBlockState, bl);
    }

    private static boolean Method6039(List list, BlockPos blockPos) {
        if (list.contains(blockPos)) return false;
        return true;
    }
}

