/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.QXlkw2Ikft5UWcHHYvWCAtMLZOpdngQ5;
import lavahack.client.iDprz50yBrPJ6StAk1hDYgq1aL04tvSb;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/websockets/command/commands/CapeCommand;", "Lcom/kisman/cc/websockets/command/Command;", "()V", "execute", "", "Lcom/kisman/cc/websockets/data/SocketMessage;", "line", "", "args", "kisman.cc"})
public final class qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr
extends QXlkw2Ikft5UWcHHYvWCAtMLZOpdngQ5 {
    public static final qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr Field9323;
    private String Field9324 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    @NotNull
    @NotNull
    public List Method1589(@NotNull @NotNull String string, @NotNull @NotNull List list) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"line");
        Intrinsics.checkParameterIsNotNull((Object)list, (String)"args");
        switch (list.size()) {
            case 2: {
                if (!Intrinsics.areEqual((Object)((String)list.get((int)((long)929136042 ^ (long)929136043))), (Object)"clear")) return CollectionsKt.emptyList();
                iDprz50yBrPJ6StAk1hDYgq1aL04tvSb.Field16451.Method6888();
                return CollectionsKt.emptyList();
            }
            case 4: {
                switch ((String)list.get((int)886501523L ^ 0x34D6F092)) {
                    case "add": {
                        iDprz50yBrPJ6StAk1hDYgq1aL04tvSb.Field16451.Method6889((String)list.get((int)((long)45483942 ^ (long)45483941)), iDprz50yBrPJ6StAk1hDYgq1aL04tvSb.Field16451.Method6897((String)list.get(((int)-515216812L ^ 0xE14A6A55) << 1)));
                        return CollectionsKt.emptyList();
                    }
                    case "remove": {
                        iDprz50yBrPJ6StAk1hDYgq1aL04tvSb.Field16451.Method6891((String)list.get((int)((long)1833764098 ^ (long)1833764097)));
                    }
                }
                return CollectionsKt.emptyList();
            }
        }
        return CollectionsKt.emptyList();
    }

    private qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr() {
        super("cape");
    }

    static {
        qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr2;
        Field9323 = qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr2 = new qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr();
    }

    private static String Method1592(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)738350330L ^ 0x2C0254FA;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2108349148 ^ (long)2108348963);
            int n2 = ((int)-492618834L ^ 0xE2A33BB9) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1502414930 ^ (long)1502432447) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

