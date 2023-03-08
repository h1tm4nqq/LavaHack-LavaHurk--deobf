//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Class1556
{
    private String Field15266 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static List Method6135(final Entity entity, final double n) {
        final List method6136 = Method6136(entity, n);
        final ArrayList list = new ArrayList();
        method6136.forEach(Class1556::Method6137);
        list.removeAll(method6136);
        return list;
    }
    
    public static List Method6136(final Entity entity, final double n) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final double n2 = (entity.boundingBox.maxX - entity.boundingBox.minX) / Double.longBitsToDouble((long)952231845 ^ 0x4000000038C1E7A5L);
        final double n3 = (entity.boundingBox.maxZ - entity.boundingBox.minZ) / Double.longBitsToDouble((long)1425053044 ^ 0x4000000054F09574L);
        for (double floor = Math.floor(entity.posX - n2); floor <= Math.floor(entity.posX + n2); ++floor) {
            final double floor2 = Math.floor(entity.posZ - n3);
            while (floor2 <= Math.floor(entity.posZ + n3)) {
                list.add(new BlockPos(floor, entity.posY + n, floor2));
                ++floor;
            }
        }
        return list;
    }
    
    private static void Method6137(final List list, final BlockPos blockPos) {
        list.addAll(Stream.of(EnumFacing.HORIZONTALS).map((Function<? super EnumFacing, ?>)blockPos::offset).collect((Collector<? super Object, ?, List<? super Object>>)Collectors.toList()));
    }
}
