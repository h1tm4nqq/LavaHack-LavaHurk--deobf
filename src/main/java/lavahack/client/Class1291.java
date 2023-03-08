//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;

class Class1291 extends Class1368
{
    private int Field13889;
    
    public Class1291(@NotNull @NotNull final Class158 class158) {
        super("fmt", class158);
    }
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Class1393.Method5505().Method1892("To be implemented");
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x8E8 ^ 0x7C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
