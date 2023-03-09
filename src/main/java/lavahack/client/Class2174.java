//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiButton
 *  net.minecraft.client.gui.GuiScreen
 *  net.minecraft.util.text.TextFormatting
 */
package lavahack.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lavahack.client.Class1546;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;

public class Class2174
extends GuiScreen {
    public static final String[] Field17946 = new String[]{"\u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453", "_ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e", "_ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026", "_ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020", "_ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021", "_ _ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac", "_ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021", "_ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020", "_ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026", "_ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e", "\u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453", "\u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _", "\u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _", "\u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _", "\u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _", "\u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _ _", "\u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _", "\u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _", "\u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _", "\u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _"};
    public GuiScreen Field17947;
    public List Field17948 = new ArrayList();
    public boolean Field17949 = false;
    public int Field17950;
    private String Field17951 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2174(GuiScreen guiScreen) {
        this.Field17947 = guiScreen;
        Class1546.Method6104(this);
    }

    public void initGui() {
        this.addButton(new GuiButton(0, this.width / 2 - 50, this.height - 24, 100, 20, "Cancel"));
    }

    protected void actionPerformed(GuiButton guiButton) throws IOException {
        if (guiButton.id != 0) return;
        this.mc.displayGuiScreen(this.Field17947);
    }

    public void updateScreen() {
        ++this.Field17950;
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "Microsoft Auth", this.width / 2, 10, -1);
        for (int i = 0; i < this.Field17948.size(); ++i) {
            this.drawCenteredString(this.fontRenderer, (String)this.Field17948.get(i), this.width / 2, this.height / 2 + i * 10, -1);
        }
        if (!this.Field17949) {
            this.drawCenteredString(this.fontRenderer, Field17946[this.Field17950 % Field17946.length], this.width / 2, this.height / 3 * 2, -256);
        }
        super.drawScreen(n, n2, f);
    }

    public void onGuiClosed() {
        Class1546.Method6105();
        super.onGuiClosed();
    }

    public void setState(String string) {
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.addScheduledTask(() -> this.lambda$setState$0(minecraft, string));
    }

    public void error(String string) {
        Minecraft minecraft = Minecraft.getMinecraft();
        minecraft.addScheduledTask(() -> this.lambda$error$1(minecraft, string));
    }

    private void lambda$error$1(Minecraft minecraft, String string) {
        this.Field17948 = minecraft.fontRenderer.listFormattedStringToWidth(TextFormatting.RED + "Error: " + string, this.width);
        this.Field17949 = true;
    }

    private void lambda$setState$0(Minecraft minecraft, String string) {
        this.Field17948 = minecraft.fontRenderer.listFormattedStringToWidth(string, this.width);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 109;
            cArray2[n] = (char)(cArray[n] ^ (0x34A4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

