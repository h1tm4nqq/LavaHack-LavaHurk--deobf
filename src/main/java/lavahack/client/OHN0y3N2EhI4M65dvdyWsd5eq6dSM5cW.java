/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.FOVUpdateEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Deprecated
public class OHN0y3N2EhI4M65dvdyWsd5eq6dSM5cW
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8616 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("SettingFOV", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 1.0, 0.0, Double.longBitsToDouble(0xA856D845209551F9L ^ 0xE872D845209551F9L), ((int)2040229339L ^ 0x799B6DDB) != 0));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field8617 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Static", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)1980233349 ^ (long)1980233348)));
    private String Field8618 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OHN0y3N2EhI4M65dvdyWsd5eq6dSM5cW() {
        super("FovModifier", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342, (boolean)((long)-331095896 ^ (long)-331095895));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1054(FOVUpdateEvent fOVUpdateEvent) {
        fOVUpdateEvent.setNewfov(this.Field8617.Method365() ? this.Field8616.Method368() : fOVUpdateEvent.getFov() * this.Field8616.Method368());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1528531188L ^ 0x5B1B88F4;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1760560425 ^ (long)1760560598);
            int n2 = (int)((long)-1097223897 ^ (long)-1097223704);
            cArray2[n] = (char)(cArray[n] ^ (((int)87019881L ^ 0x52FDA8A) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

