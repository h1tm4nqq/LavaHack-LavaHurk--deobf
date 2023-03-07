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

public class sVFvSJCg9iERJA0BOC50G1vZk9CkuJF8
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static sVFvSJCg9iERJA0BOC50G1vZk9CkuJF8 Field15415 = new sVFvSJCg9iERJA0BOC50G1vZk9CkuJF8();
    public float Field15416;
    public float Field15417 = Float.intBitsToFloat(0xB7C1794 ^ 0x3630DB59);
    private String Field15418 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public sVFvSJCg9iERJA0BOC50G1vZk9CkuJF8() {
        super("flow.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field15416);
        this.Field15416 += this.Field15417 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1118807605 ^ (long)1118807605);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1236049732 ^ (long)1236049851);
            int n2 = (int)((long)1063347248 ^ (long)1063347261) << 4;
            cArray2[n] = (char)(cArray[n] ^ (((int)-523119586L ^ 0xE0D1D4FB) << 7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

