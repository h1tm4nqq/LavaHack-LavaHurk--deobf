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
final class Class195
implements Runnable {
    final Class729 Field8857;
    final String Field8858;
    private int Field8859;

    @Override
    public final void run() {
        this.Field8857.Field11095.mc.displayGuiScreen((GuiScreen)new GuiDisconnected(Class1086.access$getPreviousGuiScreen$p(this.Field8857.Field11095), "connect.failed", (ITextComponent)new TextComponentTranslation("disconnect.genericReason", new Object[]{this.Field8858})));
    }

    Class195(Class729 class729, String string) {
        this.Field8857 = class729;
        this.Field8858 = string;
    }

    private static String Method1169(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 148;
            cArray2[n] = (char)(cArray[n] ^ (0x662F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

