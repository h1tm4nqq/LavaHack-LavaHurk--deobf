/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 */
package lavahack.client;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lavahack.client.qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/websockets/command/CommandManager;", "", "()V", "commands", "", "Lcom/kisman/cc/websockets/command/commands/CapeCommand;", "execute", "", "line", "", "kisman.cc"})
public final class hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW {
    private static final List Field15395;
    public static final hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW Field15396;
    private String Field15397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final boolean Method6215(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"line");
        Object object = string;
        int n = (int)((long)437828510 ^ (long)437828510);
        int n2 = object.length() == 0 ? (int)-1036023510L ^ 0xC23F892B : (int)((long)7527293 ^ (long)7527293);
        if (StringsKt.isBlank((CharSequence)string)) {
            return (int)((long)548034180 ^ (long)548034180) != 0;
        }
        String[] stringArray = new String[(int)((long)-1435245360 ^ (long)-1435245359)];
        stringArray[(int)213755738L ^ 0xCBDA75A] = " ";
        object = StringsKt.split$default((CharSequence)string, (String[])stringArray, (boolean)((long)2039963491 ^ (long)2039963491), (int)((int)291004504L ^ 0x11586058), (int)(((int)-1259372241L ^ 0xB4EF812C) << 1), null);
        n = (int)((long)630397005 ^ (long)630397005);
        Iterator iterator = Field15395.iterator();
        while (iterator.hasNext()) {
            qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr2 = (qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr)iterator.next();
            if (!Intrinsics.areEqual((Object)qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr2.Method1591(), (Object)((String)object.get((int)-1716152025L ^ 0x99B59927)))) continue;
            qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr2.Method1590(string, (List)object);
            n = (int)((long)-1786149110 ^ (long)-1786149109);
        }
        return n != 0;
    }

    private hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW() {
    }

    static {
        hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW2;
        Field15396 = hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW2 = new hKyAp97OBjIOB2mZNQ64ZkkGxHZRPyNW();
        Field15395 = CollectionsKt.listOf((Object)qwvaDBhGMvkSWUlX8WIXhyviJHpvenJr.Field9323);
    }

    private static String Method6216(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-2091577757L ^ 0x83550E63;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-130550673 ^ (long)-130550640);
            int n2 = ((int)46937037L ^ 0x2CC33DA) << 2;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1548045852 ^ (long)1548044875) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

