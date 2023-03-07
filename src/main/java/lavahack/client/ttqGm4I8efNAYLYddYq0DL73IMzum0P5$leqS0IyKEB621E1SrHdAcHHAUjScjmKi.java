/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL;
import lavahack.client.GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/net/discord/DiscordWebhookSender$Companion;", "", "()V", "send", "", "webhook", "", "color", "Lcom/kisman/cc/util/Colour;", "title", "kisman.cc"})
public final class ttqGm4I8efNAYLYddYq0DL73IMzum0P5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi {
    private String Field16932 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method7174(@NotNull @NotNull String string, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"webhook");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"color");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"title");
        GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL = new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL(string);
        gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL.Method4341(new GZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL$leqS0IyKEB621E1SrHdAcHHAUjScjmKi().Method4907(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2.Method3625()).Method4904(string2));
        gZWgjYD32yYiZlOKEzud3Qj0Qc8svKvL.Method4342();
    }

    private ttqGm4I8efNAYLYddYq0DL73IMzum0P5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
    }

    public ttqGm4I8efNAYLYddYq0DL73IMzum0P5$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static String Method7175(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)82620450 ^ (long)82620450);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1845524320 ^ (long)1845524383);
            int n2 = (int)((long)1313503640 ^ (long)1313503711) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1801123987 ^ (long)-1801121108) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

