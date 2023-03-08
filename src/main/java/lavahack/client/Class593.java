//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import java.util.*;
import java.io.*;

public class Class593 extends GuiScreen
{
    protected final GuiScreen Field10527;
    protected List Field10528;
    private String Field10529 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class593() {
        this(null);
    }
    
    public Class593(final GuiScreen field10527) {
        this.Field10528 = new ArrayList();
        this.Field10527 = field10527;
    }
    
    public void initGui() {
        this.buttonList.clear();
        this.Field10528.clear();
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) throws IOException {
        for (final GuiButton guiButton : this.buttonList) {
            if (guiButton instanceof Class1093) {
                ((Class1093)guiButton).mouseClicked(n, n2, n3);
            }
        }
        final Iterator<GuiTextField> iterator2 = this.Field10528.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().mouseClicked(n, n2, n3);
        }
        super.mouseClicked(n, n2, n3);
    }
    
    protected void keyTyped(final char c, final int n) throws IOException {
        if (n == 1) {
            this.mc.displayGuiScreen(this.Field10527);
            return;
        }
        for (final GuiButton guiButton : this.buttonList) {
            if (guiButton instanceof Class1093) {
                final Class1093 class1093 = (Class1093)guiButton;
                class1093.keyTyped(c, n);
                if (!class1093.isFocused()) {
                    continue;
                }
                this.actionPerformed((GuiButton)class1093);
            }
        }
        final Iterator<GuiTextField> iterator2 = this.Field10528.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().textboxKeyTyped(c, n);
        }
        super.keyTyped(c, n);
    }
    
    public void updateScreen() {
        super.updateScreen();
        for (final GuiButton guiButton : this.buttonList) {
            if (guiButton instanceof Class1093) {
                ((Class1093)guiButton).updateCursorCounter();
            }
        }
        final Iterator<GuiTextField> iterator2 = this.Field10528.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().updateCursorCounter();
        }
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        super.drawScreen(n, n2, n3);
        final Iterator<GuiTextField> iterator = this.Field10528.iterator();
        while (iterator.hasNext()) {
            iterator.next().drawTextBox();
        }
    }
}
