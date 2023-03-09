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
import lavahack.client.Class1281;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"check", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "invoke"})
final class Class914
extends Lambda
implements Function1 {
    final Class1281 Field11874;
    private String Field11875 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Object invoke(Object object) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((BlockPos)object);
    }

    public final boolean leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!Class1281.Method5185(this.Field11874, blockPos)) return false;
        if (!Class1281.Method5173().world.getEntitiesWithinAABBExcludingEntity(null, new AxisAlignedBB(blockPos.up())).isEmpty()) return false;
        return true;
    }

    Class914(Class1281 class1281) {
        this.Field11874 = class1281;
        super(1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 148;
            cArray2[n] = (char)(cArray[n] ^ (0x7873 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

