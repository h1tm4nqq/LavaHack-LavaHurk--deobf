//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.item.EntityItem
 *  net.minecraft.entity.item.EntityXPOrb
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.world.IBlockAccess
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import lavahack.client.FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import lavahack.client.jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field10545 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("EventMode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15059).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field10546 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field12174).Method5303();
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field10547 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Switch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11028);
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10548 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Smart", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1249364566L ^ 0x4A77CA56) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10549 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SurroundBlocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-816942564L ^ 0xCF4E721D) != 0));
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field10550 = new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("HelpingBlocks", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16467).Method5303();
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10551 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Down", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)451258922 ^ (long)451258923)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10552 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Center", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2139670184 ^ (long)-2139670184)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10553 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1814316281 ^ (long)1814316281)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10554 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-2645592 ^ (long)-2645592)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10555 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DisableOnComplete", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)602311657 ^ (long)602311656)));
    private EnumFacing Field10556 = null;
    private String Field10557 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd() {
        super("SelfTrapRewrite", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338, (boolean)((long)-1517957225 ^ (long)-1517957226));
    }

    @Override
    public void Method38() {
        if (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        super.Method38();
        if (!this.Field10552.Method365()) {
            return;
        }
        double d = Math.floor(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)113430872 ^ 0x3FE0000006C2D158L);
        double d2 = Math.floor(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(0x5A1C0A7706F19D9EL ^ 0x65FC0A7706F19D9EL);
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2);
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field10556 = null;
    }

    @Override
    public void Method45() {
        if (this.Field10545.Method341() != jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15060) {
            return;
        }
        this.Method20();
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2583(TickEvent tickEvent) {
        if (this.Field10545.Method341() != jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field15059) {
            return;
        }
        this.Method20();
    }

    private void Method20() {
        if (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        List list = this.Method2587();
        list.addAll((int)((long)-1825763519 ^ (long)-1825763519), this.Method2588());
        if (this.Field10551.Method365()) {
            list.add((int)((long)-1273945005 ^ (long)-1273945005), this.Method2589().down());
        }
        if (this.Field10555.Method365() && this.Method2584(list)) {
            this.Field10556 = null;
            this.Method22();
            return;
        }
        this.Method2585(list);
    }

    private boolean Method2584(List list) {
        BlockPos blockPos;
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return (int)((long)1869211339 ^ (long)1869211338) != 0;
        } while (!jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = (BlockPos)iterator.next()).getBlock().isReplaceable((IBlockAccess)jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos));
        return ((int)399803144L ^ 0x17D48308) != 0;
    }

    private void Method2585(List list) {
        int n = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        if (n == ((int)1120833991L ^ 0xBD316E38)) {
            return;
        }
        int n2 = jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            BlockPos blockPos = (BlockPos)iterator.next();
            if (!jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock().isReplaceable((IBlockAccess)jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, blockPos) || this.Method2586(blockPos)) continue;
            Object[] objectArray = new Object[(int)((long)-132208642 ^ (long)-132208641) << 1];
            objectArray[(int)((long)-1402945799 ^ (long)-1402945799)] = n;
            objectArray[(int)1354624798L ^ 0x50BDEF1F] = (boolean)((long)605382792 ^ (long)605382792);
            ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field10547.Method341()).Method2972().Method1726(objectArray);
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos, EnumHand.MAIN_HAND, this.Field10553.Method365(), this.Field10554.Method365());
            Object[] objectArray2 = new Object[((int)-531735198L ^ 0xE04E5D63) << 1];
            objectArray2[(int)-1234945588L ^ 0xB66439CC] = n2;
            objectArray2[(int)-445542998L ^ 0xE5718DAB] = ((int)92838600L ^ 0x5889AC9) != 0;
            ((FKHn4IKNbAKsMEDwTCTo9XW4DMGeO92N$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field10547.Method341()).Method2972().Method1726(objectArray2);
        }
    }

    private boolean Method2586(BlockPos blockPos) {
        AxisAlignedBB axisAlignedBB = new AxisAlignedBB(blockPos);
        Iterator iterator = jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getEntitiesWithinAABB(Entity.class, axisAlignedBB).iterator();
        while (iterator.hasNext()) {
            Entity entity = (Entity)iterator.next();
            if (entity instanceof EntityItem) continue;
            if (!(entity instanceof EntityXPOrb)) return (int)((long)-940630313 ^ (long)-940630314) != 0;
        }
        return ((int)-1624928900L ^ 0x9F258D7C) != 0;
    }

    private List Method2587() {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        if (this.Field10556 == null) {
            this.Field10556 = jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().getOpposite();
        }
        if (this.Field10546.Method341() == jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field12174 || this.Field10549.Method365()) {
            arrayList.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2596).collect(Collectors.toList()));
        } else {
            arrayList.add(this.Method2589().offset(this.Field10556));
        }
        arrayList.addAll(Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2595).collect(Collectors.toList()));
        if (this.Field10548.Method365()) {
            if (jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(this.Method2589().up(((int)-356188163L ^ 0xEAC4FFFC) << 1)).getBlock().isReplaceable((IBlockAccess)jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world, this.Method2589().up((int)((long)-1101278665 ^ (long)-1101278666) << 1))) {
                arrayList.add(this.Method2589().up(((int)1036289171L ^ 0x3DC48492) << 1).offset(this.Field10556));
                arrayList.add(this.Method2589().up(((int)-555622021L ^ 0xDEE1E17A) << 1));
            }
        } else {
            arrayList.add(this.Method2589().up((int)((long)-140014040 ^ (long)-140014039) << 1).offset(this.Field10556));
            arrayList.add(this.Method2589().up(((int)88393625L ^ 0x544C798) << 1));
        }
        if (this.Field10546.Method341() == jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Field12174) {
            return arrayList;
        }
        arrayList.removeAll(Arrays.stream(EnumFacing.HORIZONTALS).filter(this::Method2594).map(this::Method2593).collect(Collectors.toList()));
        return arrayList;
    }

    private List Method2588() {
        if (this.Field10550.Method341() == jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16467) {
            return Collections.emptyList();
        }
        if (this.Field10550.Method341() != jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field16468) return Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2591).filter(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd::Method2590).collect(Collectors.toList());
        return Arrays.stream(EnumFacing.HORIZONTALS).map(this::Method2592).collect(Collectors.toList());
    }

    private BlockPos Method2589() {
        return new BlockPos(jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, jvMGQohyZ2NXwgBNIoouJqmuiAs8gTfd.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
    }

    private static boolean Method2590(BlockPos blockPos) {
        return h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4213(blockPos.up()).isEmpty();
    }

    private BlockPos Method2591(EnumFacing enumFacing) {
        return this.Method2589().down().offset(enumFacing);
    }

    private BlockPos Method2592(EnumFacing enumFacing) {
        return this.Method2589().down().offset(enumFacing);
    }

    private BlockPos Method2593(EnumFacing enumFacing) {
        return this.Method2589().up().offset(enumFacing);
    }

    private boolean Method2594(EnumFacing enumFacing) {
        int n;
        if (enumFacing != this.Field10556) {
            n = (int)((long)1882032005 ^ (long)1882032004);
            return n != 0;
        }
        n = (int)658489977L ^ 0x273FC279;
        return n != 0;
    }

    private BlockPos Method2595(EnumFacing enumFacing) {
        return this.Method2589().up().offset(enumFacing);
    }

    private BlockPos Method2596(EnumFacing enumFacing) {
        return this.Method2589().offset(enumFacing);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)367978058L ^ 0x15EEE64A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1708821601L ^ 0x9A257360);
            int n2 = ((int)-58836098L ^ 0xFC7E3B77) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)2021264137 ^ (long)2021276496) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

