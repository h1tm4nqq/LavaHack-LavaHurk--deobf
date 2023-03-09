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
import lavahack.client.Class311;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/websockets/command/CommandManager;", "", "()V", "commands", "", "Lcom/kisman/cc/websockets/command/commands/CapeCommand;", "execute", "", "line", "", "kisman.cc"})
public final class Class1577 {
    private static final List Field15395;
    public static final Class1577 Field15396;
    private String Field15397 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final boolean Method6215(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"line");
        Object object = string;
        boolean bl = false;
        boolean bl2 = object.length() == 0;
        if (StringsKt.isBlank((CharSequence)string)) {
            return false;
        }
        object = StringsKt.split$default((CharSequence)string, (String[])new String[]{" "}, (boolean)false, (int)0, (int)6, null);
        bl = false;
        Iterator iterator = Field15395.iterator();
        while (iterator.hasNext()) {
            Class311 class311 = (Class311)iterator.next();
            if (!Intrinsics.areEqual((Object)class311.Method1591(), (Object)((String)object.get(0)))) continue;
            class311.Method1590(string, (List)object);
            bl = true;
        }
        return bl;
    }

    private Class1577() {
    }

    static {
        Class1577 class1577;
        Field15396 = class1577 = new Class1577();
        Field15395 = CollectionsKt.listOf((Object)Class311.Field9323);
    }

    private static String Method6216(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 92;
            cArray2[n] = (char)(cArray[n] ^ (0x8AE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

