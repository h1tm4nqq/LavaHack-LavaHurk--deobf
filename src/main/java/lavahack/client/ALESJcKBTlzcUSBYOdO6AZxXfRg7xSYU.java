/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "", "name", "", "type", "Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "(Ljava/lang/String;Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "Type", "kisman.cc"})
public final class ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU {
    @NotNull
    private final String Field14887;
    @NotNull
    private final ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field14888;
    private String Field14889 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method5918() {
        return this.Field14887;
    }

    @NotNull
    @NotNull
    public final ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method5919() {
        return this.Field14888;
    }

    public ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU(@NotNull @NotNull String string, @NotNull @NotNull ALESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)((Object)aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi), (String)"type");
        this.Field14887 = string;
        this.Field14888 = aLESJcKBTlzcUSBYOdO6AZxXfRg7xSYU$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
    }

    private static String Method5920(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)225133218L ^ 0xD6B42A2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-72759247L ^ 0xFBA9C8CE);
            int n2 = ((int)-394707748L ^ 0xE8793CDF) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)401110093 ^ (long)401107542) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

