/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import lavahack.client.Class2153;
import lavahack.client.Class42;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaValue;

public class Class183 {
    public String Field8798;
    public LuaClosure Field8799;
    public Class42 Field8800;
    private String Field8801 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class183(String string, LuaClosure luaClosure, Class42 class42) {
        this.Field8798 = string;
        this.Field8799 = luaClosure;
        this.Field8800 = class42;
    }

    public void Method1110(LuaValue luaValue) {
        if (!this.Field8800.Method35()) return;
        Class2153.Method7744(this.Field8800, this.Field8799, luaValue);
    }
}

