/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import javax.annotation.Nullable;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaValue;

public class K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    private int Field17849;

    public static void Method7744(@Nullable @Nullable WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, @Nullable @Nullable LuaClosure luaClosure, LuaValue ... luaValueArray) {
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
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7744(null, luaClosure, luaValueArray);
    }

    private static String Method7746(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1174741224L ^ 0xB9FADF18;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1053433915 ^ (long)1053434052);
            int n2 = ((int)-1485641928L ^ 0xA772E70D) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)1883127242L ^ 0x703E3F19 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

