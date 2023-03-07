//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class gnWh7yVwHfkjaP61EEa1obtwBbodsRY9
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11014 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Astolfo", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1490037358L ^ 0xA72FD593) != 0));
    private String Field11015 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public gnWh7yVwHfkjaP61EEa1obtwBbodsRY9() {
        super("Fps", (boolean)((long)-344886594 ^ (long)-344886593));
        this.Method271(1.0);
        this.Method272(1.0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2945(RenderGameOverlayEvent.Text text) {
        this.Method273(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4741("Fps: " + Minecraft.getDebugFPS()));
        this.Method274(fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4748());
        int n = this.Field11014.Method365() ? zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709((int)((long)223154998 ^ (long)223154991) << 2, (int)((long)1581879237 ^ (long)1581879260) << 2) : (int)((long)-2015969936 ^ (long)2015969935);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4745("Fps: " + TextFormatting.GRAY + Minecraft.getDebugFPS(), this.Method267(), this.Method268(), n);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)600418526L ^ 0x23C9A8DE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-613895735 ^ (long)-613895882);
            int n2 = (int)-1842007394L ^ 0x92353249;
            cArray2[n] = (char)(cArray[n] ^ ((int)922809485L ^ 0x3700938A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

