//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.text.*;
import net.minecraft.client.gui.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class195 implements Runnable
{
    final Class729 Field8857;
    final String Field8858;
    private int Field8859;
    
    @Override
    public final void run() {
        this.Field8857.Field11095.mc.displayGuiScreen((GuiScreen)new GuiDisconnected(Class1086.access$getPreviousGuiScreen$p(this.Field8857.Field11095), "connect.failed", (ITextComponent)new TextComponentTranslation("disconnect.genericReason", new Object[] { this.Field8858 })));
    }
    
    Class195(final Class729 field8857, final String field8858) {
        this.Field8857 = field8857;
        this.Field8858 = field8858;
    }
    
    private static String Method1169(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x662F ^ 0x94));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
