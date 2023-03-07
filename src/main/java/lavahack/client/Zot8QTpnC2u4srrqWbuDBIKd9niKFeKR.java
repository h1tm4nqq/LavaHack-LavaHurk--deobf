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

public class Zot8QTpnC2u4srrqWbuDBIKd9niKFeKR
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static Zot8QTpnC2u4srrqWbuDBIKd9niKFeKR Field13266 = new Zot8QTpnC2u4srrqWbuDBIKd9niKFeKR();
    public float Field13267;
    public float Field13268 = Float.intBitsToFloat((int)((long)366162621 ^ (long)703653303));
    private String Field13269 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Zot8QTpnC2u4srrqWbuDBIKd9niKFeKR() {
        super("kfc.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field13267);
        this.Field13267 += this.Field13268 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)711057949L ^ 0x2A61E21D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)346159037L ^ 0x14A1F742);
            int n2 = (int)((long)571202575 ^ (long)571202572) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)703392039 ^ (long)703385998) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

