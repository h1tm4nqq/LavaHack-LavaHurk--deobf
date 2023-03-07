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

public class xZkjrtF08vBQgNcRBprEAj7rCOfKkEbj
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static xZkjrtF08vBQgNcRBprEAj7rCOfKkEbj Field16941 = new xZkjrtF08vBQgNcRBprEAj7rCOfKkEbj();
    public float Field16942;
    public float Field16943 = Float.intBitsToFloat((int)1889661920L ^ 0x4C8224EA);
    private String Field16944 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public xZkjrtF08vBQgNcRBprEAj7rCOfKkEbj() {
        super("blueflames.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field16942);
        this.Field16942 += this.Field16943 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1655175426L ^ 0x9D5806FE;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-150228096 ^ (long)-150228097);
            int n2 = (int)((long)169166224 ^ (long)169166193);
            cArray2[n] = (char)(cArray[n] ^ ((int)2068451665L ^ 0x7B4A6BAA ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

