//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.client.gui.*;

public class Class165 extends GuiScreen
{
    private Minecraft Field8681;
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
    
    public Class165(final Class1876 field8689, final String field8690, final int field8691, final int field8692, final int field8693, final int field8694) {
        this.Field8681 = Minecraft.getMinecraft();
        this.Field8682 = field8690;
        this.Field8683 = field8691;
        this.Field8684 = field8692;
        this.Field8685 = field8693;
        this.Field8686 = field8694;
        this.Field8695 = new GuiTextField(1, this.Field8681.fontRenderer, 0, 0, 140, 22);
        this.Field8689 = field8689;
        (this.Field8688 = new Class1803(field8689, (Class1997)new Class13())).Method6815(new Class2006(field8689, "Save"));
        this.Field8688.Method6815(new Class2006(field8689, "Reset"));
    }
    
    public void drawScreen(final int field8693, final int field8694) {
        final int method2450 = this.Field8689.Method2450(this.Field8682);
        final int n = method2450 / 4;
        this.Field8687 = n * 2 + method2450;
        this.Field8689.Method2445(this.Field8683, this.Field8684, this.Field8685, this.Field8686, Class1039.Field12572);
        this.Field8689.Method2445(this.Field8683, this.Field8684, this.Field8685, this.Field8687, Class1039.Field12569);
        if (null.Field11786.Method365()) {
            Class753.drawRoundedRect(this.Field8683 / 2, this.Field8684 / 2, (this.Field8683 + this.Field8685) / 2, (this.Field8684 + this.Field8687) / 2, Class1039.Field12569, null.Field11788.Method367());
        }
        this.Field8689.Method2448(this.Field8683 + this.Field8685 / 2 - this.Field8689.Method2449(this.Field8682) / 2, this.Field8684 + n, this.Field8682, null.Field11804.Method365() ? this.Field8689.Method2456() : Class1039.Field12573);
        this.Field8695.drawTextBox();
        this.Field8693 = field8693;
        this.Field8694 = field8694;
    }
    
    public void setTitle(final String field8682) {
        this.Field8682 = field8682;
    }
    
    public void mousePressed(final int n, final int n2, final int n3) {
        this.Field8695.mouseClicked(n2, n3, n);
        if (n == 0 && n2 >= this.Field8683 && n3 >= this.Field8684 && n2 <= this.Field8683 + this.Field8685 && n3 <= this.Field8684 + this.Field8687) {
            this.Field8690 = true;
            this.Field8691 = this.Field8683 - n2;
            this.Field8692 = this.Field8684 - n3;
        }
    }
    
    public void keyTyped(final int n, final char c) {
        this.Field8695.textboxKeyTyped(c, n);
    }
    
    private void drag(final int n, final int n2) {
        if (this.Field8690) {
            this.Field8683 = n + this.Field8691;
            this.Field8684 = n2 + this.Field8692;
        }
    }
    
    public void mouseReleased(final int n, final int n2, final int n3) {
        if (n == 0) {
            this.Field8690 = false;
        }
    }
    
    public void mouseMoved(final int n, final int n2) {
        this.drag(n, n2);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x13B ^ 0xF));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
