/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.TwoArgFunction
 */
package lavahack.client;

import lavahack.client.OCddToCcDdmbIyAUyRytOC6d7BPPqaEs;
import lavahack.client.bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.TwoArgFunction;

public class QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz
extends TwoArgFunction
implements OCddToCcDdmbIyAUyRytOC6d7BPPqaEs {
    private int Field13725;

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2) {
        return QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz.userdataOf((Object)new bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE(luaValue.todouble(), luaValue2.todouble()));
    }

    @Override
    public String Method856() {
        return "vec2d";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1904736496 ^ (long)-1904736496);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-2095280953 ^ (long)-2095281096);
            int n2 = (int)-855774202L ^ 0xCCFDECD1;
            cArray2[n] = (char)(cArray[n] ^ (((int)-619292227L ^ 0xDB165C5C) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

