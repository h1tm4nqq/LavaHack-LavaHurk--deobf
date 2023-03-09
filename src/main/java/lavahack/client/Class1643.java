/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaTable
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 *  org.luaj.vm2.lib.jse.CoerceLuaToJava
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class139;
import lavahack.client.Class1499;
import lavahack.client.Class1584;
import lavahack.client.Class1846;
import lavahack.client.Class255;
import lavahack.client.Class928;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;
import org.luaj.vm2.lib.jse.CoerceLuaToJava;

public class Class1643 {
    private static LuaValue Field15639;
    private String Field15640 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static LuaValue Method6379() {
        if (Field15639 != null) return Field15639;
        Field15639 = new LuaTable();
        Field15639.set("rgb", (LuaValue)new Class255());
        Field15639.set("rgba", (LuaValue)new Class928());
        Field15639.set("hsv", (LuaValue)new Class1846());
        Field15639.set("pulse", (LuaValue)new Class1584());
        Field15639.set("fade", (LuaValue)new Class1499());
        Field15639.set("rainbow", (LuaValue)new Class139());
        return Field15639;
    }

    public static LuaValue Method6380(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        Color color = (Color)CoerceLuaToJava.coerce((LuaValue)luaValue, Color.class);
        Color color2 = (Color)CoerceLuaToJava.coerce((LuaValue)luaValue2, Color.class);
        return CoerceJavaToLua.coerce((Object)new Color((int)((float)color.getRed() * luaValue3.tofloat() + (float)color2.getRed() * (1.0f - luaValue3.tofloat())), (int)((float)color.getGreen() * luaValue3.tofloat() + (float)color2.getGreen() * (1.0f - luaValue3.tofloat())), (int)((float)color.getBlue() * luaValue3.tofloat() + (float)color2.getBlue() * (1.0f - luaValue3.tofloat())), (int)((float)color.getAlpha() * luaValue3.tofloat() + (float)color2.getAlpha() * (1.0f - luaValue3.tofloat()))));
    }

    private static String Method6381(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 102;
            cArray2[n] = (char)(cArray[n] ^ (0x7367 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

