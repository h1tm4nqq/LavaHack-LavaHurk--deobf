//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import net.minecraft.client.*;

public class Class1093 extends GuiButton
{
    private static final int Field12920;
    private static final int Field12921;
    private final GuiTextField Field12922;
    private final GuiButton Field12923;
    private final GuiButton Field12924;
    private String Field12925;
    private int Field12926;
    private int Field12927;
    private boolean Field12928;
    private String Field12929 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1093(final FontRenderer fontRenderer, final int n, final int n2, final int n3) {
        this(fontRenderer, n, n2, n3, 100, 20);
    }
    
    public Class1093(final FontRenderer fontRenderer, final int n, final int n2, final int n3, final int n4) {
        this(fontRenderer, n, n2, n3, n4, 20);
    }
    
    public Class1093(final FontRenderer fontRenderer, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(n, 0, 0, n4, n5, "");
        this.Field12925 = String.valueOf(0);
        this.Field12926 = Integer.MIN_VALUE;
        this.Field12927 = Integer.MAX_VALUE;
        this.Field12928 = false;
        this.Field12922 = new GuiTextField(0, fontRenderer, n2 + 1, n3 + 1, n4 - 24 - 2, n5 - 2);
        this.Field12923 = new GuiButton(1, n2 + n4 - 24, n3, 12, n5, "-");
        this.Field12924 = new GuiButton(2, n2 + n4 - 12, n3, 12, n5, "+");
        this.setValue(0);
    }
    
    public boolean mousePressed(final Minecraft minecraft, final int n, final int n2) {
        if (this.Field12928 && !this.Field12922.isFocused()) {
            this.Field12928 = false;
            return true;
        }
        this.Field12928 = this.Field12922.isFocused();
        return this.Field12923.mousePressed(minecraft, n, n2) || this.Field12924.mousePressed(minecraft, n, n2);
    }
    
    public void drawButton(final Minecraft minecraft, final int n, final int n2, final float n3) {
        if (this.visible) {
            this.Field12922.drawTextBox();
            this.Field12924.drawButton(minecraft, n, n2, n3);
            this.Field12923.drawButton(minecraft, n, n2, n3);
        }
    }
    
    public void mouseClicked(final int n, final int n2, final int n3) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        this.Field12922.mouseClicked(n, n2, n3);
        if (this.Field12924.mousePressed(getMinecraft, n, n2)) {
            this.setValue(this.getValue() + 1);
        }
        if (this.Field12923.mousePressed(getMinecraft, n, n2)) {
            this.setValue(this.getValue() - 1);
        }
    }
    
    public boolean keyTyped(final char c, final int n) {
        if (!this.Field12922.isFocused()) {
            return false;
        }
        this.Field12922.getCursorPosition();
        this.Field12922.textboxKeyTyped(c, n);
        final String getText = this.Field12922.getText();
        final int getCursorPosition = this.Field12922.getCursorPosition();
        if (getText.length() == 0 || getText.equals("-")) {
            return true;
        }
        long long1 = Long.parseLong(getText);
        if (long1 > this.Field12927) {
            long1 = this.Field12927;
        }
        else if (long1 < this.Field12926) {
            long1 = this.Field12926;
        }
        final String value = String.valueOf(long1);
        if (!value.equals(this.Field12925)) {
            this.Field12922.setText(String.valueOf(long1));
            this.Field12922.setCursorPosition(getCursorPosition);
        }
        this.Field12925 = value;
        return true;
    }
    
    public void updateCursorCounter() {
        this.Field12922.updateCursorCounter();
    }
    
    public boolean isFocused() {
        return this.Field12922.isFocused();
    }
    
    public void setPosition(final int n, final int n2) {
        this.Field12922.x = n + 1;
        this.Field12922.y = n2 + 1;
        this.Field12924.x = n + this.width - 24;
        this.Field12924.y = n2;
        this.Field12923.x = n + this.width - 12;
        this.Field12923.y = n2;
    }
    
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
        this.Field12922.setEnabled(enabled);
        this.Field12924.enabled = enabled;
        this.Field12923.enabled = enabled;
    }
    
    public void setMinimum(final int field12926) {
        this.Field12926 = field12926;
    }
    
    public int getMinimum() {
        return this.Field12926;
    }
    
    public void setMaximum(final int field12927) {
        this.Field12927 = field12927;
    }
    
    public int getMaximum() {
        return this.Field12927;
    }
    
    public void setValue(int i) {
        if (i > this.Field12927) {
            i = this.Field12927;
        }
        else if (i < this.Field12926) {
            i = this.Field12926;
        }
        this.Field12922.setText(String.valueOf(i));
    }
    
    public int getValue() {
        final String getText = this.Field12922.getText();
        if (getText.length() == 0 || getText.equals("-")) {
            return 0;
        }
        return Integer.parseInt(getText);
    }
    
    static {
        Field12921 = 12;
        Field12920 = 0;
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x57B ^ 0xE1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
