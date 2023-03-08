//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.*;
import com.kisman.cc.util.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.gui.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/features/module/render/shader/shaders/CircleShader;", "Lcom/kisman/cc/features/module/render/shader/FramebufferShader;", "()V", "circle", "", "circleRadius", "", "color1", "Lcom/kisman/cc/util/Colour;", "kotlin.jvm.PlatformType", "color2", "customAlpha", "fadeOutline", "filled", "filledColor", "glow", "glowRadius", "mix", "outline", "outlineColor", "outlineRadius", "quality", "rainbow", "rainbowAlpha", "time", "setupUniforms", "", "updateUniforms", "kisman.cc" })
public final class Class160 extends Class1591
{
    @JvmField
    public static float Field8627;
    @JvmField
    public static Class2027 Field8628;
    @JvmField
    public static Class2027 Field8629;
    @JvmField
    public static Class2027 Field8630;
    @JvmField
    public static Class2027 Field8631;
    @JvmField
    public static boolean Field8632;
    @JvmField
    public static boolean Field8633;
    @JvmField
    public static boolean Field8634;
    @JvmField
    public static boolean Field8635;
    @JvmField
    public static boolean Field8636;
    @JvmField
    public static boolean Field8637;
    @JvmField
    public static boolean Field8638;
    @JvmField
    public static float Field8639;
    @JvmField
    public static float Field8640;
    @JvmField
    public static float Field8641;
    @JvmField
    public static float Field8642;
    @JvmField
    public static float Field8643;
    @JvmField
    public static float Field8644;
    public static final Class160 Field8645;
    private String Field8646 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method232() {
        this.Method237("time");
        this.Method237("resolution");
        this.Method237("divider");
        this.Method237("maxSample");
        this.Method237("texelSize");
        this.Method237("color1");
        this.Method237("color2");
        this.Method237("filledColor");
        this.Method237("outlineColor");
        this.Method237("customAlpha");
        this.Method237("mix");
        this.Method237("filled");
        this.Method237("rainbow");
        this.Method237("rainbowAlpha");
        this.Method237("circle");
        this.Method237("circleRadius");
        this.Method237("glow");
        this.Method237("glowRadius");
        this.Method237("outline");
        this.Method237("fadeOutline");
        this.Method237("outlineRadius");
    }
    
    public void Method233() {
        GL20.glUniform1f(this.Method238("time"), Class160.Field8627);
        GL20.glUniform2f(this.Method238("resolution"), (float)new ScaledResolution(Class1591.Field15443).getScaledWidth(), (float)new ScaledResolution(Class1591.Field15443).getScaledHeight());
        GL20.glUniform1f(this.Method238("divider"), Float.intBitsToFloat(1124859904));
        GL20.glUniform1f(this.Method238("maxSample"), Float.intBitsToFloat(1092616192));
        GL20.glUniform2f(this.Method238("texelSize"), 1.0f / Class1591.Field15443.displayWidth * (Class160.Field8642 * Class160.Field8644), 1.0f / Class1591.Field15443.displayHeight * (Class160.Field8642 * Class160.Field8644));
        GL20.glUniform4f(this.Method238("color1"), Class160.Field8628.Field17325, Class160.Field8628.Field17326, Class160.Field8628.Field17327, Class160.Field8628.Field17328);
        GL20.glUniform4f(this.Method238("color2"), Class160.Field8629.Field17325, Class160.Field8629.Field17326, Class160.Field8629.Field17327, Class160.Field8629.Field17328);
        GL20.glUniform4f(this.Method238("filledColor"), Class160.Field8630.Field17325, Class160.Field8630.Field17326, Class160.Field8630.Field17327, Class160.Field8630.Field17328);
        GL20.glUniform4f(this.Method238("outlineColor"), Class160.Field8631.Field17325, Class160.Field8631.Field17326, Class160.Field8631.Field17327, Class160.Field8631.Field17328);
        GL20.glUniform1i(this.Method238("customAlpha"), (int)(Class160.Field8632 ? 1 : 0));
        GL20.glUniform1f(this.Method238("mix"), Class160.Field8639);
        GL20.glUniform1i(this.Method238("filled"), (int)(Class160.Field8635 ? 1 : 0));
        GL20.glUniform1i(this.Method238("rainbow"), (int)(Class160.Field8633 ? 1 : 0));
        GL20.glUniform1f(this.Method238("rainbowAlpha"), Class160.Field8640);
        GL20.glUniform1i(this.Method238("circle"), (int)(Class160.Field8634 ? 1 : 0));
        GL20.glUniform1f(this.Method238("circleRadius"), Class160.Field8641);
        GL20.glUniform1i(this.Method238("glow"), (int)(Class160.Field8636 ? 1 : 0));
        GL20.glUniform1f(this.Method238("glowRadius"), Class160.Field8642);
        GL20.glUniform1i(this.Method238("outline"), (int)(Class160.Field8637 ? 1 : 0));
        GL20.glUniform1i(this.Method238("fadeOutline"), (int)(Class160.Field8638 ? 1 : 0));
        GL20.glUniform1f(this.Method238("outlineRadius"), Class160.Field8643);
        Class160.Field8627 += this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }
    
    private Class160() {
        super("circle2.frag");
    }
    
    static {
        Field8645 = new Class160();
        Class160.Field8627 = 1.0f;
        Class160.Field8628 = Class815.Field11486;
        Class160.Field8629 = Class815.Field11486;
        Class160.Field8630 = Class815.Field11486;
        Class160.Field8631 = Class815.Field11486;
        Class160.Field8639 = 1.0f;
        Class160.Field8640 = 1.0f;
        Class160.Field8641 = Float.intBitsToFloat(1084227584);
        Class160.Field8642 = 1.0f;
        Class160.Field8643 = 1.0f;
        Class160.Field8644 = 1.0f;
    }
    
    private static String Method240(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x1FAE ^ 0xA8));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
