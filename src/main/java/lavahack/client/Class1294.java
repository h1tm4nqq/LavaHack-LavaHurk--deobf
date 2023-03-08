//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.function.*;

public class Class1294 extends Class42
{
    public static Class1294 Field13915;
    @Class1801
    private final Class618 Field13916;
    private String Field13917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1294() {
        super("CameraClip", Class97.Field8341);
        this.Field13916 = new Class618(Class1185::Method158, new Predicate[0]);
        Class1294.Field13915 = this;
    }
    
    @Override
    public void Method38() {
        Class1796.Field16242.Method706(this.Field13916);
    }
    
    @Override
    public void Method39() {
        Class1796.Field16242.Method711(this.Field13916);
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x39B ^ 0x5A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
