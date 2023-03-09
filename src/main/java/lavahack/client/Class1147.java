/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  org.luaj.vm2.LuaClosure
 *  org.luaj.vm2.LuaTable
 *  org.luaj.vm2.LuaValue
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import lavahack.client.Class1855;
import lavahack.client.Class692;
import net.minecraft.client.gui.GuiScreen;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

public class Class1147
implements Class2142 {
    private static LuaValue Field13176;
    private final String Field13177;
    private boolean Field13178;
    private LuaClosure Field13179;
    private LuaClosure Field13180;
    private LuaClosure Field13181;
    private LuaClosure Field13182;
    private LuaClosure Field13183;
    private LuaClosure Field13184;
    private LuaClosure Field13185;
    private LuaClosure Field13186;
    private boolean Field13187 = true;
    private String Field13188 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1147(String string) {
        this.Field13177 = string;
    }

    public Class1147 Method4633(LuaClosure luaClosure) {
        this.Field13180 = luaClosure;
        return this;
    }

    public Class1147 Method4634(LuaClosure luaClosure) {
        this.Field13179 = luaClosure;
        return this;
    }

    public void Method4635(boolean bl) {
        this.Field13178 = bl;
    }

    public Class1147 Method4636(boolean bl) {
        this.Field13187 = bl;
        return this;
    }

    public Class1147 Method4637(LuaClosure luaClosure) {
        this.Field13183 = luaClosure;
        return this;
    }

    public Class1147 Method4638(LuaClosure luaClosure) {
        this.Field13184 = luaClosure;
        return this;
    }

    public Class1147 Method4639(LuaClosure luaClosure) {
        this.Field13185 = luaClosure;
        return this;
    }

    public void Method4640(LuaClosure luaClosure) {
        this.Field13181 = luaClosure;
    }

    public void Method4641(LuaClosure luaClosure) {
        this.Field13182 = luaClosure;
    }

    public void Method4642(LuaClosure luaClosure) {
        this.Field13186 = luaClosure;
    }

    public GuiScreen Method4643() {
        return new Class692(this);
    }

    public static LuaValue Method4644() {
        if (Field13176 != null) return Field13176;
        LuaTable luaTable = new LuaTable();
        luaTable.set("new", (LuaValue)new Class1855());
        luaTable.set("__index", (LuaValue)luaTable);
        Field13176 = luaTable;
        return Field13176;
    }

    static LuaClosure Method4645(Class1147 class1147) {
        return class1147.Field13179;
    }

    static LuaClosure Method4646(Class1147 class1147) {
        return class1147.Field13180;
    }

    static boolean Method4647(Class1147 class1147) {
        return class1147.Field13187;
    }

    static LuaClosure Method4648(Class1147 class1147) {
        return class1147.Field13184;
    }

    static LuaClosure Method4649(Class1147 class1147) {
        return class1147.Field13185;
    }

    static LuaClosure Method4650(Class1147 class1147) {
        return class1147.Field13181;
    }

    private static String Method4651(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 29;
            cArray2[n] = (char)(cArray[n] ^ (0x217F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

