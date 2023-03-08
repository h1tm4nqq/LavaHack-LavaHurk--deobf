//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004?\u0006\u0005" }, d2 = { "Lcom/kisman/cc/util/enums/AntiCrystalAngles;", "", "(Ljava/lang/String;I)V", "SurroundBlocks", "UppedSurroundBlocks", "kisman.cc" })
public enum Class1170
{
    Field13272("SurroundBlocks", 0), 
    Field13273("UppedSurroundBlocks", 1);
    
    private static final Class1170[] Field13274;
    private String Field13275 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1170(final String name, final int ordinal) {
    }
    
    private static String Method4696(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1746 ^ 0xB5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
