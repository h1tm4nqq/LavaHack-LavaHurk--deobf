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
import lavahack.client.T5FD2ee74iGrSuUWIS0OtiFiVnGbordE;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP
extends GuiScreen {
    protected final GuiScreen Field10527;
    protected List Field10528 = new ArrayList();
    private String Field10529 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP() {
        this(null);
    }

    public QnfEmKWvlwRNiRsFVIMqQU1HcNHc8CBP(GuiScreen guiScreen) {
        this.Field10527 = guiScreen;
    }

    public void initGui() {
        this.buttonList.clear();
        this.Field10528.clear();
    }

    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        for (GuiButton guiButton : this.buttonList) {
            if (!(guiButton instanceof T5FD2ee74iGrSuUWIS0OtiFiVnGbordE)) continue;
            T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE = (T5FD2ee74iGrSuUWIS0OtiFiVnGbordE)guiButton;
            t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.mouseClicked(n, n2, n3);
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
        if (n == (int)((long)-966888155 ^ (long)-966888156)) {
            this.mc.displayGuiScreen(this.Field10527);
            return;
        }
        for (GuiButton guiButton : this.buttonList) {
            if (!(guiButton instanceof T5FD2ee74iGrSuUWIS0OtiFiVnGbordE)) continue;
            T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE = (T5FD2ee74iGrSuUWIS0OtiFiVnGbordE)guiButton;
            t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.keyTyped(c, n);
            if (!t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.isFocused()) continue;
            this.actionPerformed(t5FD2ee74iGrSuUWIS0OtiFiVnGbordE);
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
            if (!(guiButton instanceof T5FD2ee74iGrSuUWIS0OtiFiVnGbordE)) continue;
            T5FD2ee74iGrSuUWIS0OtiFiVnGbordE t5FD2ee74iGrSuUWIS0OtiFiVnGbordE = (T5FD2ee74iGrSuUWIS0OtiFiVnGbordE)guiButton;
            t5FD2ee74iGrSuUWIS0OtiFiVnGbordE.updateCursorCounter();
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

