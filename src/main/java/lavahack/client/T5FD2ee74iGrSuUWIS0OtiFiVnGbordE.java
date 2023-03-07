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

public class T5FD2ee74iGrSuUWIS0OtiFiVnGbordE
extends GuiButton {
    private static final int Field12920;
    private static final int Field12921;
    private final GuiTextField Field12922;
    private final GuiButton Field12923;
    private final GuiButton Field12924;
    private String Field12925 = String.valueOf((int)-195772529L ^ 0xF454BF8F);
    private int Field12926 = (int)1704302287L ^ 0xE59596CF;
    private int Field12927 = Integer.MAX_VALUE;
    private boolean Field12928 = (int)944136762L ^ 0x3846623A;
    private String Field12929 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(FontRenderer fontRenderer, int n, int n2, int n3) {
        this(fontRenderer, n, n2, n3, (int)((long)-303645174 ^ (long)-303645165) << 2, (int)((long)-1736559588 ^ (long)-1736559591) << 2);
    }

    public T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(FontRenderer fontRenderer, int n, int n2, int n3, int n4) {
        this(fontRenderer, n, n2, n3, n4, (int)((long)1431541186 ^ (long)1431541191) << 2);
    }

    public T5FD2ee74iGrSuUWIS0OtiFiVnGbordE(FontRenderer fontRenderer, int n, int n2, int n3, int n4, int n5) {
        super(n, (int)1455020524L ^ 0x56B9D9EC, (int)((long)-374657173 ^ (long)-374657173), n4, n5, "");
        this.Field12922 = new GuiTextField((int)-1411906595L ^ 0xABD803DD, fontRenderer, n2 + ((int)-1296693143L ^ 0xB2B60868), n3 + ((int)-435975628L ^ 0xE6038A35), n4 - (((int)1547695308L ^ 0x5C3FF4CF) << 3) - (((int)-1187094761L ^ 0xB93E5F16) << 1), n5 - (((int)-1807689441L ^ 0x9440D91E) << 1));
        this.Field12923 = new GuiButton((int)((long)480335975 ^ (long)480335974), n2 + n4 - (((int)19433191L ^ 0x12886E4) << 3), n3, ((int)-872318424L ^ 0xCC017A2B) << 2, n5, "-");
        this.Field12924 = new GuiButton(((int)-144287153L ^ 0xF7665A4E) << 1, n2 + n4 - ((int)((long)1482992550 ^ (long)1482992549) << 2), n3, (int)((long)845798862 ^ (long)845798861) << 2, n5, "+");
        this.setValue((int)((long)-402760189 ^ (long)-402760189));
    }

    public boolean mousePressed(Minecraft minecraft, int n, int n2) {
        int n3;
        if (this.Field12928 && !this.Field12922.isFocused()) {
            this.Field12928 = (int)1795616958L ^ 0x6B06F0BE;
            return ((int)-1726993013L ^ 0x99102D8A) != 0;
        }
        this.Field12928 = this.Field12922.isFocused();
        if (!this.Field12923.mousePressed(minecraft, n, n2) && !this.Field12924.mousePressed(minecraft, n, n2)) {
            n3 = (int)((long)-843432818 ^ (long)-843432818);
            return n3 != 0;
        }
        n3 = (int)((long)1898571384 ^ (long)1898571385);
        return n3 != 0;
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
            this.setValue(this.getValue() + (int)((long)-1293202338 ^ (long)-1293202337));
        }
        if (!this.Field12923.mousePressed(minecraft, n, n2)) return;
        this.setValue(this.getValue() - ((int)806557475L ^ 0x30131722));
    }

    public boolean keyTyped(char c, int n) {
        if (!this.Field12922.isFocused()) {
            return (int)((long)261120641 ^ (long)261120641) != 0;
        }
        int n2 = this.Field12922.getCursorPosition();
        this.Field12922.textboxKeyTyped(c, n);
        String string = this.Field12922.getText();
        int n3 = this.Field12922.getCursorPosition();
        if (string.length() == 0) return (int)((long)-1966925330 ^ (long)-1966925329) != 0;
        if (string.equals("-")) {
            return (int)((long)-1966925330 ^ (long)-1966925329) != 0;
        }
        long l = Long.parseLong(string);
        int n4 = (int)((long)-1305869985 ^ (long)-1305869985);
        if (l > (long)this.Field12927) {
            l = this.Field12927;
            n4 = (int)307231981L ^ 0x124FFCEC;
        } else if (l < (long)this.Field12926) {
            l = this.Field12926;
            n4 = (int)((long)1743249451 ^ (long)1743249450);
        }
        string = String.valueOf(l);
        if (string.equals(this.Field12925)) {
        } else {
            this.Field12922.setText(String.valueOf(l));
            this.Field12922.setCursorPosition(n3);
        }
        this.Field12925 = string;
        return (int)((long)-1556096941 ^ (long)-1556096942) != 0;
    }

    public void updateCursorCounter() {
        this.Field12922.updateCursorCounter();
    }

    public boolean isFocused() {
        return this.Field12922.isFocused();
    }

    public void setPosition(int n, int n2) {
        this.Field12922.x = n + ((int)-1975534183L ^ 0x8A3FBD98);
        this.Field12922.y = n2 + ((int)1153569661L ^ 0x44C2137C);
        this.Field12924.x = n + this.width - ((int)((long)-1837098974 ^ (long)-1837098975) << 3);
        this.Field12924.y = n2;
        this.Field12923.x = n + this.width - (((int)-1863494679L ^ 0x90ED53EA) << 2);
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
        if (string.length() == 0) return (int)-758952552L ^ 0xD2C34D98;
        if (!string.equals("-")) return Integer.parseInt(string);
        return (int)-758952552L ^ 0xD2C34D98;
    }

    static {
        Field12921 = ((int)682346136L ^ 0x28ABC69B) << 2;
        Field12920 = (int)((long)1005470108 ^ (long)1005470108);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1903217491L ^ 0x8E8F34AD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1553760396 ^ (long)-1553760373);
            int n2 = (int)((long)-438744620 ^ (long)-438744779);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1225499946 ^ (long)1225498705) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

