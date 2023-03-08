//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;

class Class2003 extends Class1368
{
    private String Field17187 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2003(final Class158 class158) {
        super("argbuilding", class158);
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        final boolean boolean1 = Boolean.parseBoolean(array[1]);
        Class813.Method3421((Class813)this.Method2057(), boolean1);
        this.Method437("Arg building is now set to: " + boolean1);
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5332 ^ 0x27));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
