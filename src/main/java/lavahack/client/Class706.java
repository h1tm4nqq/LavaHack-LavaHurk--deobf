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

import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class706
extends Class1249 {
    private final Class44 Field11014 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private String Field11015 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class706() {
        super("Fps", true);
        this.Method271(1.0);
        this.Method272(1.0);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2945(RenderGameOverlayEvent.Text text) {
        this.Method273(Class1178.Method4741("Fps: " + Minecraft.getDebugFPS()));
        this.Method274(Class1178.Method4748());
        int n = this.Field11014.Method365() ? Class1172.Method4709(100, 100) : -1;
        Class1178.Method4745("Fps: " + TextFormatting.GRAY + Minecraft.getDebugFPS(), this.Method267(), this.Method268(), n);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 215;
            cArray2[n] = (char)(cArray[n] ^ (0x6707 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

