//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiSlot
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.Tessellator
 *  net.minecraft.client.resources.I18n
 *  net.minecraft.item.ItemStack
 */
package lavahack.client;

import lavahack.client.Class1947;
import lavahack.client.Class2042;
import lavahack.client.Class510;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;

class Class1470
extends GuiSlot {
    private final Minecraft Field14868 = Minecraft.getMinecraft();
    private final Class510 Field14869;
    private final String Field14870 = I18n.format((String)"schematica.gui.materialavailable", (Object[])new Object[0]);
    private final String Field14871 = I18n.format((String)"schematica.gui.materialmissing", (Object[])new Object[0]);
    protected int Field14872 = -1;
    private String Field14873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1470(Class510 class510) {
        super(Minecraft.getMinecraft(), class510.width, class510.height, 16, class510.height - 34, 24);
        this.Field14869 = class510;
        this.Field14872 = -1;
    }

    protected int getSize() {
        return this.Field14869.Field10153.size();
    }

    protected void elementClicked(int n, boolean bl, int n2, int n3) {
        this.Field14872 = n;
    }

    protected boolean isSelected(int n) {
        if (n != this.Field14872) return false;
        return true;
    }

    protected void drawBackground() {
    }

    protected void drawContainerBackground(Tessellator tessellator) {
    }

    protected int getScrollBarX() {
        return this.width / 2 + this.getListWidth() / 2 + 2;
    }

    protected void drawSlot(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        Class1947 class1947 = (Class1947)this.Field14869.Field10153.get(n);
        ItemStack itemStack = class1947.Field16997;
        String string = class1947.Method7229();
        String string2 = class1947.Method7230();
        String string3 = class1947.Method7231(this.Field14870, this.Field14871);
        Class2042.Method7538(this.Field14868.renderEngine, itemStack, n2, n3);
        this.Field14869.drawString(this.Field14868.fontRenderer, string, n2 + 24, n3 + 6, 0xFFFFFF);
        this.Field14869.drawString(this.Field14868.fontRenderer, string2, n2 + 215 - this.Field14868.fontRenderer.getStringWidth(string2), n3 + 1, 0xFFFFFF);
        this.Field14869.drawString(this.Field14868.fontRenderer, string3, n2 + 215 - this.Field14868.fontRenderer.getStringWidth(string3), n3 + 11, 0xFFFFFF);
        if (n5 <= n2) return;
        if (n6 <= n3) return;
        if (n5 > n2 + 18) return;
        if (n6 > n3 + 18) return;
        this.Field14869.Method2355(itemStack, n5, n6);
        GlStateManager.disableLighting();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 216;
            cArray2[n] = (char)(cArray[n] ^ (0x53B3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

