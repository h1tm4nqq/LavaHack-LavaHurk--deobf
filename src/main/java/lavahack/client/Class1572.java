//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import net.minecraft.util.text.*;
import net.minecraft.client.gui.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n?\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "run" })
final class Class1572 implements Runnable
{
    final Class729 Field15327;
    private String Field15328 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Override
    public final void run() {
        this.Field15327.Field11095.mc.displayGuiScreen((GuiScreen)new GuiDisconnected(Class1086.access$getPreviousGuiScreen$p(this.Field15327.Field11095), "connect.failed", (ITextComponent)new TextComponentTranslation("disconnect.genericReason", new Object[] { "Unknown host" })));
    }
    
    Class1572(final Class729 field15327) {
        this.Field15327 = field15327;
    }
    
    private static String Method6200(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A3D ^ 0x28));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
