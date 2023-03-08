//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public final class Class2114 extends Class1591
{
    public static final Class2114 Field17609;
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
    
    public void Method232() {
        this.Method237("texture");
        this.Method237("texelSize");
        this.Method237("color");
        this.Method237("divider");
        this.Method237("radius");
        this.Method237("maxSample");
    }
    
    public void Method233() {
        GL20.glUniform1i(this.Method238("texture"), 0);
        GL20.glUniform2f(this.Method238("texelSize"), 1.0f / Class2114.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field17610 * this.Field17611), 1.0f / Class2114.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field17610 * this.Field17611));
        GL20.glUniform3f(this.Method238("color"), this.Field17612, this.Field17613, this.Field17614);
        GL20.glUniform1f(this.Method238("divider"), Float.intBitsToFloat(1124859904));
        GL20.glUniform1f(this.Method238("radius"), this.Field17610);
        GL20.glUniform1f(this.Method238("maxSample"), Float.intBitsToFloat(1092616192));
    }
    
    static {
        Field17609 = new Class2114();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xF6C ^ 0xE9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
