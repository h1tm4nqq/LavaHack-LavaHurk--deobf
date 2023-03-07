//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.Packet
 *  net.minecraft.network.play.client.CPacketHeldItemChange
 */
package lavahack.client;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public class dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10750 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 1", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)841841375 ^ 0x40220000322D7ADFL), (boolean)((long)-326912835 ^ (long)-326912836)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10751 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 2", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)986834140 ^ 0x402200003AD1E4DCL), (boolean)((long)-601128366 ^ (long)-601128365)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10752 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 3", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xD951AAEDABACF01CL ^ 0x9973AAEDABACF01CL), ((int)153557309L ^ 0x927193C) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10753 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 4", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x5611BB21F79973BL ^ 0x45431BB21F79973BL), (boolean)((long)2145410154 ^ (long)2145410155)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10754 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 5", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)2132640146 ^ 0x402200007F1D8192L), ((int)-1325570241L ^ 0xB0FD673E) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10755 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 6", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x302E4E423AA533BL ^ 0x4320E4E423AA533BL), (boolean)((long)203004091 ^ (long)203004090)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10756 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 7", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble((long)1555658222 ^ 0x402200005CB975EEL), ((int)-411207578L ^ 0xE77D7867) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10757 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 8", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0xDBE01130476A7842L ^ 0x9BC21130476A7842L), (boolean)((long)-1224113098 ^ (long)-1224113097)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10758 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slot 9", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, 0.0, Double.longBitsToDouble(0x5FE7A66DBDB4806L ^ 0x45DC7A66DBDB4806L), (boolean)((long)864783251 ^ (long)864783250)));
    private final Map Field10759 = new ConcurrentHashMap();
    private String Field10760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a() {
        super("SlotMapper", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
        this.Field10759.put((int)-646603193L ^ 0xD9759E46, ((int)-1192659600L ^ 0xB8E97570) != 0);
        this.Field10759.put((int)((long)1794756742 ^ (long)1794756743) << 1, ((int)-1093063105L ^ 0xBED92E3F) != 0);
        this.Field10759.put((int)-1553796289L ^ 0xA362F33C, ((int)382418197L ^ 0x16CB3D15) != 0);
        this.Field10759.put(((int)-1010518607L ^ 0xC3C4B5B0) << 2, ((int)-1520953049L ^ 0xA5581927) != 0);
        this.Field10759.put((int)((long)-578630715 ^ (long)-578630720), (boolean)((long)1238562267 ^ (long)1238562267));
        this.Field10759.put(((int)-865596199L ^ 0xCC680CDA) << 1, (boolean)((long)299332093 ^ (long)299332093));
        this.Field10759.put((int)351174432L ^ 0x14EE7F27, ((int)-1211510677L ^ 0xB7C9D06B) != 0);
        this.Field10759.put((int)((long)-1717498647 ^ (long)-1717498648) << 3, (boolean)((long)224018289 ^ (long)224018289));
        this.Field10759.put((int)1763920414L ^ 0x69234A17, ((int)565821979L ^ 0x21B9C21B) != 0);
    }

    @Override
    public void Method45() {
        if (dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) {
            this.Field10759.put(n, (boolean)((long)1825967645 ^ (long)1825967645));
            return;
        }
        if (((Boolean)this.Field10759.get(n)).booleanValue()) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Method2768(n);
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 == null) {
            return;
        }
        int n2 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method335();
        if (n2 == 0) {
            return;
        }
        dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
        dijkspSVQsAFXeFFuRb6B6S5Zb9M0k8a.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        this.Field10759.put(n2, ((int)-1510795396L ^ 0xA5F3177D) != 0);
    }

    private qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method2768(int n) {
        switch (n) {
            case 1: {
                return this.Field10750;
            }
            case 2: {
                return this.Field10751;
            }
            case 3: {
                return this.Field10752;
            }
            case 4: {
                return this.Field10753;
            }
            case 5: {
                return this.Field10754;
            }
            case 6: {
                return this.Field10755;
            }
            case 7: {
                return this.Field10756;
            }
            case 8: {
                return this.Field10757;
            }
            case 9: {
                return this.Field10758;
            }
        }
        return null;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1684577053 ^ (long)1684577053);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)2138012642L ^ 0x7F6F7B1D);
            int n2 = (int)((long)1562504581 ^ (long)1562504638);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1198166395 ^ (long)-1198177740) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

