/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.loader;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/loader/websockets/DummyMessageProcessor;", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "()V", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class W3C0y9394VvVcZKAtDfQSnqXm5zLQGty
implements xthiG5kgsZ7gUpqshm3SOX812RpS42oo {
    private int Field11899;

    @Override
    public void Method852(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
    }

    private static String Method3843(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-494469253L ^ 0xE286FF7B;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)478305267 ^ (long)478305036);
            int n2 = (int)235166092L ^ 0xE0459E1;
            cArray2[n] = (char)(cArray[n] ^ (((int)601508455L ^ 0x23DA4310) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

