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

public class uTRiUJB4DNf95NxzINoWHnirh3v0EOsG
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static uTRiUJB4DNf95NxzINoWHnirh3v0EOsG Field10131 = new uTRiUJB4DNf95NxzINoWHnirh3v0EOsG();
    public float Field10132;
    public float Field10133 = Float.intBitsToFloat((int)((long)987818498 ^ (long)113458440));
    private int Field10134;

    public uTRiUJB4DNf95NxzINoWHnirh3v0EOsG() {
        super("holyfuck.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field10132);
        this.Field10132 += this.Field10133 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1573432333L ^ 0xA23753F3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-2054155300L ^ 0x85901323);
            int n2 = ((int)1521972534L ^ 0x5AB77521) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-467447222 ^ (long)-467447661) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

