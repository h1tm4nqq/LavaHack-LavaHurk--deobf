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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.Class1058;
import lavahack.client.Class1247;
import lavahack.client.Class389;
import lavahack.client.Class793;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;

class Class491
extends Class1058 {
    private String Field10045 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class491() {
        super(null);
    }

    @Override
    public List Method2271(Class1247 class1247, Entity entity) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        BlockPos blockPos = Class389.Method1905(entity);
        Arrays.stream(EnumFacing.HORIZONTALS).forEach(arg_0 -> Class491.Method2278(arrayList, blockPos, arg_0));
        if (class1247 == Class1247.Field13648) {
            Arrays.stream(EnumFacing.HORIZONTALS).forEach(arg_0 -> Class491.Method2277(arrayList, blockPos, arg_0));
        } else {
            arrayList.add(blockPos.up().north());
        }
        arrayList.add(blockPos.up(2).north());
        arrayList.add(blockPos.up(2));
        return arrayList;
    }

    @Override
    public List Method2272(Entity entity) {
        return Arrays.stream(EnumFacing.HORIZONTALS).map(arg_0 -> Class491.Method2276(entity, arg_0)).collect(Collectors.toList());
    }

    @Override
    public List Method2273(Entity entity) {
        return Collections.singletonList(Class389.Method1905(entity).down());
    }

    @Override
    public List Method2274(Entity entity) {
        return Arrays.stream(EnumFacing.HORIZONTALS).map(arg_0 -> Class491.Method2275(entity, arg_0)).collect(Collectors.toList());
    }

    private static BlockPos Method2275(Entity entity, EnumFacing enumFacing) {
        return Class389.Method1905(entity).up(2).offset(enumFacing);
    }

    private static BlockPos Method2276(Entity entity, EnumFacing enumFacing) {
        return Class389.Method1905(entity).down().offset(enumFacing);
    }

    private static void Method2277(List list, BlockPos blockPos, EnumFacing enumFacing) {
        list.add(blockPos.up().offset(enumFacing));
    }

    private static void Method2278(List list, BlockPos blockPos, EnumFacing enumFacing) {
        list.add(blockPos.offset(enumFacing));
    }

    Class491(Class793 class793) {
        this();
    }
}

