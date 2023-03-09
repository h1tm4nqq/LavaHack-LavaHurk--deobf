//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

public class Class1556 {
    private String Field15266 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static List Method6135(Entity entity, double d) {
        List list = Class1556.Method6136(entity, d);
        ArrayList arrayList = new ArrayList();
        list.forEach(arg_0 -> Class1556.Method6137(arrayList, arg_0));
        arrayList.removeAll(list);
        return arrayList;
    }

    public static List Method6136(Entity entity, double d) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        double d2 = (entity.boundingBox.maxX - entity.boundingBox.minX) / Double.longBitsToDouble((long)952231845 ^ 0x4000000038C1E7A5L);
        double d3 = (entity.boundingBox.maxZ - entity.boundingBox.minZ) / Double.longBitsToDouble((long)1425053044 ^ 0x4000000054F09574L);
        double d4 = Math.floor(entity.posX - d2);
        while (d4 <= Math.floor(entity.posX + d2)) {
            double d5 = Math.floor(entity.posZ - d3);
            while (d5 <= Math.floor(entity.posZ + d3)) {
                arrayList.add(new BlockPos(d4, entity.posY + d, d5));
                d4 += 1.0;
            }
            d4 += 1.0;
        }
        return arrayList;
    }

    private static void Method6137(List list, BlockPos blockPos) {
        list.addAll(Stream.of(EnumFacing.HORIZONTALS).map(arg_0 -> ((BlockPos)blockPos).offset(arg_0)).collect(Collectors.toList()));
    }
}

