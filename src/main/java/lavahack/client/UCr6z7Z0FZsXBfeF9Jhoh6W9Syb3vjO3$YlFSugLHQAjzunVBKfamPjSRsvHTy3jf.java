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
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$1;
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

class UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field13640 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf() {
        super(null);
    }

    @Override
    public List Method2271(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV, Entity entity) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4996(entity, (int)187452903L ^ 0xB2C4DE7));
        if (uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV == UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.Field13648) {
            arrayList.addAll(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4996(entity, (int)((long)-649033458 ^ (long)-649033457)));
        } else {
            arrayList.add(((BlockPos)arrayList.get((int)-1539211505L ^ 0xA4417F0F)).up());
        }
        arrayList.add(((BlockPos)arrayList.get((int)1860005829L ^ 0x6EDD6FC5)).up(((int)-1335774100L ^ 0xB061B46D) << 1));
        arrayList.addAll(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4997(entity, (int)((long)1748880105 ^ (long)1748880104) << 1));
        return arrayList;
    }

    @Override
    public List Method2272(Entity entity) {
        return UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4996(entity, (int)((long)1279485059 ^ (long)-1279485060));
    }

    @Override
    public List Method2273(Entity entity) {
        return UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4997(entity, (int)276025471L ^ 0xEF8C2F80);
    }

    @Override
    public List Method2274(Entity entity) {
        return UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4997(entity, (int)((long)-895654620 ^ (long)-895654619) << 1);
    }

    private static List Method4996(Entity entity, int n) {
        List list = UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4997(entity, n);
        ArrayList arrayList = new ArrayList();
        list.forEach(arg_0 -> UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4999(arrayList, arg_0));
        return arrayList.stream().filter(arg_0 -> UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method4998(list, arg_0)).collect(Collectors.toList());
    }

    private static List Method4997(Entity entity, int n) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)-1040098351L ^ 0xC2015BD0) << 4);
        AxisAlignedBB axisAlignedBB = entity.getEntityBoundingBox();
        double d = (axisAlignedBB.maxX - axisAlignedBB.minX) / Double.longBitsToDouble(0xCE3B32BE12BEA7C4L ^ 0x8E3B32BE12BEA7C4L);
        double d2 = (axisAlignedBB.maxZ - axisAlignedBB.minZ) / Double.longBitsToDouble((long)540048533 ^ 0x4000000020307C95L);
        arrayList.add(new BlockPos(new Vec3d(entity.posX + d, entity.posY + (double)n, entity.posZ + d2)));
        arrayList.add(new BlockPos(new Vec3d(entity.posX + d, entity.posY + (double)n, entity.posZ - d2)));
        arrayList.add(new BlockPos(new Vec3d(entity.posX - d, entity.posY + (double)n, entity.posZ + d2)));
        arrayList.add(new BlockPos(new Vec3d(entity.posX - d, entity.posY + (double)n, entity.posZ - d2)));
        return arrayList;
    }

    private static boolean Method4998(List list, BlockPos blockPos) {
        int n;
        if (!list.contains(blockPos)) {
            n = (int)((long)221377627 ^ (long)221377626);
            return n != 0;
        }
        n = (int)((long)-566336594 ^ (long)-566336594);
        return n != 0;
    }

    private static void Method4999(List list, BlockPos blockPos) {
        Arrays.stream(EnumFacing.HORIZONTALS).forEach(arg_0 -> UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Method5000(list, blockPos, arg_0));
    }

    private static void Method5000(List list, BlockPos blockPos, EnumFacing enumFacing) {
        list.add(blockPos.offset(enumFacing));
    }

    UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(UCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$1 uCr6z7Z0FZsXBfeF9Jhoh6W9Syb3vjO3$1) {
        this();
    }
}

