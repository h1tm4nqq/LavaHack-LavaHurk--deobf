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

class Class255
extends ThreeArgFunction {
    private int Field9130;

    Class255() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return Class255.userdataOf((Object)new Color(luaValue.toint(), luaValue2.toint(), luaValue3.toint()));
    }
}

