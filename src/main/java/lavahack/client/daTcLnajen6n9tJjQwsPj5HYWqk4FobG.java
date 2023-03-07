/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraft.client.Minecraft;

@Deprecated
public class daTcLnajen6n9tJjQwsPj5HYWqk4FobG
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field13492 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public daTcLnajen6n9tJjQwsPj5HYWqk4FobG() {
        super("PacketMine V2", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8344);
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
        int n = (int)((long)1534991421 ^ (long)1534991421);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1037040813L ^ 0xC23003AC);
            int n2 = ((int)1091356715L ^ 0x410CC852) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1807432305 ^ (long)1807428098) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

