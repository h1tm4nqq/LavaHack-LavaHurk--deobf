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

import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class619
extends Class1249 {
    private final Class44 Field10644 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private String Field10645 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class619() {
        super("Ping", "", true);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method2653(RenderGameOverlayEvent.Text text) {
        String string = "Ping: " + TextFormatting.GRAY + (leqS0IyKEB621E1SrHdAcHHAUjScjmKi.isSingleplayer() ? 0 : Class1796.Field16241.Field16275.Method7401());
        this.Method273(Class1178.Method4741(string));
        this.Method274(Class1178.Method4748());
        Class1178.Method4745(string, this.Method267(), this.Method268(), this.Field10644.Method365() ? Class1172.Method4709(100, 100) : -1);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 104;
            cArray2[n] = (char)(cArray[n] ^ (0x2ADE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

