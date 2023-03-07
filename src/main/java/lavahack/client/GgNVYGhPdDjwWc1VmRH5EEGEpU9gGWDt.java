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

import lavahack.client.GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY;
import lavahack.client.OVr6sF5CeH66hsotktp9WWZm4gSQtcre;
import lavahack.client.bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE;
import lavahack.client.gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh;
import lavahack.client.qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt
extends qAXijXKl4wnUSkJoQN8cwM9BnIYGBWt2 {
    private final OVr6sF5CeH66hsotktp9WWZm4gSQtcre Field11264;
    private static LuaValue Field11265;
    private LuaClosure Field11266;
    private LuaClosure Field11267;
    private int Field11268;

    public GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt(String string, String string2, boolean bl, OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre) {
        super(string, string2, bl);
        this.Field11264 = oVr6sF5CeH66hsotktp9WWZm4gSQtcre;
    }

    public OVr6sF5CeH66hsotktp9WWZm4gSQtcre Method3206() {
        return this.Field11264;
    }

    public void Method3207(LuaClosure luaClosure) {
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7744(this.Field11264, luaClosure, new LuaValue[(int)1720873377L ^ 0x669271A1]);
        this.Method20();
    }

    public gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh Method3208(String string, LuaClosure luaClosure) {
        gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2 = new gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh(string, luaClosure, this);
        this.Field11264.Field12882.add(gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2);
        return gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2;
    }

    public void Method3209(String string, LuaValue luaValue) {
        if (this.Field11264.Field12882 == null) {
            return;
        }
        this.Field11264.Field12882.stream().filter(arg_0 -> GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt.Method3217(string, arg_0)).forEach(arg_0 -> GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt.Method3216(luaValue, arg_0));
    }

    public void Method20() {
        this.Field11264.Method4460(this);
    }

    public void Method3210(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2) {
        this.Method271(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662);
        this.Method272(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663);
    }

    public void Method3211(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2) {
        this.Method273(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11662);
        this.Method274(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2.Field11663);
    }

    public void Method3212(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2, bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3) {
        this.Method3210(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE2);
        this.Method3211(bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE3);
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
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(this.Field11266, new LuaValue[(int)((long)-1255981962 ^ (long)-1255981962)]);
    }

    @Override
    public void Method39() {
        if (!this.Field11264.Method35()) {
            return;
        }
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(this.Field11267, new LuaValue[(int)-463725019L ^ 0xE45C1E25]);
    }

    public static LuaValue Method3215() {
        if (Field11265 != null) return Field11265;
        LuaValue luaValue = CoerceJavaToLua.coerce(GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt.class);
        LuaTable luaTable = new LuaTable();
        luaTable.set("new", (LuaValue)new GgNVYGhPdDjwWc1VmRH5EEGEpU9gGWDt$leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        luaTable.set("__index", (LuaValue)luaTable);
        luaValue.setmetatable((LuaValue)luaTable);
        Field11265 = luaValue;
        return Field11265;
    }

    @Override
    public String toString() {
        return "HudModuleLua{script=" + this.Field11264 + "} " + super.toString();
    }

    private static void Method3216(LuaValue luaValue, gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2) {
        gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2.Method1110(luaValue);
    }

    private static boolean Method3217(String string, gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2) {
        return gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2.Field8798.equalsIgnoreCase(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1713100169 ^ (long)1713100169);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)269360745L ^ 0x100E1E96);
            int n2 = (int)((long)1110794622 ^ (long)1110794731);
            cArray2[n] = (char)(cArray[n] ^ (((int)1695351989L ^ 0x650D05E8) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

