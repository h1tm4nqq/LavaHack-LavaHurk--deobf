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
import lavahack.client.L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"mine", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG
extends Lambda
implements Function1 {
    final L40FBRtktxsbtpQN35DnNbJzEkW8lsuS Field10800;
    private String Field10801 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1 l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1 = new L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1(this);
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        boolean bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos2);
        int n = (int)-711595254L ^ 0xD595EB0A;
        int n2 = (int)((long)-1479507942 ^ (long)-1479507942);
        boolean bl2 = bl;
        int n3 = (int)-376889145L ^ 0xE98920C7;
        if (bl2) {
            BlockPos blockPos3 = blockPos.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.north()");
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5183(this.Field10800, blockPos3, (boolean)((long)-1171261847 ^ (long)-1171261848));
            return (int)((long)-1672795689 ^ (long)-1672795690) != 0;
        }
        BlockPos blockPos4 = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.east()");
        bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos4);
        n = (int)-1708632739L ^ 0x9A28555D;
        n2 = (int)809840137L ^ 0x30452E09;
        bl2 = bl;
        n3 = (int)((long)-432350159 ^ (long)-432350159);
        if (bl2) {
            BlockPos blockPos5 = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.east()");
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5183(this.Field10800, blockPos5, (boolean)((long)1422667112 ^ (long)1422667113));
            return (int)((long)-1952333085 ^ (long)-1952333086) != 0;
        }
        BlockPos blockPos6 = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.west()");
        bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos6);
        n = (int)((long)-2083973211 ^ (long)-2083973211);
        n2 = (int)((long)-1096273940 ^ (long)-1096273940);
        bl2 = bl;
        n3 = (int)((long)-1640051634 ^ (long)-1640051634);
        if (bl2) {
            BlockPos blockPos7 = blockPos.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.west()");
            L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5183(this.Field10800, blockPos7, ((int)-1173741361L ^ 0xBA0A20CE) != 0);
            return (int)((long)-415597571 ^ (long)-415597572) != 0;
        }
        BlockPos blockPos8 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"pos.south()");
        bl = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG$1.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(blockPos8);
        n = (int)-2068600102L ^ 0x84B3AADA;
        n2 = (int)-290925993L ^ 0xEEA8D257;
        bl2 = bl;
        n3 = (int)1222382054L ^ 0x48DC11E6;
        if (!bl2) return 0 != 0;
        BlockPos blockPos9 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos9, (String)"pos.south()");
        L40FBRtktxsbtpQN35DnNbJzEkW8lsuS.Method5183(this.Field10800, blockPos9, (boolean)((long)-1095053978 ^ (long)-1095053977));
        return (int)((long)-201562751 ^ (long)-201562752) != 0;
    }

    L40FBRtktxsbtpQN35DnNbJzEkW8lsuS$lykufhPOEnCHuwIMw0o30bjFnsTt0nqG(L40FBRtktxsbtpQN35DnNbJzEkW8lsuS l40FBRtktxsbtpQN35DnNbJzEkW8lsuS) {
        this.Field10800 = l40FBRtktxsbtpQN35DnNbJzEkW8lsuS;
        super((int)-651295228L ^ 0xD92E0605);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)2028785631 ^ (long)2028785631);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1519963520L ^ 0xA567327F);
            int n2 = ((int)-1108961195L ^ 0xBDE6984C) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)1784842416L ^ 0x6A628B99 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

