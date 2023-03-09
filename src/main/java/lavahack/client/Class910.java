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

import lavahack.client.Class1591;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

public class Class910
extends Class1591 {
    public static final Class910 Field11855 = new Class910();
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

    public Class910() {
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
        GL20.glUniform1i((int)this.Method238("texture"), (int)0);
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field11865 * this.Field11866)), (float)(1.0f / (float)Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field11865 * this.Field11866)));
        GL20.glUniform3f((int)this.Method238("color"), (float)this.Field11862, (float)this.Field11863, (float)this.Field11864);
        GL20.glUniform1f((int)this.Method238("divider"), (float)Float.intBitsToFloat(1124859904));
        GL20.glUniform1f((int)this.Method238("radius"), (float)this.Field11865);
        GL20.glUniform1f((int)this.Method238("maxSample"), (float)Float.intBitsToFloat(1092616192));
        GL20.glUniform2f((int)this.Method238("dimensions"), (float)Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth, (float)Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight);
        GL20.glUniform1i((int)this.Method238("blur"), (int)(this.Field11856 ? 1 : 0));
        GL20.glUniform1f((int)this.Method238("mixFactor"), (float)this.Field11857);
        GL20.glUniform1f((int)this.Method238("minAlpha"), (float)this.Field11858);
        GL13.glActiveTexture((int)33992);
        GL11.glBindTexture((int)3553, (int)0);
        GL20.glUniform1i((int)this.Method238("image"), (int)8);
        GL13.glActiveTexture((int)33984);
        GL20.glUniform1f((int)this.Method238("imageMix"), (float)this.Field11859);
        GL20.glUniform1i((int)this.Method238("useImage"), (int)(this.Field11860 ? 1 : 0));
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 62;
            cArray2[n] = (char)(cArray[n] ^ (0x625F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

