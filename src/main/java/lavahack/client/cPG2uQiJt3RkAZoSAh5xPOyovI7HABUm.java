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

public class cPG2uQiJt3RkAZoSAh5xPOyovI7HABUm
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static cPG2uQiJt3RkAZoSAh5xPOyovI7HABUm Field14238 = new cPG2uQiJt3RkAZoSAh5xPOyovI7HABUm();
    public float Field14239;
    public float Field14240 = Float.intBitsToFloat(0x4D8C1071 ^ 0x70C0DCBC);
    private int Field14241;

    public cPG2uQiJt3RkAZoSAh5xPOyovI7HABUm() {
        super("smoke.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field14239);
        this.Field14239 += this.Field14240 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1033592675L ^ 0x3D9B5F63;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)417867397 ^ (long)417867386);
            int n2 = ((int)-2069697380L ^ 0x84A2EC81) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1649127480 ^ (long)1649130337) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

