//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import com.kisman.cc.util.*;
import javax.annotation.*;
import org.luaj.vm2.*;

public class Class2153 implements Class2142
{
    private int Field17849;
    
    public static void Method7744(@Nullable @Nullable final Class42 class42, @Nullable @Nullable final LuaClosure luaClosure, @Nullable @Nullable final LuaValue... array) {
        if (luaClosure == null) {
            return;
        }
        if (array == null) {
            luaClosure.invoke();
        }
        else {
            luaClosure.invoke(array);
        }
    }
    
    public static void Method7745(final LuaClosure luaClosure, final LuaValue... array) {
        Method7744(null, luaClosure, array);
    }
    
    private static String Method7746(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2D3 ^ 0xD4));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
