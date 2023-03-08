//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import java.util.function.*;
import java.util.stream.*;
import net.minecraft.util.math.*;
import net.minecraft.util.*;
import java.util.*;

class Class1243 extends Class1058
{
    private String Field13640 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1243() {
        super((Class793)null);
    }
    
    public List Method2271(final Class1247 class1247, final Entity entity) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(Method4996(entity, 0));
        if (class1247 == Class1247.Field13648) {
            list.addAll((Collection<?>)Method4996(entity, 1));
        }
        else {
            list.add(((BlockPos)list.get(0)).up());
        }
        list.add(((BlockPos)list.get(0)).up(2));
        list.addAll((Collection<?>)Method4997(entity, 2));
        return list;
    }
    
    public List Method2272(final Entity entity) {
        return Method4996(entity, -1);
    }
    
    public List Method2273(final Entity entity) {
        return Method4997(entity, -1);
    }
    
    public List Method2274(final Entity entity) {
        return Method4997(entity, 2);
    }
    
    private static List Method4996(final Entity entity, final int n) {
        final List method4997 = Method4997(entity, n);
        final ArrayList<Object> list = new ArrayList<Object>();
        method4997.forEach(Class1243::Method4999);
        return list.stream().filter(Class1243::Method4998).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
    }
    
    private static List Method4997(final Entity entity, final int n) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>(16);
        final AxisAlignedBB getEntityBoundingBox = entity.getEntityBoundingBox();
        final double n2 = (getEntityBoundingBox.maxX - getEntityBoundingBox.minX) / Double.longBitsToDouble(4611686018427387904L);
        final double n3 = (getEntityBoundingBox.maxZ - getEntityBoundingBox.minZ) / Double.longBitsToDouble((long)540048533 ^ 0x4000000020307C95L);
        list.add(new BlockPos(new Vec3d(entity.posX + n2, entity.posY + n, entity.posZ + n3)));
        list.add(new BlockPos(new Vec3d(entity.posX + n2, entity.posY + n, entity.posZ - n3)));
        list.add(new BlockPos(new Vec3d(entity.posX - n2, entity.posY + n, entity.posZ + n3)));
        list.add(new BlockPos(new Vec3d(entity.posX - n2, entity.posY + n, entity.posZ - n3)));
        return list;
    }
    
    private static boolean Method4998(final List list, final BlockPos blockPos) {
        return !list.contains(blockPos);
    }
    
    private static void Method4999(final List list, final BlockPos blockPos) {
        Arrays.stream(EnumFacing.HORIZONTALS).forEach(Class1243::Method5000);
    }
    
    private static void Method5000(final List list, final BlockPos blockPos, final EnumFacing enumFacing) {
        list.add(blockPos.offset(enumFacing));
    }
    
    Class1243(final Class793 class793) {
        this();
    }
}
