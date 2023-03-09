/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;

@Deprecated
public class Class1210
extends Class42 {
    private String Field13492 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1210() {
        super("PacketMine V2", Class97.Field8344);
    }

    static Minecraft Method4877() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4878() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    static Minecraft Method4879() {
        return vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 242;
            cArray2[n] = (char)(cArray[n] ^ (0x20E6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

