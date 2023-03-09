/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.OneArgFunction
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import lavahack.client.Class44;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public final class Class1115
extends OneArgFunction {
    private String Field13020 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public LuaValue call(LuaValue luaValue) {
        return CoerceJavaToLua.coerce((Object)new Class44(luaValue.tojstring()));
    }
}

