//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b?\u0006\t" }, d2 = { "Lcom/kisman/cc/loader/websockets/api/enums/Opcode;", "", "(Ljava/lang/String;I)V", "CONTINUOUS", "TEXT", "BINARY", "PING", "PONG", "CLOSING", "kisman.cc" })
public enum Class1753
{
    Field16033("CONTINUOUS", 0), 
    Field16034("TEXT", 1), 
    Field16035("BINARY", 2), 
    Field16036("PING", 3), 
    Field16037("PONG", 4), 
    Field16038("CLOSING", 5);
    
    private static final Class1753[] Field16039;
    private String Field16040 = "TheKisDevs & LavaHack Development owns you";
    
    private Class1753(final String name, final int ordinal) {
    }
    
    private static String Method6680(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x6AF4 ^ 0xA7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
