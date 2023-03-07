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

public class i7kNobE1u57CFRO51RQvduopQg4hglSh
extends QeKqDKHtLfIoFEKMMGksH0qruCVSVC83 {
    public static i7kNobE1u57CFRO51RQvduopQg4hglSh Field8217 = new i7kNobE1u57CFRO51RQvduopQg4hglSh();
    public float Field8218;
    public float Field8219 = Float.intBitsToFloat((int)((long)1974699848 ^ (long)1328583975));
    private int Field8220;

    public i7kNobE1u57CFRO51RQvduopQg4hglSh() {
        super("sheldon.frag");
    }

    @Override
    public void Method232() {
        this.Method237("resolution");
        this.Method237("time");
    }

    @Override
    public void Method233() {
        GL20.glUniform2f((int)this.Method238("resolution"), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledWidth(), (float)new ScaledResolution(Minecraft.getMinecraft()).getScaledHeight());
        GL20.glUniform1f((int)this.Method238("time"), (float)this.Field8218);
        this.Field8218 += this.Field8219 * (float)this.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
    }

    private static String Method240(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1331184974 ^ (long)-1331184974);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)523540426L ^ 0x1F349735);
            int n2 = (int)1657371898L ^ 0x62C97C91;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-611509644 ^ (long)-611505837) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

