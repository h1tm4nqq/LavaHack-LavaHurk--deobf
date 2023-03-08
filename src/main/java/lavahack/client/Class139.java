//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import java.awt.*;

class Class139 extends LibFunction
{
    private String Field8527 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4) {
        final Color hsbColor = Color.getHSBColor((float)(Math.ceil((System.currentTimeMillis() + luaValue.toint()) / Double.longBitsToDouble(4626322717216342016L)) % Double.longBitsToDouble(4645040803167600640L) / Double.longBitsToDouble(4645040803167600640L)), luaValue2.tofloat(), luaValue3.tofloat());
        return (LuaValue)userdataOf((Object)new Color(hsbColor.getRed(), hsbColor.getGreen(), hsbColor.getBlue(), luaValue4.toint()));
    }
}
