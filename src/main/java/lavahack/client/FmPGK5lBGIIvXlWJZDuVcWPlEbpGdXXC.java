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

public class FmPGK5lBGIIvXlWJZDuVcWPlEbpGdXXC
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static FmPGK5lBGIIvXlWJZDuVcWPlEbpGdXXC Field15180 = new FmPGK5lBGIIvXlWJZDuVcWPlEbpGdXXC();
    public float Field15181;
    public float Field15182 = Float.intBitsToFloat(0x107C8EDE ^ 0x2C5F59D4);
    private String Field15183 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public FmPGK5lBGIIvXlWJZDuVcWPlEbpGdXXC() {
        super("techno.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field15181);
        this.Field15181 += this.Field15182 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)136804031L ^ 0x82776BF;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-274054175L ^ 0xEFAA431E);
            int n2 = ((int)1365388993L ^ 0x51622EC6) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)563878379 ^ (long)563877080) << 3 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

