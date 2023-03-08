//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;

class Class1584 extends LibFunction
{
    private int Field15414;
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4) {
        final double n = (System.currentTimeMillis() + luaValue4.toint()) % luaValue3.todouble() / luaValue3.todouble();
        if (n > Double.longBitsToDouble((long)560102044 ^ 0x3FE0000021627A9CL)) {
            return Class1643.Method6380(luaValue2, luaValue, (LuaValue)LuaValue.valueOf((n - Double.longBitsToDouble(4602678819172646912L)) * Double.longBitsToDouble((long)671388221 ^ 0x400000002804923DL)));
        }
        return Class1643.Method6380(luaValue, luaValue2, (LuaValue)LuaValue.valueOf(n * Double.longBitsToDouble((long)440915670 ^ 0x400000001A47D6D6L)));
    }
}
