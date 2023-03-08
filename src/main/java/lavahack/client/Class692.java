//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import org.luaj.vm2.*;
import org.luaj.vm2.lib.jse.*;

class Class692 extends GuiScreen
{
    final Class1147 Field10923;
    private String Field10924 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    Class692(final Class1147 field10923) {
        this.Field10923 = field10923;
    }
    
    public void initGui() {
        Class2153.Method7745(Class1147.Method4645(this.Field10923), new LuaValue[0]);
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        Class2153.Method7745(Class1147.Method4646(this.Field10923), new LuaValue[] { CoerceJavaToLua.coerce((Object)new Class870(n, n2)) });
    }
    
    public boolean doesGuiPauseGame() {
        return Class1147.Method4647(this.Field10923);
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        Class2153.Method7745(Class1147.Method4648(this.Field10923), new LuaValue[] { CoerceJavaToLua.coerce((Object)new Class870(n, n2)), (LuaValue)LuaValue.valueOf(n3) });
        super.mouseClicked(n, n2, n3);
    }
    
    public void mouseReleased(final int n, final int n2, final int n3) {
        Class2153.Method7745(Class1147.Method4649(this.Field10923), new LuaValue[] { CoerceJavaToLua.coerce((Object)new Class870(n, n2)), (LuaValue)LuaValue.valueOf(n3) });
        super.mouseReleased(n, n2, n3);
    }
    
    public void keyTyped(final char c, final int n) {
        Class2153.Method7745(Class1147.Method4650(this.Field10923), new LuaValue[] { (LuaValue)LuaValue.valueOf(n), (LuaValue)LuaValue.valueOf((int)c) });
        super.keyTyped(c, n);
    }
}
