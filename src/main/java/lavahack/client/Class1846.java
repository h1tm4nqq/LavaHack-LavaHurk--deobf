/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.ThreeArgFunction
 */
package lavahack.client;

import java.awt.Color;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ThreeArgFunction;

class Class1846
extends ThreeArgFunction {
    private int Field16511;

    Class1846() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return Class1846.userdataOf((Object)Color.getHSBColor(luaValue.tofloat(), luaValue2.tofloat(), luaValue3.tofloat()));
    }
}

