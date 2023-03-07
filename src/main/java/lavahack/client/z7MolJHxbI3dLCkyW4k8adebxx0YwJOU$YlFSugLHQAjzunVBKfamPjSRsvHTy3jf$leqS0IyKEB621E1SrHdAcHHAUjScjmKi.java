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
import lavahack.client.z7MolJHxbI3dLCkyW4k8adebxx0YwJOU;
import lavahack.client.z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2={"<anonymous>", "", "run"})
final class z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Runnable {
    final z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field15327;
    private String Field15328 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public final void run() {
        Object[] objectArray = new Object[(int)548849627L ^ 0x20B6C7DA];
        objectArray[(int)((long)656719927 ^ (long)656719927)] = "Unknown host";
        this.Field15327.Field11095.mc.displayGuiScreen((GuiScreen)new GuiDisconnected(z7MolJHxbI3dLCkyW4k8adebxx0YwJOU.access$getPreviousGuiScreen$p(this.Field15327.Field11095), "connect.failed", (ITextComponent)new TextComponentTranslation("disconnect.genericReason", objectArray)));
    }

    z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        this.Field15327 = z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
    }

    private static String Method6200(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-996265943 ^ (long)-996265943);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1113452609 ^ (long)1113452734);
            int n2 = (int)((long)1171941971 ^ (long)1171941974) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1839881403 ^ (long)1839859334) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

