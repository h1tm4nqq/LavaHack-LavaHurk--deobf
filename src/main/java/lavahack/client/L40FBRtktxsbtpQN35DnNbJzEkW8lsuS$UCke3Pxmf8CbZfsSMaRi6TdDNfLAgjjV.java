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
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lnet/minecraft/util/math/BlockPos;", "kotlin.jvm.PlatformType", "test"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements Predicate {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field11744;
    final boolean Field11745;
    final double Field11746;
    final EntityPlayer Field11747;
    private int Field11748;

    public boolean test(Object object) {
        return this.Method3722((BlockPos)object);
    }

    public final boolean Method3722(BlockPos blockPos) {
        int n;
        BlockPos blockPos2 = blockPos;
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"it");
        if (!L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5175(this.Field11744, blockPos2)) return (int)((long)-1169979228 ^ (long)-1169979228) != 0;
        if ((Intrinsics.areEqual((Object)L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5176(this.Field11744), (Object)blockPos) ^ (int)((long)1355335906 ^ (long)1355335907)) == 0) return (int)((long)-1169979228 ^ (long)-1169979228) != 0;
        if (this.Field11745) {
            double d = this.Field11746;
            double d2 = Double.longBitsToDouble((long)323102631 ^ 0x40000000134227A7L);
            double d3 = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().player.getDistanceSq(blockPos);
            int n2 = (int)((long)507888810 ^ (long)507888810);
            double d4 = Math.pow(d, d2);
            if (d3 < d4) {
                n = (int)-1556180428L ^ 0xA33E9235;
                return (int)((long)-1169979228 ^ (long)-1169979228) != 0;
            }
            n = (int)-429708882L ^ 0xE66329AE;
            return (int)((long)-1169979228 ^ (long)-1169979228) != 0;
        }
        if (this.Field11747.getDistanceSq(blockPos) > (double)(((int)2130144425L ^ 0x7EF76CA8) << 2) && this.Field11747.getDistanceSq(blockPos) < (double)((int)1277656214L ^ 0x4C277C8F)) {
            n = (int)((long)-894424115 ^ (long)-894424116);
            return (int)((long)-1169979228 ^ (long)-1169979228) != 0;
        }
        n = (int)((long)-908409814 ^ (long)-908409814);
        return (int)((long)-1169979228 ^ (long)-1169979228) != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS, boolean bl, double d, EntityPlayer entityPlayer) {
        this.Field11744 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
        this.Field11745 = bl;
        this.Field11746 = d;
        this.Field11747 = entityPlayer;
    }

    private static String Method3723(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)715691126 ^ (long)715691126);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1561924029L ^ 0x5D191142);
            int n2 = (int)1915783639L ^ 0x723089D7;
            cArray2[n] = (char)(cArray[n] ^ ((int)-2070528183L ^ 0x849679C2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

