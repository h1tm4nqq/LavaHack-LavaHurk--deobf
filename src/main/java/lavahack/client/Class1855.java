//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;

public class Class1855 extends OneArgFunction
{
    private int Field16544;
    
    public LuaValue call(final LuaValue luaValue) {
        if (!luaValue.isstring()) {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        return CoerceJavaToLua.coerce((Object)new Class1147(luaValue.toString()));
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5B99 ^ 0x18));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
