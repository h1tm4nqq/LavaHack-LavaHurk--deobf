//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.client.gui.GuiTextField
 */
package lavahack.client;

import lavahack.client.EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
import lavahack.client.PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O;
import lavahack.client.PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo;
import lavahack.client.evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr;
import lavahack.client.fBw059jSZh9EnsOSUkYoCNT8w9VXknU4;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class T45b2GxFOQ8CUfDhx1ThrOO7mYMRseA5
extends GuiScreen {
    private Minecraft Field8681 = Minecraft.getMinecraft();
    private String Field8682;
    public int Field8683;
    public int Field8684;
    public int Field8685;
    public int Field8686;
    private int Field8687;
    private PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O Field8688;
    private EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP Field8689;
    private boolean Field8690;
    private int Field8691;
    private int Field8692;
    private int Field8693;
    private int Field8694;
    private GuiTextField Field8695;
    private String Field8696 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public T45b2GxFOQ8CUfDhx1ThrOO7mYMRseA5(EaPO2tejfzeKFPU19fHIJkdD7KPbX6qP eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, String string, int n, int n2, int n3, int n4) {
        this.Field8682 = string;
        this.Field8683 = n;
        this.Field8684 = n2;
        this.Field8685 = n3;
        this.Field8686 = n4;
        this.Field8695 = new GuiTextField((int)((long)-1260844637 ^ (long)-1260844638), this.Field8681.fontRenderer, (int)-1733570537L ^ 0x98ABD017, (int)-1930863941L ^ 0x8CE95ABB, ((int)-30986050L ^ 0xFE27309D) << 2, ((int)460589022L ^ 0x1B7407D5) << 1);
        this.Field8689 = eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP;
        this.Field8688 = new PLdRxfnNjGlDr0HwmtRsAMEGxz28YJ1O(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, new evFbJT3zQ353eeZ7G9ok7OR06IWFSOFr());
        this.Field8688.Method6815(new fBw059jSZh9EnsOSUkYoCNT8w9VXknU4(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, "Save"));
        this.Field8688.Method6815(new fBw059jSZh9EnsOSUkYoCNT8w9VXknU4(eaPO2tejfzeKFPU19fHIJkdD7KPbX6qP, "Reset"));
    }

    public void drawScreen(int n, int n2) {
        int n3 = this.Field8689.Method2450(this.Field8682);
        int n4 = n3 / ((int)((long)72465692 ^ (long)72465693) << 2);
        this.Field8687 = n4 * (((int)-979853233L ^ 0xC598A04E) << 1) + n3;
        this.Field8689.Method2445(this.Field8683, this.Field8684, this.Field8685, this.Field8686, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12572);
        this.Field8689.Method2445(this.Field8683, this.Field8684, this.Field8685, this.Field8687, PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569);
        if (null.Field11786.Method365()) {
            hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawRoundedRect((double)(this.Field8683 / ((int)((long)1310340903 ^ (long)1310340902) << 1)), (double)(this.Field8684 / (((int)-263470080L ^ 0xF04BC401) << 1)), (double)((this.Field8683 + this.Field8685) / (((int)-79955321L ^ 0xFB3BFA86) << 1)), (double)((this.Field8684 + this.Field8687) / ((int)((long)1013032929 ^ (long)1013032928) << 1)), PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12569, null.Field11788.Method367());
        }
        this.Field8689.Method2448(this.Field8683 + this.Field8685 / (((int)-134186402L ^ 0xF8007A5F) << 1) - this.Field8689.Method2449(this.Field8682) / (((int)-1595970121L ^ 0xA0DF6DB6) << 1), this.Field8684 + n4, this.Field8682, null.Field11804.Method365() ? this.Field8689.Method2456() : PxnV1NdjGxyN4Clkf4DCZI9zHTzdx6fo.Field12573);
        this.Field8695.drawTextBox();
        this.Field8693 = n;
        this.Field8694 = n2;
    }

    public void setTitle(String string) {
        this.Field8682 = string;
    }

    public void mousePressed(int n, int n2, int n3) {
        this.Field8695.mouseClicked(n2, n3, n);
        if (n != 0) return;
        if (n2 < this.Field8683) return;
        if (n3 < this.Field8684) return;
        if (n2 > this.Field8683 + this.Field8685) return;
        if (n3 > this.Field8684 + this.Field8687) return;
        this.Field8690 = (int)((long)2011104281 ^ (long)2011104280);
        this.Field8691 = this.Field8683 - n2;
        this.Field8692 = this.Field8684 - n3;
    }

    public void keyTyped(int n, char c) {
        this.Field8695.textboxKeyTyped(c, n);
    }

    private void drag(int n, int n2) {
        if (!this.Field8690) return;
        this.Field8683 = n + this.Field8691;
        this.Field8684 = n2 + this.Field8692;
    }

    public void mouseReleased(int n, int n2, int n3) {
        if (n != 0) return;
        this.Field8690 = (int)1121794184L ^ 0x42DD3888;
    }

    public void mouseMoved(int n, int n2) {
        this.drag(n, n2);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1036622467 ^ (long)-1036622467);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1806528916 ^ (long)-1806528877);
            int n2 = (int)-1274736401L ^ 0xB40510E0;
            cArray2[n] = (char)(cArray[n] ^ ((int)-262021607L ^ 0xF061DF22 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

