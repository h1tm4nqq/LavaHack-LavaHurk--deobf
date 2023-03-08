//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n?\u0006\u000b" }, d2 = { "Lcom/kisman/cc/util/enums/RobotHoleOperation;", "", "(Ljava/lang/String;I)V", "Sword", "Exp", "Await", "MineEchest", "RunOut", "Quiver", "CounterTower", "City", "kisman.cc" })
public enum Class1277
{
    Field13754("Sword", 0), 
    Field13755("Exp", 1), 
    Field13756("Await", 2), 
    Field13757("MineEchest", 3), 
    Field13758("RunOut", 4), 
    Field13759("Quiver", 5), 
    Field13760("CounterTower", 6), 
    Field13761("City", 7);
    
    private static final Class1277[] Field13762;
    private String Field13763 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1277(final String name, final int ordinal) {
    }
    
    private static String Method5114(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x46F5 ^ 0x15));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
