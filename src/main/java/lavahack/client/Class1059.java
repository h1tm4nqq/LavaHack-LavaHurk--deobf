//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;

public class Class1059 extends Class158
{
    private String Field12678 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1059() {
        super("setting");
    }
    
    @Override
    public String Method447() {
        return null;
    }
    
    @Override
    public String Method448() {
        return null;
    }
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (array.length < 2) {
            Class1393.Method5504().Method1882("Not enough arguments: " + array.length);
            return;
        }
        final Class42 method1162 = Class1796.Field16241.Field16254.Method1162(array[0]);
        if (method1162 == null) {
            Class1393.Method5504().Method1882("Could not find module: " + array[0]);
            return;
        }
        final Class1182 class1182 = new Class1182(method1162, Class1796.Field16241.Field16258.Method7571(method1162));
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4F7E ^ 0x48));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
