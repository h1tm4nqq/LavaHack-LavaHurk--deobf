//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.lwjgl.opengl.*;

public final class Class365 extends Class1591
{
    public static final Class365 Field9528;
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
    
    public Class365() {
        super("outline_custom.frag");
    }
    
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
    
    public void Method233() {
        GL20.glUniform2f(this.Method238("texelSize"), 1.0f / Class365.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field9529 * this.Field9530), 1.0f / Class365.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field9529 * this.Field9530));
        this.Method238("color");
        GL20.glUniform4f((int)this.Field9531, this.Field9532, this.Field9533, (float)this, 0.0f);
        GL20.glUniform1f(this.Method238("radius"), this.Field9529);
        GL20.glUniform2f(this.Method238("rainbowStrength"), this.Field9536, this.Field9536);
        GL20.glUniform1f(this.Method238("rainbowSpeed"), this.Field9535);
        GL20.glUniform1f(this.Method238("saturation"), this.Field9537);
    }
    
    static {
        Field9528 = new Class365();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5ED2 ^ 0x19));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
