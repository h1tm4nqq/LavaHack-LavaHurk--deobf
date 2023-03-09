/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.TwoArgFunction
 */
package lavahack.client;

import lavahack.client.Class126;
import lavahack.client.Class870;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;

public class Class1268
extends TwoArgFunction
implements Class126 {
    private int Field13725;

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return Class1268.userdataOf((Object)new Class870(luaValue.todouble(), luaValue2.todouble()));
    }

    @Override
    public String Method856() {
        return "vec2d";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 215;
            cArray2[n] = (char)(cArray[n] ^ (0x1784 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

