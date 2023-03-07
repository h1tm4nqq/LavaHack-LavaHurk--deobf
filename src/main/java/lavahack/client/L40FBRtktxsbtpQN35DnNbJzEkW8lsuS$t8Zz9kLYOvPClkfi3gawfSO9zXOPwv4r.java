//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"check", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r
extends Lambda
implements Function1 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field11874;
    private String Field11875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5185(this.Field11874, blockPos) && L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5173().world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos.up())).isEmpty()) {
            n = (int)-1216913781L ^ 0xB7775E8A;
            return n != 0;
        }
        n = (int)((long)149219844 ^ (long)149219844);
        return n != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field11874 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
        super((int)981687769L ^ 0x3A835DD8);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1283192897 ^ (long)-1283192897);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-91340718 ^ (long)-91340627);
            int n2 = ((int)-1882617286L ^ 0x8FC98A1F) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)1358175367L ^ 0x50F464F4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

