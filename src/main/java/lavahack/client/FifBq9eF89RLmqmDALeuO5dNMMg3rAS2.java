//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketPlayer$Position
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.BlockPos;

public class FifBq9eF89RLmqmDALeuO5dNMMg3rAS2
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10656 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Test", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)28320266L ^ 0x1B0220A) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10657 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strict", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)46855335L ^ 0x2CAF4A6) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10658 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("DelayMultiplier", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0x3B1AD37964D33FDBL ^ 0x7B3ED37964D33FDBL), (boolean)((long)1128849711 ^ (long)1128849711)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10659 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Sprint", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1008853933 ^ (long)-1008853933)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10660 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SetPosition", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-1858624249 ^ (long)-1858624249)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10661 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SmartOnGround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)716727007L ^ 0x2AB862DF) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10662 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("NoClip", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)2021091519L ^ 0x787768BF) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10663 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CancelInBlock", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-829873934L ^ 0xCE8920F2) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10664 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("CancelOffGround", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-268204267 ^ (long)-268204267)));
    private final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field10665 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private CPacketPlayer.Position[] Field10666 = new CPacketPlayer.Position[(int)872276941L ^ 0x33FDE3CD];
    private long Field10667;
    private String Field10668 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public FifBq9eF89RLmqmDALeuO5dNMMg3rAS2() {
        super("TickShiftTeleport", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
    }

    @Override
    public void Method38() {
        if (FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        BlockPos blockPos = FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.getBlockPos();
        if (blockPos == null || FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.objectMouseOver.entityHit != null) {
            NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5504().Method1886("Cannot Teleport onto an Entity!");
            return;
        }
        blockPos = blockPos.up();
        double d = blockPos.getX();
        double d2 = blockPos.getY();
        double d3 = blockPos.getZ();
        if (this.Field10656.Method365()) {
            d2 = PzymjJJ9R7LhPzqSLW2fMv06yAvJr5Gb.Method6657().getY();
        }
        double d4 = FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posX;
        double d5 = FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posY;
        double d6 = FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.posZ;
        int n = XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS.Method1678(FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.getDistance(d += Double.longBitsToDouble(0xBDAC32D63611A7B6L ^ 0x824C32D63611A7B6L), d2, d3 += Double.longBitsToDouble((long)819899470 ^ 0x3FE0000030DEAC4EL)), this.Field10659.Method365());
        this.Field10666 = XDiY4GRhFsGdqmqYgbrvieuwziIHGbpS.Method1679(n, ((int)-599442975L ^ 0xDC4539E0) != 0, this.Field10663.Method365(), this.Field10664.Method365(), this.Field10661.Method365(), d4, d5, d6, d, d2, d3);
        this.Field10665.Method2801();
        this.Field10667 = (long)((double)((long)n * (0x3000736L & 0x24022832L)) * this.Field10658.Method367());
    }

    @Override
    public void Method45() {
        if (FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            this.Method22();
            return;
        }
        if (this.Field10657.Method365() && !this.Field10665.Method2797(this.Field10667)) {
            return;
        }
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Charged!");
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1886("Teleporting...");
        boolean bl = FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip;
        if (this.Field10662.Method365()) {
            FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = (int)((long)-643674023 ^ (long)-643674024);
        }
        CPacketPlayer.Position position = this.Field10666;
        int n = ((CPacketPlayer.Position[])position).length;
        for (int i = (int)((long)-1848532118 ^ (long)-1848532118); i < n; ++i) {
            CPacketPlayer.Position position2 = position[i];
            if (position2 == null) continue;
            FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)position2);
            if (!this.Field10660.Method365()) continue;
            FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position2.x, position2.y, position2.z);
        }
        if (this.Field10666.length > 0) {
            position = this.Field10666[this.Field10666.length - (int)((long)-174048113 ^ (long)-174048114)];
            FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.setPosition(position.x, position.y, position.z);
        }
        FifBq9eF89RLmqmDALeuO5dNMMg3rAS2.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.noClip = bl;
        this.Method22();
    }

    @Override
    public void Method39() {
        this.Field10665.Method2801();
        this.Field10666 = new CPacketPlayer.Position[(int)-759846210L ^ 0xD2B5AABE];
        this.Field10667 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1376593125L ^ 0x520D24E5;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1534029048 ^ (long)-1534028809);
            int n2 = (int)((long)-679334497 ^ (long)-679334428) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-93907921 ^ (long)-93901368) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

