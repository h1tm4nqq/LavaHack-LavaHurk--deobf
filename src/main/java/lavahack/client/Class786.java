//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003?\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015?\u0006\u0016" }, d2 = { "Lcom/kisman/cc/util/enums/RenderingRewriteModes;", "", "mode", "Lcom/kisman/cc/util/render/Rendering$Mode;", "(Ljava/lang/String;ILcom/kisman/cc/util/render/Rendering$Mode;)V", "getMode", "()Lcom/kisman/cc/util/render/Rendering$Mode;", "None", "Filled", "Outline", "Wire", "FilledOutline", "FilledWire", "FilledWireOutline", "WireOutline", "FilledGradient", "WireGradient", "OutlineGradient", "FilledOutlineGradient", "FilledWireGradient", "FilledWireOutlineGradient", "WireOutlineGradient", "kisman.cc" })
public enum Class786
{
    Field11308("None", 0, (Class2008)null), 
    Field11309("Filled", 1, Class2008.Field17212), 
    Field11310("Outline", 2, Class2008.Field17211), 
    Field11311("Wire", 3, Class2008.Field17213), 
    Field11312("FilledOutline", 4, Class2008.Field17214), 
    Field11313("FilledWire", 5, Class2008.Field17215), 
    Field11314("FilledWireOutline", 6, Class2008.Field17217), 
    Field11315("WireOutline", 7, Class2008.Field17216), 
    Field11316("FilledGradient", 8, Class2008.Field17219), 
    Field11317("WireGradient", 9, Class2008.Field17218), 
    Field11318("OutlineGradient", 10, Class2008.Field17220), 
    Field11319("FilledOutlineGradient", 11, Class2008.Field17221), 
    Field11320("FilledWireGradient", 12, Class2008.Field17222), 
    Field11321("FilledWireOutlineGradient", 13, Class2008.Field17224), 
    Field11322("WireOutlineGradient", 14, Class2008.Field17223);
    
    private static final Class786[] Field11323;
    @Nullable
    private final Class2008 Field11324;
    private String Field11325 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public final Class2008 Method3273() {
        return this.Field11324;
    }
    
    private Class786(final String name, final int ordinal, final Class2008 field11324) {
        this.Field11324 = field11324;
    }
    
    private static String Method3274(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x716 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
