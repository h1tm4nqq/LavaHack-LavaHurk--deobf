/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.ThreeArgFunction
 */
package lavahack.client;

import lavahack.client.OCddToCcDdmbIyAUyRytOC6d7BPPqaEs;
import net.minecraft.util.math.Vec3d;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.ThreeArgFunction;

public class r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT
extends ThreeArgFunction
implements OCddToCcDdmbIyAUyRytOC6d7BPPqaEs {
    private int Field10787;

    public LuaValue call(LuaValue luaValue, LuaValue luaValue2, LuaValue luaValue3) {
        return r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT.userdataOf((Object)new Vec3d(luaValue.todouble(), luaValue2.todouble(), luaValue3.todouble()));
    }

    @Override
    public String Method856() {
        return "vec3d";
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1000883731 ^ (long)1000883731);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1544679946 ^ (long)-1544680183);
            int n2 = (int)((long)-483148607 ^ (long)-483148580) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)256178302 ^ (long)256164205) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

