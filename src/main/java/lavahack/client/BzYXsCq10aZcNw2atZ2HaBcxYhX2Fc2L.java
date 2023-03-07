/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.entity.Entity
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
import lavahack.client.a9NhE2uE5ss35q5VfVeiULzPuHisTAna;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0007BK\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/AutoRerDamageSyncHandler;", "Lcom/kisman/cc/util/world/DamageSyncHandler;", "handler", "placeCheck", "Ljava/util/function/Supplier;", "", "breakCheck", "(Lcom/kisman/cc/util/world/DamageSyncHandler;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "state", "delay", "", "minOffset", "", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "canBreak", "Lcom/kisman/cc/util/collections/Bind;", "", "damage", "target", "Lnet/minecraft/entity/Entity;", "canPlace", "kisman.cc"})
public final class BzYXsCq10aZcNw2atZ2HaBcxYhX2Fc2L
extends a9NhE2uE5ss35q5VfVeiULzPuHisTAna {
    private final Supplier Field17524;
    private final Supplier Field17525;
    private String Field17526 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr Method7623(float f, @Nullable @Nullable Entity entity) {
        SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
        if (entity != null) {
            Object t = this.Field17524.get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"placeCheck.get()");
            if (((Boolean)t).booleanValue()) {
                smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = this.Method6396(f, entity);
                return smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
            }
        }
        smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr((entity != null ? (int)((long)1427019359 ^ (long)1427019358) : (int)((long)754083055 ^ (long)754083055)) != 0, Float.valueOf(f));
        return smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
    }

    @NotNull
    @NotNull
    public final SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr Method7624(float f, @Nullable @Nullable Entity entity) {
        SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
        if (entity != null) {
            Object t = this.Field17525.get();
            Intrinsics.checkExpressionValueIsNotNull(t, (String)"breakCheck.get()");
            if (((Boolean)t).booleanValue()) {
                smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = this.Method6396(f, entity);
                return smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
            }
        }
        smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr = new SmbBI1RfInIWz1jOHQYQ20hZlFRTXxxr((entity != null ? (int)1181593405L ^ 0x466DAF3C : (int)((long)-1666917258 ^ (long)-1666917258)) != 0, Float.valueOf(f));
        return smbBI1RfInIWz1jOHQYQ20hZlFRTXxxr;
    }

    public BzYXsCq10aZcNw2atZ2HaBcxYhX2Fc2L(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3, @NotNull @NotNull Supplier supplier4, @NotNull @NotNull Supplier supplier5) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"state");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"delay");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"minOffset");
        Intrinsics.checkParameterIsNotNull((Object)supplier4, (String)"placeCheck");
        Intrinsics.checkParameterIsNotNull((Object)supplier5, (String)"breakCheck");
        super(supplier, supplier2, supplier3);
        this.Field17524 = supplier4;
        this.Field17525 = supplier5;
    }

    public BzYXsCq10aZcNw2atZ2HaBcxYhX2Fc2L(@NotNull @NotNull a9NhE2uE5ss35q5VfVeiULzPuHisTAna a9NhE2uE5ss35q5VfVeiULzPuHisTAna2, @NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2) {
        Intrinsics.checkParameterIsNotNull((Object)a9NhE2uE5ss35q5VfVeiULzPuHisTAna2, (String)"handler");
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"placeCheck");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"breakCheck");
        this(a9NhE2uE5ss35q5VfVeiULzPuHisTAna2.Method6397(), a9NhE2uE5ss35q5VfVeiULzPuHisTAna2.Method6398(), a9NhE2uE5ss35q5VfVeiULzPuHisTAna2.Method6399(), supplier, supplier2);
    }

    private static String Method6400(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)773998092L ^ 0x2E22460C;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1330654252L ^ 0x4F502CD3);
            int n2 = (int)-1169894380L ^ 0xBA44D4ED;
            cArray2[n] = (char)(cArray[n] ^ (((int)1016996504L ^ 0x3C9E236D) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

