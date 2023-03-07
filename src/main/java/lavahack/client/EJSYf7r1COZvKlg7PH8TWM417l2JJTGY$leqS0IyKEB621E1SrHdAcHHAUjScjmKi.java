/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.OneArgFunction
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import lavahack.client.EJSYf7r1COZvKlg7PH8TWM417l2JJTGY;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.OneArgFunction;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends OneArgFunction {
    private int Field16544;

    public LuaValue call(LuaValue luaValue) {
        if (!luaValue.isstring()) {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY = new EJSYf7r1COZvKlg7PH8TWM417l2JJTGY(luaValue.toString());
        return CoerceJavaToLua.coerce((Object)eJSYf7r1COZvKlg7PH8TWM417l2JJTGY);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1524532926 ^ (long)-1524532926);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1842380267 ^ (long)1842380052);
            int n2 = (int)((long)-1514017377 ^ (long)-1514017380) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-382876043L ^ 0xE92D9DEC ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

