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

class Class139
extends LibFunction {
    private String Field8527 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class139() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)luaValue.toint()) / Double.longBitsToDouble(0x4034000000000000L));
        Color color = Color.getHSBColor((float)((d %= Double.longBitsToDouble(4645040803167600640L)) / Double.longBitsToDouble(4645040803167600640L)), luaValue2.tofloat(), luaValue3.tofloat());
        return Class139.userdataOf((Object)new Color(color.getRed(), color.getGreen(), color.getBlue(), luaValue4.toint()));
    }
}

