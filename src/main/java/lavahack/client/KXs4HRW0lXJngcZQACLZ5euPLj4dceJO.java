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
import lavahack.client.Jl14CJNmtWTqlp58umYadtnd800b2Vd0;
import lavahack.client.Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T;
import lavahack.client.dEyNkKK7m9En8syt2f5PGzT6mmuTitT3;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class KXs4HRW0lXJngcZQACLZ5euPLj4dceJO
extends dEyNkKK7m9En8syt2f5PGzT6mmuTitT3 {
    public float Field13254;
    public Jl14CJNmtWTqlp58umYadtnd800b2Vd0 Field13255;
    private String Field13256 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public KXs4HRW0lXJngcZQACLZ5euPLj4dceJO(Jl14CJNmtWTqlp58umYadtnd800b2Vd0 jl14CJNmtWTqlp58umYadtnd800b2Vd0, Color color, float f) {
        super(jl14CJNmtWTqlp58umYadtnd800b2Vd0.Method1672(), color, ((int)1970691739L ^ 0x75765E9B) != 0, 1.0f);
        this.Field13255 = jl14CJNmtWTqlp58umYadtnd800b2Vd0;
        this.Field13254 = f;
    }

    @Override
    public void Method190() {
        super.Method190();
        GL11.glPushMatrix();
        GL11.glEnable((int)(((int)2007354095L ^ 0x77A5CF1E) << 1));
        GL11.glDisable((int)((int)((long)1230283572 ^ (long)1230283547) << 6));
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method783();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method788("color", this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getRed(), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getGreen(), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getBlue(), this.YlFSugLHQAjzunVBKfamPjSRsvHTy3jf.getAlpha());
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method786("resolution", Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method786("center", (this.Field13255.Method1673() + (this.Field13255.Method1675() - this.Field13255.Method1673()) / 2.0f) * 2.0f, (this.Field13255.Method1674() + (this.Field13255.Method1676() - this.Field13255.Method1674()) / 2.0f) * 2.0f);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method786("dst", (this.Field13255.Method1675() - this.Field13255.Method1673() - this.Field13254) * 2.0f, (this.Field13255.Method1675() - this.Field13255.Method1673() - this.Field13254) * 2.0f);
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method785("radius", this.Field13254);
        GL11.glBegin((int)((int)((long)967996748 ^ (long)967996747)));
        this.Field13255.Method1677();
        GL11.glEnd();
        Rl5I7qAwvNZQfZIf5qv7WIHgiOwZqk0T.Field8312.Method789();
        GL11.glEnable((int)((int)((long)338098163 ^ (long)338098140) << 6));
        GL11.glDisable((int)((int)((long)-1801275049 ^ (long)-1801274202) << 1));
        GL11.glPopMatrix();
    }

    private static String Method4689(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1402032595L ^ 0x539151D3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-242709273 ^ (long)-242709480);
            int n2 = (int)((long)1923193670 ^ (long)1923193691) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)602534489 ^ (long)602521834) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

