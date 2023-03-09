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
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class97;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketHeldItemChange;

public class Class639
extends Class42 {
    private final Class44 Field10750 = this.Method23(new Class44("Slot 1", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)841841375 ^ 0x40220000322D7ADFL), true));
    private final Class44 Field10751 = this.Method23(new Class44("Slot 2", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)986834140 ^ 0x402200003AD1E4DCL), true));
    private final Class44 Field10752 = this.Method23(new Class44("Slot 3", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4022000000000000L), true));
    private final Class44 Field10753 = this.Method23(new Class44("Slot 4", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4022000000000000L), true));
    private final Class44 Field10754 = this.Method23(new Class44("Slot 5", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)2132640146 ^ 0x402200007F1D8192L), true));
    private final Class44 Field10755 = this.Method23(new Class44("Slot 6", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4022000000000000L), true));
    private final Class44 Field10756 = this.Method23(new Class44("Slot 7", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1555658222 ^ 0x402200005CB975EEL), true));
    private final Class44 Field10757 = this.Method23(new Class44("Slot 8", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4022000000000000L), true));
    private final Class44 Field10758 = this.Method23(new Class44("Slot 9", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(0x4022000000000000L), true));
    private final Map Field10759 = new ConcurrentHashMap();
    private String Field10760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class639() {
        super("SlotMapper", Class97.Field8343);
        this.Field10759.put(1, false);
        this.Field10759.put(2, false);
        this.Field10759.put(3, false);
        this.Field10759.put(4, false);
        this.Field10759.put(5, false);
        this.Field10759.put(6, false);
        this.Field10759.put(7, false);
        this.Field10759.put(8, false);
        this.Field10759.put(9, false);
    }

    @Override
    public void Method45() {
        if (Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        int n = Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) {
            this.Field10759.put(n, false);
            return;
        }
        if (((Boolean)this.Field10759.get(n)).booleanValue()) {
            return;
        }
        Class44 class44 = this.Method2768(n);
        if (class44 == null) {
            return;
        }
        int n2 = class44.Method335();
        if (n2 == 0) {
            return;
        }
        Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(n2));
        Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = n2;
        this.Field10759.put(n2, true);
    }

    private Class44 Method2768(int n) {
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 59;
            cArray2[n] = (char)(cArray[n] ^ (0x5962 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

