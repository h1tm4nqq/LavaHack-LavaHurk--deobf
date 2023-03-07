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
import lavahack.client.KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT;
import lavahack.client.VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P;
import lavahack.client.XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.uYiUhRHxAsDrSfRBoXY14xI7yei7T67q;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

public class Fyw4VLWjpn2d3zfURwsqHpTCdEas3yyz
extends GuiScreen {
    private final GuiScreen Field12636;
    private GuiButton Field12637;
    private String Field12638 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Fyw4VLWjpn2d3zfURwsqHpTCdEas3yyz(GuiScreen guiScreen) {
        this.Field12636 = guiScreen;
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        super.drawScreen(n, n2, f);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6783() + " " + leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6785(), (float)this.width / Float.intBitsToFloat(0x23FCE986 ^ 0x637CE986), Double.longBitsToDouble(0xB076DF4385CAF43FL ^ 0xF06EDF4385CAF43FL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)1150603837L ^ 0x4494D224) << 2, (int)((long)1829366320 ^ (long)1829366313) << 2));
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
                this.mc.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16262.Method1218(this));
                return;
            }
            case 2: {
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6787("https://discord.gg/GRAbsr6Cf4");
                return;
            }
            case 3: {
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method6787("https://www.youtube.com/channel/UCWxQLRT9CXqcK6YyiKHrrNw");
                return;
            }
            case 4: {
                this.mc.displayGuiScreen((GuiScreen)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16241.Field16266.Method1236(this));
                return;
            }
            case 5: {
                this.mc.displayGuiScreen((GuiScreen)new KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT(this));
                return;
            }
            case 6: {
                this.mc.displayGuiScreen(this.Field12636);
                return;
            }
            case 7: {
                XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method22();
                this.Field12637.displayString = this.getDisplayString();
                return;
            }
            case 8: {
                this.mc.displayGuiScreen((GuiScreen)new VLBGi4jQpjwoS2YuOQrDZuYou5Mqly3P(this));
                return;
            }
        }
    }

    public void confirmClicked(boolean bl, int n) {
        if (n != (int)((long)-809210452 ^ (long)-809210453)) return;
        this.mc.displayGuiScreen((GuiScreen)this);
    }

    public void initGui() {
        super.initGui();
        this.addButtons(this.height / (((int)-230074138L ^ 0xF24958E7) << 3) + (((int)1281489494L ^ 0x4C61FA55) << 4) - (((int)569338594L ^ 0x21EF6AE1) << 1), ((int)-1667293683L ^ 0x9C9F1E0E) << 3);
    }

    private void addButtons(int n, int n2) {
        this.buttonList.add(new GuiButton((int)((long)1551869221 ^ (long)1551869220), this.width / (((int)1910809704L ^ 0x71E4A469) << 1) - ((int)((long)1748972486 ^ (long)1748972511) << 2), n, "Gui"));
        this.buttonList.add(new GuiButton(((int)-1576493475L ^ 0xA2089E5C) << 1, this.width / (((int)-961987006L ^ 0xC6A93E43) << 1) - ((int)((long)239261832 ^ (long)239261841) << 2), n + n2, "Discord"));
        this.buttonList.add(new GuiButton((int)((long)-124333870 ^ (long)-124333871), this.width / ((int)((long)563866233 ^ (long)563866232) << 1) - (((int)-1392879161L ^ 0xACFA59DE) << 2), n + n2 * ((int)((long)-654486737 ^ (long)-654486738) << 1), "YouTube"));
        this.buttonList.add(new GuiButton(((int)1256828500L ^ 0x4AE9AE55) << 2, this.width / (((int)1464415759L ^ 0x5749360E) << 1) - (((int)-261749151L ^ 0xF0660678) << 2), n + n2 * ((int)((long)-644690230 ^ (long)-644690229) << 2), (int)((long)386766082 ^ (long)386766131) << 1, ((int)-341860926L ^ 0xEB9F9DC7) << 2, "Version"));
        this.buttonList.add(new GuiButton((int)1667094511L ^ 0x635DD7EA, this.width / ((int)((long)-933774474 ^ (long)-933774473) << 1) + (((int)-424625021L ^ 0xE6B0BC82) << 1), n + n2 * ((int)((long)-471729926 ^ (long)-471729925) << 2), (int)((long)364124805 ^ (long)364124852) << 1, ((int)-115174436L ^ 0xF92293D9) << 2, "Alts"));
        this.Field12637 = this.addButton(new GuiButton((int)-1442958872L ^ 0xA9FE31EF, this.width / ((int)((long)529613912 ^ (long)529613913) << 1) - (int)((long)1259441915 ^ (long)1259441862), n + n2 * (int)((long)-2009588247 ^ (long)-2009588244), ((int)-980069075L ^ 0xC5955534) << 2, ((int)-353193546L ^ 0xEAF2B1B3) << 2, this.getDisplayString()));
        this.buttonList.add(new uYiUhRHxAsDrSfRBoXY14xI7yei7T67q(((int)-2120342234L ^ 0x819E2527) << 3, this.width / ((int)((long)1909338249 ^ (long)1909338248) << 1) - ((int)-1708304748L ^ 0x9A2D56A9) + (((int)730275197L ^ 0x2B871D64) << 2) + ((int)((long)-222980728 ^ (long)-222980727) << 1), n + n2 * ((int)-226218026L ^ 0xF2842FD3)));
        this.buttonList.add(new GuiButton((int)((long)-220045412 ^ (long)-220045409) << 1, this.width / (((int)-1518340278L ^ 0xA57FF74B) << 1) - ((int)((long)-479159860 ^ (long)-479159851) << 2), n + n2 * (int)((long)-384131089 ^ (long)-384131096), "Back"));
    }

    private String getDisplayString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder().append("PingBypass: ");
        if (XAGouiPFkAplDGbHIpcra7jCCj9Bv0EJ.Field14381.Method35()) {
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
        int n = (int)549247971L ^ 0x20BCDBE3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-505622414 ^ (long)-505622387);
            int n2 = ((int)1694388589L ^ 0x64FE5166) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1195229246 ^ (long)-1195245063) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

