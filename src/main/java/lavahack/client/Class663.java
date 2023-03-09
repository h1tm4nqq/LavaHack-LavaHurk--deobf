/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.LibFunction
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import lavahack.client.Class1172;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.LibFunction;

class Class663
extends LibFunction {
    private String Field10818 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class663() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        return Class663.userdataOf((Object)new Class2027(Class1172.Method4709(100, 100)).Method3615(luaValue2.tofloat()).Method3611(luaValue3.tofloat()).Method3613(luaValue4.toint()).Method3625());
    }
}

