//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;

class Class612 extends LibFunction
{
    private String Field10608 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4) {
        if (!luaValue.isstring() || !luaValue2.isstring() || !luaValue3.isstring()) {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        return CoerceJavaToLua.coerce((Object)new Class1700(luaValue.tojstring(), luaValue2.tojstring(), Class97.valueOf(luaValue3.tojstring()), (Class1089)CoerceLuaToJava.coerce(luaValue4, (Class)Class1089.class)));
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x561E ^ 0x2F));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
