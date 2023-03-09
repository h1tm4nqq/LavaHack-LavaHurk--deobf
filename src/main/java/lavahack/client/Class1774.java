//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.mixin.mixins.accessor.ISession;
import java.io.IOException;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1300;
import lavahack.client.Class1484;
import lavahack.client.Class1977;
import lavahack.client.Class2018;
import lavahack.client.Class2174;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.opengl.GL11;

public class Class1774
extends GuiScreen {
    private GuiButton Field16139;
    private GuiScreen Field16140;
    private Class1300 Field16141;
    private GuiTextField Field16142;
    private int Field16143;

    public Class1774(GuiScreen guiScreen) {
        this.Field16140 = guiScreen;
    }

    public void initGui() {
        super.initGui();
        this.Field16142 = new GuiTextField(69, this.mc.fontRenderer, 4, 20, 95, 15);
        this.buttonList.add(new GuiButton(4, 103, 20, "Microsoft"));
        this.Field16142.setText(this.mc.getSession().getUsername());
        this.Field16142.setMaxStringLength(16);
        this.Field16141 = new Class1300(this, this.mc, this.width, this.height, 40, this.height - 60, 36);
        this.buttonList.add(new GuiButton(1, this.width / 2 - 75, this.height - 52, 75, 20, "Add"));
        this.Field16139 = new GuiButton(2, this.width / 2 + 1, this.height - 52, 75, 20, "Delete");
        this.buttonList.add(this.Field16139);
        this.buttonList.add(new GuiButton(3, this.width / 2 - 75, this.height - 30, 150, 20, "Back"));
    }

    public void drawScreen(int n, int n2, float f) {
        this.Field16141.drawScreen(n, n2, f);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Class1178.Method4746("Alts", this.width / 4, Double.longBitsToDouble(4618441417868443648L), Class1172.Method4709(100, 100));
        GL11.glPopMatrix();
        String string = "Signed in as ";
        this.drawString(this.mc.fontRenderer, string, 4, 6, -5592406);
        this.drawString(this.mc.fontRenderer, this.mc.getSession().getUsername(), this.mc.fontRenderer.getStringWidth(string) + 3, 6, -1);
        this.Field16142.drawTextBox();
        if (!this.Field16142.isFocused()) {
            this.Field16142.setText(this.mc.getSession().getUsername());
        }
        this.Field16139.enabled = (Boolean)this.Field16141.getVisibility().get();
        super.drawScreen(n, n2, f);
    }

    public void mouseClicked(int n, int n2, int n3) throws IOException {
        this.Field16142.mouseClicked(n, n2, n3);
        this.Field16141.mouseClicked(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }

    public void handleMouseInput() throws IOException {
        this.Field16141.handleMouseInput();
        super.handleMouseInput();
    }

    public void keyTyped(char c, int n) throws IOException {
        if (n == 1) {
            this.mc.displayGuiScreen(this.Field16140);
            return;
        }
        this.Field16142.textboxKeyTyped(c, n);
        if (n == 28) {
            ((ISession)this.mc.getSession()).Method1120(this.Field16142.getText());
            this.Field16142.setFocused(false);
        }
        super.keyTyped(c, n);
    }

    protected void actionPerformed(GuiButton guiButton) throws IOException {
        this.Field16141.actionPerformed(guiButton);
        switch (guiButton.id) {
            case 1: {
                this.mc.displayGuiScreen((GuiScreen)new Class1484(this));
                return;
            }
            case 2: {
                if ((Boolean)this.Field16141.getVisibility().get() == false) return;
                Class1977 class1977 = (Class1977)this.Field16141.getAlts().get(this.Field16141.getSelectedId());
                this.Field16141.getAlts().remove(class1977);
                Class2018.Method7475().remove(class1977);
                return;
            }
            case 3: {
                this.mc.displayGuiScreen(this.Field16140);
                return;
            }
            case 4: {
                this.mc.displayGuiScreen((GuiScreen)new Class2174(this));
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
            int n2 = 11;
            cArray2[n] = (char)(cArray[n] ^ (0x1BBF ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

