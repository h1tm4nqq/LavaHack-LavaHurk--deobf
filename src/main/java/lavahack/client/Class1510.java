//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.init.*;
import net.minecraft.block.state.*;

public class Class1510
{
    private static final Minecraft Field15072;
    private String Field15073 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static List Method6031(final double n) {
        final List method7758 = Class2155.Method7758((float)n, true, false);
        final ArrayList<Class1960> list = new ArrayList<Class1960>();
        final HashSet set = new HashSet();
        for (final BlockPos blockPos : method7758) {
            if (set.contains(blockPos)) {
                continue;
            }
            final Class1960 method7759 = Method6032(blockPos);
            if (method7759 == null) {
                continue;
            }
            set.addAll(method7759.Method7276());
            list.add(method7759);
        }
        return list;
    }
    
    public static Class1960 Method6032(final BlockPos blockPos) {
        if (Method6038(blockPos, true)) {
            return null;
        }
        if (!Method6038(blockPos.down(), false)) {
            return null;
        }
        final List<? super Object> list = Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)blockPos::offset).filter((Predicate<? super Object>)Class1510::Method6035).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
        if (list.size() <= 1) {
            return null;
        }
        if (list.size() >= 4) {
            if (!Method6037(blockPos)) {
                return null;
            }
            Class1120 method6034 = null;
            final Iterator<BlockPos> iterator = list.iterator();
            while (iterator.hasNext()) {
                method6034 = Method6034(Method6036(iterator.next()), method6034);
            }
            return new Class1960(Arrays.asList(blockPos), new AxisAlignedBB(blockPos), Class792.Field11374, method6034);
        }
        else if (list.size() >= 3) {
            final BlockPos blockPos2 = Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ? extends BlockPos>)blockPos::offset).filter(Class1510::Method6039).findFirst().orElse(null);
            if (blockPos2 == null) {
                return null;
            }
            if (!Method6037(blockPos) && !Method6037(blockPos2)) {
                return null;
            }
            Class792 class792 = Class792.Field11375;
            if (!Method6038(blockPos2.down(), false)) {
                class792 = Class792.Field11376;
            }
            Class1120 method6035 = null;
            final List<? super Object> list2 = Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)blockPos::offset).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList());
            list2.addAll(Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)blockPos2::offset).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
            list2.remove(blockPos);
            list2.remove(blockPos2);
            final Iterator<BlockPos> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                if (!Method6035(iterator2.next())) {
                    return null;
                }
            }
            final Iterator<BlockPos> iterator3 = list2.iterator();
            while (iterator3.hasNext()) {
                method6035 = Method6034(Method6036(iterator3.next()), method6035);
            }
            if (method6035 == null) {
                return null;
            }
            return new Class1960(Arrays.asList(blockPos, blockPos2), new AxisAlignedBB((double)Math.min(blockPos.getX(), blockPos2.getX()), (double)Math.min(blockPos.getY(), blockPos2.getY()), (double)Math.min(blockPos.getZ(), blockPos2.getZ()), (double)(Math.max(blockPos.getX(), blockPos2.getX()) + 1), (double)(Math.max(blockPos.getY(), blockPos2.getY()) + 1), (double)(Math.max(blockPos.getZ(), blockPos2.getZ()) + 1)), class792, method6035);
        }
        else {
            final EnumFacing method6036 = Method6033(blockPos, list.get(0));
            final EnumFacing method6037 = Method6033(blockPos, list.get(1));
            if (method6036 == null || method6037 == null) {
                return null;
            }
            final EnumFacing getOpposite = method6036.getOpposite();
            final EnumFacing getOpposite2 = method6037.getOpposite();
            final Iterator<BlockPos> iterator4 = Arrays.asList(blockPos, blockPos.offset(getOpposite), blockPos.offset(getOpposite2), blockPos.offset(getOpposite).offset(getOpposite2)).iterator();
            while (iterator4.hasNext() && !Method6037(iterator4.next())) {}
            return null;
        }
    }
    
    public static EnumFacing Method6033(final BlockPos blockPos, final BlockPos blockPos2) {
        for (final EnumFacing enumFacing : EnumFacing.HORIZONTALS) {
            if (blockPos.offset(enumFacing) == blockPos2) {
                return enumFacing;
            }
        }
        return null;
    }
    
    public static Class1120 Method6034(final Class1111 class1111, final Class1120 class1112) {
        if (class1112 == null) {
            return class1111.Method4542();
        }
        if (class1112 == Class1120.Field13036) {
            if (class1111 == Class1111.Field13001) {
                return Class1120.Field13036;
            }
            return Class1120.Field13038;
        }
        else {
            if (class1112 != Class1120.Field13037) {
                return Class1120.Field13038;
            }
            if (class1111 == Class1111.Field13001) {
                return Class1120.Field13038;
            }
            return Class1120.Field13037;
        }
    }
    
    public static boolean Method6035(final BlockPos blockPos) {
        return Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.BEDROCK || Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.OBSIDIAN;
    }
    
    public static Class1111 Method6036(final BlockPos blockPos) {
        if (Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.OBSIDIAN) {
            return Class1111.Field13002;
        }
        if (Class1510.Field15072.world.getBlockState(blockPos).getBlock() == Blocks.BEDROCK) {
            return Class1111.Field13001;
        }
        return null;
    }
    
    public static boolean Method6037(final BlockPos blockPos) {
        boolean b = false;
        int n = 0;
        while (true) {
            b |= Method6038(blockPos.up(n + 1), true);
            ++n;
        }
    }
    
    public static boolean Method6038(final BlockPos blockPos, final boolean b) {
        final IBlockState getBlockState = Class1510.Field15072.world.getBlockState(blockPos);
        return getBlockState.getBlock().canCollideCheck(getBlockState, b);
    }
    
    private static boolean Method6039(final List list, final BlockPos blockPos) {
        return !list.contains(blockPos);
    }
    
    static {
        Field15072 = Minecraft.getMinecraft();
    }
}
