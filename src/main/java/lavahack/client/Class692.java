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

import lavahack.client.Class1147;
import lavahack.client.Class2153;
import lavahack.client.Class870;
import net.minecraft.client.gui.GuiScreen;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.CoerceJavaToLua;

class Class692
extends GuiScreen {
    final Class1147 Field10923;
    private String Field10924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    Class692(Class1147 class1147) {
        this.Field10923 = class1147;
    }

    public void initGui() {
        Class2153.Method7745(Class1147.Method4645(this.Field10923), new LuaValue[0]);
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        Class2153.Method7745(Class1147.Method4646(this.Field10923), CoerceJavaToLua.coerce((Object)new Class870(n, n2)));
    }

    public boolean doesGuiPauseGame() {
        return Class1147.Method4647(this.Field10923);
    }

    public void mouseClicked(int n, int n2, int n3) {
        Class2153.Method7745(Class1147.Method4648(this.Field10923), new LuaValue[]{CoerceJavaToLua.coerce((Object)new Class870(n, n2)), LuaValue.valueOf((int)n3)});
        super.mouseClicked(n, n2, n3);
    }

    public void mouseReleased(int n, int n2, int n3) {
        Class2153.Method7745(Class1147.Method4649(this.Field10923), new LuaValue[]{CoerceJavaToLua.coerce((Object)new Class870(n, n2)), LuaValue.valueOf((int)n3)});
        super.mouseReleased(n, n2, n3);
    }

    public void keyTyped(char c, int n) {
        Class2153.Method7745(Class1147.Method4650(this.Field10923), new LuaValue[]{LuaValue.valueOf((int)n), LuaValue.valueOf((int)c)});
        super.keyTyped(c, n);
    }
}

