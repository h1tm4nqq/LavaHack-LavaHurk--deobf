//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X;
import lavahack.client.nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class QBGYrncebY0237e3drWXCqKOtyv0jOt3
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15055 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Count", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xC72CE6AD7D87DC5CL ^ 0x8738E6AD7D87DC5CL), 1.0, Double.longBitsToDouble(0xA889511B08B8563AL ^ 0xE8C0511B08B8563AL), ((int)0x48EE8488L ^ 0x48EE8489) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15056 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Delay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xAC97CE9B3F805C32L ^ 0xECE88E9B3F805C32L), 0.0, Double.longBitsToDouble(0x306A7D2E087DA204L ^ 0x70F53D2E087DA204L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
    private nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X Field15057;
    private String Field15058 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QBGYrncebY0237e3drWXCqKOtyv0jOt3() {
        super("LavaHackOwns", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8345);
    }

    @Override
    public void Method38() {
        super.Method38();
        if (QBGYrncebY0237e3drWXCqKOtyv0jOt3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (QBGYrncebY0237e3drWXCqKOtyv0jOt3.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Field15057 = new nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X(nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9121, nnQrrQPcRQ4DWA1yA39hIVRs4LLaf07X$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.Field12793, this.Field15056.Method335(), this.Field15055.Method335(), QBGYrncebY0237e3drWXCqKOtyv0jOt3::Method20);
        this.Field15057.Method793().start();
    }

    @Override
    public void Method39() {
        super.Method39();
        this.Field15057.Method793().stop();
    }

    private static void Method20() {
        NCAK0sFLWmP0xBxkwWzF2T1bn3cRmhqs.Method5505().Method1875("LavaHack owns!");
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1420650670 ^ (long)-1420650670);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1547744039 ^ (long)1547744216);
            int n2 = ((int)1644720731L ^ 0x6208727E) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2046485441L ^ 0x8605536C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

