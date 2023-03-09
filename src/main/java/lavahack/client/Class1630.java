/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.ZeroArgFunction
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import lavahack.client.Class442;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ZeroArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class1630
extends ZeroArgFunction {
    private int Field15617;

    public LuaValue call() {
        return CoerceJavaToLua.coerce((Object)new Class442());
    }
}

