/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.LibFunction
 */
package lavahack.client;

import lavahack.client.OCddToCcDdmbIyAUyRytOC6d7BPPqaEs;
import lavahack.client.hCtTgnEE6TMT0gFFqDwE9rj9V3nDioMu;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;

public class rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG
extends LibFunction
implements OCddToCcDdmbIyAUyRytOC6d7BPPqaEs {
    private String Field16223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public LuaValue leqS0IyKEB621E1SrHdAcHHAUjScjmKi(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4, LuaValue luaValue5, LuaValue luaValue6) {
        return rRzQ0Vs9QzFUmQhXM0VX1AGIcFg0BHlG.userdataOf((Object)new hCtTgnEE6TMT0gFFqDwE9rj9V3nDioMu(luaValue.todouble(), luaValue2.todouble(), luaValue3.todouble(), luaValue4.todouble(), luaValue5.todouble(), luaValue6.todouble()));
    }

    @Override
    public String Method856() {
        return "box";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1664111342 ^ (long)-1664111342);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1677074095L ^ 0x63F61E50);
            int n2 = (int)1401595937L ^ 0x538AA896;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1095791896L ^ 0xBEAFA849) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

