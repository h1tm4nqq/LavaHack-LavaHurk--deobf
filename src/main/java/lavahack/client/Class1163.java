//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  org.lwjgl.opengl.GL11
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class22;
import lavahack.client.Class340;
import lavahack.client.Class92;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Class1163
extends Class22 {
    public float Field13254;
    public Class340 Field13255;
    private String Field13256 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1163(Class340 class340, Color color, float f) {
        super(class340.Method1672(), color, false, 1.0f);
        this.Field13255 = class340;
        this.Field13254 = f;
    }

    @Override
    public void Method190() {
        super.Method190();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        Class92.Field8312.Method783();
        Class92.Field8312.Method788("color", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getRed(), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getGreen(), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getBlue(), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getAlpha());
        Class92.Field8312.Method786("resolution", Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        Class92.Field8312.Method786("center", (this.Field13255.Method1673() + (this.Field13255.Method1675() - this.Field13255.Method1673()) / 2.0f) * 2.0f, (this.Field13255.Method1674() + (this.Field13255.Method1676() - this.Field13255.Method1674()) / 2.0f) * 2.0f);
        Class92.Field8312.Method786("dst", (this.Field13255.Method1675() - this.Field13255.Method1673() - this.Field13254) * 2.0f, (this.Field13255.Method1675() - this.Field13255.Method1673() - this.Field13254) * 2.0f);
        Class92.Field8312.Method785("radius", this.Field13254);
        GL11.glBegin((int)7);
        this.Field13255.Method1677();
        GL11.glEnd();
        Class92.Field8312.Method789();
        GL11.glEnable((int)3008);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private static String Method4689(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 232;
            cArray2[n] = (char)(cArray[n] ^ (0x32B3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

