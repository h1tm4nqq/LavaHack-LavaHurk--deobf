//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.awt.*;

class Class460 extends Class1368
{
    private int Field9908;
    
    public Class460(@NotNull @NotNull final Class158 class158) {
        super("config", class158);
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        if (!Class707.Method2947().exists()) {
            Class707.Method2948(Class707.Method2947(), false);
        }
        Desktop.getDesktop().open(Class707.Method2947());
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2C73 ^ 0xC1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
