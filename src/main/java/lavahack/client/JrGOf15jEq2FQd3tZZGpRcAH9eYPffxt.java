//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.ScaledResolution
 *  org.lwjgl.opengl.GL20
 */
package lavahack.client;

import lavahack.client.QeKqDKHtLfIoFEKMMGksH0qruCVSVC83;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL20;

public class JrGOf15jEq2FQd3tZZGpRcAH9eYPffxt
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static JrGOf15jEq2FQd3tZZGpRcAH9eYPffxt Field10385 = new JrGOf15jEq2FQd3tZZGpRcAH9eYPffxt();
    public float Field10386;
    public float Field10387 = Float.intBitsToFloat((int)((long)1405809415 ^ (long)1877550093));
    private String Field10388 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public JrGOf15jEq2FQd3tZZGpRcAH9eYPffxt() {
        super("snow.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field10386);
        this.Field10386 += this.Field10387 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)633365443L ^ 0x25C063C3;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)234175923L ^ 0xDF53D4C);
            int n2 = (int)((long)135328938 ^ (long)135328939) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1984191082L ^ 0x89BBF7A1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

