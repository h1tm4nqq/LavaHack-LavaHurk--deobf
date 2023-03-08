//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;

public final class Class1115 extends OneArgFunction
{
    private String Field13020 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public LuaValue call(final LuaValue luaValue) {
        return CoerceJavaToLua.coerce((Object)new Class44(luaValue.tojstring()));
    }
}
