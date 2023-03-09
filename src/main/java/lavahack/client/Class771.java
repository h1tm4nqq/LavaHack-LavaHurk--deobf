/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaTable
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import lavahack.client.Class1089;
import lavahack.client.Class1249;
import lavahack.client.Class183;
import lavahack.client.Class2153;
import lavahack.client.Class2169;
import lavahack.client.Class870;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class771
extends Class1249 {
    private final Class1089 Field11264;
    private static LuaValue Field11265;
    private LuaClosure Field11266;
    private LuaClosure Field11267;
    private int Field11268;

    public Class771(String string, String string2, boolean bl, Class1089 class1089) {
        super(string, string2, bl);
        this.Field11264 = class1089;
    }

    public Class1089 Method3206() {
        return this.Field11264;
    }

    public void Method3207(LuaClosure luaClosure) {
        Class2153.Method7744(this.Field11264, luaClosure, new LuaValue[0]);
        this.Method20();
    }

    public Class183 Method3208(String string, LuaClosure luaClosure) {
        Class183 class183 = new Class183(string, luaClosure, this);
        this.Field11264.Field12882.add(class183);
        return class183;
    }

    public void Method3209(String string, LuaValue luaValue) {
        if (this.Field11264.Field12882 == null) {
            return;
        }
        this.Field11264.Field12882.stream().filter(arg_0 -> Class771.Method3217(string, arg_0)).forEach(arg_0 -> Class771.Method3216(luaValue, arg_0));
    }

    public void Method20() {
        this.Field11264.Method4460(this);
    }

    public void Method3210(Class870 class870) {
        this.Method271(class870.Field11662);
        this.Method272(class870.Field11663);
    }

    public void Method3211(Class870 class870) {
        this.Method273(class870.Field11662);
        this.Method274(class870.Field11663);
    }

    public void Method3212(Class870 class870, Class870 class8702) {
        this.Method3210(class870);
        this.Method3211(class8702);
    }

    public void Method3213(LuaClosure luaClosure) {
        this.Field11266 = luaClosure;
    }

    public void Method3214(LuaClosure luaClosure) {
        this.Field11267 = luaClosure;
    }

    @Override
    public void Method38() {
        if (!this.Field11264.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field11266, new LuaValue[0]);
    }

    @Override
    public void Method39() {
        if (!this.Field11264.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field11267, new LuaValue[0]);
    }

    public static LuaValue Method3215() {
        if (Field11265 != null) return Field11265;
        LuaValue luaValue = CoerceJavaToLua.coerce(Class771.class);
        LuaTable luaTable = new LuaTable();
        luaTable.set("new", (LuaValue)new Class2169());
        luaTable.set("__index", (LuaValue)luaTable);
        luaValue.setmetatable((LuaValue)luaTable);
        Field11265 = luaValue;
        return Field11265;
    }

    @Override
    public String toString() {
        return "HudModuleLua{script=" + this.Field11264 + "} " + super.toString();
    }

    private static void Method3216(LuaValue luaValue, Class183 class183) {
        class183.Method1110(luaValue);
    }

    private static boolean Method3217(String string, Class183 class183) {
        return class183.Field8798.equalsIgnoreCase(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 149;
            cArray2[n] = (char)(cArray[n] ^ (0x574 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

