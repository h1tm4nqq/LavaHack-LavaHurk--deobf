//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.Class1591;
import org.lwjgl.opengl.GL20;

public final class Class2114
extends Class1591 {
    public static final Class2114 Field17609 = new Class2114();
    public float Field17610;
    public float Field17611;
    public float Field17612;
    public float Field17613;
    public float Field17614;
    public float Field17615;
    private String Field17616 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class2114() {
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
        GL20.glUniform1i((int)this.Method238("texture"), (int)0);
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)Class2114.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field17610 * this.Field17611)), (float)(1.0f / (float)Class2114.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field17610 * this.Field17611)));
        GL20.glUniform3f((int)this.Method238("color"), (float)this.Field17612, (float)this.Field17613, (float)this.Field17614);
        GL20.glUniform1f((int)this.Method238("divider"), (float)Float.intBitsToFloat(1124859904));
        GL20.glUniform1f((int)this.Method238("radius"), (float)this.Field17610);
        GL20.glUniform1f((int)this.Method238("maxSample"), (float)Float.intBitsToFloat(1092616192));
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 233;
            cArray2[n] = (char)(cArray[n] ^ (0xF6C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

