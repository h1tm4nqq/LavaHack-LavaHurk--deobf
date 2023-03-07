//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;

public class aCst2o3RIz7FgICibv4wsbtdWEDjQvE7
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15943 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LeftClick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)1282257572L ^ 0x4C6DB2A4) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15944 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("LeftClickDelay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble(0xCDC3BF591A35E351L ^ 0x8DD3BF591A35E351L), 0.0, Double.longBitsToDouble((long)777301934 ^ 0x404400002E54AFAEL), (boolean)((long)1524122296 ^ (long)1524122297)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15945 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RightClick", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1062618718 ^ (long)1062618719)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field15946 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("RightClickDelay", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, Double.longBitsToDouble((long)513726562 ^ 0x401000001E9ED862L), 0.0, Double.longBitsToDouble(0x627F9F81AC7DC72FL ^ 0x223B9F81AC7DC72FL), (boolean)((long)738203511 ^ (long)738203510)));
    private String Field15947 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public aCst2o3RIz7FgICibv4wsbtdWEDjQvE7() {
        super("ClickDelayTimer", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8343);
    }

    @Override
    public void Method45() {
        if (aCst2o3RIz7FgICibv4wsbtdWEDjQvE7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player == null) return;
        if (aCst2o3RIz7FgICibv4wsbtdWEDjQvE7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.world == null) {
            return;
        }
        this.Method20();
        this.Method6600();
    }

    private void Method20() {
        if (!this.Field15943.Method365()) {
            return;
        }
        if (aCst2o3RIz7FgICibv4wsbtdWEDjQvE7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field15944.Method335() == 0) return;
    }

    private void Method6600() {
        if (!this.Field15945.Method365()) {
            return;
        }
        if (aCst2o3RIz7FgICibv4wsbtdWEDjQvE7.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.player.ticksExisted % this.Field15946.Method335() == 0) return;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1563142024L ^ 0x5D2BA788;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1361180992L ^ 0x5121F9BF);
            int n2 = ((int)1034944625L ^ 0x3DB0003A) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)711593765 ^ (long)711621796) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

