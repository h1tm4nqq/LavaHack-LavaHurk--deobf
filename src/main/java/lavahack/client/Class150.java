//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;

public class Class150 extends Class158
{
    public static String Field8581;
    private int Field8582;
    
    public Class150() {
        super("clientname");
    }
    
    @Override
    public String Method447() {
        return "Changes the name of the client";
    }
    
    @Override
    public String Method448() {
        return "clientname <name>";
    }
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Class150.Field8581 = Class2131.Method7669((CharSequence[])array, 0, array.length).toString();
    }
    
    static {
        Class150.Field8581 = Class1796.Method6783();
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x744E ^ 0xAE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
