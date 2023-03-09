/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.OneArgFunction
 */
package lavahack.client;

import lavahack.client.Class126;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;

public class Class998
extends OneArgFunction
implements Class126 {
    private int Field12290;

    public LuaValue call(LuaValue luaValue) {
        return Class998.userdataOf((Object)luaValue.tojstring());
    }

    @Override
    public String Method856() {
        return "textOf";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 94;
            cArray2[n] = (char)(cArray[n] ^ (0xCF5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

