//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005?\u0006\u0006" }, d2 = { "Lcom/kisman/cc/loader/websockets/api/enums/CloseHandshakeType;", "", "(Ljava/lang/String;I)V", "NONE", "ONEWAY", "TWOWAY", "kisman.cc" })
public enum Class1159
{
    Field13228("NONE", 0), 
    Field13229("ONEWAY", 1), 
    Field13230("TWOWAY", 2);
    
    private static final Class1159[] Field13231;
    private String Field13232 = "TheKisDevs & LavaHack Development owns you";
    
    private Class1159(final String name, final int ordinal) {
    }
    
    private static String Method4680(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x770E ^ 0x9C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
