//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public class Class910 extends Class1591
{
    public static final Class910 Field11855;
    public boolean Field11856;
    public float Field11857;
    public float Field11858;
    public float Field11859;
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
        this.Field11857 = 0.0f;
        this.Field11858 = 1.0f;
        this.Field11859 = 0.0f;
    }
    
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
    
    public void Method233() {
        GL20.glUniform1i(this.Method238("texture"), 0);
        GL20.glUniform2f(this.Method238("texelSize"), 1.0f / Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field11865 * this.Field11866), 1.0f / Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field11865 * this.Field11866));
        GL20.glUniform3f(this.Method238("color"), this.Field11862, this.Field11863, this.Field11864);
        GL20.glUniform1f(this.Method238("divider"), Float.intBitsToFloat(1124859904));
        GL20.glUniform1f(this.Method238("radius"), this.Field11865);
        GL20.glUniform1f(this.Method238("maxSample"), Float.intBitsToFloat(1092616192));
        GL20.glUniform2f(this.Method238("dimensions"), (float)Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth, (float)Class910.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight);
        GL20.glUniform1i(this.Method238("blur"), (int)(this.Field11856 ? 1 : 0));
        GL20.glUniform1f(this.Method238("mixFactor"), this.Field11857);
        GL20.glUniform1f(this.Method238("minAlpha"), this.Field11858);
        GL13.glActiveTexture(33992);
        GL11.glBindTexture(3553, 0);
        GL20.glUniform1i(this.Method238("image"), 8);
        GL13.glActiveTexture(33984);
        GL20.glUniform1f(this.Method238("imageMix"), this.Field11859);
        GL20.glUniform1i(this.Method238("useImage"), (int)(this.Field11860 ? 1 : 0));
    }
    
    static {
        Field11855 = new Class910();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x625F ^ 0x3E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
