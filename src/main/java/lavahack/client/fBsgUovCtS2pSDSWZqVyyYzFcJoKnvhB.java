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

public class fBsgUovCtS2pSDSWZqVyyYzFcJoKnvhB
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static fBsgUovCtS2pSDSWZqVyyYzFcJoKnvhB Field7934 = new fBsgUovCtS2pSDSWZqVyyYzFcJoKnvhB();
    public float Field7935;
    public float Field7936 = Float.intBitsToFloat(0x5932FDAA ^ 0x647E3167);
    private String Field7937 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public fBsgUovCtS2pSDSWZqVyyYzFcJoKnvhB() {
        super("hidef.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field7935);
        this.Field7935 += this.Field7936 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1938055346L ^ 0x738460B2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)727793486 ^ (long)727793585);
            int n2 = (int)((long)-281699680 ^ (long)-281699749);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-184114081 ^ (long)-184108770) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

