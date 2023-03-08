//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.*;
import java.awt.*;
import org.luaj.vm2.lib.jse.*;

public class Class1643
{
    private static LuaValue Field15639;
    private String Field15640 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static LuaValue Method6379() {
        if (Class1643.Field15639 == null) {
            (Class1643.Field15639 = (LuaValue)new LuaTable()).set("rgb", (LuaValue)new Class255());
            Class1643.Field15639.set("rgba", (LuaValue)new Class928());
            Class1643.Field15639.set("hsv", (LuaValue)new Class1846());
            Class1643.Field15639.set("pulse", (LuaValue)new Class1584());
            Class1643.Field15639.set("fade", (LuaValue)new Class1499());
            Class1643.Field15639.set("rainbow", (LuaValue)new Class139());
        }
        return Class1643.Field15639;
    }
    
    public static LuaValue Method6380(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3) {
        final Color color = (Color)CoerceLuaToJava.coerce(luaValue, (Class)Color.class);
        final Color color2 = (Color)CoerceLuaToJava.coerce(luaValue2, (Class)Color.class);
        return CoerceJavaToLua.coerce((Object)new Color((int)(color.getRed() * luaValue3.tofloat() + color2.getRed() * (1.0f - luaValue3.tofloat())), (int)(color.getGreen() * luaValue3.tofloat() + color2.getGreen() * (1.0f - luaValue3.tofloat())), (int)(color.getBlue() * luaValue3.tofloat() + color2.getBlue() * (1.0f - luaValue3.tofloat())), (int)(color.getAlpha() * luaValue3.tofloat() + color2.getAlpha() * (1.0f - luaValue3.tofloat()))));
    }
    
    private static String Method6381(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7367 ^ 0x66));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
