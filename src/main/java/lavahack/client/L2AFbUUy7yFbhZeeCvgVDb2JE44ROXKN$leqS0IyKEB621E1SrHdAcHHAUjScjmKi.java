/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r;
import net.minecraft.util.math.BlockPos;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/EventDamageBlock;", "kotlin.jvm.PlatformType", "invoke"})
final class L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    public static final L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field15155 = new L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    private String Field15156 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method6072((t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r)object);
    }

    public final void Method6072(t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2) {
        t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r3 = t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2;
        Intrinsics.checkExpressionValueIsNotNull((Object)t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r3, (String)"it");
        BlockPos blockPos = t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r3.Method7625();
        Intrinsics.checkExpressionValueIsNotNull((Object)blockPos, (String)"it.blockPos");
        if (!L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN.Field9152.Method1405(blockPos, t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2.Method7626())) return;
        t8Zz9kLYOvPClkfi3gawfSO9zXOPwv4r2.Method158();
    }

    L2AFbUUy7yFbhZeeCvgVDb2JE44ROXKN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    private static String Method6073(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-613628451L ^ 0xDB6CC5DD;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-1640688150L ^ 0x9E351515);
            int n2 = (int)((long)-966010484 ^ (long)-966010495) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1811870375 ^ (long)1811869772) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

