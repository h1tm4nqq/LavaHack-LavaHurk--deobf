//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiScreen
 *  org.luaj.vm2.LuaValue
 *  org.luaj.vm2.lib.jse.CoerceJavaToLua
 */
package lavahack.client;

import lavahack.client.EJSYf7r1COZvKlg7PH8TWM417l2JJTGY;
import lavahack.client.K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY;
import lavahack.client.bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE;
import net.minecraft.client.gui.GuiScreen;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

class EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$1
extends GuiScreen {
    final EJSYf7r1COZvKlg7PH8TWM417l2JJTGY Field10923;
    private String Field10924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    EJSYf7r1COZvKlg7PH8TWM417l2JJTGY$1(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY eJSYf7r1COZvKlg7PH8TWM417l2JJTGY) {
        this.Field10923 = eJSYf7r1COZvKlg7PH8TWM417l2JJTGY;
    }

    public void initGui() {
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4645(this.Field10923), new LuaValue[(int)-1598383065L ^ 0xA0BA9C27]);
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        LuaValue[] luaValueArray = new LuaValue[(int)995188109L ^ 0x3B515D8C];
        luaValueArray[(int)((long)-368795260 ^ (long)-368795260)] = CoerceJavaToLua.coerce((Object)new bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE(n, n2));
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4646(this.Field10923), luaValueArray);
    }

    public boolean doesGuiPauseGame() {
        return EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4647(this.Field10923);
    }

    public void mouseClicked(int n, int n2, int n3) {
        LuaValue[] luaValueArray = new LuaValue[(int)((long)-22944693 ^ (long)-22944694) << 1];
        luaValueArray[(int)((long)958083046 ^ (long)958083046)] = CoerceJavaToLua.coerce((Object)new bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE(n, n2));
        luaValueArray[(int)((long)-2086135457 ^ (long)-2086135458)] = LuaValue.valueOf((int)n3);
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4648(this.Field10923), luaValueArray);
        super.mouseClicked(n, n2, n3);
    }

    public void mouseReleased(int n, int n2, int n3) {
        LuaValue[] luaValueArray = new LuaValue[(int)((long)1218907045 ^ (long)1218907044) << 1];
        luaValueArray[(int)((long)987420558 ^ (long)987420558)] = CoerceJavaToLua.coerce((Object)new bNzPAby7ejbT9nCckVXJRyiVLV4qRBhE(n, n2));
        luaValueArray[(int)-1737749703L ^ 0x986C0B38] = LuaValue.valueOf((int)n3);
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4649(this.Field10923), luaValueArray);
        super.mouseReleased(n, n2, n3);
    }

    public void keyTyped(char c, int n) {
        LuaValue[] luaValueArray = new LuaValue[(int)((long)-1756415263 ^ (long)-1756415264) << 1];
        luaValueArray[(int)((long)2076316235 ^ (long)2076316235)] = LuaValue.valueOf((int)n);
        luaValueArray[(int)((long)-2058030548 ^ (long)-2058030547)] = LuaValue.valueOf((int)c);
        K9PkOnMGfpo751nxsj7CzHjKWnjAgUcY.Method7745(EJSYf7r1COZvKlg7PH8TWM417l2JJTGY.Method4650(this.Field10923), luaValueArray);
        super.keyTyped(c, n);
    }
}

