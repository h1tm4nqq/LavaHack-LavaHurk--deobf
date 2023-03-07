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

public class iB09fLYs8CbO37nZIEUKqoRb7SE6F6Ds
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static iB09fLYs8CbO37nZIEUKqoRb7SE6F6Ds Field8254 = new iB09fLYs8CbO37nZIEUKqoRb7SE6F6Ds();
    public float Field8255;
    public float Field8256 = Float.intBitsToFloat((int)728788462L ^ 0x163CA123);
    private String Field8257 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public iB09fLYs8CbO37nZIEUKqoRb7SE6F6Ds() {
        super("unu.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field8255);
        this.Field8255 += this.Field8256 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)828962774L ^ 0x3168F7D6;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1259042826 ^ (long)1259043061);
            int n2 = (int)((long)306655014 ^ (long)306655041) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1306433845 ^ (long)1306452552) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

