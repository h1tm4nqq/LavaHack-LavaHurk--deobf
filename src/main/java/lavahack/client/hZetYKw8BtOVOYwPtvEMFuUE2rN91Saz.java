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

public final class hZetYKw8BtOVOYwPtvEMFuUE2rN91Saz
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static final hZetYKw8BtOVOYwPtvEMFuUE2rN91Saz Field9528 = new hZetYKw8BtOVOYwPtvEMFuUE2rN91Saz();
    public float Field9529;
    public float Field9530;
    public float Field9531;
    public float Field9532;
    public float Field9533;
    public float Field9534;
    public float Field9535;
    public float Field9536;
    public float Field9537;
    private String Field9538 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public hZetYKw8BtOVOYwPtvEMFuUE2rN91Saz() {
        super("outline_custom.frag");
    }

    @Override
    public void Method232() {
        this.Method237("texelSize");
        this.Method237("color");
        this.Method237("divider");
        this.Method237("radius");
        this.Method237("maxSample");
        this.Method237("rainbowStrength");
        this.Method237("rainbowSpeed");
        this.Method237("saturation");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)hZetYKw8BtOVOYwPtvEMFuUE2rN91Saz.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field9529 * this.Field9530)), (float)(1.0f / (float)hZetYKw8BtOVOYwPtvEMFuUE2rN91Saz.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field9529 * this.Field9530)));
        int n = this.Method238("color");
        GL20.glUniform4f((int)this.Field9531, (float)this.Field9532, (float)this.Field9533, (float)this, (float)0.0f);
        GL20.glUniform1f((int)this.Method238("radius"), (float)this.Field9529);
        GL20.glUniform2f((int)this.Method238("rainbowStrength"), (float)this.Field9536, (float)this.Field9536);
        GL20.glUniform1f((int)this.Method238("rainbowSpeed"), (float)this.Field9535);
        GL20.glUniform1f((int)this.Method238("saturation"), (float)this.Field9537);
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-816422638L ^ 0xCF566112;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-29877123L ^ 0xFE381C82);
            int n2 = (int)((long)522219215 ^ (long)522219222);
            cArray2[n] = (char)(cArray[n] ^ (((int)-1824840374L ^ 0x933B0A23) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

