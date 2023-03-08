//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import java.util.concurrent.*;
import net.minecraft.network.play.client.*;
import net.minecraft.network.*;

public class Class639 extends Class42
{
    private final Class44 Field10750;
    private final Class44 Field10751;
    private final Class44 Field10752;
    private final Class44 Field10753;
    private final Class44 Field10754;
    private final Class44 Field10755;
    private final Class44 Field10756;
    private final Class44 Field10757;
    private final Class44 Field10758;
    private final Map Field10759;
    private String Field10760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class639() {
        super("SlotMapper", Class97.Field8343);
        this.Field10750 = this.Method23(new Class44("Slot 1", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)841841375 ^ 0x40220000322D7ADFL), true));
        this.Field10751 = this.Method23(new Class44("Slot 2", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)986834140 ^ 0x402200003AD1E4DCL), true));
        this.Field10752 = this.Method23(new Class44("Slot 3", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4621256167635550208L), true));
        this.Field10753 = this.Method23(new Class44("Slot 4", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4621256167635550208L), true));
        this.Field10754 = this.Method23(new Class44("Slot 5", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)2132640146 ^ 0x402200007F1D8192L), true));
        this.Field10755 = this.Method23(new Class44("Slot 6", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4621256167635550208L), true));
        this.Field10756 = this.Method23(new Class44("Slot 7", (Class42)this, 0.0, 0.0, Double.longBitsToDouble((long)1555658222 ^ 0x402200005CB975EEL), true));
        this.Field10757 = this.Method23(new Class44("Slot 8", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4621256167635550208L), true));
        this.Field10758 = this.Method23(new Class44("Slot 9", (Class42)this, 0.0, 0.0, Double.longBitsToDouble(4621256167635550208L), true));
        (this.Field10759 = new ConcurrentHashMap()).put(1, false);
        this.Field10759.put(2, false);
        this.Field10759.put(3, false);
        this.Field10759.put(4, false);
        this.Field10759.put(5, false);
        this.Field10759.put(6, false);
        this.Field10759.put(7, false);
        this.Field10759.put(8, false);
        this.Field10759.put(9, false);
    }
    
    public void Method45() {
        if (Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null || Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        final int currentItem = Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem;
        if (Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.isHandActive()) {
            this.Field10759.put(currentItem, false);
            return;
        }
        if (this.Field10759.get(currentItem)) {
            return;
        }
        final Class44 method2768 = this.Method2768(currentItem);
        if (method2768 == null) {
            return;
        }
        final int method2769 = method2768.Method335();
        if (method2769 == 0) {
            return;
        }
        Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.connection.sendPacket((Packet)new CPacketHeldItemChange(method2769));
        Class639.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.inventory.currentItem = method2769;
        this.Field10759.put(method2769, true);
    }
    
    private Class44 Method2768(final int n) {
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
            default: {
                return null;
            }
        }
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5962 ^ 0x3B));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
