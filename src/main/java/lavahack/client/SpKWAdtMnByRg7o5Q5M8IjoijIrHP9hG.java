/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SpKWAdtMnByRg7o5Q5M8IjoijIrHP9hG
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private String Field12180 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public SpKWAdtMnByRg7o5Q5M8IjoijIrHP9hG() {
        super("NoPushOutBlock", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340, ((int)259549446L ^ 0xF786907) != 0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3978(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        playerSPPushOutOfBlocksEvent.setCanceled((boolean)((long)532388465 ^ (long)532388464));
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1241722733 ^ (long)-1241722733);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1260030299 ^ (long)-1260030374);
            int n2 = ((int)962981374L ^ 0x3965EDDF) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-822111184 ^ (long)-822114197) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

