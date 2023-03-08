//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003?\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/enums/FontStyles;", "", "style", "", "(Ljava/lang/String;II)V", "getStyle", "()I", "Plain", "Bold", "Italic", "Both", "kisman.cc" })
public enum Class1613
{
    Field15543("Plain", 0, 0), 
    Field15544("Bold", 1, 1), 
    Field15545("Italic", 2, 2), 
    Field15546("Both", 3, 3);
    
    private static final Class1613[] Field15547;
    private final int Field15548;
    private String Field15549 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public final int Method6280() {
        return this.Field15548;
    }
    
    private Class1613(final String name, final int ordinal, final int field15548) {
        this.Field15548 = field15548;
    }
    
    private static String Method6281(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1E25 ^ 0x78));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
