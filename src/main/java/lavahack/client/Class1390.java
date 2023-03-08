//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/enums/BurrowStages;", "", "(Ljava/lang/String;I)V", "Centering", "PreparePlacing", "Placing", "Clipping", "Burrowing", "kisman.cc" })
public enum Class1390
{
    Field14299("Centering", 0), 
    Field14300("PreparePlacing", 1), 
    Field14301("Placing", 2), 
    Field14302("Clipping", 3), 
    Field14303("Burrowing", 4);
    
    private static final Class1390[] Field14304;
    private String Field14305 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1390(final String name, final int ordinal) {
    }
    
    private static String Method5498(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5AEB ^ 0x1D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
