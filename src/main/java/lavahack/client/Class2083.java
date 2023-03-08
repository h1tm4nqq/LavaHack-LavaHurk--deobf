//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.gui.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import org.apache.commons.io.*;

public class Class2083 extends GuiSlot
{
    private final Minecraft Field17513;
    private final Class483 Field17514;
    protected int Field17515;
    private long Field17516;
    private int Field17517;
    
    public Class2083(final Class483 field17514) {
        super(Minecraft.getMinecraft(), field17514.width, field17514.height, 16, field17514.height - 40, 24);
        this.Field17513 = Minecraft.getMinecraft();
        this.Field17515 = -1;
        this.Field17516 = 0L;
        this.Field17514 = field17514;
    }
    
    protected int getSize() {
        return this.Field17514.Field10017.size();
    }
    
    protected void elementClicked(final int field17515, final boolean b, final int n, final int n2) {
        final boolean b2 = Minecraft.getSystemTime() - this.Field17516 < 500L;
        this.Field17516 = Minecraft.getSystemTime();
        final Class156 class156 = this.Field17514.Field10017.get(field17515);
        if (class156.Method1052()) {
            this.Field17514.Method2239(class156.Method1049());
            this.Field17515 = -1;
        }
        else {
            this.Field17515 = field17515;
        }
    }
    
    protected boolean isSelected(final int n) {
        return n == this.Field17515;
    }
    
    protected void drawBackground() {
    }
    
    protected void drawContainerBackground(final Tessellator tessellator) {
    }
    
    protected void drawSlot(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        if (n < 0 || n >= this.Field17514.Field10017.size()) {
            return;
        }
        final Class156 class156 = this.Field17514.Field10017.get(n);
        final String method1049 = class156.Method1049();
        String s;
        if (class156.Method1052()) {
            s = method1049 + "/";
        }
        else {
            s = FilenameUtils.getBaseName(method1049);
        }
        Class2042.Method7538(this.Field17513.renderEngine, class156.Method1053(), n2, n3);
        this.Field17514.drawString(this.Field17513.fontRenderer, s, n2 + 24, n3 + 6, 16777215);
    }
    
    private static String a(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2BE1 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
