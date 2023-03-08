//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;

class Class2169 extends LibFunction
{
    private String Field17917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public LuaValue leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4, final LuaValue luaValue5) {
        if (!luaValue.isstring() || !luaValue2.isstring() || !luaValue3.isstring() || !luaValue4.isstring()) {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        return CoerceJavaToLua.coerce((Object)new Class771(luaValue.tojstring(), luaValue2.tojstring(), Boolean.valueOf(luaValue4.tojstring()), (Class1089)CoerceLuaToJava.coerce(luaValue5, (Class)Class1089.class)));
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7F7C ^ 0x1A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
