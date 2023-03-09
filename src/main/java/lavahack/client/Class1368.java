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
import lavahack.client.Class1563;
import lavahack.client.Class158;
import lavahack.client.Class2080;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/command/SubCommand;", "Lcom/kisman/cc/features/command/ICommand;", "Lcom/kisman/cc/util/chat/ChatHandler;", "command", "", "instance", "Lcom/kisman/cc/features/command/Command;", "(Ljava/lang/String;Lcom/kisman/cc/features/command/Command;)V", "getInstance", "()Lcom/kisman/cc/features/command/Command;", "getCommand", "kisman.cc"})
public abstract class Class1368
extends Class1563
implements Class2080 {
    private final String Field14225;
    @NotNull
    private final Class158 Field14226;
    private int Field14227;

    @Override
    @NotNull
    @NotNull
    public String Method442() {
        return this.Field14225;
    }

    @NotNull
    @NotNull
    public final Class158 Method2057() {
        return this.Field14226;
    }

    public Class1368(@NotNull @NotNull String string, @NotNull @NotNull Class158 class158) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"command");
        Intrinsics.checkParameterIsNotNull((Object)class158, (String)"instance");
        this.Field14225 = string;
        this.Field14226 = class158;
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 105;
            cArray2[n] = (char)(cArray[n] ^ (0xD94 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

