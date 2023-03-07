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

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lavahack.client.hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7;
import lavahack.client.sBXvZh1FnX9XL3nU0uzC7c09oefT2s1B;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n\u00a2\u0006\u0002\b\u0007"}, d2={"modifyColor", "Lcom/kisman/cc/util/Colour;", "color", "delay", "", "logic", "Lcom/kisman/cc/util/enums/FadeLogic;", "invoke"})
final class c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends Lambda
implements Function3 {
    final long Field8425;
    final float Field8426;
    final float Field8427;
    private int Field8428;

    public Object invoke(Object object, Object object2, Object object3) {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((vl3icpcdb9cWvH39NKe3weWQwVdWO7AV)object, ((Number)object2).longValue(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)((Object)object3));
    }

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, long l, @NotNull @NotNull hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7 hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo72) {
        float f;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        Intrinsics.checkParameterIsNotNull((Object)((Object)hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo72), (String)"logic");
        if (l == 0L) {
            vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2;
            return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
        }
        switch (sBXvZh1FnX9XL3nU0uzC7c09oefT2s1B.Field14755[hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo72.ordinal()]) {
            case 1: {
                long l2 = System.currentTimeMillis() - this.Field8425;
                int n = (int)2000878256L ^ 0x7742FAB0;
                f = Math.min(l2, l) / l;
                break;
            }
            case 2: {
                float f2 = this.Field8426;
                float f3 = this.Field8427;
                float f4 = (int)1796730701L ^ 0x6B17EF4C;
                int n = (int)((long)-1901486966 ^ (long)-1901486966);
                float f5 = Math.min(f2, f3);
                f = f4 - f5 / this.Field8427;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        float f6 = f;
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3633((int)((float)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Field17324 * f6));
        vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3 = vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4;
        Intrinsics.checkExpressionValueIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"color.withAlpha((color.a * delta).toInt())");
        return vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3;
    }

    c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(long l, float f, float f2) {
        this.Field8425 = l;
        this.Field8426 = f;
        this.Field8427 = f2;
        super((int)-393307422L ^ 0xE88E9AE1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1634619186L ^ 0x616E4F32;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-143331351L ^ 0xF774EF16);
            int n2 = (int)-141329628L ^ 0xF7937BE5;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1714607471 ^ (long)1714598428) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

