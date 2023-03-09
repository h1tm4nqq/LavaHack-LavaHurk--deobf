//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiSlot
 *  net.minecraft.client.renderer.Tessellator
 */
package lavahack.client;

import lavahack.client.Class156;
import lavahack.client.Class2042;
import lavahack.client.Class483;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.Tessellator;
import org.apache.commons.io.FilenameUtils;

public class Class2083
extends GuiSlot {
    private final Minecraft Field17513 = Minecraft.getMinecraft();
    private final Class483 Field17514;
    protected int Field17515 = -1;
    private long Field17516 = 0L;
    private int Field17517;

    public Class2083(Class483 class483) {
        super(Minecraft.getMinecraft(), class483.width, class483.height, 16, class483.height - 40, 24);
        this.Field17514 = class483;
    }

    protected int getSize() {
        return this.Field17514.Field10017.size();
    }

    protected void elementClicked(int n, boolean bl, int n2, int n3) {
        boolean bl2 = Minecraft.getSystemTime() - this.Field17516 < 500L;
        this.Field17516 = Minecraft.getSystemTime();
        Class156 class156 = (Class156)this.Field17514.Field10017.get(n);
        if (class156.Method1052()) {
            this.Field17514.Method2239(class156.Method1049());
            this.Field17515 = -1;
            return;
        }
        this.Field17515 = n;
    }

    protected boolean isSelected(int n) {
        if (n != this.Field17515) return false;
        return true;
    }

    protected void drawBackground() {
    }

    protected void drawContainerBackground(Tessellator tessellator) {
    }

    protected void drawSlot(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        if (n < 0) return;
        if (n >= this.Field17514.Field10017.size()) {
            return;
        }
        Class156 class156 = (Class156)this.Field17514.Field10017.get(n);
        String string = class156.Method1049();
        string = class156.Method1052() ? string + "/" : FilenameUtils.getBaseName(string);
        Class2042.Method7538(this.Field17513.renderEngine, class156.Method1053(), n2, n3);
        this.Field17514.drawString(this.Field17513.fontRenderer, string, n2 + 24, n3 + 6, 0xFFFFFF);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x2BE1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

