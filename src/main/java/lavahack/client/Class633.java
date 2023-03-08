//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.awt.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.*;

public final class Class633 extends Class1591
{
    public static final Class633 Field10703;
    public float Field10704;
    public Color Field10705;
    public float Field10706;
    public float Field10707;
    public boolean Field10708;
    public int Field10709;
    public float Field10710;
    public float Field10711;
    public float Field10712;
    public float Field10713;
    public int Field10714;
    private String Field10715 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class633() {
        super("outlineGradient.frag");
        this.Field10704 = 0.0f;
    }
    
    public void Method232() {
        this.Method237("texture");
        this.Method237("texelSize");
        this.Method237("color");
        this.Method237("divider");
        this.Method237("radius");
        this.Method237("maxSample");
        this.Method237("alpha0");
        this.Method237("resolution");
        this.Method237("time");
        this.Method237("moreGradient");
        this.Method237("Creepy");
        this.Method237("alpha");
        this.Method237("NUM_OCTAVES");
    }
    
    public void Method233() {
        GL20.glUniform1i(this.Method238("texture"), 0);
        GL20.glUniform2f(this.Method238("texelSize"), 1.0f / Class633.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field10706 * this.Field10707), 1.0f / Class633.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field10706 * this.Field10707));
        GL20.glUniform3f(this.Method238("color"), this.Field10705.getRed() / Float.intBitsToFloat(1132396544), this.Field10705.getGreen() / Float.intBitsToFloat(1132396544), this.Field10705.getBlue() / Float.intBitsToFloat(1132396544));
        GL20.glUniform1f(this.Method238("divider"), Float.intBitsToFloat(1124859904));
        GL20.glUniform1f(this.Method238("radius"), this.Field10706);
        GL20.glUniform1f(this.Method238("maxSample"), Float.intBitsToFloat(1092616192));
        GL20.glUniform1f(this.Method238("alpha0"), this.Field10708 ? Float.intBitsToFloat(-1082130432) : (this.Field10709 / Float.intBitsToFloat(1132396544)));
        GL20.glUniform2f(this.Method238("resolution"), new ScaledResolution(Class633.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV).getScaledWidth() / this.Field10710, new ScaledResolution(Class633.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV).getScaledHeight() / this.Field10710);
        GL20.glUniform1f(this.Method238("time"), this.Field10704);
        GL20.glUniform1f(this.Method238("moreGradient"), this.Field10711);
        GL20.glUniform1f(this.Method238("Creepy"), this.Field10712);
        GL20.glUniform1f(this.Method238("alpha"), this.Field10713);
        GL20.glUniform1i(this.Method238("NUM_OCTAVES"), this.Field10714);
    }
    
    public void Method2747(final double n) {
        this.Field10704 += (float)n;
    }
    
    static {
        Field10703 = new Class633();
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7CB9 ^ 0xE0));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
