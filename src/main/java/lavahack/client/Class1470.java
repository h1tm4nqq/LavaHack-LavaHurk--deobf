//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import net.minecraft.client.resources.*;
import net.minecraft.client.renderer.*;
import net.minecraft.item.*;

class Class1470 extends GuiSlot
{
    private final Minecraft Field14868;
    private final Class510 Field14869;
    private final String Field14870;
    private final String Field14871;
    protected int Field14872;
    private String Field14873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class1470(final Class510 field14869) {
        super(Minecraft.getMinecraft(), field14869.width, field14869.height, 16, field14869.height - 34, 24);
        this.Field14868 = Minecraft.getMinecraft();
        this.Field14870 = I18n.format("schematica.gui.materialavailable", new Object[0]);
        this.Field14871 = I18n.format("schematica.gui.materialmissing", new Object[0]);
        this.Field14872 = -1;
        this.Field14869 = field14869;
        this.Field14872 = -1;
    }
    
    protected int getSize() {
        return this.Field14869.Field10153.size();
    }
    
    protected void elementClicked(final int field14872, final boolean b, final int n, final int n2) {
        this.Field14872 = field14872;
    }
    
    protected boolean isSelected(final int n) {
        return n == this.Field14872;
    }
    
    protected void drawBackground() {
    }
    
    protected void drawContainerBackground(final Tessellator tessellator) {
    }
    
    protected int getScrollBarX() {
        return this.width / 2 + this.getListWidth() / 2 + 2;
    }
    
    protected void drawSlot(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        final Class1947 class1947 = this.Field14869.Field10153.get(n);
        final ItemStack field16997 = class1947.Field16997;
        final String method7229 = class1947.Method7229();
        final String method7230 = class1947.Method7230();
        final String method7231 = class1947.Method7231(this.Field14870, this.Field14871);
        Class2042.Method7538(this.Field14868.renderEngine, field16997, n2, n3);
        this.Field14869.drawString(this.Field14868.fontRenderer, method7229, n2 + 24, n3 + 6, 16777215);
        this.Field14869.drawString(this.Field14868.fontRenderer, method7230, n2 + 215 - this.Field14868.fontRenderer.getStringWidth(method7230), n3 + 1, 16777215);
        this.Field14869.drawString(this.Field14868.fontRenderer, method7231, n2 + 215 - this.Field14868.fontRenderer.getStringWidth(method7231), n3 + 11, 16777215);
        if (n5 > n2 && n6 > n3 && n5 <= n2 + 18 && n6 <= n3 + 18) {
            this.Field14869.Method2355(field16997, n5, n6);
            GlStateManager.disableLighting();
        }
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x53B3 ^ 0xD8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
