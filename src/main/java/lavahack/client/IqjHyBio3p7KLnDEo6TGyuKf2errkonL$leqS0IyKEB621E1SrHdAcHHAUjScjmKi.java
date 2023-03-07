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

import lavahack.client.IqjHyBio3p7KLnDEo6TGyuKf2errkonL;
import lavahack.client.OVr6sF5CeH66hsotktp9WWZm4gSQtcre;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

class IqjHyBio3p7KLnDEo6TGyuKf2errkonL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends LibFunction {
    private String Field10608 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    IqjHyBio3p7KLnDEo6TGyuKf2errkonL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        if (!luaValue.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (!luaValue2.isstring()) throw new IllegalArgumentException("Invalid arguments.");
        if (luaValue3.isstring()) return CoerceJavaToLua.coerce((Object)new IqjHyBio3p7KLnDEo6TGyuKf2errkonL(luaValue.tojstring(), luaValue2.tojstring(), qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.valueOf(luaValue3.tojstring()), (OVr6sF5CeH66hsotktp9WWZm4gSQtcre)CoerceLuaToJava.coerce((LuaValue)luaValue4, OVr6sF5CeH66hsotktp9WWZm4gSQtcre.class)));
        throw new IllegalArgumentException("Invalid arguments.");
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1383753253 ^ (long)-1383753253);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1015382268 ^ (long)1015382019);
            int n2 = (int)((long)1089628835 ^ (long)1089628812);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1811999032 ^ (long)1811989047) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

