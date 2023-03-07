//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.QeKqDKHtLfIoFEKMMGksH0qruCVSVC83;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL20;

public class gR98ND7OG3AUoXwLG3DMmpRrvz0DGa9n
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static gR98ND7OG3AUoXwLG3DMmpRrvz0DGa9n Field10583 = new gR98ND7OG3AUoXwLG3DMmpRrvz0DGa9n();
    public float Field10584;
    public float Field10585 = Float.intBitsToFloat((int)((long)971978887 ^ (long)57420520));
    private String Field10586 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public gR98ND7OG3AUoXwLG3DMmpRrvz0DGa9n() {
        super("smoky.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field10584);
        this.Field10584 += this.Field10585 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-800689980 ^ (long)-800689980);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1886935771L ^ 0x8F87A5DA);
            int n2 = ((int)46118476L ^ 0x2BFB625) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)655595723L ^ 0x2713910C) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

