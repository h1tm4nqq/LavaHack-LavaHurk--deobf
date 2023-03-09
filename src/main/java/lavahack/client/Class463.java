//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class451;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class463
extends Class1249 {
    private final Class451 Field9924 = this.Method275();
    private String Field9925 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class463() {
        super("ServerIp", "", true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2176(RenderGameOverlayEvent.Text text) {
        this.Method273(Class1178.Method4741("Server: " + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? "SingePlayer" : Class463.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getCurrentServerData().serverIP.toLowerCase())));
        this.Method274(Class1178.Method4748());
        Class1178.Method4745("Server: " + TextFormatting.GRAY + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? "SingePlayer" : Class463.leqS0IyKEB621E1SrHdAcHHAUjScjmKi.getCurrentServerData().serverIP.toLowerCase()), this.Method267(), this.Method268(), this.Field9924.Method2151().Method3626());
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 209;
            cArray2[n] = (char)(cArray[n] ^ (0x192C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

