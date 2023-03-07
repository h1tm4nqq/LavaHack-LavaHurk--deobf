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
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field9950 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9951 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1844423530L ^ 0x92105496) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field9952 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-711830399L ^ 0xD5925481) != 0));
    private int Field9953;
    private List Field9954 = new ArrayList();
    private String Field9955 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx() {
        super("ScaffoldTest2", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        if (tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player != null && tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world != null) {
            this.Field9953 = (int)Math.floor(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
            this.Field9954.clear();
            return;
        }
        this.Method22();
    }

    @Override
    public void Method45() {
        if (tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == (int)((long)1491547068 ^ (long)-1491547069)) {
            return;
        }
        int n2 = tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n3 = (int)Math.floor(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY);
        BlockPos blockPos = new BlockPos(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, (double)this.Field9953, tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List<BlockPos> list = this.Method2198(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, this.Field9953 - ((int)1637894903L ^ 0x61A04AF6), tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        if (!h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos).isEmpty()) {
            BlockPos[] blockPosArray = new BlockPos[(int)235397568L ^ 0xE07E1C1];
            blockPosArray[(int)-973228976L ^ 0xC5FDB450] = blockPos;
            list = Arrays.asList(blockPosArray);
        }
        if (this.Method2196(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, this.Field9953 - ((int)1423646318L ^ 0x54DB1E6F), tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) || this.Field9954.size() >= ((int)-736295777L ^ 0xD41D049E) << 1 && list.stream().filter(this::Method2203).count() > 1L) {
            this.Field9953 = n3;
            return;
        }
        Object[] objectArray = new Object[((int)1461293386L ^ 0x5719914B) << 1];
        objectArray[(int)((long)-1055948246 ^ (long)-1055948246)] = n;
        objectArray[(int)-2062756030L ^ 0x850CD743] = (boolean)((long)1919348258 ^ (long)1919348258);
        ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9950.Method341()).Method2972().Method1726(objectArray);
        Iterator<BlockPos> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Object[] objectArray2 = new Object[((int)1339390699L ^ 0x4FD57AEA) << 1];
                objectArray2[(int)((long)-546858892 ^ (long)-546858892)] = n2;
                objectArray2[(int)1096081324L ^ 0x4154DFAD] = ((int)1081289960L ^ 0x40732CE9) != 0;
                ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field9950.Method341()).Method2972().Method1726(objectArray2);
                this.Field9953 = n3;
                this.Field9954 = list;
                return;
            }
            BlockPos blockPos2 = iterator.next();
            if (!tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getBlock().isReplaceable((IBlockAccess)tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos2) || this.Method2197(blockPos2)) continue;
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos2, EnumHand.MAIN_HAND, this.Field9951.Method365(), this.Field9952.Method365());
        }
    }

    private boolean Method2196(double d, double d2, double d3) {
        BlockPos[] blockPosArray = new BlockPos[(int)((long)-1570798993 ^ (long)-1570798994) << 2];
        blockPosArray[(int)((long)-658361969 ^ (long)-658361969)] = new BlockPos(d + Double.longBitsToDouble((long)778156855 ^ 0x3FD333331D528804L), d2, d3 + Double.longBitsToDouble(0xF0EEFEC0EDB62FD9L ^ 0xCF3DCDF3DE851CEAL));
        blockPosArray[(int)((long)148606539 ^ (long)148606538)] = new BlockPos(d + Double.longBitsToDouble((long)74929198 ^ 0x3FD333333744671DL), d2, d3 - Double.longBitsToDouble((long)1214751420 ^ 0x3FD333337B54918FL));
        blockPosArray[((int)-783811276L ^ 0xD147FD35) << 1] = new BlockPos(d - Double.longBitsToDouble(0x187125EBB891F75BL ^ 0x27A216D88BA2C468L), d2, d3 + Double.longBitsToDouble((long)18635702 ^ 0x3FD33333322F6885L));
        blockPosArray[(int)59661176L ^ 0x38E5B7B] = new BlockPos(d - Double.longBitsToDouble((long)893733392 ^ 0x3FD3333306767923L), d2, d3 - Double.longBitsToDouble(0x491C9B5E7AF06ED4L ^ 0x76CFA86D49C35DE7L));
        List list = Stream.of(blockPosArray).distinct().collect(Collectors.toList());
        int n = (int)((long)1615209377 ^ (long)1615209377);
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                int cfr_ignored_0 = (int)-1255236695L ^ 0xB52E9BAA;
                return (int)((long)1993639059 ^ (long)1993639059) != 0;
            }
            BlockPos blockPos = (BlockPos)iterator.next();
            if (tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos)) continue;
            ++n;
        }
    }

    private boolean Method2197(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)1614662866 ^ (long)1614662867) != 0;
        }
        return ((int)1713900719L ^ 0x66280CAF) != 0;
    }

    private List Method2198(double d, double d2, double d3) {
        List list = this.Method2199(d, d2, d3);
        if (list.size() == 0) {
            return Arrays.asList(new BlockPos[(int)-872937177L ^ 0xCBF80927]);
        }
        if (list.size() == (int)((long)938238973 ^ (long)938238972)) {
            BlockPos[] blockPosArray = new BlockPos[(int)((long)169146493 ^ (long)169146492)];
            blockPosArray[(int)((long)-794814009 ^ (long)-794814009)] = (BlockPos)((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)list.iterator().next()).Method6308();
            return Arrays.asList(blockPosArray);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr : list) {
            arrayList.add(smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6308());
        }
        if (arrayList.size() == ((int)1172403888L ^ 0x45E176B1) << 1) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)list.stream().max(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx::Method2202).get()).Method6308());
        arrayList2.add(((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)list.stream().min(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx::Method2201).get()).Method6308());
        list.removeAll(arrayList2);
        arrayList2.add(((SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr)list.stream().max(tAJyGCYohxf5tp1gR6EmTjH7I6aQnbNx::Method2200).get()).Method6308());
        return arrayList2;
    }

    private List Method2199(double d, double d2, double d3) {
        BlockPos[] blockPosArray = new BlockPos[((int)977451238L ^ 0x3A42B8E7) << 2];
        blockPosArray[(int)((long)-1359141489 ^ (long)-1359141489)] = new BlockPos(d + Double.longBitsToDouble((long)459527121 ^ 0x3FD333332850E0E2L), d2, d3 + Double.longBitsToDouble(0x7176ADB3424C9FBCL ^ 0x4EA59E80717FAC8FL));
        blockPosArray[(int)((long)-330957559 ^ (long)-330957560)] = new BlockPos(d + Double.longBitsToDouble((long)1004576582 ^ 0x3FD3333308D3AC75L), d2, d3 - Double.longBitsToDouble(0xDEB5EDEF479BA28FL ^ 0xE166DEDC74A891BCL));
        blockPosArray[(int)((long)-594039330 ^ (long)-594039329) << 1] = new BlockPos(d - Double.longBitsToDouble(0x7A7A55A51CD120B5L ^ 0x45A966962FE21386L), d2, d3 + Double.longBitsToDouble((long)26196296 ^ 0x3FD3333332BC8A7BL));
        blockPosArray[(int)((long)-2116084912 ^ (long)-2116084909)] = new BlockPos(d - Double.longBitsToDouble((long)2141068506 ^ 0x3FD333334CAD2FE9L), d2, d3 - Double.longBitsToDouble(0x87A506F76BA7AEB2L ^ 0xB87635C458949D81L));
        List list = Stream.of(blockPosArray).distinct().collect(Collectors.toList());
        if (list.size() < ((int)1308367951L ^ 0x4DFC1C4E)) {
            return Collections.emptyList();
        }
        if (list.size() == ((int)-435467318L ^ 0xE60B4BCB)) {
            return Collections.singletonList(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(Double.longBitsToDouble((long)240002613 ^ 0x3FD70A3D7EEDF13FL), list.get((int)((long)-1489600596 ^ (long)-1489600596))));
        }
        if (list.size() != ((int)1790720524L ^ 0x6ABC3A0D) << 1) {
            double d4 = Math.round(d);
            double d5 = Math.round(d3);
            double d6 = Math.abs(d3 - Double.longBitsToDouble((long)1175244450 ^ 0x3FD33333753FFD91L) - d5);
            double d7 = Math.abs(d + Double.longBitsToDouble((long)684705496 ^ 0x3FD333331BFCF5EBL) - d4);
            double d8 = Math.abs(d3 + Double.longBitsToDouble((long)1008548294 ^ 0x3FD333330F2E0AF5L) - d5);
            double d9 = Math.abs(d - Double.longBitsToDouble((long)855547319 ^ 0x3FD3333301CDAE84L) - d4);
            ArrayList<SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr> arrayList = new ArrayList<SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr>();
            arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(d8 * d7, list.get((int)-1585071105L ^ 0xA185BBFF)));
            arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(d6 * d7, list.get((int)-1694632917L ^ 0x9AFDF42A)));
            arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(d9 * d8, list.get(((int)1477303721L ^ 0x580DDDA8) << 1)));
            arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(d9 * d6, list.get((int)-5124299L ^ 0xFFB1CF36)));
            return arrayList;
        }
        BlockPos blockPos = (BlockPos)list.get((int)-913305145L ^ 0xC99011C7);
        BlockPos blockPos2 = (BlockPos)list.get((int)861785322L ^ 0x335DCCEB);
        if (blockPos.getZ() == blockPos2.getZ()) {
            double d10 = Math.round(d);
            double d11 = Double.longBitsToDouble((long)1703095147 ^ 0x3FE3333356B01858L) * Math.abs(d + Double.longBitsToDouble((long)846104959 ^ 0x3FD33333015DBA4CL) - d10);
            ArrayList<SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr> arrayList = new ArrayList<SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr>();
            arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(d11, blockPos.getX() > blockPos2.getX() ? blockPos : blockPos2));
            arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(Double.longBitsToDouble((long)1001361411 ^ 0x3FD70A3D4B0C4709L) - d11, blockPos.getX() <= blockPos2.getX() ? blockPos : blockPos2));
            return arrayList;
        }
        double d12 = Math.round(d3);
        double d13 = Double.longBitsToDouble(0x566EF55236EAA0D3L ^ 0x698DC66105D993E0L) * Math.abs(d3 + Double.longBitsToDouble((long)819909931 ^ 0x3FD3333303EDE618L) - d12);
        ArrayList<SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr> arrayList = new ArrayList<SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr>();
        arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(d13, blockPos.getZ() > blockPos2.getZ() ? blockPos : blockPos2));
        arrayList.add(new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr(Double.longBitsToDouble(0xCF4095DBA332AF8AL ^ 0xF0979FE6D3917880L) - d13, blockPos.getZ() <= blockPos2.getZ() ? blockPos : blockPos2));
        return arrayList;
    }

    private static int Method2200(SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr, SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2) {
        return Double.compare((Double)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307(), (Double)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307());
    }

    private static int Method2201(SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr, SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2) {
        return Double.compare((Double)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307(), (Double)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307());
    }

    private static int Method2202(SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr, SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2) {
        return Double.compare((Double)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr.Method6307(), (Double)smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr2.Method6307());
    }

    private boolean Method2203(BlockPos blockPos) {
        return this.Field9954.contains(blockPos);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1512410024L ^ 0xA5DA7458;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)987221753L ^ 0x3AD7CE06);
            int n2 = (int)1554786873L ^ 0x5CAC2A84;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-866739352 ^ (long)-866744397) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

