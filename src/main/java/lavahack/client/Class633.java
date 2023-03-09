//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import java.awt.Color;
import lavahack.client.Class1591;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL20;

public final class Class633
extends Class1591 {
    public static final Class633 Field10703 = new Class633();
    public float Field10704 = 0.0f;
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
    }

    @Override
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

    @Override
    public void Method233() {
        GL20.glUniform1i((int)this.Method238("texture"), (int)0);
        GL20.glUniform2f((int)this.Method238("texelSize"), (float)(1.0f / (float)Class633.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayWidth * (this.Field10706 * this.Field10707)), (float)(1.0f / (float)Class633.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV.displayHeight * (this.Field10706 * this.Field10707)));
        GL20.glUniform3f((int)this.Method238("color"), (float)((float)this.Field10705.getRed() / Float.intBitsToFloat(1132396544)), (float)((float)this.Field10705.getGreen() / Float.intBitsToFloat(1132396544)), (float)((float)this.Field10705.getBlue() / Float.intBitsToFloat(1132396544)));
        GL20.glUniform1f((int)this.Method238("divider"), (float)Float.intBitsToFloat(1124859904));
        GL20.glUniform1f((int)this.Method238("radius"), (float)this.Field10706);
        GL20.glUniform1f((int)this.Method238("maxSample"), (float)Float.intBitsToFloat(1092616192));
        GL20.glUniform1f((int)this.Method238("alpha0"), (float)(this.Field10708 ? Float.intBitsToFloat(-1082130432) : (float)this.Field10709 / Float.intBitsToFloat(1132396544)));
        GL20.glUniform2f((int)this.Method238("resolution"), (float)((float)new ScaledResolution(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV).getScaledWidth() / this.Field10710), (float)((float)new ScaledResolution(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV).getScaledHeight() / this.Field10710));
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field10704);
        GL20.glUniform1f((int)this.Method238("moreGradient"), (float)this.Field10711);
        GL20.glUniform1f((int)this.Method238("Creepy"), (float)this.Field10712);
        GL20.glUniform1f((int)this.Method238("alpha"), (float)this.Field10713);
        GL20.glUniform1i((int)this.Method238("NUM_OCTAVES"), (int)this.Field10714);
    }

    public void Method2747(double d) {
        this.Field10704 = (float)((double)this.Field10704 + d);
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 224;
            cArray2[n] = (char)(cArray[n] ^ (0x7CB9 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

