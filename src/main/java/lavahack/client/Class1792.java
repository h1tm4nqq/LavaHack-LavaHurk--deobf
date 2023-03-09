/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.LibFunction
 */
package lavahack.client;

import lavahack.client.Class126;
import lavahack.client.Class1779;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;

public class Class1792
extends LibFunction
implements Class126 {
    private String Field16223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public LuaValue leqS0IyKEB621E1SrHdAcHHAUjScjmKi(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4, LuaValue luaValue5, LuaValue luaValue6) {
        return Class1792.userdataOf((Object)new Class1779(luaValue.todouble(), luaValue2.todouble(), luaValue3.todouble(), luaValue4.todouble(), luaValue5.todouble(), luaValue6.todouble()));
    }

    @Override
    public String Method856() {
        return "box";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 183;
            cArray2[n] = (char)(cArray[n] ^ (0x4542 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

