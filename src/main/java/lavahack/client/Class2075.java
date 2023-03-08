//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/enums/GradientModes;", "", "(Ljava/lang/String;I)V", "None", "Rainbow", "Astolfo", "Pulsive", "Companion", "kisman.cc" })
public enum Class2075
{
    Field17489("None", 0), 
    Field17490("Rainbow", 1), 
    Field17491("Astolfo", 2), 
    Field17492("Pulsive", 3);
    
    private static final Class2075[] Field17493;
    public static final Class261 Field17494;
    private String Field17495 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    static {
        Field17494 = new Class261(null);
    }
    
    private Class2075(final String name, final int ordinal) {
    }
    
    private static String Method7617(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x43F6 ^ 0xBB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
