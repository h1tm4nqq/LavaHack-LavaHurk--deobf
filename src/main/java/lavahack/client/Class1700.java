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
import lavahack.client.Class183;
import lavahack.client.Class2153;
import lavahack.client.Class42;
import lavahack.client.Class612;
import lavahack.client.Class97;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class Class1700
extends Class42 {
    private final Class1089 Field15868;
    private static LuaValue Field15869;
    private LuaClosure Field15870;
    private LuaClosure Field15871;
    private String Field15872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1700(String string, String string2, Class97 class97, Class1089 class1089) {
        super(string, string2, class97);
        this.Field15868 = class1089;
        this.Field8063 = false;
    }

    public Class1700(String string, String string2, String string3, Class1089 class1089) {
        super(string, string2, Class97.valueOf(string3));
        this.Field15868 = class1089;
        this.Field8063 = false;
    }

    public Class1089 Method6511() {
        return this.Field15868;
    }

    public void Method6512(LuaClosure luaClosure) {
        Class2153.Method7744(this.Field15868, luaClosure, new LuaValue[0]);
        this.Method20();
    }

    public Class183 Method6513(String string, LuaClosure luaClosure) {
        Class183 class183 = new Class183(string, luaClosure, this);
        this.Field15868.Field12882.add(class183);
        return class183;
    }

    public void Method6514(String string, LuaValue luaValue) {
        if (this.Field15868.Field12882 == null) {
            return;
        }
        this.Field15868.Field12882.stream().filter(arg_0 -> Class1700.Method6519(string, arg_0)).forEach(arg_0 -> Class1700.Method6518(luaValue, arg_0));
    }

    public void Method20() {
        this.Field15868.Method4459(this);
    }

    public void Method6515(LuaClosure luaClosure) {
        this.Field15870 = luaClosure;
    }

    public void Method6516(LuaClosure luaClosure) {
        this.Field15871 = luaClosure;
    }

    @Override
    public void Method38() {
        if (!this.Field15868.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field15870, new LuaValue[0]);
    }

    @Override
    public void Method39() {
        if (!this.Field15868.Method35()) {
            return;
        }
        Class2153.Method7745(this.Field15871, new LuaValue[0]);
    }

    public static LuaValue Method6517() {
        if (Field15869 != null) return Field15869;
        LuaValue luaValue = CoerceJavaToLua.coerce(Class1700.class);
        LuaTable luaTable = new LuaTable();
        luaTable.set("new", (LuaValue)new Class612());
        luaTable.set("__index", (LuaValue)luaTable);
        luaValue.setmetatable((LuaValue)luaTable);
        Field15869 = luaValue;
        return Field15869;
    }

    @Override
    public String toString() {
        return "ModuleLua{script=" + this.Field15868 + "} " + super.toString();
    }

    private static void Method6518(LuaValue luaValue, Class183 class183) {
        class183.Method1110(luaValue);
    }

    private static boolean Method6519(String string, Class183 class183) {
        return class183.Field8798.equalsIgnoreCase(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 148;
            cArray2[n] = (char)(cArray[n] ^ (0xC06 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

