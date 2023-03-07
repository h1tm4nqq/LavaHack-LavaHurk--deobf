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

public class QjOLBlprItN3o0qNjQkDsNOBEmGdfREA
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static QjOLBlprItN3o0qNjQkDsNOBEmGdfREA Field13652 = new QjOLBlprItN3o0qNjQkDsNOBEmGdfREA();
    public float Field13653;
    public float Field13654 = Float.intBitsToFloat((int)2074006170L ^ 0x46D21E57);
    private int Field13655;

    public QjOLBlprItN3o0qNjQkDsNOBEmGdfREA() {
        super("red.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field13653);
        this.Field13653 += this.Field13654 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1476895266 ^ (long)1476895266);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-514408608L ^ 0xE156BF9F);
            int n2 = (int)((long)522209304 ^ (long)522209377) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1267109074 ^ (long)1267110865) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

