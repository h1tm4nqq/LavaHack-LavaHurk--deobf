//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import java.util.*;

public class Class809 extends Class158
{
    private int Field11451;
    
    public Class809() {
        super("lang");
    }
    
    public String Method447() {
        return "";
    }
    
    public String Method448() {
        return "lang <language>";
    }
    
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        final Map method1471 = Class278.Method1471();
        System.out.println(method1471);
        final String method1472 = Class278.Method1475(method1471, array[1]);
        if (method1472 != null) {
            Class769.Field11262 = method1472;
            this.Method437("Set target language to " + method1471.get(method1472));
        }
        else {
            this.Method438("Could not find language");
        }
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7D36 ^ 0x30));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
