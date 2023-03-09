/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.Varargs
 *  org.luaj.vm2.lib.LibFunction
 */
package lavahack.client;

import java.awt.Color;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;
import org.luaj.vm2.lib.LibFunction;

public class Class268
extends LibFunction {
    private int Field9192;

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        return Class268.userdataOf((Object)new Color(luaValue.toint(), luaValue2.toint(), luaValue3.toint(), luaValue4.toint()));
    }

    public Varargs invoke(Varargs varargs) {
        return this.call(varargs.arg1(), varargs.arg(2), varargs.arg(3), varargs.arg(4));
    }
}

