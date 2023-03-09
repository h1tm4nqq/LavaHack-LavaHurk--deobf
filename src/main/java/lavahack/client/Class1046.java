//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.text.TextFormatting
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.io.IOException;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1409;
import lavahack.client.Class1770;
import lavahack.client.Class1774;
import lavahack.client.Class1796;
import lavahack.client.Class579;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class Class1046
extends GuiScreen {
    private final GuiScreen Field12636;
    private GuiButton Field12637;
    private String Field12638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1046(GuiScreen guiScreen) {
        this.Field12636 = guiScreen;
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        super.drawScreen(n, n2, f);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Class1178.Method4746(Class1796.Method6783() + " " + Class1796.Method6785(), (float)this.width / Float.intBitsToFloat(0x40800000), Double.longBitsToDouble(4618441417868443648L), Class1172.Method4709(100, 100));
        GL11.glPopMatrix();
    }

    protected void keyTyped(char c, int n) throws IOException {
        super.keyTyped(c, n);
    }

    protected void mouseClicked(int n, int n2, int n3) throws IOException {
        super.mouseClicked(n, n2, n3);
    }

    protected void mouseReleased(int n, int n2, int n3) {
        super.mouseReleased(n, n2, n3);
    }

    protected void actionPerformed(@NotNull @NotNull GuiButton guiButton) throws IOException {
        switch (guiButton.id) {
            case 1: {
                this.mc.displayGuiScreen((GuiScreen)Class1796.Field16241.Field16262.Method1218(this));
                return;
            }
            case 2: {
                Class1796.Method6787("https://discord.gg/GRAbsr6Cf4");
                return;
            }
            case 3: {
                Class1796.Method6787("https://www.youtube.com/channel/UCWxQLRT9CXqcK6YyiKHrrNw");
                return;
            }
            case 4: {
                this.mc.displayGuiScreen((GuiScreen)Class1796.Field16241.Field16266.Method1236(this));
                return;
            }
            case 5: {
                this.mc.displayGuiScreen((GuiScreen)new Class1774(this));
                return;
            }
            case 6: {
                this.mc.displayGuiScreen(this.Field12636);
                return;
            }
            case 7: {
                Class1409.Field14381.Method22();
                this.Field12637.displayString = this.getDisplayString();
                return;
            }
            case 8: {
                this.mc.displayGuiScreen((GuiScreen)new Class579(this));
                return;
            }
        }
    }

    public void confirmClicked(boolean bl, int n) {
        if (n != 7) return;
        this.mc.displayGuiScreen((GuiScreen)this);
    }

    public void initGui() {
        super.initGui();
        this.addButtons(this.height / 8 + 48 - 6, 24);
    }

    private void addButtons(int n, int n2) {
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
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("PingBypass: ");
        if (Class1409.Field14381.Method35()) {
            string = TextFormatting.GREEN + "On";
            return stringBuilder.append(string).toString();
        }
        string = TextFormatting.RED + "Off";
        return stringBuilder.append(string).toString();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 22;
            cArray2[n] = (char)(cArray[n] ^ (0x3E3B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

