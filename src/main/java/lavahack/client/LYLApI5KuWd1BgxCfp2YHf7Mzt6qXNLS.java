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

public class LYLApI5KuWd1BgxCfp2YHf7Mzt6qXNLS
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static LYLApI5KuWd1BgxCfp2YHf7Mzt6qXNLS Field16059 = new LYLApI5KuWd1BgxCfp2YHf7Mzt6qXNLS();
    public float Field16060;
    public float Field16061 = Float.intBitsToFloat((int)903769974L ^ 0x892A3BB);
    private String Field16062 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public LYLApI5KuWd1BgxCfp2YHf7Mzt6qXNLS() {
        super("purple.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field16060);
        this.Field16060 += this.Field16061 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1468351655 ^ (long)-1468351655);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-625319539 ^ (long)-625319566);
            int n2 = (int)((long)1281584528 ^ (long)1281584571);
            cArray2[n] = (char)(cArray[n] ^ ((int)684186787L ^ 0x28C787D0 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

