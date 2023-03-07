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

public class I3woNTVGwoHGbdgY4PGrnGDsU7kJlm3Q
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static I3woNTVGwoHGbdgY4PGrnGDsU7kJlm3Q Field10299 = new I3woNTVGwoHGbdgY4PGrnGDsU7kJlm3Q();
    public float Field10300;
    public float Field10301 = Float.intBitsToFloat(0x3A0A54A0 ^ 0x1A983AA);
    private String Field10302 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public I3woNTVGwoHGbdgY4PGrnGDsU7kJlm3Q() {
        super("hotshit.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field10300);
        this.Field10300 += this.Field10301 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1446322556L ^ 0xA9CADE84;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1126172955L ^ 0x432009E4);
            int n2 = (int)((long)498417632 ^ (long)498417547);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1528941160 ^ (long)-1528941085) << 8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

