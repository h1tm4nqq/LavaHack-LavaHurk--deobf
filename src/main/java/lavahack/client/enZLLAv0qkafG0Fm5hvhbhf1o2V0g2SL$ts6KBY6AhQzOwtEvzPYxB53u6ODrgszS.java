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

class enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
extends LibFunction {
    private String Field8527 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS() {
    }

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3, LuaValue luaValue4) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)luaValue.toint()) / Double.longBitsToDouble(0xF371CAAD36CFC4A8L ^ 0xB345CAAD36CFC4A8L));
        Color color = Color.getHSBColor((float)((d %= Double.longBitsToDouble(0xCD108DFCD4F799CAL ^ 0x8D660DFCD4F799CAL)) / Double.longBitsToDouble(0x9C59867D81338647L ^ 0xDC2F067D81338647L)), luaValue2.tofloat(), luaValue3.tofloat());
        return enZLLAv0qkafG0Fm5hvhbhf1o2V0g2SL$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.userdataOf((Object)new Color(color.getRed(), color.getGreen(), color.getBlue(), luaValue4.toint()));
    }
}

