/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.LibFunction
 */
package lavahack.client;

import lavahack.client.Class1643;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;

class Class1584
extends LibFunction {
    private int Field15414;

    Class1584() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        double d = (double)(System.currentTimeMillis() + (long)luaValue4.toint()) % luaValue3.todouble() / luaValue3.todouble();
        if (!(d > Double.longBitsToDouble((long)560102044 ^ 0x3FE0000021627A9CL))) return Class1643.Method6380(luaValue, luaValue2, (LuaValue)LuaValue.valueOf((double)(d * Double.longBitsToDouble((long)440915670 ^ 0x400000001A47D6D6L))));
        return Class1643.Method6380(luaValue2, luaValue, (LuaValue)LuaValue.valueOf((double)((d - Double.longBitsToDouble(4602678819172646912L)) * Double.longBitsToDouble((long)671388221 ^ 0x400000002804923DL))));
    }
}

