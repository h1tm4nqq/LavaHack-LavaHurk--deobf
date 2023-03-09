//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1058;
import lavahack.client.Class1247;
import lavahack.client.Class793;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

class Class1243
extends Class1058 {
    private String Field13640 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class1243() {
        super(null);
    }

    @Override
    public List Method2271(Class1247 class1247, Entity entity) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(Class1243.Method4996(entity, 0));
        if (class1247 == Class1247.Field13648) {
            arrayList.addAll(Class1243.Method4996(entity, 1));
        } else {
            arrayList.add(((BlockPos)arrayList.get(0)).up());
        }
        arrayList.add(((BlockPos)arrayList.get(0)).up(2));
        arrayList.addAll(Class1243.Method4997(entity, 2));
        return arrayList;
    }

    @Override
    public List Method2272(Entity entity) {
        return Class1243.Method4996(entity, -1);
    }

    @Override
    public List Method2273(Entity entity) {
        return Class1243.Method4997(entity, -1);
    }

    @Override
    public List Method2274(Entity entity) {
        return Class1243.Method4997(entity, 2);
    }

    private static List Method4996(Entity entity, int n) {
        List list = Class1243.Method4997(entity, n);
        ArrayList arrayList = new ArrayList();
        list.forEach(arg_0 -> Class1243.Method4999(arrayList, arg_0));
        return arrayList.stream().filter(arg_0 -> Class1243.Method4998(list, arg_0)).collect(Collectors.toList());
    }

    private static List Method4997(Entity entity, int n) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(16);
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d = (axisAlignedBB.maxX - axisAlignedBB.minX) / Double.longBitsToDouble(0x4000000000000000L);
        double d2 = (axisAlignedBB.maxZ - axisAlignedBB.minZ) / Double.longBitsToDouble((long)540048533 ^ 0x4000000020307C95L);
        arrayList.add(new BlockPos(new Vec3d(entity.posX + d, entity.posY + (double)n, entity.posZ + d2)));
        arrayList.add(new BlockPos(new Vec3d(entity.posX + d, entity.posY + (double)n, entity.posZ - d2)));
        arrayList.add(new BlockPos(new Vec3d(entity.posX - d, entity.posY + (double)n, entity.posZ + d2)));
        arrayList.add(new BlockPos(new Vec3d(entity.posX - d, entity.posY + (double)n, entity.posZ - d2)));
        return arrayList;
    }

    private static boolean Method4998(List list, BlockPos blockPos) {
        if (list.contains(blockPos)) return false;
        return true;
    }

    private static void Method4999(List list, BlockPos blockPos) {
        Arrays.stream(EnumFacing.HORIZONTALS).forEach(arg_0 -> Class1243.Method5000(list, blockPos, arg_0));
    }

    private static void Method5000(List list, BlockPos blockPos, EnumFacing enumFacing) {
        list.add(blockPos.offset(enumFacing));
    }

    Class1243(Class793 class793) {
        this();
    }
}

