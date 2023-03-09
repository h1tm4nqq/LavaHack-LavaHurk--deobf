/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class204;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo$Companion;", "", "()V", "INVALID", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "INVALID$annotations", "getElementFromListByPos", "list", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "kisman.cc"})
public final class Class1500 {
    private int Field15038;

    @Nullable
    @Nullable
    public final Class204 Method6018(@NotNull @NotNull List list, @NotNull @NotNull BlockPos blockPos) {
        Object t;
        Object v0;
        Class204 class204;
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"list");
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        Iterable iterable = list;
        boolean bl = false;
        Iterator iterator = iterable.iterator();
        do {
            if (!iterator.hasNext()) {
                v0 = null;
                return v0;
            }
            t = iterator.next();
            class204 = (Class204)t;
            boolean bl2 = false;
        } while (!Intrinsics.areEqual((Object)class204.Method1203(), (Object)blockPos));
        v0 = t;
        return v0;
    }

    private Class1500() {
    }

    public Class1500(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method6019(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x4BE6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

