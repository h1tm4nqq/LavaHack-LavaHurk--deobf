//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1281;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/util/math/BlockPos;", "kotlin.jvm.PlatformType", "test"})
final class Class894
implements Predicate {
    final Class1281 Field11744;
    final boolean Field11745;
    final double Field11746;
    final EntityPlayer Field11747;
    private int Field11748;

    public boolean test(Object object) {
        return this.Method3722((BlockPos)object);
    }

    public final boolean Method3722(BlockPos blockPos) {
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"it");
        if (!Class1281.Method5175(this.Field11744, blockPos2)) return false;
        if (!(Intrinsics.areEqual((Object)Class1281.Method5176(this.Field11744), (Object)blockPos) ^ true)) return false;
        if (this.Field11745) {
            double d = this.Field11746;
            double d2 = Double.longBitsToDouble((long)323102631 ^ 0x40000000134227A7L);
            double d3 = Class1281.Method5173().player.getDistanceSq(blockPos);
            boolean bl = false;
            double d4 = Math.pow(d, d2);
            if (!(d3 < d4)) return false;
            return false;
        }
        if (!(this.Field11747.getDistanceSq(blockPos) > (double)4)) return false;
        if (!(this.Field11747.getDistanceSq(blockPos) < (double)25)) return false;
        return false;
    }

    Class894(Class1281 class1281, boolean bl, double d, EntityPlayer entityPlayer) {
        this.Field11744 = class1281;
        this.Field11745 = bl;
        this.Field11746 = d;
        this.Field11747 = entityPlayer;
    }

    private static String Method3723(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 0;
            cArray2[n] = (char)(cArray[n] ^ (0x468B ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

