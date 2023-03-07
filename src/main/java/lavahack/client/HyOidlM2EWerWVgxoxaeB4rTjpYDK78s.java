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

import lavahack.client.Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF;
import lavahack.client.q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV;
import lavahack.client.vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;

class HyOidlM2EWerWVgxoxaeB4rTjpYDK78s
extends GuiSlot {
    private final Minecraft Field14868 = Minecraft.getMinecraft();
    private final Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF Field14869;
    private final String Field14870 = I18n.format((String)"schematica.gui.materialavailable", (Object[])new Object[(int)230404061L ^ 0xDBBAFDD]);
    private final String Field14871 = I18n.format((String)"schematica.gui.materialmissing", (Object[])new Object[(int)((long)204970414 ^ (long)204970414)]);
    protected int Field14872 = (int)((long)-1915023582 ^ (long)1915023581);
    private String Field14873 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public HyOidlM2EWerWVgxoxaeB4rTjpYDK78s(Z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF) {
        super(Minecraft.getMinecraft(), z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF.width, z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF.height, ((int)-1591629890L ^ 0xA121A7BF) << 4, z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF.height - ((int)((long)965742195 ^ (long)965742178) << 1), ((int)-651922806L ^ 0xD9247289) << 3);
        this.Field14869 = z5ZmD08b7JN6vOGXwjWIEkZYtXPbG5uF;
        this.Field14872 = (int)((long)-336783664 ^ (long)336783663);
    }

    protected int getSize() {
        return this.Field14869.Field10153.size();
    }

    protected void elementClicked(int n, boolean bl, int n2, int n3) {
        this.Field14872 = n;
    }

    protected boolean isSelected(int n) {
        int n2;
        if (n == this.Field14872) {
            n2 = (int)1744109355L ^ 0x67F4FF2A;
            return n2 != 0;
        }
        n2 = (int)((long)-1109267899 ^ (long)-1109267899);
        return n2 != 0;
    }

    protected void drawBackground() {
    }

    protected void drawContainerBackground(Tessellator tessellator) {
    }

    protected int getScrollBarX() {
        return this.width / ((int)((long)2027693218 ^ (long)2027693219) << 1) + this.getListWidth() / ((int)((long)1004956725 ^ (long)1004956724) << 1) + ((int)((long)1901446170 ^ (long)1901446171) << 1);
    }

    protected void drawSlot(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = (vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi)this.Field14869.Field10153.get(n);
        ItemStack itemStack = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16997;
        String string = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7229();
        String string2 = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7230();
        String string3 = vRSIZNgV5V35OSEkvipPXCLvRCwQ1pd7$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method7231(this.Field14870, this.Field14871);
        q2JUuQmmOGie5BgmmcrZ6oMKdcwstMiV.Method7538(this.Field14868.renderEngine, itemStack, n2, n3);
        this.Field14869.drawString(this.Field14868.fontRenderer, string, n2 + ((int)((long)964377204 ^ (long)964377207) << 3), n3 + (((int)1683751579L ^ 0x645C0298) << 1), (int)509212618L ^ 0x1EA60835);
        this.Field14869.drawString(this.Field14868.fontRenderer, string2, n2 + ((int)417144653L ^ 0x18DD1F9A) - this.Field14868.fontRenderer.getStringWidth(string2), n3 + ((int)1671177964L ^ 0x639C26ED), (int)((long)1054427342 ^ (long)1042724657));
        this.Field14869.drawString(this.Field14868.fontRenderer, string3, n2 + (int)((long)-958216646 ^ (long)-958216467) - this.Field14868.fontRenderer.getStringWidth(string3), n3 + ((int)869733147L ^ 0x33D71310), (int)-261872005L ^ 0xF09BD984);
        if (n5 <= n2) return;
        if (n6 <= n3) return;
        if (n5 > n2 + ((int)((long)1358615392 ^ (long)1358615401) << 1)) return;
        if (n6 > n3 + (((int)96689589L ^ 0x5C35DBC) << 1)) return;
        this.Field14869.Method2355(itemStack, n5, n6);
        GlStateManager.disableLighting();
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-692202914L ^ 0xD6BDD25E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2005198355 ^ (long)2005198572);
            int n2 = ((int)-2100584103L ^ 0x82CBA142) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)22874249L ^ 0x15D5B3A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

