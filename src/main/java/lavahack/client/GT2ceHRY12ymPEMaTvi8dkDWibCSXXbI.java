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

public class GT2ceHRY12ymPEMaTvi8dkDWibCSXXbI
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static GT2ceHRY12ymPEMaTvi8dkDWibCSXXbI Field13512 = new GT2ceHRY12ymPEMaTvi8dkDWibCSXXbI();
    public float Field13513;
    public float Field13514 = Float.intBitsToFloat((int)158529220L ^ 0x343E3A09);
    private String Field13515 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public GT2ceHRY12ymPEMaTvi8dkDWibCSXXbI() {
        super("aqua.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field13513);
        this.Field13513 += this.Field13514 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1868410755L ^ 0x90A2507D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-218672289 ^ (long)-218672224);
            int n2 = (int)((long)1671335779 ^ (long)1671335782) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)788811000L ^ 0x2F04596B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

