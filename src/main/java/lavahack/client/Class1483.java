//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;

public class Class1483
{
    private String Field14924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method5937(final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        fontRenderer.drawStringWithShadow(s, (float)n, (float)n2, n3);
    }
    
    public static void Method5938(final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        fontRenderer.drawStringWithShadow(s, (float)(n - fontRenderer.getStringWidth(s) / 2), (float)n2, n3);
    }
    
    public static void Method5939(final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        fontRenderer.drawStringWithShadow(s, (float)(n - fontRenderer.getStringWidth(s)), (float)n2, n3);
    }
}
