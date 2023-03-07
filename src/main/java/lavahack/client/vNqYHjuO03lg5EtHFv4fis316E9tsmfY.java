//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import lavahack.client.QeKqDKHtLfIoFEKMMGksH0qruCVSVC83;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL20;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/features/module/render/shader/shaders/CircleShader;", "Lcom/kisman/cc/features/module/render/shader/FramebufferShader;", "()V", "circle", "", "circleRadius", "", "color1", "Lcom/kisman/cc/util/Colour;", "kotlin.jvm.PlatformType", "color2", "customAlpha", "fadeOutline", "filled", "filledColor", "glow", "glowRadius", "mix", "outline", "outlineColor", "outlineRadius", "quality", "rainbow", "rainbowAlpha", "time", "setupUniforms", "", "updateUniforms", "kisman.cc"})
public final class vNqYHjuO03lg5EtHFv4fis316E9tsmfY
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    @JvmField
    public static float Field8627;
    @JvmField
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field8628;
    @JvmField
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field8629;
    @JvmField
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field8630;
    @JvmField
    public static vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Field8631;
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
    public static final vNqYHjuO03lg5EtHFv4fis316E9tsmfY Field8645;
    private String Field8646 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
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

    @Override
    public void Method233() {
        GL20.glUniform1f((int)this.Method238("time"), (float)Field8627);
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443).getScaledWidth(), (float)new ScaledResolution(QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("divider"), (float)Float.intBitsToFloat((int)((long)2015817542 ^ (long)992669510)));
        GL20.glUniform1f((int)this.Method238("maxSample"), (float)Float.intBitsToFloat(0x33CDED17 ^ 0x72EDED17));
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayWidth * (Field8642 * Field8644)), (float)(1.0f / (float)QeKqDKHtLfIoFEKMMGksH0qruCVSVC83.Field15443.displayHeight * (Field8642 * Field8644)));
        GL20.glUniform4f((int)this.Method238("color1"), (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8628.Field17325, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8628.Field17326, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8628.Field17327, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8628.Field17328);
        GL20.glUniform4f((int)this.Method238("color2"), (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8629.Field17325, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8629.Field17326, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8629.Field17327, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8629.Field17328);
        GL20.glUniform4f((int)this.Method238("filledColor"), (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8630.Field17325, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8630.Field17326, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8630.Field17327, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8630.Field17328);
        GL20.glUniform4f((int)this.Method238("outlineColor"), (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8631.Field17325, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8631.Field17326, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8631.Field17327, (float)vNqYHjuO03lg5EtHFv4fis316E9tsmfY.Field8631.Field17328);
        GL20.glUniform1i((int)this.Method238("customAlpha"), (int)(Field8632 ? (int)((long)1059885329 ^ (long)1059885328) : (int)1050715290L ^ 0x3EA0A49A));
        GL20.glUniform1f((int)this.Method238("mix"), (float)Field8639);
        GL20.glUniform1i((int)this.Method238("filled"), (int)(Field8635 ? (int)((long)-756884501 ^ (long)-756884502) : (int)((long)237863333 ^ (long)237863333)));
        GL20.glUniform1i((int)this.Method238("rainbow"), (int)(Field8633 ? (int)947134062L ^ 0x38741E6F : (int)-1234776530L ^ 0xB666CE2E));
        GL20.glUniform1f((int)this.Method238("rainbowAlpha"), (float)Field8640);
        GL20.glUniform1i((int)this.Method238("circle"), (int)(Field8634 ? (int)947416901L ^ 0x38786F44 : (int)((long)2142957833 ^ (long)2142957833)));
        GL20.glUniform1f((int)this.Method238("circleRadius"), (float)Field8641);
        GL20.glUniform1i((int)this.Method238("glow"), (int)(Field8636 ? (int)1415385231L ^ 0x545D108E : (int)((long)757198370 ^ (long)757198370)));
        GL20.glUniform1f((int)this.Method238("glowRadius"), (float)Field8642);
        GL20.glUniform1i((int)this.Method238("outline"), (int)(Field8637 ? (int)-1324220197L ^ 0xB11200DA : (int)((long)-768823793 ^ (long)-768823793)));
        GL20.glUniform1i((int)this.Method238("fadeOutline"), (int)(Field8638 ? (int)((long)-1553956710 ^ (long)-1553956709) : (int)1011456383L ^ 0x3C49997F));
        GL20.glUniform1f((int)this.Method238("outlineRadius"), (float)Field8643);
        Field8627 += (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private vNqYHjuO03lg5EtHFv4fis316E9tsmfY() {
        super("circle2.frag");
    }

    static {
        vNqYHjuO03lg5EtHFv4fis316E9tsmfY vNqYHjuO03lg5EtHFv4fis316E9tsmfY2;
        Field8645 = vNqYHjuO03lg5EtHFv4fis316E9tsmfY2 = new vNqYHjuO03lg5EtHFv4fis316E9tsmfY();
        Field8627 = 1.0f;
        Field8628 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486;
        Field8629 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486;
        Field8630 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486;
        Field8631 = exalTBqSufwHR1VdwyK23X5QNwSlzh5j.Field11486;
        Field8639 = 1.0f;
        Field8640 = 1.0f;
        Field8641 = Float.intBitsToFloat(0x64F8DE7B ^ 0x2458DE7B);
        Field8642 = 1.0f;
        Field8643 = 1.0f;
        Field8644 = 1.0f;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)86658535 ^ (long)86658535);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)894287797L ^ 0x354DBF4A);
            int n2 = ((int)388083951L ^ 0x1721B0FA) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2012484713 ^ (long)-2012486592) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

