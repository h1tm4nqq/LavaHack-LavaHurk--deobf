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
import lavahack.client.KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6;
import lavahack.client.d8NUi994osLCmt6QS9gn2nL3bytx8gy3;
import lavahack.client.fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj;
import lavahack.client.j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR;
import lavahack.client.jfV7QfBb0ya4qxjiQh04TfulJofawM0V;
import lavahack.client.zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import org.lwjgl.opengl.GL11;

public class KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT
extends GuiScreen {
    private GuiButton Field16139;
    private GuiScreen Field16140;
    private KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field16141;
    private GuiTextField Field16142;
    private int Field16143;

    public KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT(GuiScreen guiScreen) {
        this.Field16140 = guiScreen;
    }

    public void initGui() {
        super.initGui();
        this.Field16142 = new GuiTextField((int)-429874201L ^ 0xE660A3A2, this.mc.fontRenderer, ((int)-683129372L ^ 0xD74845E5) << 2, ((int)-668165726L ^ 0xD82C99A7) << 2, (int)-1000625681L ^ 0xC45BA9B0, (int)-438480333L ^ 0xE5DD523C);
        this.buttonList.add(new GuiButton((int)((long)-839519927 ^ (long)-839519928) << 2, (int)((long)-639709872 ^ (long)-639709897), (int)((long)-1161023121 ^ (long)-1161023126) << 2, "Microsoft"));
        this.Field16142.setText(this.mc.getSession().getUsername());
        this.Field16142.setMaxStringLength((int)((long)-1476316771 ^ (long)-1476316772) << 4);
        this.Field16141 = new KcCIZHkiqRyYy9aG2CChxoIkIF4rNhaT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, this.mc, this.width, this.height, ((int)1055837294L ^ 0x3EEECC6B) << 3, this.height - (((int)-1988086919L ^ 0x89803376) << 2), (int)((long)-1446700322 ^ (long)-1446700329) << 2);
        this.buttonList.add(new GuiButton((int)((long)-709116653 ^ (long)-709116654), this.width / (((int)-1231227630L ^ 0xB69CF513) << 1) - (int)((long)-1792508671 ^ (long)-1792508598), this.height - (((int)1054975216L ^ 0x3EE1A4FD) << 2), (int)((long)1818014342 ^ (long)1818014413), (int)((long)-106047687 ^ (long)-106047684) << 2, "Add"));
        this.Field16139 = new GuiButton((int)((long)-1073042451 ^ (long)-1073042452) << 1, this.width / ((int)((long)180377117 ^ (long)180377116) << 1) + ((int)1904794840L ^ 0x7188DCD9), this.height - ((int)((long)896571881 ^ (long)896571876) << 2), (int)((long)1766183076 ^ (long)1766183151), (int)((long)205277386 ^ (long)205277391) << 2, "Delete");
        this.buttonList.add(this.Field16139);
        this.buttonList.add(new GuiButton((int)-1225487537L ^ 0xB6F48B4C, this.width / ((int)((long)851923467 ^ (long)851923466) << 1) - (int)((long)-1060563043 ^ (long)-1060562986), this.height - ((int)((long)1738889586 ^ (long)1738889597) << 1), (int)((long)-1411170843 ^ (long)-1411170898) << 1, (int)((long)-1088885280 ^ (long)-1088885275) << 2, "Back"));
    }

    public void drawScreen(int n, int n2, float f) {
        this.Field16141.drawScreen(n, n2, f);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        fG4zHmfoRGE4EaMv1zmxKijeYT9zMfCj.Method4746("Alts", this.width / ((int)((long)-984422440 ^ (long)-984422439) << 2), Double.longBitsToDouble(0xCAF500525C2EC9FEL ^ 0x8AED00525C2EC9FEL), zmVsbwAdTVZaRYytJCehCE9v2PCkzpEB.Method4709(((int)-1227833615L ^ 0xB6D0BEE8) << 2, ((int)116997320L ^ 0x6F93CD1) << 2));
        GL11.glPopMatrix();
        String string = "Signed in as ";
        this.drawString(this.mc.fontRenderer, string, ((int)-552438072L ^ 0xDF1276C9) << 2, (int)((long)-111487981 ^ (long)-111487984) << 1, (int)421260772L ^ 0xE6B1474E);
        this.drawString(this.mc.fontRenderer, this.mc.getSession().getUsername(), this.mc.fontRenderer.getStringWidth(string) + (int)((long)759766674 ^ (long)759766673), (int)((long)1840735915 ^ (long)1840735912) << 1, (int)-1762981921L ^ 0x6914F820);
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
        if (n == ((int)-581837134L ^ 0xDD51DEB3)) {
            this.mc.displayGuiScreen(this.Field16140);
            return;
        }
        this.Field16142.textboxKeyTyped(c, n);
        if (n == (int)((long)-2063613293 ^ (long)-2063613292) << 2) {
            ((ISession)this.mc.getSession()).Method1120(this.Field16142.getText());
            this.Field16142.setFocused(((int)1837777637L ^ 0x6D8A42E5) != 0);
        }
        super.keyTyped(c, n);
    }

    protected void actionPerformed(GuiButton guiButton) throws IOException {
        this.Field16141.actionPerformed(guiButton);
        switch (guiButton.id) {
            case 1: {
                this.mc.displayGuiScreen((GuiScreen)new jfV7QfBb0ya4qxjiQh04TfulJofawM0V(this));
                return;
            }
            case 2: {
                if ((Boolean)this.Field16141.getVisibility().get() == false) return;
                RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6 rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6 = (RJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6)this.Field16141.getAlts().get(this.Field16141.getSelectedId());
                this.Field16141.getAlts().remove(rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6);
                d8NUi994osLCmt6QS9gn2nL3bytx8gy3.Method7475().remove(rJ3He3FYgu0B1QUq5w34XvoC8L4vYFY6);
                return;
            }
            case 3: {
                this.mc.displayGuiScreen(this.Field16140);
                return;
            }
            case 4: {
                this.mc.displayGuiScreen((GuiScreen)new j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR(this));
                return;
            }
        }
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1190235124 ^ (long)1190235124);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-650304092 ^ (long)-650304165);
            int n2 = (int)((long)-1949485989 ^ (long)-1949486000);
            cArray2[n] = (char)(cArray[n] ^ ((int)1593080758L ^ 0x5EF46009 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

