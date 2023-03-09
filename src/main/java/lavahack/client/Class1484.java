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
import lavahack.client.Class1977;
import lavahack.client.Class2018;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class Class1484
extends GuiScreen {
    private GuiScreen Field14925;
    private GuiTextField Field14926;
    private GuiTextField Field14927;
    private int Field14928;

    public Class1484(GuiScreen guiScreen) {
        this.Field14925 = guiScreen;
    }

    public void initGui() {
        this.Field14927 = new GuiTextField(1, this.mc.fontRenderer, this.width / 2 - 100, this.height / 2 - 100, 200, 15);
        this.Field14926 = new GuiTextField(2, this.mc.fontRenderer, this.width / 2 - 100, this.height / 2 - 80, 200, 15);
        this.buttonList.add(new GuiButton(3, this.width / 2 - 51, this.height / 2 - 60, 50, 20, "Add"));
        this.buttonList.add(new GuiButton(4, this.width / 2 + 1, this.height / 2 - 60, 50, 20, "Cancel"));
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.mc.fontRenderer, "Add Alt Account", this.width / 2, 10, -1);
        this.Field14927.drawTextBox();
        this.Field14926.drawTextBox();
        if (this.Field14927.getText().equals("") && !this.Field14927.isFocused()) {
            this.fontRenderer.drawStringWithShadow("Email", (float)(this.width / 2 - 97), (float)(this.height / 2 - 96), -6710887);
        }
        if (this.Field14926.getText().equals("") && !this.Field14926.isFocused()) {
            this.fontRenderer.drawStringWithShadow("Password", (float)(this.width / 2 - 97), (float)(this.height / 2 - 76), -6710887);
        }
        super.drawScreen(n, n2, f);
    }

    public void keyTyped(char c, int n) throws IOException {
        if (n == 1) {
            this.mc.displayGuiScreen(this.Field14925);
            return;
        }
        this.Field14927.textboxKeyTyped(c, n);
        this.Field14926.textboxKeyTyped(c, n);
        if (n == 28) {
            this.Field14927.setFocused(false);
            this.Field14926.setFocused(false);
        }
        super.keyTyped(c, n);
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        this.Field14927.mouseClicked(n, n2, n3);
        this.Field14926.mouseClicked(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }

    protected void actionPerformed(GuiButton guiButton) throws IOException {
        switch (guiButton.id) {
            case 3: {
                Class1977 class1977 = new Class1977(this.Field14927.getText(), this.Field14926.getText());
                Class2018.Method7475().add(class1977);
                this.mc.displayGuiScreen(this.Field14925);
                return;
            }
            case 4: {
                this.mc.displayGuiScreen(this.Field14925);
                return;
            }
        }
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 71;
            cArray2[n] = (char)(cArray[n] ^ (0x67D5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

