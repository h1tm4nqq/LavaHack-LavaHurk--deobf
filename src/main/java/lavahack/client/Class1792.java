//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;

public class Class1792 extends LibFunction implements Class126
{
    private String Field16223 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public LuaValue leqS0IyKEB621E1SrHdAcHHAUjScjmKi(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3, final LuaValue luaValue4, final LuaValue luaValue5, final LuaValue luaValue6) {
        return (LuaValue)userdataOf((Object)new Class1779(luaValue.todouble(), luaValue2.todouble(), luaValue3.todouble(), luaValue4.todouble(), luaValue5.todouble(), luaValue6.todouble()));
    }
    
    public String Method856() {
        return "box";
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4542 ^ 0xB7));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
