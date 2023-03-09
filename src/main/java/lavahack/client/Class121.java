/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.Class1442;
import lavahack.client.Class1480;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n\u00a2\u0006\u0002\b\u0007"}, d2={"modifyColor", "Lcom/kisman/cc/util/Colour;", "color", "delay", "", "logic", "Lcom/kisman/cc/util/enums/FadeLogic;", "invoke"})
final class Class121
extends Lambda
implements Function3 {
    final long Field8425;
    final float Field8426;
    final float Field8427;
    private int Field8428;

    public Object invoke(Object object, Object object2, Object object3) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((Class2027)object, ((Number)object2).longValue(), (Class1480)((Object)object3));
    }

    @NotNull
    @NotNull
    public final Class2027 leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull Class2027 class2027, long l, @NotNull @NotNull Class1480 class1480) {
        float f;
        Class2027 class20272;
        Intrinsics.checkParameterIsNotNull((Object)class2027, (String)"color");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class1480), (String)"logic");
        if (l == 0L) {
            class20272 = class2027;
            return class20272;
        }
        switch (Class1442.Field14755[class1480.ordinal()]) {
            case 1: {
                long l2 = System.currentTimeMillis() - this.Field8425;
                boolean bl = false;
                f = Math.min(l2, l) / l;
                break;
            }
            case 2: {
                float f2 = this.Field8426;
                float f3 = this.Field8427;
                float f4 = 1.0f;
                boolean bl = false;
                float f5 = Math.min(f2, f3);
                f = f4 - f5 / this.Field8427;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        float f6 = f;
        Class2027 class20273 = class2027.Method3633((int)((float)class2027.Field17324 * f6));
        class20272 = class20273;
        Intrinsics.checkExpressionValueIsNotNull((Object)class20273, (String)"color.withAlpha((color.a * delta).toInt())");
        return class20272;
    }

    Class121(long l, float f, float f2) {
        this.Field8425 = l;
        this.Field8426 = f;
        this.Field8427 = f2;
        super(3);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 193;
            cArray2[n] = (char)(cArray[n] ^ (0x6773 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

