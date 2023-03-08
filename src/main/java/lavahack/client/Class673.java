//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/websockets/api/enums/CloseHandshakeType;", "", "(Ljava/lang/String;I)V", "NONE", "ONEWAY", "TWOWAY", "kisman.cc" })
public enum Class673
{
    Field10859("NONE", 0), 
    Field10860("ONEWAY", 1), 
    Field10861("TWOWAY", 2);
    
    private static final Class673[] Field10862;
    private int Field10863;
    
    private Class673(final String name, final int ordinal) {
    }
    
    private static String Method2858(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C35 ^ 0x86));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
