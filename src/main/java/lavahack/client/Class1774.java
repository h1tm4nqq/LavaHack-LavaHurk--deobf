//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import java.io.*;
import com.kisman.cc.mixin.mixins.accessor.*;

public class Class1774 extends GuiScreen
{
    private GuiButton Field16139;
    private GuiScreen Field16140;
    private Class1300 Field16141;
    private GuiTextField Field16142;
    private int Field16143;
    
    public Class1774(final GuiScreen field16140) {
        this.Field16140 = field16140;
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
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.Field16141.drawScreen(n, n2, n3);
        GL11.glPushMatrix();
        GL11.glScalef(2.0f, 2.0f, 2.0f);
        Class1178.Method4746("Alts", (double)(this.width / 4), Double.longBitsToDouble(4618441417868443648L), Class1172.Method4709(100, 100));
        GL11.glPopMatrix();
        final String s = "Signed in as ";
        this.drawString(this.mc.fontRenderer, s, 4, 6, -5592406);
        this.drawString(this.mc.fontRenderer, this.mc.getSession().getUsername(), this.mc.fontRenderer.getStringWidth(s) + 3, 6, -1);
        this.Field16142.drawTextBox();
        if (!this.Field16142.isFocused()) {
            this.Field16142.setText(this.mc.getSession().getUsername());
        }
        this.Field16139.enabled = this.Field16141.getVisibility().get();
        super.drawScreen(n, n2, n3);
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) throws IOException {
        this.Field16142.mouseClicked(n, n2, n3);
        this.Field16141.mouseClicked(n, n2, n3);
        super.mouseClicked(n, n2, n3);
    }
    
    public void handleMouseInput() throws IOException {
        this.Field16141.handleMouseInput();
        super.handleMouseInput();
    }
    
    public void keyTyped(final char c, final int n) throws IOException {
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
    
    protected void actionPerformed(final GuiButton guiButton) throws IOException {
        this.Field16141.actionPerformed(guiButton);
        switch (guiButton.id) {
            case 1: {
                this.mc.displayGuiScreen((GuiScreen)new Class1484((GuiScreen)this));
                break;
            }
            case 2: {
                if (this.Field16141.getVisibility().get()) {
                    final Class1977 class1977 = this.Field16141.getAlts().get(this.Field16141.getSelectedId());
                    this.Field16141.getAlts().remove(class1977);
                    Class2018.Method7475().remove(class1977);
                    break;
                }
                break;
            }
            case 3: {
                this.mc.displayGuiScreen(this.Field16140);
                break;
            }
            case 4: {
                this.mc.displayGuiScreen((GuiScreen)new Class2174(this));
                break;
            }
        }
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1BBF ^ 0xB));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
