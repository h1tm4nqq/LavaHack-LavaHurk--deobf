//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.util.*;

enum Class1587
{
    Field15419("MainHand", 0, EnumHand.MAIN_HAND), 
    Field15420("OffHand", 1, EnumHand.OFF_HAND), 
    Field15421("CurrentHand", 2, (EnumHand)null);
    
    private final EnumHand Field15422;
    private static final Class1587[] Field15423;
    private String Field15424 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    private Class1587(final String name, final int ordinal, final EnumHand field15422) {
        this.Field15422 = field15422;
    }
    
    public EnumHand Method6229() {
        return (this.Field15422 == null) ? null.Method5313() : this.Field15422;
    }
    
    static {
        Field15423 = new Class1587[] { Class1587.Field15419, Class1587.Field15420, Class1587.Field15421 };
    }
    
    private static String Method6230(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x35B6 ^ 0x2C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
