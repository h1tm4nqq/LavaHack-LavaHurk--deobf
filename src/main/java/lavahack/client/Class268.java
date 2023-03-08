//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import java.awt.*;
import org.luaj.vm2.*;

public class Class268 extends LibFunction
{
    private int Field9192;
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4) {
        return (LuaValue)userdataOf((Object)new Color(luaValue.toint(), luaValue2.toint(), luaValue3.toint(), luaValue4.toint()));
    }
    
    public Varargs invoke(final Varargs varargs) {
        return (Varargs)this.call(varargs.arg1(), varargs.arg(2), varargs.arg(3), varargs.arg(4));
    }
}
