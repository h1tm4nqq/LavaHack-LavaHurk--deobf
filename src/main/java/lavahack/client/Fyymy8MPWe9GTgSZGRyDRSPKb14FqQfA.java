/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.OneArgFunction
 */
package lavahack.client;

import lavahack.client.OCddToCcDdmbIyAUyRytOC6d7BPPqaEs;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;

public class Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA
extends OneArgFunction
implements OCddToCcDdmbIyAUyRytOC6d7BPPqaEs {
    private int Field12290;

    public LuaValue call(LuaValue luaValue) {
        return Fyymy8MPWe9GTgSZGRyDRSPKb14FqQfA.userdataOf((Object)luaValue.tojstring());
    }

    @Override
    public String Method856() {
        return "textOf";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1203901602L ^ 0x47C214A2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1774912154 ^ (long)1774912101);
            int n2 = ((int)-649519102L ^ 0xD949202D) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)320394899L ^ 0x1318DA66 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

