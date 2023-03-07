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
import lavahack.client.kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.text.TextFormatting;

public class j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR
extends GuiScreen {
    public static final String[] Field17946;
    public GuiScreen Field17947;
    public List Field17948 = new ArrayList();
    public boolean Field17949 = (int)((long)-18230083 ^ (long)-18230083);
    public int Field17950;
    private String Field17951 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public j5SIQw4VmltrFjd4nl2D1mWQeZJNyPUR(GuiScreen guiScreen) {
        this.Field17947 = guiScreen;
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6104(this);
    }

    public void initGui() {
        this.addButton(new GuiButton((int)-419062689L ^ 0xE7059C5F, this.width / ((int)((long)-1640126053 ^ (long)-1640126054) << 1) - ((int)((long)1355393913 ^ (long)1355393888) << 1), this.height - ((int)((long)-1399332182 ^ (long)-1399332183) << 3), ((int)-71585464L ^ 0xFBBBB151) << 2, ((int)-533202720L ^ 0xE037F8E5) << 2, "Cancel"));
    }

    protected void actionPerformed(GuiButton guiButton) throws IOException {
        if (guiButton.id != 0) return;
        this.mc.displayGuiScreen(this.Field17947);
    }

    public void updateScreen() {
        this.Field17950 += (int)((long)1033348848 ^ (long)1033348849);
    }

    public void drawScreen(int n, int n2, float f) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "Microsoft Auth", this.width / (((int)-1177079845L ^ 0xB9D72FDA) << 1), (int)((long)-1339191882 ^ (long)-1339191885) << 1, (int)1245020905L ^ 0xB5CA7D16);
        for (int i = (int)-391720212L ^ 0xE8A6D2EC; i < this.Field17948.size(); ++i) {
            this.drawCenteredString(this.fontRenderer, (String)this.Field17948.get(i), this.width / ((int)((long)1070804418 ^ (long)1070804419) << 1), this.height / (((int)-959709892L ^ 0xC6CBFD3D) << 1) + i * (((int)1840919357L ^ 0x6DBA3338) << 1), (int)((long)-1992474386 ^ (long)1992474385));
        }
        if (!this.Field17949) {
            this.drawCenteredString(this.fontRenderer, Field17946[this.Field17950 % Field17946.length], this.width / (((int)-1603805763L ^ 0xA067DDBC) << 1), this.height / (int)((long)-2052479437 ^ (long)-2052479440) * ((int)((long)-266960014 ^ (long)-266960013) << 1), (int)215365521L ^ 0xF329C891);
        }
        super.drawScreen(n, n2, f);
    }

    public void onGuiClosed() {
        kDJXFGGaYbbMxC5JZhUVuyONBQG0RovO.Method6105();
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
        this.Field17949 = (int)((long)-339901927 ^ (long)-339901928);
    }

    private void lambda$setState$0(Minecraft minecraft, String string) {
        this.Field17948 = minecraft.fontRenderer.listFormattedStringToWidth(string, this.width);
    }

    static {
        String[] stringArray = new String[(int)((long)1827589432 ^ (long)1827589437) << 2];
        stringArray[(int)((long)-133250966 ^ (long)-133250966)] = "\u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453";
        stringArray[(int)413097262L ^ 0x189F5D2F] = "_ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e";
        stringArray[((int)740138177L ^ 0x2C1D9CC0) << 1] = "_ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026";
        stringArray[(int)((long)879280178 ^ (long)879280177)] = "_ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020";
        stringArray[((int)-344847084L ^ 0xEB720D15) << 2] = "_ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021";
        stringArray[(int)1754779415L ^ 0x6897CF12] = "_ _ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac";
        stringArray[(int)((long)-167109145 ^ (long)-167109148) << 1] = "_ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021";
        stringArray[(int)((long)1297929470 ^ (long)1297929465)] = "_ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020";
        stringArray[((int)-432731035L ^ 0xE6350C64) << 3] = "_ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026";
        stringArray[(int)((long)-461382847 ^ (long)-461382840)] = "_ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e";
        stringArray[(int)((long)989640072 ^ (long)989640077) << 1] = "\u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453";
        stringArray[(int)((long)-2103526460 ^ (long)-2103526449)] = "\u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _";
        stringArray[((int)-1547389463L ^ 0xA3C4B5EA) << 2] = "\u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _";
        stringArray[(int)-2129523720L ^ 0x81120BF5] = "\u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _";
        stringArray[(int)((long)1284132699 ^ (long)1284132700) << 1] = "\u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _";
        stringArray[(int)2045018411L ^ 0x79E48124] = "\u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _ _";
        stringArray[(int)((long)570606084 ^ (long)570606085) << 4] = "\u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _";
        stringArray[(int)1135003674L ^ 0x43A6C80B] = "\u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _";
        stringArray[(int)((long)-2131116794 ^ (long)-2131116785) << 1] = "\u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _";
        stringArray[(int)((long)-484077172 ^ (long)-484077153)] = "\u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _";
        Field17946 = stringArray;
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-652268129 ^ (long)-652268129);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)205396251L ^ 0xC3E19E4);
            int n2 = (int)((long)-1112298631 ^ (long)-1112298732);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)933041145 ^ (long)933043920) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

