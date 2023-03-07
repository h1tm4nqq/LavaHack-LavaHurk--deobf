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

public class PW3PTCJpm6BzaRuVfH021Jby5mcYYvWE
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static PW3PTCJpm6BzaRuVfH021Jby5mcYYvWE Field16482 = new PW3PTCJpm6BzaRuVfH021Jby5mcYYvWE();
    public float Field16483;
    public float Field16484 = Float.intBitsToFloat((int)1024406630L ^ 0x12CE36C);
    private String Field16485 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public PW3PTCJpm6BzaRuVfH021Jby5mcYYvWE() {
        super("codex.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field16483);
        this.Field16483 += this.Field16484 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-972798125L ^ 0xC6044753;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)465842226L ^ 0x1BC430CD);
            int n2 = (int)((long)458352074 ^ (long)458352127) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-940822378 ^ (long)-940821007) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

