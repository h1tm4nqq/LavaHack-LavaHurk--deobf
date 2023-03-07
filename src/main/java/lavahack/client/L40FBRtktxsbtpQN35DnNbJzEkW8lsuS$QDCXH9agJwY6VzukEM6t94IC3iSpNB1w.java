//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"place", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w
extends Lambda
implements Function1 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field14776;
    private String Field14777 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        boolean bl = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field14776, blockPos2);
        int n = (int)((long)1773559202 ^ (long)1773559202);
        int n2 = (int)-141382287L ^ 0xF792AD71;
        boolean bl2 = bl;
        int n3 = (int)-1055117487L ^ 0xC11C2F51;
        if (bl2) {
            BlockPos blockPos3 = blockPos.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.north()");
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5184(this.Field14776, blockPos3);
            return ((int)-1894032234L ^ 0x8F1B5C97) != 0;
        }
        BlockPos blockPos4 = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.east()");
        bl = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field14776, blockPos4);
        n = (int)((long)-1098969278 ^ (long)-1098969278);
        n2 = (int)-434630691L ^ 0xE6180FDD;
        bl2 = bl;
        n3 = (int)((long)-1682832156 ^ (long)-1682832156);
        if (bl2) {
            BlockPos blockPos5 = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.east()");
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5184(this.Field14776, blockPos5);
            return ((int)1779227563L ^ 0x6A0CDBAA) != 0;
        }
        BlockPos blockPos6 = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.west()");
        bl = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field14776, blockPos6);
        n = (int)((long)1360761308 ^ (long)1360761308);
        n2 = (int)597239005L ^ 0x239924DD;
        bl2 = bl;
        n3 = (int)((long)1103711278 ^ (long)1103711278);
        if (bl2) {
            BlockPos blockPos7 = blockPos.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.west()");
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5184(this.Field14776, blockPos7);
            return ((int)-689838852L ^ 0xD6E1E4FD) != 0;
        }
        BlockPos blockPos8 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"pos.south()");
        bl = L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5179(this.Field14776, blockPos8);
        n = (int)((long)-606113692 ^ (long)-606113692);
        n2 = (int)((long)967200716 ^ (long)967200716);
        bl2 = bl;
        n3 = (int)674172596L ^ 0x282F0EB4;
        if (!bl2) return 0 != 0;
        BlockPos blockPos9 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos9, (String)"pos.south()");
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5184(this.Field14776, blockPos9);
        return (int)((long)1844481796 ^ (long)1844481797) != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$QDCXH9agJwY6VzukEM6t94IC3iSpNB1w(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field14776 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
        super((int)-1477657013L ^ 0xA7ECBE4A);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1266051188L ^ 0x4B766874;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1090492198L ^ 0x40FF97D9);
            int n2 = (int)((long)2064418263 ^ (long)2064418234);
            cArray2[n] = (char)(cArray[n] ^ ((int)-621421131L ^ 0xDAF595F8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

