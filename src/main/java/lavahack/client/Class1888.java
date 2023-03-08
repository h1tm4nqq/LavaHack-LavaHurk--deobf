//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import kotlin.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/gui/KismanGuiScreen;", "Lnet/minecraft/client/gui/GuiScreen;", "()V", "drawScreen", "", "mouseX", "", "mouseY", "partialTicks", "", "drawSelectionBar", "initGui", "keyTyped", "typedChar", "", "keyCode", "mouseClicked", "mouseButton", "kisman.cc" })
public class Class1888 extends GuiScreen
{
    private String Field16703 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void initGui() {
        super.initGui();
        if (Class1796.Field16241.Field16267.Method1979()) {
            Class1796.Field16241.Field16267.Method1975();
        }
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) {
        if (Class1796.Field16241.Field16267.Method1979()) {
            Class1796.Field16241.Field16267.Method1977(n3, n, n2);
        }
        super.mouseClicked(n, n2, n3);
    }
    
    public final void drawSelectionBar(final int n, final int n2) {
        if (Class1796.Field16241.Field16267.Method1979()) {
            Class1796.Field16241.Field16267.Method1976(n, n2);
        }
    }
    
    protected void keyTyped(final char c, final int n) {
        if (Class1796.Field16241.Field16267.Method1979()) {
            Class1796.Field16241.Field16267.Method1978(c, n);
        }
        super.keyTyped(c, n);
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        super.drawScreen(n, n2, n3);
        this.drawSelectionBar(n, n2);
    }
}
