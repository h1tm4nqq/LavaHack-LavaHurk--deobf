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

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import lavahack.client.EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$1;
import lavahack.client.EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.gui.GuiScreen;
import org.luaj.vm2.LuaClosure;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

public class EJSYf7r1COZvKlg7PH8TWM417l2JJTGY
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
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
    private boolean Field13187 = (int)((long)688512431 ^ (long)688512430);
    private String Field13188 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY(String string) {
        this.Field13177 = string;
    }

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Method4633(LuaClosure luaClosure) {
        this.Field13180 = luaClosure;
        return this;
    }

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Method4634(LuaClosure luaClosure) {
        this.Field13179 = luaClosure;
        return this;
    }

    public void Method4635(boolean bl) {
        this.Field13178 = bl;
    }

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Method4636(boolean bl) {
        this.Field13187 = bl;
        return this;
    }

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Method4637(LuaClosure luaClosure) {
        this.Field13183 = luaClosure;
        return this;
    }

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Method4638(LuaClosure luaClosure) {
        this.Field13184 = luaClosure;
        return this;
    }

    public EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Method4639(LuaClosure luaClosure) {
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
        return new EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$1(this);
    }

    public static LuaValue Method4644() {
        if (Field13176 != null) return Field13176;
        LuaTable luaTable = new LuaTable();
        luaTable.set("new", (LuaValue)new EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$leqS0IyKEB621E1SrHdAcHHAUjScjmKi());
        luaTable.set("__index", (LuaValue)luaTable);
        Field13176 = luaTable;
        return Field13176;
    }

    static LuaClosure Method4645(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        return eJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Field13179;
    }

    static LuaClosure Method4646(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        return eJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Field13180;
    }

    static boolean Method4647(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        return eJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Field13187;
    }

    static LuaClosure Method4648(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        return eJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Field13184;
    }

    static LuaClosure Method4649(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        return eJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Field13185;
    }

    static LuaClosure Method4650(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        return eJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Field13181;
    }

    private static String Method4651(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2107580143 ^ (long)2107580143);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-666441898 ^ (long)-666441815);
            int n2 = (int)840367045L ^ 0x3216FBD8;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1199292644L ^ 0xB8841E63 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

