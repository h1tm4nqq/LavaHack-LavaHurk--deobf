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

public class bZiUWDeb9iTD5vBgY6J7hAWBm6xzdKPD {
    private String Field12988 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static String Method4533(Vec3d vec3d, boolean ... blArray) {
        int n = blArray.length <= 0 || blArray[(int)((long)-60961714 ^ (long)-60961714)] ? (int)((long)533541437 ^ (long)533541436) : (int)779300658L ^ 0x2E732F32;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((int)((long)-1315387126 ^ (long)-1315387121) << 3);
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
            int n2 = (int)((long)1673253050 ^ (long)1673253050);
            while (n2 <= (int)d2) {
                double d5 = d3 * d4;
                if (bl && (int)d5 > n) {
                    if (bl2) {
                        arrayList.add(new BlockPos((Vec3i)blockPos.add(n2, (int)256918170L ^ 0xF50429A, n)));
                    } else {
                        arrayList.add(new BlockPos((Vec3i)blockPos.add((double)(n2 - (int)((long)-418072493 ^ (long)-418072494)), 0.0, d5)));
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
        int n3 = (int)((long)867306331 ^ (long)867306331);
        while (n3 <= (int)d) {
            double d6 = d3 * d4;
            if (bl && (int)d6 > n) {
                if (bl2) {
                    arrayList.add(new BlockPos((Vec3i)blockPos.add(n, (int)((long)958592801 ^ (long)958592801), n3)));
                } else {
                    arrayList.add(new BlockPos((Vec3i)blockPos.add(d6, 0.0, (double)(n3 - ((int)1013090387L ^ 0x3C628852)))));
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
        int n = (int)((long)834137047 ^ (long)834137047);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-302191007L ^ 0xEDFCEE9E);
            int n2 = (int)1079228723L ^ 0x4053B992;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-2084197311 ^ (long)-2084193784) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

