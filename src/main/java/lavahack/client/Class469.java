//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lavahack.client.Class1036;
import lavahack.client.Class1303;
import lavahack.client.Class1621;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class711;
import lavahack.client.Class9;
import lavahack.client.Class97;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Class469
extends Class42 {
    private final Class1303 Field9950 = new Class1303("Switch", (Class42)this, Class711.Field11028).Method5303();
    private final Class44 Field9951 = this.Method23(new Class44("Rotate", (Class42)this, false));
    private final Class44 Field9952 = this.Method23(new Class44("Packet", (Class42)this, false));
    private int Field9953;
    private List Field9954 = new ArrayList();
    private String Field9955 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class469() {
        super("ScaffoldTest2", Class97.Field8345);
    }

    @Override
    public void Method38() {
        if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field9953 = (int)Math.floor(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            this.Field9954.clear();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method45() {
        if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = Class9.Method127(Blocks.OBSIDIAN);
        if (n == -1) {
            return;
        }
        int n2 = Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n3 = (int)Math.floor(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        BlockPos blockPos = new BlockPos(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)this.Field9953, Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List<BlockPos> list = this.Method2198(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, this.Field9953 - 1, Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (!Class1036.Method4213(blockPos).isEmpty()) {
            list = Arrays.asList(blockPos);
        }
        if (this.Method2196(Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, this.Field9953 - 1, Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) || this.Field9954.size() >= 2 && list.stream().filter(this::Method2203).count() > 1L) {
            this.Field9953 = n3;
            return;
        }
        ((Class711)this.Field9950.Method341()).Method2972().Method1726(n, false);
        Iterator<BlockPos> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                ((Class711)this.Field9950.Method341()).Method2972().Method1726(n2, true);
                this.Field9953 = n3;
                this.Field9954 = list;
                return;
            }
            BlockPos blockPos2 = iterator.next();
            if (!Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().isReplaceable((IBlockAccess)Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2) || this.Method2197(blockPos2)) continue;
            Class1036.Method4208(blockPos2, EnumHand.MAIN_HAND, this.Field9951.Method365(), this.Field9952.Method365());
        }
    }

    private boolean Method2196(double d, double d2, double d3) {
        List list = Stream.of(new BlockPos(d + Double.longBitsToDouble((long)778156855 ^ 0x3FD333331D528804L), d2, d3 + Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(d + Double.longBitsToDouble((long)74929198 ^ 0x3FD333333744671DL), d2, d3 - Double.longBitsToDouble((long)1214751420 ^ 0x3FD333337B54918FL)), new BlockPos(d - Double.longBitsToDouble(0x3FD3333333333333L), d2, d3 + Double.longBitsToDouble((long)18635702 ^ 0x3FD33333322F6885L)), new BlockPos(d - Double.longBitsToDouble((long)893733392 ^ 0x3FD3333306767923L), d2, d3 - Double.longBitsToDouble(0x3FD3333333333333L))).distinct().collect(Collectors.toList());
        int n = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) continue;
            ++n;
        }
        return false;
    }

    private boolean Method2197(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = Class469.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return true;
        }
        return false;
    }

    private List Method2198(double d, double d2, double d3) {
        List list = this.Method2199(d, d2, d3);
        if (list.size() == 0) {
            return Arrays.asList(new BlockPos[0]);
        }
        if (list.size() == 1) {
            return Arrays.asList((BlockPos)((Class1621)list.iterator().next()).Method6308());
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Class1621 class1621 : list) {
            arrayList.add(class1621.Method6308());
        }
        if (arrayList.size() == 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(((Class1621)list.stream().max(Class469::Method2202).get()).Method6308());
        arrayList2.add(((Class1621)list.stream().min(Class469::Method2201).get()).Method6308());
        list.removeAll(arrayList2);
        arrayList2.add(((Class1621)list.stream().max(Class469::Method2200).get()).Method6308());
        return arrayList2;
    }

    private List Method2199(double d, double d2, double d3) {
        List list = Stream.of(new BlockPos(d + Double.longBitsToDouble((long)459527121 ^ 0x3FD333332850E0E2L), d2, d3 + Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(d + Double.longBitsToDouble((long)1004576582 ^ 0x3FD3333308D3AC75L), d2, d3 - Double.longBitsToDouble(0x3FD3333333333333L)), new BlockPos(d - Double.longBitsToDouble(0x3FD3333333333333L), d2, d3 + Double.longBitsToDouble((long)26196296 ^ 0x3FD3333332BC8A7BL)), new BlockPos(d - Double.longBitsToDouble((long)2141068506 ^ 0x3FD333334CAD2FE9L), d2, d3 - Double.longBitsToDouble(0x3FD3333333333333L))).distinct().collect(Collectors.toList());
        if (list.size() < 1) {
            return Collections.emptyList();
        }
        if (list.size() == 1) {
            return Collections.singletonList(new Class1621(Double.longBitsToDouble((long)240002613 ^ 0x3FD70A3D7EEDF13FL), list.get(0)));
        }
        if (list.size() != 2) {
            double d4 = Math.round(d);
            double d5 = Math.round(d3);
            double d6 = Math.abs(d3 - Double.longBitsToDouble((long)1175244450 ^ 0x3FD33333753FFD91L) - d5);
            double d7 = Math.abs(d + Double.longBitsToDouble((long)684705496 ^ 0x3FD333331BFCF5EBL) - d4);
            double d8 = Math.abs(d3 + Double.longBitsToDouble((long)1008548294 ^ 0x3FD333330F2E0AF5L) - d5);
            double d9 = Math.abs(d - Double.longBitsToDouble((long)855547319 ^ 0x3FD3333301CDAE84L) - d4);
            ArrayList<Class1621> arrayList = new ArrayList<Class1621>();
            arrayList.add(new Class1621(d8 * d7, list.get(0)));
            arrayList.add(new Class1621(d6 * d7, list.get(1)));
            arrayList.add(new Class1621(d9 * d8, list.get(2)));
            arrayList.add(new Class1621(d9 * d6, list.get(3)));
            return arrayList;
        }
        BlockPos blockPos = (BlockPos)list.get(0);
        BlockPos blockPos2 = (BlockPos)list.get(1);
        if (blockPos.getZ() == blockPos2.getZ()) {
            double d10 = Math.round(d);
            double d11 = Double.longBitsToDouble((long)1703095147 ^ 0x3FE3333356B01858L) * Math.abs(d + Double.longBitsToDouble((long)846104959 ^ 0x3FD33333015DBA4CL) - d10);
            ArrayList<Class1621> arrayList = new ArrayList<Class1621>();
            arrayList.add(new Class1621(d11, blockPos.getX() > blockPos2.getX() ? blockPos : blockPos2));
            arrayList.add(new Class1621(Double.longBitsToDouble((long)1001361411 ^ 0x3FD70A3D4B0C4709L) - d11, blockPos.getX() <= blockPos2.getX() ? blockPos : blockPos2));
            return arrayList;
        }
        double d12 = Math.round(d3);
        double d13 = Double.longBitsToDouble(0x3FE3333333333333L) * Math.abs(d3 + Double.longBitsToDouble((long)819909931 ^ 0x3FD3333303EDE618L) - d12);
        ArrayList<Class1621> arrayList = new ArrayList<Class1621>();
        arrayList.add(new Class1621(d13, blockPos.getZ() > blockPos2.getZ() ? blockPos : blockPos2));
        arrayList.add(new Class1621(Double.longBitsToDouble(4600156803381319434L) - d13, blockPos.getZ() <= blockPos2.getZ() ? blockPos : blockPos2));
        return arrayList;
    }

    private static int Method2200(Class1621 class1621, Class1621 class16212) {
        return Double.compare((Double)class1621.Method6307(), (Double)class16212.Method6307());
    }

    private static int Method2201(Class1621 class1621, Class1621 class16212) {
        return Double.compare((Double)class1621.Method6307(), (Double)class16212.Method6307());
    }

    private static int Method2202(Class1621 class1621, Class1621 class16212) {
        return Double.compare((Double)class1621.Method6307(), (Double)class16212.Method6307());
    }

    private boolean Method2203(BlockPos blockPos) {
        return this.Field9954.contains(blockPos);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 189;
            cArray2[n] = (char)(cArray[n] ^ (0x39B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

