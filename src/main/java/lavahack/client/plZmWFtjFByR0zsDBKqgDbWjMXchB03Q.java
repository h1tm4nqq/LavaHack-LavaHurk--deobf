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

public class plZmWFtjFByR0zsDBKqgDbWjMXchB03Q
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static plZmWFtjFByR0zsDBKqgDbWjMXchB03Q Field16604 = new plZmWFtjFByR0zsDBKqgDbWjMXchB03Q();
    public float Field16605;
    public float Field16606 = Float.intBitsToFloat((int)((long)1189841872 ^ (long)2059951322));
    private String Field16607 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public plZmWFtjFByR0zsDBKqgDbWjMXchB03Q() {
        super("golden.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field16605);
        this.Field16605 += this.Field16606 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-35128882 ^ (long)-35128882);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-509989059L ^ 0xE19A2FC2);
            int n2 = (int)((long)776275768 ^ (long)776275871);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1275198490 ^ (long)1275181713) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

