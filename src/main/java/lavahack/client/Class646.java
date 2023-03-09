/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.ThreeArgFunction
 */
package lavahack.client;

import lavahack.client.Class126;
import net.minecraft.util.math.Vec3d;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ThreeArgFunction;

public class Class646
extends ThreeArgFunction
implements Class126 {
    private int Field10787;

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return Class646.userdataOf((Object)new Vec3d(luaValue.todouble(), luaValue2.todouble(), luaValue3.todouble()));
    }

    @Override
    public String Method856() {
        return "vec3d";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 58;
            cArray2[n] = (char)(cArray[n] ^ (0x7226 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

