//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 */
package lavahack.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lavahack.client.Class1093;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class Class593
extends GuiScreen {
    protected final GuiScreen Field10527;
    protected List Field10528 = new ArrayList();
    private String Field10529 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class593() {
        this(null);
    }

    public Class593(GuiScreen guiScreen) {
        this.Field10527 = guiScreen;
    }

    public void initGui() {
        this.buttonList.clear();
        this.Field10528.clear();
    }

    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        for (GuiButton guiButton : this.buttonList) {
            if (!(guiButton instanceof Class1093)) continue;
            Class1093 class1093 = (Class1093)guiButton;
            class1093.mouseClicked(n, n2, n3);
        }
        Iterator iterator = this.Field10528.iterator();
        while (true) {
            GuiButton guiButton;
            if (!iterator.hasNext()) {
                super.mouseClicked(n, n2, n3);
                return;
            }
            guiButton = (GuiTextField)iterator.next();
            guiButton.mouseClicked(n, n2, n3);
        }
    }

    protected void keyTyped(char c, int n) throws IOException {
        if (n == 1) {
            this.mc.displayGuiScreen(this.Field10527);
            return;
        }
        for (GuiButton guiButton : this.buttonList) {
            if (!(guiButton instanceof Class1093)) continue;
            Class1093 class1093 = (Class1093)guiButton;
            class1093.keyTyped(c, n);
            if (!class1093.isFocused()) continue;
            this.actionPerformed(class1093);
        }
        Iterator iterator = this.Field10528.iterator();
        while (true) {
            GuiButton guiButton;
            if (!iterator.hasNext()) {
                super.keyTyped(c, n);
                return;
            }
            guiButton = (GuiTextField)iterator.next();
            guiButton.textboxKeyTyped(c, n);
        }
    }

    public void updateScreen() {
        super.updateScreen();
        for (GuiButton guiButton : this.buttonList) {
            if (!(guiButton instanceof Class1093)) continue;
            Class1093 class1093 = (Class1093)guiButton;
            class1093.updateCursorCounter();
        }
        Iterator iterator = this.Field10528.iterator();
        while (iterator.hasNext()) {
            GuiButton guiButton;
            guiButton = (GuiTextField)iterator.next();
            guiButton.updateCursorCounter();
        }
    }

    public void drawScreen(int n, int n2, float f) {
        super.drawScreen(n, n2, f);
        Iterator iterator = this.Field10528.iterator();
        while (iterator.hasNext()) {
            GuiTextField guiTextField = (GuiTextField)iterator.next();
            guiTextField.drawTextBox();
        }
    }
}

