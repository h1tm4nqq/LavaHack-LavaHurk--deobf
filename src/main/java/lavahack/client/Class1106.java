//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package lavahack.client;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class Class1106 {
    private String Field12988 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method4533(Vec3d vec3d, boolean ... blArray) {
        boolean bl = blArray.length <= 0 || blArray[0];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append((int)Math.floor(vec3d.x));
        stringBuilder.append(", ");
        stringBuilder.append((int)Math.floor(vec3d.y));
        stringBuilder.append(", ");
        stringBuilder.append((int)Math.floor(vec3d.z));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static float Method4534(Entity entity, BlockPos blockPos) {
        float f = (float)(entity.posX - (double)blockPos.getX());
        float f2 = (float)(entity.posY - (double)blockPos.getY());
        float f3 = (float)(entity.posZ - (double)blockPos.getZ());
        return MathHelper.sqrt((float)(f * f + f2 * f2 + f3 * f3));
    }

    public static List Method4535(BlockPos blockPos, BlockPos blockPos2, boolean bl, boolean bl2) {
        double d;
        ArrayList<BlockPos> arrayList = new ArrayList<BlockPos>();
        double d2 = blockPos.getX() - blockPos2.getX();
        double d3 = d2 > (d = (double)(blockPos.getZ() - blockPos2.getZ())) ? d / d2 : d2 / d;
        double d4 = Double.longBitsToDouble((long)1594340639 ^ 0x3FE000005F07B51FL);
        int n = (int)(d3 * d4);
        if (d2 > d) {
            int n2 = 0;
            while (n2 <= (int)d2) {
                double d5 = d3 * d4;
                if (bl && (int)d5 > n) {
                    if (bl2) {
                        arrayList.add(new BlockPos((Vec3i)blockPos.add(n2, 0, n)));
                    } else {
                        arrayList.add(new BlockPos((Vec3i)blockPos.add((double)(n2 - 1), 0.0, d5)));
                    }
                }
                BlockPos blockPos3 = new BlockPos((Vec3i)blockPos.add((double)n2, 0.0, d5));
                arrayList.add(blockPos3);
                n = (int)d5;
                d4 += 1.0;
                ++n2;
            }
            return arrayList;
        }
        int n3 = 0;
        while (n3 <= (int)d) {
            double d6 = d3 * d4;
            if (bl && (int)d6 > n) {
                if (bl2) {
                    arrayList.add(new BlockPos((Vec3i)blockPos.add(n, 0, n3)));
                } else {
                    arrayList.add(new BlockPos((Vec3i)blockPos.add(d6, 0.0, (double)(n3 - 1))));
                }
            }
            BlockPos blockPos4 = new BlockPos((Vec3i)blockPos.add(d6, 0.0, (double)n3));
            arrayList.add(blockPos4);
            d4 += 1.0;
            ++n3;
        }
        return arrayList;
    }

    private static double Method4536(double d, double d2) {
        double d3 = Math.max(d, d2);
        double d4 = Math.min(d, d2);
        return d3 - d4;
    }

    private static String Method4537(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 161;
            cArray2[n] = (char)(cArray[n] ^ (0x5924 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

