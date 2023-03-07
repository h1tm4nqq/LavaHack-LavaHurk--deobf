/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0007\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/event/events/EventC00Handshake;", "Lcom/kisman/cc/event/Event;", "ip", "", "defaultIp", "(Ljava/lang/String;Ljava/lang/String;)V", "getDefaultIp", "()Ljava/lang/String;", "getIp", "setIp", "(Ljava/lang/String;)V", "kisman.cc"})
public final class JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm
extends Event {
    @NotNull
    private String Field12225;
    @NotNull
    private final String Field12226;
    private String Field12227 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final String Method4009() {
        return this.Field12225;
    }

    public final void Method4010(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"<set-?>");
        this.Field12225 = string;
    }

    @NotNull
    @NotNull
    public final String Method4011() {
        return this.Field12226;
    }

    public JO6jdiLX9RYULB5te7Gwfhm7zkPpnZUm(@NotNull @NotNull String string, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"ip");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"defaultIp");
        super(new Object[(int)((long)601647786 ^ (long)601647786)]);
        this.Field12225 = string;
        this.Field12226 = string2;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1261482574L ^ 0xB4CF4DB2;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1888681534L ^ 0x7092FEC1);
            int n2 = (int)-696410418L ^ 0xD67D9E5D;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)5472533 ^ (long)5491188) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

