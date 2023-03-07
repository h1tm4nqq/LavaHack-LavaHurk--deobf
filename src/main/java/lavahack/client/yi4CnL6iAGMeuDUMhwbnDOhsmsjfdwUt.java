//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import lavahack.client.hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public final class yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt
extends Enum
implements Ljc0gDTN8WkwPRHY480HpEkScGALG41A {
    public static final /* enum */ yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt Field11994 = new yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt("CHECKED_CHECKBOX", (int)-946197231L ^ 0xC79A2D11, new ResourceLocation("kismancc:icons/enabled1.png"));
    public static final /* enum */ yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt Field11995 = new yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt("LOGO", (int)((long)-552429598 ^ (long)-552429597), new ResourceLocation("kismancc:icons/logo.png"));
    public static final /* enum */ yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt Field11996 = new yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt("LOGO_NEW", (int)((long)841096112 ^ (long)841096113) << 1, new ResourceLocation("kismancc:icons/sex.png"));
    public static final /* enum */ yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt Field11997 = new yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt("COLOR_PICKER", (int)1281708153L ^ 0x4C65507A, new ResourceLocation("kismancc:icons/color-picker.png"));
    public static final /* enum */ yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt Field11998 = new yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt("LOADING_SCREEN_IMAGE", ((int)-2007362175L ^ 0x885A1580) << 2, new ResourceLocation("kismancc:icons/loadingscreen.png"));
    public final ResourceLocation Field11999;
    private static final yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt[] Field12000;
    private String Field12001 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt[] values() {
        return (yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt[])Field12000.clone();
    }

    public static yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt valueOf(String string) {
        return Enum.valueOf(yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.Field11999 = var3_1;
    }

    public void Method3868(double d, double d2, double d3, double d4) {
        this.Method3869(d, d2, d3, d4, new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV((int)((long)-1573703258 ^ (long)1573703257)));
    }

    public void Method3869(double d, double d2, double d3, double d4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2) {
        GL11.glPushMatrix();
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getTextureManager().bindTexture(this.Field11999);
        GL11.glColor4f((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17325, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17326, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17327, (float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17328);
        hS2q7nEd8dHHQz33Sb2fmP8f1QDk01hc.drawModalRectWithCustomSizedTexture(d, d2, 0.0f, 0.0f, d3, d4, d3, d4);
        GL11.glPopMatrix();
    }

    static {
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt[] yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray = new yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUt[(int)((long)-713172614 ^ (long)-713172609)];
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray[(int)((long)-634798850 ^ (long)-634798850)] = Field11994;
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray[(int)1732387965L ^ 0x6742247C] = Field11995;
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray[((int)977781925L ^ 0x3A47C4A4) << 1] = Field11996;
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray[(int)297866523L ^ 0x11C11518] = Field11997;
        yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray[(int)((long)1426666932 ^ (long)1426666933) << 2] = Field11998;
        Field12000 = yi4CnL6iAGMeuDUMhwbnDOhsmsjfdwUtArray;
    }

    private static String Method3870(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)87798061 ^ (long)87798061);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)422898314 ^ (long)422898293);
            int n2 = ((int)1151433735L ^ 0x44A17C22) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-561501601 ^ (long)-561497870) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

