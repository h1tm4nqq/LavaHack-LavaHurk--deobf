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

import lavahack.client.Class1591;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL20;

public class Class1585
extends Class1591 {
    public static Class1585 Field15415 = new Class1585();
    public float Field15416;
    public float Field15417 = Float.intBitsToFloat(1028443341);
    private String Field15418 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class1585() {
        super("flow.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field15416);
        this.Field15416 += this.Field15417 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 208;
            cArray2[n] = (char)(cArray[n] ^ (0x7280 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

