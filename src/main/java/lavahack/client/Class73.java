//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1796;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Class73
extends Class1249 {
    private String Field8243 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class73() {
        super("Tps", "");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method660(RenderGameOverlayEvent.Text text) {
        ScaledResolution scaledResolution = new ScaledResolution(leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        String string = TextFormatting.WHITE + "TPS: " + TextFormatting.GRAY + Class1796.Field16241.Field16275.Method7398();
        Class1178.Method4745(string, scaledResolution.getScaledWidth() - 1 - Class1178.Method4741(string), scaledResolution.getScaledHeight() - 3 - Class1178.Method4748() * 2, -1);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 13;
            cArray2[n] = (char)(cArray[n] ^ (0x57EF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

