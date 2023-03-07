//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.QeKqDKHtLfIoFEKMMGksH0qruCVSVC83;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

public class HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static final HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3 Field11855 = new HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3();
    public boolean Field11856;
    public float Field11857 = 0.0f;
    public float Field11858 = 1.0f;
    public float Field11859 = 0.0f;
    public boolean Field11860;
    public boolean Field11861;
    public float Field11862;
    public float Field11863;
    public float Field11864;
    public float Field11865;
    public float Field11866;
    private String Field11867 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3() {
        super("itemglow.frag");
    }

    @Override
    public void Method232() {
        this.Method237("texture");
        this.Method237("texelSize");
        this.Method237("color");
        this.Method237("divider");
        this.Method237("radius");
        this.Method237("maxSample");
        this.Method237("dimensions");
        this.Method237("blur");
        this.Method237("mixFactor");
        this.Method237("minAlpha");
        this.Method237("image");
        this.Method237("imageMix");
        this.Method237("useImage");
    }

    @Override
    public void Method233() {
        GL20.glUniform1i((int)this.Method238("texture"), (int)((int)-1966086868L ^ 0x8ACFE52C));
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field11865 * this.Field11866)), (float)(1.0f / (float)HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field11865 * this.Field11866)));
        GL20.glUniform3f((int)this.Method238("color"), (float)this.Field11862, (float)this.Field11863, (float)this.Field11864);
        GL20.glUniform1f((int)this.Method238("divider"), (float)Float.intBitsToFloat((int)((long)1635449239 ^ (long)578222487)));
        GL20.glUniform1f((int)this.Method238("radius"), (float)this.Field11865);
        GL20.glUniform1f((int)this.Method238("maxSample"), (float)Float.intBitsToFloat((int)((long)1053454141 ^ (long)2146070333)));
        GL20.glUniform2f((int)this.Method238("dimensions"), (float)HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth, (float)HA1Kpurc6DBOhsGf6bKqGpUDtWxhKwO3.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight);
        GL20.glUniform1i((int)this.Method238("blur"), (int)(this.Field11856 ? (int)((long)-964928361 ^ (long)-964928362) : (int)((long)1736247440 ^ (long)1736247440)));
        GL20.glUniform1f((int)this.Method238("mixFactor"), (float)this.Field11857);
        GL20.glUniform1f((int)this.Method238("minAlpha"), (float)this.Field11858);
        GL13.glActiveTexture((int)(((int)-1791592961L ^ 0x95366566) << 3));
        GL11.glBindTexture((int)((int)((long)0x8833323 ^ (long)142819010)), (int)((int)((long)-581068028 ^ (long)-581068028)));
        GL20.glUniform1i((int)this.Method238("image"), (int)(((int)-2146625048L ^ 0x800D19E9) << 3));
        GL13.glActiveTexture((int)(((int)541262670L ^ 0x2043015D) << 6));
        GL20.glUniform1f((int)this.Method238("imageMix"), (float)this.Field11859);
        GL20.glUniform1i((int)this.Method238("useImage"), (int)(this.Field11860 ? (int)((long)2026915084 ^ (long)2026915085) : (int)-1445054638L ^ 0xA9DE3752));
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1707691347L ^ 0x9A36B2AD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-742426922L ^ 0xD3BF7629);
            int n2 = ((int)-118536630L ^ 0xF8EF4655) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1203418683L ^ 0xB8452B9A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

