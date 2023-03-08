//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.util.*;

public class Class440 extends Class158
{
    private String Field9840 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class440() {
        super("panic");
    }
    
    public String Method447() {
        return "turns off all module";
    }
    
    public String Method448() {
        return "panic";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        final Iterator<Class42> iterator = Class1796.Field16241.Field16254.Method1165().iterator();
        while (iterator.hasNext()) {
            iterator.next().Method21(false);
        }
        for (final Class1249 class1249 : Class1796.Field16241.Field16257.Field9235) {
            if (class1249.Method35()) {
                class1249.Method21(false);
            }
        }
        for (final Class1255 class1250 : Class82.Method733().values()) {
            if (class1250.Method5069()) {
                class1250.Method5066();
            }
        }
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4C72 ^ 0x96));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
