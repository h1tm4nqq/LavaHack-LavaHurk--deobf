/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.OneArgFunction
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import lavahack.client.Class1147;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class1855
extends OneArgFunction {
    private int Field16544;

    public LuaValue call(LuaValue luaValue) {
        if (!luaValue.isstring()) {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        Class1147 class1147 = new Class1147(luaValue.toString());
        return CoerceJavaToLua.coerce((Object)class1147);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 24;
            cArray2[n] = (char)(cArray[n] ^ (0x5B99 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

