//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.*;
import net.minecraft.util.math.*;

public class Class1525
{
    private static final Random Field15124;
    private String Field15125 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static boolean Method6056(final long n, final BlockPos blockPos) {
        final int n2 = blockPos.getX() >> 4;
        final int n3 = blockPos.getZ() >> 4;
        Class1525.Field15124.setSeed(n + n2 * n2 * 4987142 + n2 * 5947611 + n3 * n3 * 4392871L + n3 * 389711 ^ 0x3AD8025FL);
        return Class1525.Field15124.nextInt(10) == 0;
    }
    
    static {
        Field15124 = new Random();
    }
}
