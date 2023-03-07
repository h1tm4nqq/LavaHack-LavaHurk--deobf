//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Random;
import net.minecraft.util.math.BlockPos;

public class anIfZ9VLGdwbq76Dhfa3UDdsn1dbB4Rf {
    private static final Random Field15124 = new Random();
    private String Field15125 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method6056(long l, BlockPos blockPos) {
        int n;
        int n2 = blockPos.getX() >> (((int)369540290L ^ 0x1606BCC3) << 2);
        int n3 = blockPos.getZ() >> (((int)1137995054L ^ 0x43D46D2F) << 2);
        Field15124.setSeed(l + (long)(n2 * n2 * ((int)((long)-1032430727 ^ (long)-1034921990) << 1)) + (long)(n2 * ((int)2082693214L ^ 0x7C79A085)) + (long)(n3 * n3) * (0x15D707EFL & 0x84B47A7L) + (long)(n3 * ((int)-1519027462L ^ 0xA57088B5)) ^ 0x3AD88A5FL & 0x3EDC125FL);
        if (Field15124.nextInt(((int)-2023626263L ^ 0x8761E9EC) << 1) == 0) {
            n = (int)((long)885986892 ^ (long)885986893);
            return n != 0;
        }
        n = (int)-1673115791L ^ 0x9C464771;
        return n != 0;
    }
}

