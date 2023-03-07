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

import lavahack.client.IqjHyBio3p7KLnDEo6TGyuKf2errkonL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY;
import lavahack.client.OVr6sF5CeH66hsotktp9WWZm4gSQtcre;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

public class IqjHyBio3p7KLnDEo6TGyuKf2errkonL
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final OVr6sF5CeH66hsotktp9WWZm4gSQtcre Field15868;
    private static LuaValue Field15869;
    private LuaClosure Field15870;
    private LuaClosure Field15871;
    private String Field15872 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public IqjHyBio3p7KLnDEo6TGyuKf2errkonL(String string, String string2, qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P2, OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre) {
        super(string, string2, qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P2);
        this.Field15868 = oVr6sF5CeH66hsotktp9WWZm4gSQtcre;
        this.Field8063 = (int)1214814579L ^ 0x48689973;
    }

    public IqjHyBio3p7KLnDEo6TGyuKf2errkonL(String string, String string2, String string3, OVr6sF5CeH66hsotktp9WWZm4gSQtcre oVr6sF5CeH66hsotktp9WWZm4gSQtcre) {
        super(string, string2, qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.valueOf(string3));
        this.Field15868 = oVr6sF5CeH66hsotktp9WWZm4gSQtcre;
        this.Field8063 = (int)((long)377112715 ^ (long)377112715);
    }

    public OVr6sF5CeH66hsotktp9WWZm4gSQtcre Method6511() {
        return this.Field15868;
    }

    public void Method6512(LuaClosure luaClosure) {
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7744(this.Field15868, luaClosure, new LuaValue[(int)-2058024470L ^ 0x855509EA]);
        this.Method20();
    }

    public gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh Method6513(String string, LuaClosure luaClosure) {
        gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2 = new gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh(string, luaClosure, this);
        this.Field15868.Field12882.add(gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2);
        return gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2;
    }

    public void Method6514(String string, LuaValue luaValue) {
        if (this.Field15868.Field12882 == null) {
            return;
        }
        this.Field15868.Field12882.stream().filter(arg_0 -> IqjHyBio3p7KLnDEo6TGyuKf2errkonL.Method6519(string, arg_0)).forEach(arg_0 -> IqjHyBio3p7KLnDEo6TGyuKf2errkonL.Method6518(luaValue, arg_0));
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
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(this.Field15870, new LuaValue[(int)((long)-1303984088 ^ (long)-1303984088)]);
    }

    @Override
    public void Method39() {
        if (!this.Field15868.Method35()) {
            return;
        }
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(this.Field15871, new LuaValue[(int)-1133587682L ^ 0xBC6ED31E]);
    }

    public static LuaValue Method6517() {
        if (Field15869 != null) return Field15869;
        LuaValue luaValue = CoerceJavaToLua.coerce(IqjHyBio3p7KLnDEo6TGyuKf2errkonL.class);
        LuaTable luaTable = new LuaTable();
        luaTable.set("new", (LuaValue)new IqjHyBio3p7KLnDEo6TGyuKf2errkonL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        luaTable.set("__index", (LuaValue)luaTable);
        luaValue.setmetatable((LuaValue)luaTable);
        Field15869 = luaValue;
        return Field15869;
    }

    @Override
    public String toString() {
        return "ModuleLua{script=" + this.Field15868 + "} " + super.toString();
    }

    private static void Method6518(LuaValue luaValue, gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2) {
        gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2.Method1110(luaValue);
    }

    private static boolean Method6519(String string, gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2) {
        return gIFsdWpKZu6ObcMoOi8w5RePDDW3Dfuh2.Field8798.equalsIgnoreCase(string);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1965645139L ^ 0x8AD6A2AD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)290680134 ^ (long)290680249);
            int n2 = (int)((long)1893668821 ^ (long)1893668848) << 2;
            cArray2[n] = (char)(cArray[n] ^ (((int)950192300L ^ 0x38A2CEAF) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

