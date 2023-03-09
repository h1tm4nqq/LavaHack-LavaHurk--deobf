/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import javax.annotation.Nullable;
import lavahack.client.Class42;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaValue;

public class Class2153
implements Class2142 {
    private int Field17849;

    public static void Method7744(@Nullable @Nullable Class42 class42, @Nullable @Nullable LuaClosure luaClosure, LuaValue ... luaValueArray) {
        if (luaClosure == null) {
            return;
        }
        if (luaValueArray == null) {
            luaClosure.invoke();
            return;
        }
        luaClosure.invoke(luaValueArray);
    }

    public static void Method7745(LuaClosure luaClosure, LuaValue ... luaValueArray) {
        Class2153.Method7744(null, luaClosure, luaValueArray);
    }

    private static String Method7746(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 212;
            cArray2[n] = (char)(cArray[n] ^ (0x2D3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

