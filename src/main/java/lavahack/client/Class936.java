//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.ResourceLocation
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class2142;
import lavahack.client.Class753;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public enum Class936 implements Class2142
{
    Field11994(new ResourceLocation("kismancc:icons/enabled1.png")),
    Field11995(new ResourceLocation("kismancc:icons/logo.png")),
    Field11996(new ResourceLocation("kismancc:icons/sex.png")),
    Field11997(new ResourceLocation("kismancc:icons/color-picker.png")),
    Field11998(new ResourceLocation("kismancc:icons/loadingscreen.png"));

    public final ResourceLocation Field11999;
    private String Field12001 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Class936() {
        void var3_1;
        this.Field11999 = var3_1;
    }

    public void Method3868(double d, double d2, double d3, double d4) {
        this.Method3869(d, d2, d3, d4, new Class2027(-1));
    }

    public void Method3869(double d, double d2, double d3, double d4, Class2027 class2027) {
        GL11.glPushMatrix();
        ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS.getTextureManager().bindTexture(this.Field11999);
        GL11.glColor4f((float)class2027.Field17325, (float)class2027.Field17326, (float)class2027.Field17327, (float)class2027.Field17328);
        Class753.drawModalRectWithCustomSizedTexture(d, d2, 0.0f, 0.0f, d3, d4, d3, d4);
        GL11.glPopMatrix();
    }

    private static String Method3870(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 148;
            cArray2[n] = (char)(cArray[n] ^ (0x255A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

