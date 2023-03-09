//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  net.minecraft.client.gui.GuiDisconnected
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.text.ITextComponent
 *  net.minecraft.util.text.TextComponentTranslation
 */
package lavahack.client;

import kotlin.Metadata;
import lavahack.client.Class1086;
import lavahack.client.Class729;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class Class1572
implements Runnable {
    final Class729 Field15327;
    private String Field15328 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        this.Field15327.Field11095.mc.displayGuiScreen((GuiScreen)new GuiDisconnected(Class1086.access$getPreviousGuiScreen$p(this.Field15327.Field11095), "connect.failed", (ITextComponent)new TextComponentTranslation("disconnect.genericReason", new Object[]{"Unknown host"})));
    }

    Class1572(Class729 class729) {
        this.Field15327 = class729;
    }

    private static String Method6200(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 40;
            cArray2[n] = (char)(cArray[n] ^ (0x5A3D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

