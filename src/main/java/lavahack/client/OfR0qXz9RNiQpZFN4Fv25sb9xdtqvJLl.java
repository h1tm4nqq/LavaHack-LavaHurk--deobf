//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.QeKqDKHtLfIoFEKMMGksH0qruCVSVC83;
import org.lwjgl.opengl.GL20;

public final class OfR0qXz9RNiQpZFN4Fv25sb9xdtqvJLl
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static final OfR0qXz9RNiQpZFN4Fv25sb9xdtqvJLl Field17609 = new OfR0qXz9RNiQpZFN4Fv25sb9xdtqvJLl();
    public float Field17610;
    public float Field17611;
    public float Field17612;
    public float Field17613;
    public float Field17614;
    public float Field17615;
    private String Field17616 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public OfR0qXz9RNiQpZFN4Fv25sb9xdtqvJLl() {
        super("glow.frag");
    }

    @Override
    public void Method232() {
        this.Method237("texture");
        this.Method237("texelSize");
        this.Method237("color");
        this.Method237("divider");
        this.Method237("radius");
        this.Method237("maxSample");
    }

    @Override
    public void Method233() {
        GL20.glUniform1i((int)this.Method238("texture"), (int)((int)((long)1312005835 ^ (long)1312005835)));
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)OfR0qXz9RNiQpZFN4Fv25sb9xdtqvJLl.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field17610 * this.Field17611)), (float)(1.0f / (float)OfR0qXz9RNiQpZFN4Fv25sb9xdtqvJLl.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field17610 * this.Field17611)));
        GL20.glUniform3f((int)this.Method238("color"), (float)this.Field17612, (float)this.Field17613, (float)this.Field17614);
        GL20.glUniform1f((int)this.Method238("divider"), (float)Float.intBitsToFloat(0x52F459FF ^ 0x11F859FF));
        GL20.glUniform1f((int)this.Method238("radius"), (float)this.Field17610);
        GL20.glUniform1f((int)this.Method238("maxSample"), (float)Float.intBitsToFloat(0x1F230418 ^ 0x5E030418));
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1131405641L ^ 0x436FE149;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1885719198 ^ (long)1885719137);
            int n2 = (int)((long)132043269 ^ (long)132043500);
            cArray2[n] = (char)(cArray[n] ^ (((int)1232125484L ^ 0x4970BDF7) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

