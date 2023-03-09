/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.LibFunction
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 *  org.luaj.vm2.lib.jse.CoerceLuaToJava
 */
package lavahack.client;

import lavahack.client.Class1089;
import lavahack.client.Class771;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

class Class2169
extends LibFunction {
    private String Field17917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class2169() {
    }

    public LuaValue leqS0IyKEB621E1SrHdAcHHAUjScjmKi(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4, LuaValue luaValue5) {
        if (!luaValue.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (!luaValue2.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (!luaValue3.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (luaValue4.isstring()) return CoerceJavaToLua.coerce((Object)new Class771(luaValue.tojstring(), luaValue2.tojstring(), Boolean.valueOf(luaValue4.tojstring()), (Class1089)CoerceLuaToJava.coerce((LuaValue)luaValue5, Class1089.class)));
        throw new IllegalArgumentException("Invalid arguments.");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 26;
            cArray2[n] = (char)(cArray[n] ^ (0x7F7C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

