//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import java.awt.*;

class Class1846 extends ThreeArgFunction
{
    private int Field16511;
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3) {
        return (LuaValue)userdataOf((Object)Color.getHSBColor(luaValue.tofloat(), luaValue2.tofloat(), luaValue3.tofloat()));
    }
}
