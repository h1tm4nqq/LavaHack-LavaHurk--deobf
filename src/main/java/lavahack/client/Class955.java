//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/features/module/BindType;", "", "(Ljava/lang/String;I)V", "Keyboard", "Mouse", "kisman.cc" })
public enum Class955
{
    Field12068("Keyboard", 0), 
    Field12069("Mouse", 1);
    
    private static final Class955[] Field12070;
    private int Field12071;
    
    private Class955(final String name, final int ordinal) {
    }
    
    private static String Method3923(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5C07 ^ 0xB6));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
