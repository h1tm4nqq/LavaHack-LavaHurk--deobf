//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import java.io.*;
import org.jetbrains.annotations.*;
import net.minecraft.util.text.*;

public class Class1046 extends GuiScreen
{
    private final GuiScreen Field12636;
    private GuiButton Field12637;
    private String Field12638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1046(final GuiScreen field12636) {
        this.Field12636 = field12636;
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        super.drawScreen(n, n2, n3);
        GL11.glPushMatrix();
        GL11.glScalef(2.0f, 2.0f, 2.0f);
        Class1178.Method4746(Class1796.Method6783() + " " + Class1796.Method6785(), this.width / Float.intBitsToFloat(1082130432), Double.longBitsToDouble(4618441417868443648L), Class1172.Method4709(100, 100));
        GL11.glPopMatrix();
    }
    
    protected void keyTyped(final char c, final int n) throws IOException {
        super.keyTyped(c, n);
    }
    
    protected void mouseClicked(final int n, final int n2, final int n3) throws IOException {
        super.mouseClicked(n, n2, n3);
    }
    
    protected void mouseReleased(final int n, final int n2, final int n3) {
        super.mouseReleased(n, n2, n3);
    }
    
    protected void actionPerformed(@NotNull @NotNull final GuiButton guiButton) throws IOException {
        switch (guiButton.id) {
            case 1: {
                this.mc.displayGuiScreen((GuiScreen)Class1796.Field16241.Field16262.Method1218(this));
                break;
            }
            case 2: {
                Class1796.Method6787("https://discord.gg/GRAbsr6Cf4");
                break;
            }
            case 3: {
                Class1796.Method6787("https://www.youtube.com/channel/UCWxQLRT9CXqcK6YyiKHrrNw");
                break;
            }
            case 4: {
                this.mc.displayGuiScreen((GuiScreen)Class1796.Field16241.Field16266.Method1236(this));
                break;
            }
            case 5: {
                this.mc.displayGuiScreen((GuiScreen)new Class1774(this));
                break;
            }
            case 6: {
                this.mc.displayGuiScreen(this.Field12636);
                break;
            }
            case 7: {
                Class1409.Field14381.Method22();
                this.Field12637.displayString = this.getDisplayString();
                break;
            }
            case 8: {
                this.mc.displayGuiScreen((GuiScreen)new Class579(this));
                break;
            }
        }
    }
    
    public void confirmClicked(final boolean b, final int n) {
        if (n == 7) {
            this.mc.displayGuiScreen((GuiScreen)this);
        }
    }
    
    public void initGui() {
        super.initGui();
        this.addButtons(this.height / 8 + 48 - 6, 24);
    }
    
    private void addButtons(final int n, final int n2) {
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, n, "Gui"));
        this.buttonList.add(new GuiButton(2, this.width / 2 - 100, n + n2, "Discord"));
        this.buttonList.add(new GuiButton(3, this.width / 2 - 100, n + n2 * 2, "YouTube"));
        this.buttonList.add(new GuiButton(4, this.width / 2 - 100, n + n2 * 4, 98, 20, "Version"));
        this.buttonList.add(new GuiButton(5, this.width / 2 + 2, n + n2 * 4, 98, 20, "Alts"));
        this.Field12637 = this.addButton(new GuiButton(7, this.width / 2 - 61, n + n2 * 5, 100, 20, this.getDisplayString()));
        this.buttonList.add(new Class1770(8, this.width / 2 - 61 + 100 + 2, n + n2 * 5));
        this.buttonList.add(new GuiButton(6, this.width / 2 - 100, n + n2 * 7, "Back"));
    }
    
    private String getDisplayString() {
        return "PingBypass: " + (Class1409.Field14381.Method35() ? (TextFormatting.GREEN + "On") : (TextFormatting.RED + "Off"));
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3E3B ^ 0x16));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
