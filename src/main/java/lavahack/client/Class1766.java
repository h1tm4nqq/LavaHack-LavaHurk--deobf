//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1766 extends Class42
{
    public static Class1766 Field16075;
    @Class1801
    private final Class618 Field16076;
    private String Field16077 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1766() {
        super("SkylightFix", Class97.Field8343);
        this.Field16076 = new Class618(Class1185::Method158, new Predicate[0]);
        Class1766.Field16075 = this;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field16076);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field16076);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7016 ^ 0xFF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
