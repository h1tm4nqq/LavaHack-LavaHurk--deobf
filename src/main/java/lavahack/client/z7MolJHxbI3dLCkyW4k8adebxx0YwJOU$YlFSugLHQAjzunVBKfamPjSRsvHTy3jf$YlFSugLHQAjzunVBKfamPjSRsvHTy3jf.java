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
final class z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
implements Runnable {
    final z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field8857;
    final String Field8858;
    private int Field8859;

    @Override
    public final void run() {
        Object[] objectArray = new Object[(int)((long)-1463413274 ^ (long)-1463413273)];
        objectArray[(int)1774494045L ^ 0x69C4A15D] = this.Field8858;
        this.Field8857.Field11095.mc.displayGuiScreen((GuiScreen)new GuiDisconnected(z7MolJHxbI3dLCkyW4k8adebxx0YwJOU.access$getPreviousGuiScreen$p(this.Field8857.Field11095), "connect.failed", (ITextComponent)new TextComponentTranslation("disconnect.genericReason", objectArray)));
    }

    z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf, String string) {
        this.Field8857 = z7MolJHxbI3dLCkyW4k8adebxx0YwJOU$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
        this.Field8858 = string;
    }

    private static String Method1169(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)983257266 ^ (long)983257266);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1771575340 ^ (long)-1771575509);
            int n2 = (int)((long)-147778241 ^ (long)-147778278) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)618118900L ^ 0x24D7D8DB ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

