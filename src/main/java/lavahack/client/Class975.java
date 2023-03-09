/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class975
extends Class42 {
    private String Field12180 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class975() {
        super("NoPushOutBlock", Class97.Field8340, true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method3978(PlayerSPPushOutOfBlocksEvent playerSPPushOutOfBlocksEvent) {
        playerSPPushOutOfBlocksEvent.setCanceled(true);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0x38B6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

