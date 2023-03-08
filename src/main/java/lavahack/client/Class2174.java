//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.client.gui.*;
import java.io.*;
import net.minecraft.client.*;
import net.minecraft.util.text.*;

public class Class2174 extends GuiScreen
{
    public static final String[] Field17946;
    public GuiScreen Field17947;
    public List Field17948;
    public boolean Field17949;
    public int Field17950;
    private String Field17951 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class2174(final GuiScreen field17947) {
        this.Field17948 = new ArrayList();
        this.Field17949 = false;
        this.Field17947 = field17947;
        Class1546.Method6104(this);
    }
    
    public void initGui() {
        this.addButton(new GuiButton(0, this.width / 2 - 50, this.height - 24, 100, 20, "Cancel"));
    }
    
    protected void actionPerformed(final GuiButton guiButton) throws IOException {
        if (guiButton.id == 0) {
            this.mc.displayGuiScreen(this.Field17947);
        }
    }
    
    public void updateScreen() {
        ++this.Field17950;
    }
    
    public void drawScreen(final int n, final int n2, final float n3) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRenderer, "Microsoft Auth", this.width / 2, 10, -1);
        for (int i = 0; i < this.Field17948.size(); ++i) {
            this.drawCenteredString(this.fontRenderer, (String)this.Field17948.get(i), this.width / 2, this.height / 2 + i * 10, -1);
        }
        if (!this.Field17949) {
            this.drawCenteredString(this.fontRenderer, Class2174.Field17946[this.Field17950 % Class2174.Field17946.length], this.width / 2, this.height / 3 * 2, -256);
        }
        super.drawScreen(n, n2, n3);
    }
    
    public void onGuiClosed() {
        Class1546.Method6105();
        super.onGuiClosed();
    }
    
    public void setState(final String s) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        getMinecraft.addScheduledTask(this::lambda$setState$0);
    }
    
    public void error(final String s) {
        final Minecraft getMinecraft = Minecraft.getMinecraft();
        getMinecraft.addScheduledTask(this::lambda$error$1);
    }
    
    private void lambda$error$1(final Minecraft minecraft, final String str) {
        this.Field17948 = minecraft.fontRenderer.listFormattedStringToWidth(TextFormatting.RED + "Error: " + str, this.width);
        this.Field17949 = true;
    }
    
    private void lambda$setState$0(final Minecraft minecraft, final String s) {
        this.Field17948 = minecraft.fontRenderer.listFormattedStringToWidth(s, this.width);
    }
    
    static {
        Field17946 = new String[] { "\u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453", "_ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e", "_ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026", "_ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020", "_ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021", "_ _ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac", "_ _ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021", "_ _ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020", "_ _ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026", "_ \u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e", "\u0432\u2013\u0453 \u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453", "\u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _", "\u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _", "\u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _", "\u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _", "\u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _ _", "\u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _ _", "\u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _ _", "\u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _ _", "\u0432\u2013\u201e \u0432\u2013\u2026 \u0432\u2013\u2020 \u0432\u2013\u2021 \u0432\u2013\u20ac \u0432\u2013\u2021 \u0432\u2013\u2020 \u0432\u2013\u2026 \u0432\u2013\u201e \u0432\u2013\u0453 _" };
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x34A4 ^ 0x6D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
