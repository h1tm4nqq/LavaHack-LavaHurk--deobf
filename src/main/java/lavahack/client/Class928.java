//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import java.awt.*;

class Class928 extends LibFunction
{
    private int Field11934;
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4) {
        return (LuaValue)userdataOf((Object)new Color(luaValue.toint(), luaValue2.toint(), luaValue3.toint(), luaValue4.toint()));
    }
}
