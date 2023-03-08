//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.client.*;
import net.minecraft.network.play.client.*;
import net.minecraft.util.math.*;
import net.minecraft.block.material.*;

public class Class341
{
    private static final Minecraft Field9407;
    public static final double Field9408;
    public static final double Field9409;
    private String Field9410 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static int Method1678(final double n, final boolean b) {
        return (int)(n / (b ? Double.longBitsToDouble((long)930751934 ^ 0x3FD1EB8529C27452L) : Double.longBitsToDouble((long)95062374 ^ 0x3FCB851EBDFB62E3L))) + 1;
    }
    
    public static CPacketPlayer$Position[] Method1679(final int n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final double n2, final double n3, final double n4, final double n5, final double n6, final double n7) {
        if (n < 2) {
            return new CPacketPlayer$Position[] { new CPacketPlayer$Position(n5, n6, n7, b) };
        }
        final double n8 = n5 - n2;
        final double n9 = n6 - n3;
        final double n10 = n7 - n4;
        final double n11 = n8 / n;
        final double n12 = n9 / n;
        final double n13 = n10 / n;
        final CPacketPlayer$Position[] array = new CPacketPlayer$Position[n];
        double n14 = n2;
        double n15 = n3;
        double n16 = n4;
        for (int i = 0; i < n - 1; ++i) {
            n14 += n11;
            n15 += n12;
            n16 += n13;
            final Material getMaterial = Class341.Field9407.world.getBlockState(new BlockPos(n14, n15, n16).down()).getMaterial();
            final Material getMaterial2 = Class341.Field9407.world.getBlockState(new BlockPos(n14, n15, n16)).getMaterial();
            if (!b3 || !getMaterial2.isSolid()) {
                if (!b4 || !getMaterial.isLiquid()) {
                    if (!getMaterial.isReplaceable()) {
                        final boolean b5 = getMaterial.isLiquid() || getMaterial.isReplaceable() || getMaterial2.isSolid();
                        array[i] = new CPacketPlayer$Position(n14, n15, n16, b2 ? b5 : b);
                    }
                }
            }
        }
        array[n - 1] = new CPacketPlayer$Position(n5, n6, n7, b);
        return array;
    }
    
    static {
        Field9409 = 0.0;
        Field9408 = 0.0;
        Field9407 = Minecraft.getMinecraft();
    }
}
