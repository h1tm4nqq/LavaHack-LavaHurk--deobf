//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.entity.*;
import net.minecraft.block.*;
import net.minecraft.init.*;
import java.util.function.*;
import net.minecraft.util.math.*;
import java.util.*;

public class Class1914
{
    private static final Minecraft Field16900;
    private String Field16901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static boolean Method7129(final Entity entity, final boolean b, final boolean b2) {
        return !Method7131(new BlockPos(entity.getPositionVector()), b, b2).Method6959().equals(Class422.Field9771);
    }
    
    public static Class410 Method7130(final Block block) {
        if (block == Blocks.BEDROCK) {
            return Class410.Field9697;
        }
        if (block == Blocks.OBSIDIAN || block == Blocks.ENDER_CHEST || block == Blocks.ANVIL) {
            return Class410.Field9698;
        }
        return Class410.Field9699;
    }
    
    public static Class1862 Method7131(final BlockPos e, final boolean b, final boolean b2) {
        final Class1862 class1862 = new Class1862();
        final HashMap method7133 = Method7133(e);
        if (method7133.containsKey(Class668.Field10833) && method7133.remove(Class668.Field10833, Class410.Field9699) && !b2) {
            class1862.Method6957(Class410.Field9699);
            return class1862;
        }
        final int size = method7133.size();
        method7133.entrySet().removeIf(Class1914::Method7135);
        if (method7133.size() != size) {
            class1862.Method6957(Class410.Field9698);
        }
        final int size2 = method7133.size();
        if (size2 == 0) {
            class1862.Method6956(Class422.Field9768);
            class1862.Method6958(new AxisAlignedBB(e));
            class1862.Field16564.add(e);
            return class1862;
        }
        if (size2 == 1 && !b) {
            return Method7132(class1862, e, (Class668)method7133.keySet().stream().findFirst().get());
        }
        class1862.Method6957(Class410.Field9699);
        return class1862;
    }
    
    private static Class1862 Method7132(final Class1862 class1862, final BlockPos e, final Class668 class1863) {
        final BlockPos method2846 = class1863.Method2846(e);
        final HashMap method2847 = Method7133(method2846);
        final int size = method2847.size();
        method2847.entrySet().removeIf(Class1914::Method7134);
        if (method2847.size() != size) {
            class1862.Method6957(Class410.Field9698);
        }
        if (method2847.containsKey(Class668.Field10833)) {
            class1862.Method6956(Class422.Field9770);
            method2847.remove(Class668.Field10833);
        }
        if (method2847.size() > 1) {
            class1862.Method6956(Class422.Field9771);
            return class1862;
        }
        class1862.Method6958(new AxisAlignedBB((double)Math.min(e.getX(), method2846.getX()), (double)e.getY(), (double)Math.min(e.getZ(), method2846.getZ()), (double)(Math.max(e.getX(), method2846.getX()) + 1), (double)(e.getY() + 1), (double)(Math.max(e.getZ(), method2846.getZ()) + 1)));
        class1862.Field16564.add(e);
        class1862.Field16564.add(method2846);
        if (class1862.Method6959() != Class422.Field9770) {
            class1862.Method6956(Class422.Field9769);
        }
        return class1862;
    }
    
    public static HashMap Method7133(final BlockPos blockPos) {
        final HashMap<Class668, Class410> hashMap = new HashMap<Class668, Class410>();
        final Class410 method7130 = Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10833.Method2846(blockPos)).getBlock());
        if (method7130 != Class410.Field9697) {
            hashMap.put(Class668.Field10833, method7130);
        }
        final Class410 method7131 = Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10835.Method2846(blockPos)).getBlock());
        if (method7131 != Class410.Field9697) {
            hashMap.put(Class668.Field10835, method7131);
        }
        final Class410 method7132 = Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10837.Method2846(blockPos)).getBlock());
        if (method7132 != Class410.Field9697) {
            hashMap.put(Class668.Field10837, method7132);
        }
        final Class410 method7133 = Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10836.Method2846(blockPos)).getBlock());
        if (method7133 != Class410.Field9697) {
            hashMap.put(Class668.Field10836, method7133);
        }
        final Class410 method7134 = Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10838.Method2846(blockPos)).getBlock());
        if (method7134 != Class410.Field9697) {
            hashMap.put(Class668.Field10838, method7134);
        }
        return hashMap;
    }
    
    private static boolean Method7134(final Map.Entry entry) {
        return entry.getValue() == Class410.Field9698;
    }
    
    private static boolean Method7135(final Map.Entry entry) {
        return entry.getValue() == Class410.Field9698;
    }
    
    static {
        Field16900 = Minecraft.getMinecraft();
    }
}
