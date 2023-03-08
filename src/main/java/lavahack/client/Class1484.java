//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import java.io.*;

public class Class1484 extends GuiScreen
{
    private GuiScreen Field14925;
    private GuiTextField Field14926;
    private GuiTextField Field14927;
    private int Field14928;
    
    public Class1484(final GuiScreen field14925) {
        this.Field14925 = field14925;
    }
    
    public void initGui() {
        this.Field14927 = new GuiTextField(1, this.mc.fontRenderer, this.width / 2 - 100, this.height / 2 - 100, 200, 15);
        this.Field14926 = new GuiTextField(2, this.mc.fontRenderer, this.width / 2 - 100, this.height / 2 - 80, 200, 15);
        this.buttonList.add(new GuiButton(3, this.width / 2 - 51, this.height / 2 - 60, 50, 20, "Add"));
        this.buttonList.add(new GuiButton(4, this.width / 2 + 1, this.height / 2 - 60, 50, 20, "Cancel"));
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
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
        super.drawScreen(n, n2, n3);
    }
    
    public void keyTyped(final char c, final int n) throws IOException {
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
    
    public void mouseClicked(final int n, final int n2, final int n3) throws IOException {
        this.Field14927.mouseClicked(n, n2, n3);
        this.Field14926.mouseClicked(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }
    
    protected void actionPerformed(final GuiButton guiButton) throws IOException {
        switch (guiButton.id) {
            case 3: {
                Class2018.Method7475().add(new Class1977(this.Field14927.getText(), this.Field14926.getText()));
                this.mc.displayGuiScreen(this.Field14925);
                break;
            }
            case 4: {
                this.mc.displayGuiScreen(this.Field14925);
                break;
            }
        }
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x67D5 ^ 0x47));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
