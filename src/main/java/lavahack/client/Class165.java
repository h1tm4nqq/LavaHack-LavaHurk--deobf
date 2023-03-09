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

import lavahack.client.Class1039;
import lavahack.client.Class13;
import lavahack.client.Class1803;
import lavahack.client.Class1876;
import lavahack.client.Class2006;
import lavahack.client.Class753;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class Class165
extends GuiScreen {
    private Minecraft Field8681 = Minecraft.getMinecraft();
    private String Field8682;
    public int Field8683;
    public int Field8684;
    public int Field8685;
    public int Field8686;
    private int Field8687;
    private Class1803 Field8688;
    private Class1876 Field8689;
    private boolean Field8690;
    private int Field8691;
    private int Field8692;
    private int Field8693;
    private int Field8694;
    private GuiTextField Field8695;
    private String Field8696 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class165(Class1876 class1876, String string, int n, int n2, int n3, int n4) {
        this.Field8682 = string;
        this.Field8683 = n;
        this.Field8684 = n2;
        this.Field8685 = n3;
        this.Field8686 = n4;
        this.Field8695 = new GuiTextField(1, this.Field8681.fontRenderer, 0, 0, 140, 22);
        this.Field8689 = class1876;
        this.Field8688 = new Class1803(class1876, new Class13());
        this.Field8688.Method6815(new Class2006(class1876, "Save"));
        this.Field8688.Method6815(new Class2006(class1876, "Reset"));
    }

    public void drawScreen(int n, int n2) {
        int n3 = this.Field8689.Method2450(this.Field8682);
        int n4 = n3 / 4;
        this.Field8687 = n4 * 2 + n3;
        this.Field8689.Method2445(this.Field8683, this.Field8684, this.Field8685, this.Field8686, Class1039.Field12572);
        this.Field8689.Method2445(this.Field8683, this.Field8684, this.Field8685, this.Field8687, Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect((double)(this.Field8683 / 2), (double)(this.Field8684 / 2), (double)((this.Field8683 + this.Field8685) / 2), (double)((this.Field8684 + this.Field8687) / 2), Class1039.Field12569, null.Field11788.Method367());
        }
        this.Field8689.Method2448(this.Field8683 + this.Field8685 / 2 - this.Field8689.Method2449(this.Field8682) / 2, this.Field8684 + n4, this.Field8682, null.Field11804.Method365() ? this.Field8689.Method2456() : Class1039.Field12573);
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
        this.Field8690 = true;
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
        this.Field8690 = false;
    }

    public void mouseMoved(int n, int n2) {
        this.drag(n, n2);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x13B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

