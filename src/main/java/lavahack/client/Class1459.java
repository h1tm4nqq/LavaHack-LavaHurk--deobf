//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/enums/RectSides;", "", "(Ljava/lang/String;I)V", "Top", "Bottom", "Right", "Left", "Companion", "kisman.cc" })
public enum Class1459
{
    Field14825("Top", 0), 
    Field14826("Bottom", 1), 
    Field14827("Right", 2), 
    Field14828("Left", 3);
    
    private static final Class1459[] Field14829;
    public static final Class2066 Field14830;
    private String Field14831 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field14830 = new Class2066(null);
    }
    
    private Class1459(final String name, final int ordinal) {
    }
    
    private static String Method5818(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2340 ^ 0x63));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
