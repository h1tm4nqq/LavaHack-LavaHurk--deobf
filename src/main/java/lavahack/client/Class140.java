//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import com.kisman.cc.util.*;

public class Class140 extends Class158
{
    public static String Field8528;
    private String Field8529 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class140() {
        super("clientversion");
    }
    
    @Override
    public String Method447() {
        return "Changes the version of the client";
    }
    
    @Override
    public String Method448() {
        return "clientversion <version>";
    }
    
    @Override
    public void Method443(@NotNull @NotNull final String s, @NotNull @NotNull final String[] array) {
        Class140.Field8528 = Class2131.Method7669((CharSequence[])array, 0, array.length).toString();
    }
    
    static {
        Class140.Field8528 = Class1796.Method6785();
    }
    
    private static String Method441(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5A74 ^ 0x8E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
