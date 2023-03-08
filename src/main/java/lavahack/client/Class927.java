//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b?\u0006\t" }, d2 = { "Lcom/kisman/cc/websockets/api/enums/Opcode;", "", "(Ljava/lang/String;I)V", "CONTINUOUS", "TEXT", "BINARY", "PING", "PONG", "CLOSING", "kisman.cc" })
public enum Class927
{
    Field11926("CONTINUOUS", 0), 
    Field11927("TEXT", 1), 
    Field11928("BINARY", 2), 
    Field11929("PING", 3), 
    Field11930("PONG", 4), 
    Field11931("CLOSING", 5);
    
    private static final Class927[] Field11932;
    private String Field11933 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class927(final String name, final int ordinal) {
    }
    
    private static String Method3847(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2397 ^ 0x26));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
