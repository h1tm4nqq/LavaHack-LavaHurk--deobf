//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.init.Blocks
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.EnumFacing
 *  net.minecraft.util.EnumHand
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.h3JIhOK8wAz7IadJfd7wSXmcgwjeffua;
import lavahack.client.lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16766 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Setting", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1098980676L ^ 0xBE7EE2BD) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16767 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotate", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1460025162 ^ (long)1460025162)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16768 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Packet", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)540848062 ^ (long)540848062)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field16769 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("ToggleOnComplete", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1293814325 ^ (long)1293814324)));
    private String Field16770 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN() {
        super("AutoAnvil", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8338);
    }

    @Override
    public void Method45() {
        if (NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        int n2 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.OBSIDIAN);
        int n3 = lSIvRL5NmnjnEGjnHb3VTGD9IMgv3dvC.Method127(Blocks.ANVIL);
        if (n == (int)((long)1321208433 ^ (long)-1321208434)) return;
        if (n3 == ((int)694801197L ^ 0xD6962CD2)) {
            return;
        }
        BlockPos blockPos = new BlockPos(NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List list = this.Method7053();
        Iterator iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n3));
                NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n3;
                h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos.up((int)((long)-348128804 ^ (long)-348128803) << 1), EnumHand.MAIN_HAND, (boolean)((long)1085980773 ^ (long)1085980773), ((int)-1632635572L ^ 0x9EAFF54C) != 0);
                NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
                NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
                if (!this.Field16769.Method365()) return;
                this.Method22();
                return;
            }
            BlockPos blockPos2 = (BlockPos)iterator.next();
            NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
            NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
            h3JIhOK8wAz7IadJfd7wSXmcgwjeffua.Method4208(blockPos2, EnumHand.MAIN_HAND, this.Field16767.Method365(), this.Field16768.Method365());
            NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n));
            NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n;
        }
    }

    private void Method7051(int n, boolean bl) {
    }

    private void Method20() {
        double d = this.Method7052(NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX) + Double.longBitsToDouble((long)62812963 ^ 0x3FE0000003BE7323L);
        double d2 = this.Method7052(NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ) + Double.longBitsToDouble(0xDF2AE7DA99D83F51L ^ 0xE0CAE7DA99D83F51L);
        NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionX = 0.0;
        NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.motionZ = 0.0;
        NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketPlayer.Position(d, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.onGround));
        NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(d, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, d2);
    }

    private double Method7052(double d) {
        double d2 = 0.0;
        if (!(d < 0.0)) return (double)((long)d) - d2;
        d2 = 1.0;
        return (double)((long)d) - d2;
    }

    private List Method7053() {
        BlockPos blockPos;
        BlockPos blockPos2 = new BlockPos(NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        List list = this.Method7055(blockPos2.up(((int)-140614754L ^ 0xF79E639F) << 1));
        ArrayList arrayList = new ArrayList(((int)-490432391L ^ 0xE2C49878) << 4);
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return this.Method7054(blockPos2.up((int)((long)523357745 ^ (long)523357744) << 1), NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getHorizontalFacing().getOpposite());
        } while (!NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos = (BlockPos)iterator.next()).getMaterial().isSolid());
        return arrayList;
    }

    private List Method7054(BlockPos blockPos, EnumFacing enumFacing) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>(((int)-560296532L ^ 0xDE9A8DAD) << 4);
        BlockPos blockPos2 = blockPos.offset(enumFacing);
        blockPos2 = blockPos2.down((int)-412022049L ^ 0xE7710ADC);
        int n = (int)((long)-1190537812 ^ (long)-1190537812);
        while (true) {
            int cfr_ignored_0 = (int)((long)1516370030 ^ (long)1516370031) << 2;
            if (NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos2).getMaterial().isReplaceable()) {
                arrayList.add(blockPos2);
            }
            blockPos2 = blockPos2.up();
            ++n;
        }
    }

    private List Method7055(BlockPos blockPos) {
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>((int)((long)902900966 ^ (long)902900967) << 4);
        arrayList.add(blockPos.north());
        arrayList.add(blockPos.east());
        arrayList.add(blockPos.south());
        arrayList.add(blockPos.west());
        return arrayList;
    }

    private boolean Method28() {
        BlockPos blockPos = new BlockPos(NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY, NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ);
        int n = (int)((long)-1187028069 ^ (long)-1187028070);
        int n2 = (int)((long)-681694935 ^ (long)-681694935);
        while (true) {
            int cfr_ignored_0 = (int)((long)-506533022 ^ (long)-506533023);
            n &= NBkJR0ypvxJpPPDggpCTXjUU0Due4qKN.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world.getBlockState(blockPos).getBlock() == Blocks.AIR ? (int)((long)1482745260 ^ (long)1482745261) : (int)1067690332L ^ 0x3FA3A95C;
            blockPos = blockPos.up();
            ++n2;
        }
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1137223785 ^ (long)-1137223785);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)883472801L ^ 0x34A8B95E);
            int n2 = (int)((long)346191767 ^ (long)346191856) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-963423068 ^ (long)-963422533) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

