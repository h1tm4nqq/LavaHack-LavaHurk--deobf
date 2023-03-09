//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiTextField
 */
package lavahack.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;

public class Class1093
extends GuiButton {
    private static final int Field12920;
    private static final int Field12921;
    private final GuiTextField Field12922;
    private final GuiButton Field12923;
    private final GuiButton Field12924;
    private String Field12925 = String.valueOf(0);
    private int Field12926 = Integer.MIN_VALUE;
    private int Field12927 = Integer.MAX_VALUE;
    private boolean Field12928 = false;
    private String Field12929 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1093(FontRenderer fontRenderer, int n, int n2, int n3) {
        this(fontRenderer, n, n2, n3, 100, 20);
    }

    public Class1093(FontRenderer fontRenderer, int n, int n2, int n3, int n4) {
        this(fontRenderer, n, n2, n3, n4, 20);
    }

    public Class1093(FontRenderer fontRenderer, int n, int n2, int n3, int n4, int n5) {
        super(n, 0, 0, n4, n5, "");
        this.Field12922 = new GuiTextField(0, fontRenderer, n2 + 1, n3 + 1, n4 - 24 - 2, n5 - 2);
        this.Field12923 = new GuiButton(1, n2 + n4 - 24, n3, 12, n5, "-");
        this.Field12924 = new GuiButton(2, n2 + n4 - 12, n3, 12, n5, "+");
        this.setValue(0);
    }

    public boolean mousePressed(Minecraft minecraft, int n, int n2) {
        if (this.Field12928 && !this.Field12922.isFocused()) {
            this.Field12928 = false;
            return true;
        }
        this.Field12928 = this.Field12922.isFocused();
        if (this.Field12923.mousePressed(minecraft, n, n2)) return true;
        if (this.Field12924.mousePressed(minecraft, n, n2)) return true;
        return false;
    }

    public void drawButton(Minecraft minecraft, int n, int n2, float f) {
        if (!this.visible) return;
        this.Field12922.drawTextBox();
        this.Field12924.drawButton(minecraft, n, n2, f);
        this.Field12923.drawButton(minecraft, n, n2, f);
    }

    public void mouseClicked(int n, int n2, int n3) {
        Minecraft minecraft = Minecraft.getMinecraft();
        this.Field12922.mouseClicked(n, n2, n3);
        if (this.Field12924.mousePressed(minecraft, n, n2)) {
            this.setValue(this.getValue() + 1);
        }
        if (!this.Field12923.mousePressed(minecraft, n, n2)) return;
        this.setValue(this.getValue() - 1);
    }

    public boolean keyTyped(char c, int n) {
        if (!this.Field12922.isFocused()) {
            return false;
        }
        int n2 = this.Field12922.getCursorPosition();
        this.Field12922.textboxKeyTyped(c, n);
        String string = this.Field12922.getText();
        int n3 = this.Field12922.getCursorPosition();
        if (string.length() == 0) return true;
        if (string.equals("-")) {
            return true;
        }
        long l = Long.parseLong(string);
        boolean bl = false;
        if (l > (long)this.Field12927) {
            l = this.Field12927;
            bl = true;
        } else if (l < (long)this.Field12926) {
            l = this.Field12926;
            bl = true;
        }
        string = String.valueOf(l);
        if (string.equals(this.Field12925)) {
        } else {
            this.Field12922.setText(String.valueOf(l));
            this.Field12922.setCursorPosition(n3);
        }
        this.Field12925 = string;
        return true;
    }

    public void updateCursorCounter() {
        this.Field12922.updateCursorCounter();
    }

    public boolean isFocused() {
        return this.Field12922.isFocused();
    }

    public void setPosition(int n, int n2) {
        this.Field12922.x = n + 1;
        this.Field12922.y = n2 + 1;
        this.Field12924.x = n + this.width - 24;
        this.Field12924.y = n2;
        this.Field12923.x = n + this.width - 12;
        this.Field12923.y = n2;
    }

    public void setEnabled(boolean bl) {
        this.enabled = bl;
        this.Field12922.setEnabled(bl);
        this.Field12924.enabled = bl;
        this.Field12923.enabled = bl;
    }

    public void setMinimum(int n) {
        this.Field12926 = n;
    }

    public int getMinimum() {
        return this.Field12926;
    }

    public void setMaximum(int n) {
        this.Field12927 = n;
    }

    public int getMaximum() {
        return this.Field12927;
    }

    public void setValue(int n) {
        if (n > this.Field12927) {
            n = this.Field12927;
        } else if (n < this.Field12926) {
            n = this.Field12926;
        }
        this.Field12922.setText(String.valueOf(n));
    }

    public int getValue() {
        String string = this.Field12922.getText();
        if (string.length() == 0) return 0;
        if (!string.equals("-")) return Integer.parseInt(string);
        return 0;
    }

    static {
        Field12921 = 12;
        Field12920 = 0;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 225;
            cArray2[n] = (char)(cArray[n] ^ (0x57B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

