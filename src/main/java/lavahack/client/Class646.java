//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.luaj.vm2.lib.*;
import org.luaj.vm2.*;
import net.minecraft.util.math.*;

public class Class646 extends ThreeArgFunction implements Class126
{
    private int Field10787;
    
    public LuaValue call(final LuaValue luaValue, final LuaValue luaValue2, final LuaValue luaValue3) {
        return (LuaValue)userdataOf((Object)new Vec3d(luaValue.todouble(), luaValue2.todouble(), luaValue3.todouble()));
    }
    
    public String Method856() {
        return "vec3d";
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7226 ^ 0x3A));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
