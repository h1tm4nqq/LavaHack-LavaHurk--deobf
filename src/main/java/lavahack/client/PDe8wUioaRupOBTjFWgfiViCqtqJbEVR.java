/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/event/events/EventResolutionUpdate;", "Lcom/kisman/cc/event/Event;", "width", "", "height", "(II)V", "getName", "", "kisman.cc"})
public final class PDe8wUioaRupOBTjFWgfiViCqtqJbEVR
extends Event {
    private String Field8911 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public String Method163() {
        return "update_resolution";
    }

    public PDe8wUioaRupOBTjFWgfiViCqtqJbEVR(int n, int n2) {
        super(new Object[(int)((long)1479037117 ^ (long)1479037117)]);
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1280825694L ^ 0x4C57D95E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-798966632 ^ (long)-798966681);
            int n2 = (int)((long)991188926 ^ (long)991188917) << 4;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1103786407 ^ (long)-1103777054) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

