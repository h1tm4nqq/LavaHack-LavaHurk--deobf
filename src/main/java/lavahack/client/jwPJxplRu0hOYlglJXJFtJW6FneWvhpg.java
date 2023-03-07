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

public class jwPJxplRu0hOYlglJXJFtJW6FneWvhpg
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static jwPJxplRu0hOYlglJXJFtJW6FneWvhpg Field9083 = new jwPJxplRu0hOYlglJXJFtJW6FneWvhpg();
    public float Field9084;
    public float Field9085 = Float.intBitsToFloat((int)((long)1560894031 ^ (long)1630178629));
    private String Field9086 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public jwPJxplRu0hOYlglJXJFtJW6FneWvhpg() {
        super("crazy.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field9084);
        this.Field9084 += this.Field9085 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1079542185L ^ 0x405881A9;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)308365210 ^ (long)308365157);
            int n2 = (int)((long)-942736773 ^ (long)-942736808) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)977852874L ^ 0x3A48876B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

