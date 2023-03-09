/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.LibFunction
 */
package lavahack.client;

import java.awt.Color;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;

class Class928
extends LibFunction {
    private int Field11934;

    Class928() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        return Class928.userdataOf((Object)new Color(luaValue.toint(), luaValue2.toint(), luaValue3.toint(), luaValue4.toint()));
    }
}

