//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007?\u0006\b" }, d2 = { "Lcom/kisman/cc/features/module/movement/AutoPacketFly$Stage;", "", "(Ljava/lang/String;I)V", "PrepareFly", "Jumping", "Fly", "PrepareTakeoff", "Takeoff", "kisman.cc" })
enum Class644
{
    Field10776("PrepareFly", 0), 
    Field10777("Jumping", 1), 
    Field10778("Fly", 2), 
    Field10779("PrepareTakeoff", 3), 
    Field10780("Takeoff", 4);
    
    private static final Class644[] Field10781;
    private String Field10782 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class644(final String name, final int ordinal) {
    }
    
    private static String Method2776(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7883 ^ 0xCF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
