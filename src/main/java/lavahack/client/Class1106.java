//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import net.minecraft.entity.*;
import java.util.*;
import net.minecraft.util.math.*;

public class Class1106
{
    private String Field12988 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static String Method4533(final Vec3d vec3d, final boolean... array) {
        final boolean b = array.length <= 0 || array[0];
        final StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((int)Math.floor(vec3d.x));
        sb.append(", ");
        sb.append((int)Math.floor(vec3d.y));
        sb.append(", ");
        sb.append((int)Math.floor(vec3d.z));
        sb.append(")");
        return sb.toString();
    }
    
    public static float Method4534(final Entity entity, final BlockPos blockPos) {
        final float n = (float)(entity.posX - blockPos.getX());
        final float n2 = (float)(entity.posY - blockPos.getY());
        final float n3 = (float)(entity.posZ - blockPos.getZ());
        return MathHelper.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public static List Method4535(final BlockPos blockPos, final BlockPos blockPos2, final boolean b, final boolean b2) {
        final ArrayList<BlockPos> list = new ArrayList<BlockPos>();
        final double n = blockPos.getX() - blockPos2.getX();
        final double n2 = blockPos.getZ() - blockPos2.getZ();
        final double n3 = (n > n2) ? (n2 / n) : (n / n2);
        double longBitsToDouble = Double.longBitsToDouble((long)1594340639 ^ 0x3FE000005F07B51FL);
        int n4 = (int)(n3 * longBitsToDouble);
        if (n > n2) {
            for (int i = 0; i <= (int)n; ++i) {
                final double n5 = n3 * longBitsToDouble;
                if (b && (int)n5 > n4) {
                    if (b2) {
                        list.add(new BlockPos((Vec3i)blockPos.add(i, 0, n4)));
                    }
                    else {
                        list.add(new BlockPos((Vec3i)blockPos.add((double)(i - 1), 0.0, n5)));
                    }
                }
                list.add(new BlockPos((Vec3i)blockPos.add((double)i, 0.0, n5)));
                n4 = (int)n5;
                ++longBitsToDouble;
            }
        }
        else {
            for (int j = 0; j <= (int)n2; ++j) {
                final double n6 = n3 * longBitsToDouble;
                if (b && (int)n6 > n4) {
                    if (b2) {
                        list.add(new BlockPos((Vec3i)blockPos.add(n4, 0, j)));
                    }
                    else {
                        list.add(new BlockPos((Vec3i)blockPos.add(n6, 0.0, (double)(j - 1))));
                    }
                }
                list.add(new BlockPos((Vec3i)blockPos.add(n6, 0.0, (double)j)));
                ++longBitsToDouble;
            }
        }
        return list;
    }
    
    private static double Method4536(final double n, final double n2) {
        return Math.max(n, n2) - Math.min(n, n2);
    }
    
    private static String Method4537(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5924 ^ 0xA1));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
