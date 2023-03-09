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

public class Class1525 {
    private static final Random Field15124 = new Random();
    private String Field15125 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static boolean Method6056(long l, BlockPos blockPos) {
        int n = blockPos.getX() >> 4;
        int n2 = blockPos.getZ() >> 4;
        Field15124.setSeed(l + (long)(n * n * 4987142) + (long)(n * 5947611) + (long)(n2 * n2) * 4392871L + (long)(n2 * 389711) ^ 0x3AD8025FL);
        if (Field15124.nextInt(10) != 0) return false;
        return true;
    }
}

