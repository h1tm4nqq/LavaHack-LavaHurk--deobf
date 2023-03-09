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
import lavahack.client.Class96;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/event/events/client/friend/FriendEvent;", "", "name", "", "type", "Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "(Ljava/lang/String;Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/kisman/cc/event/events/client/friend/FriendEvent$Type;", "Type", "kisman.cc"})
public final class Class1477 {
    @NotNull
    private final String Field14887;
    @NotNull
    private final Class96 Field14888;
    private String Field14889 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method5918() {
        return this.Field14887;
    }

    @NotNull
    @NotNull
    public final Class96 Method5919() {
        return this.Field14888;
    }

    public Class1477(@NotNull @NotNull String string, @NotNull @NotNull Class96 class96) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)((Object)class96), (String)"type");
        this.Field14887 = string;
        this.Field14888 = class96;
    }

    private static String Method5920(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 12;
            cArray2[n] = (char)(cArray[n] ^ (0x786C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

