//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.FontRenderer
 */
package lavahack.client;

import net.minecraft.client.gui.FontRenderer;

public class swv5Uhq0nS7perQamvaWL4XB0xEQkQjR {
    private String Field14924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method5937(FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        fontRenderer.drawStringWithShadow(string, (float)n, (float)n2, n3);
    }

    public static void Method5938(FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        fontRenderer.drawStringWithShadow(string, (float)(n - fontRenderer.getStringWidth(string) / (((int)1106190132L ^ 0x41EF1F35) << 1)), (float)n2, n3);
    }

    public static void Method5939(FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        fontRenderer.drawStringWithShadow(string, (float)(n - fontRenderer.getStringWidth(string)), (float)n2, n3);
    }
}

