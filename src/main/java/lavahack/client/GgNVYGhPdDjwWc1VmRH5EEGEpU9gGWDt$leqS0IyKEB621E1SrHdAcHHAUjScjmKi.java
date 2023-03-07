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

import lavahack.client.GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt;
import lavahack.client.OVr6sF5CeH66hsotktp9WWZm4gSQtcre;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

class GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends LibFunction {
    private String Field17917 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public LuaValue leqS0IyKEB621E1SrHdAcHHAUjScjmKi(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4, LuaValue luaValue5) {
        if (!luaValue.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (!luaValue2.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (!luaValue3.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (luaValue4.isstring()) return CoerceJavaToLua.coerce((Object)new GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt(luaValue.tojstring(), luaValue2.tojstring(), Boolean.valueOf(luaValue4.tojstring()), (OVr6sF5CeH66hsotktp9WWZm4gSQtcre)CoerceLuaToJava.coerce((LuaValue)luaValue5, OVr6sF5CeH66hsotktp9WWZm4gSQtcre.class)));
        throw new IllegalArgumentException("Invalid arguments.");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1119486523L ^ 0x42BA023B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2085519845 ^ (long)2085519642);
            int n2 = ((int)-1164311400L ^ 0xBA9A0495) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)235445771L ^ 0xE0881D4) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

