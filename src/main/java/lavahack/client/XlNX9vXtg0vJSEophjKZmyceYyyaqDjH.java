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

public class XlNX9vXtg0vJSEophjKZmyceYyyaqDjH
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static XlNX9vXtg0vJSEophjKZmyceYyyaqDjH Field11233 = new XlNX9vXtg0vJSEophjKZmyceYyyaqDjH();
    public float Field11234;
    public float Field11235 = Float.intBitsToFloat(0x5D182FEA ^ 0x61EDED65);
    private int Field11236;

    public XlNX9vXtg0vJSEophjKZmyceYyyaqDjH() {
        super("gamer.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field11234);
        this.Field11234 += this.Field11235 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1270162924 ^ (long)-1270162924);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1171270150L ^ 0xBA2FD505);
            int n2 = ((int)80408902L ^ 0x4CAF17D) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-713464953L ^ 0xD5794B70 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

