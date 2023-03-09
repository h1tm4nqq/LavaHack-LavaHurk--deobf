/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/event/events/client/console/ConsoleMessageEvent;", "Lcom/kisman/cc/event/Event;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "kisman.cc"})
public final class Class967
extends Class2157 {
    @NotNull
    private final String Field12143;
    private int Field12144;

    @NotNull
    @NotNull
    public final String Method3968() {
        return this.Field12143;
    }

    public Class967(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        super(new Object[0]);
        this.Field12143 = string;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 184;
            cArray2[n] = (char)(cArray[n] ^ (0x714D ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

