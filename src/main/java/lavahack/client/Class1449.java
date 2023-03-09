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
import lavahack.client.Class1281;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"place", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class Class1449
extends Lambda
implements Function1 {
    final Class1281 Field14776;
    private String Field14777 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        BlockPos blockPos2 = blockPos.north();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos2, (String)"pos.north()");
        boolean bl = Class1281.Method5179(this.Field14776, blockPos2);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = bl;
        boolean bl5 = false;
        if (bl4) {
            BlockPos blockPos3 = blockPos.north();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos3, (String)"pos.north()");
            Class1281.Method5184(this.Field14776, blockPos3);
            return true;
        }
        BlockPos blockPos4 = blockPos.east();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos4, (String)"pos.east()");
        bl = Class1281.Method5179(this.Field14776, blockPos4);
        bl2 = false;
        bl3 = false;
        bl4 = bl;
        bl5 = false;
        if (bl4) {
            BlockPos blockPos5 = blockPos.east();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos5, (String)"pos.east()");
            Class1281.Method5184(this.Field14776, blockPos5);
            return true;
        }
        BlockPos blockPos6 = blockPos.west();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos6, (String)"pos.west()");
        bl = Class1281.Method5179(this.Field14776, blockPos6);
        bl2 = false;
        bl3 = false;
        bl4 = bl;
        bl5 = false;
        if (bl4) {
            BlockPos blockPos7 = blockPos.west();
            Intrinsics.checkExpressionValueIsNotNull((Object)blockPos7, (String)"pos.west()");
            Class1281.Method5184(this.Field14776, blockPos7);
            return true;
        }
        BlockPos blockPos8 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos8, (String)"pos.south()");
        bl = Class1281.Method5179(this.Field14776, blockPos8);
        bl2 = false;
        bl3 = false;
        bl4 = bl;
        bl5 = false;
        if (!bl4) return false;
        BlockPos blockPos9 = blockPos.south();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos9, (String)"pos.south()");
        Class1281.Method5184(this.Field14776, blockPos9);
        return true;
    }

    Class1449(Class1281 class1281) {
        this.Field14776 = class1281;
        super(1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 109;
            cArray2[n] = (char)(cArray[n] ^ (0x484D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

