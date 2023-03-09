//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.Minecraft
 *  net.minecraft.entity.Entity
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Map;
import lavahack.client.Class1862;
import lavahack.client.Class410;
import lavahack.client.Class422;
import lavahack.client.Class668;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

public class Class1914 {
    private static final Minecraft Field16900 = Minecraft.getMinecraft();
    private String Field16901 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method7129(Entity entity, boolean bl, boolean bl2) {
        if (Class1914.Method7131(new BlockPos(entity.getPositionVector()), bl, bl2).Method6959().equals((Object)Class422.Field9771)) return false;
        return true;
    }

    public static Class410 Method7130(Block block) {
        if (block == Blocks.BEDROCK) {
            return Class410.Field9697;
        }
        if (block == Blocks.OBSIDIAN) return Class410.Field9698;
        if (block == Blocks.ENDER_CHEST) return Class410.Field9698;
        if (block != Blocks.ANVIL) return Class410.Field9699;
        return Class410.Field9698;
    }

    public static Class1862 Method7131(BlockPos blockPos, boolean bl, boolean bl2) {
        Class1862 class1862 = new Class1862();
        HashMap hashMap = Class1914.Method7133(blockPos);
        if (hashMap.containsKey((Object)Class668.Field10833) && hashMap.remove((Object)Class668.Field10833, (Object)Class410.Field9699) && !bl2) {
            class1862.Method6957(Class410.Field9699);
            return class1862;
        }
        int n = hashMap.size();
        hashMap.entrySet().removeIf(Class1914::Method7135);
        if (hashMap.size() != n) {
            class1862.Method6957(Class410.Field9698);
        }
        if ((n = hashMap.size()) == 0) {
            class1862.Method6956(Class422.Field9768);
            class1862.Method6958(new AxisAlignedBB(blockPos));
            class1862.Field16564.add(blockPos);
            return class1862;
        }
        if (n == 1 && !bl) {
            return Class1914.Method7132(class1862, blockPos, (Class668)((Object)hashMap.keySet().stream().findFirst().get()));
        }
        class1862.Method6957(Class410.Field9699);
        return class1862;
    }

    private static Class1862 Method7132(Class1862 class1862, BlockPos blockPos, Class668 class668) {
        BlockPos blockPos2 = class668.Method2846(blockPos);
        HashMap hashMap = Class1914.Method7133(blockPos2);
        int n = hashMap.size();
        hashMap.entrySet().removeIf(Class1914::Method7134);
        if (hashMap.size() != n) {
            class1862.Method6957(Class410.Field9698);
        }
        if (hashMap.containsKey((Object)Class668.Field10833)) {
            class1862.Method6956(Class422.Field9770);
            hashMap.remove((Object)Class668.Field10833);
        }
        if (hashMap.size() > 1) {
            class1862.Method6956(Class422.Field9771);
            return class1862;
        }
        double d = Math.min(blockPos.getX(), blockPos2.getX());
        double d2 = Math.max(blockPos.getX(), blockPos2.getX()) + 1;
        double d3 = Math.min(blockPos.getZ(), blockPos2.getZ());
        double d4 = Math.max(blockPos.getZ(), blockPos2.getZ()) + 1;
        class1862.Method6958(new AxisAlignedBB(d, (double)blockPos.getY(), d3, d2, (double)(blockPos.getY() + 1), d4));
        class1862.Field16564.add(blockPos);
        class1862.Field16564.add(blockPos2);
        if (class1862.Method6959() == Class422.Field9770) return class1862;
        class1862.Method6956(Class422.Field9769);
        return class1862;
    }

    public static HashMap Method7133(BlockPos blockPos) {
        HashMap<Class668, Class410> hashMap = new HashMap<Class668, Class410>();
        Class410 class410 = Class1914.Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10833.Method2846(blockPos)).getBlock());
        if (class410 != Class410.Field9697) {
            hashMap.put(Class668.Field10833, class410);
        }
        if ((class410 = Class1914.Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10835.Method2846(blockPos)).getBlock())) != Class410.Field9697) {
            hashMap.put(Class668.Field10835, class410);
        }
        if ((class410 = Class1914.Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10837.Method2846(blockPos)).getBlock())) != Class410.Field9697) {
            hashMap.put(Class668.Field10837, class410);
        }
        if ((class410 = Class1914.Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10836.Method2846(blockPos)).getBlock())) != Class410.Field9697) {
            hashMap.put(Class668.Field10836, class410);
        }
        if ((class410 = Class1914.Method7130(Class1914.Field16900.world.getBlockState(Class668.Field10838.Method2846(blockPos)).getBlock())) == Class410.Field9697) return hashMap;
        hashMap.put(Class668.Field10838, class410);
        return hashMap;
    }

    private static boolean Method7134(Map.Entry entry) {
        if (entry.getValue() != Class410.Field9698) return false;
        return true;
    }

    private static boolean Method7135(Map.Entry entry) {
        if (entry.getValue() != Class410.Field9698) return false;
        return true;
    }
}

