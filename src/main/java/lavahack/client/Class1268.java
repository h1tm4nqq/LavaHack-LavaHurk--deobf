//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;

public class Class1268 extends TwoArgFunction implements Class126
{
    private int Field13725;
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2) {
        return (LuaValue)userdataOf((Object)new Class870(luaValue.todouble(), luaValue2.todouble()));
    }
    
    public String Method856() {
        return "vec2d";
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1784 ^ 0xD7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
