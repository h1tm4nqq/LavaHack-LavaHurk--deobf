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

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class rwAM4juWfZnjKRcVZu0SRYY1S7qvBehT
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field10644 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)701318510 ^ (long)701318511)));
    private String Field10645 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public rwAM4juWfZnjKRcVZu0SRYY1S7qvBehT() {
        super("Ping", "", (boolean)((long)1216462750 ^ (long)1216462751));
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2653(RenderGameOverlayEvent.Text text) {
        String string = "Ping: " + TextFormatting.GRAY + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? (int)((long)1615638737 ^ (long)1615638737) : leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16275.Method7401());
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741(string));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745(string, this.Method267(), this.Method268(), this.Field10644.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)1013146192L ^ 0x3C636249) << 2, (int)((long)-713517024 ^ (long)-713516999) << 2) : (int)-1266381779L ^ 0x4B7B73D2);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-25638813L ^ 0xFE78C863;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1642010973L ^ 0x61DF19A2);
            int n2 = (int)((long)1910036197 ^ (long)1910036200) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1995815080 ^ (long)1995812295) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

