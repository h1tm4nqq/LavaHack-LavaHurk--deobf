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
import lavahack.client.FrvoqED59Mj96pmO7hxn2tEew1fZAOzj;
import lavahack.client.hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2={"Lcom/kisman/cc/features/command/commands/TestCommand$SubTestCommand1;", "Lcom/kisman/cc/features/command/SubCommand;", "instance", "Lcom/kisman/cc/features/command/Command;", "(Lcom/kisman/cc/features/command/Command;)V", "runCommand", "", "s", "", "args", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "kisman.cc"})
final class y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends hbD4kseV1VTER7aHOSIdAw4x7SiMKhfb {
    private String Field12317 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method443(@NotNull @NotNull String string, @NotNull @NotNull String[] stringArray) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"s");
        Intrinsics.checkParameterIsNotNull((Object)stringArray, (String)"args");
        this.Method437("Complete!!!!");
    }

    public y6zGslDM9e0TAEaF7idSOV4PCFXYFBnc$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull FrvoqED59Mj96pmO7hxn2tEew1fZAOzj frvoqED59Mj96pmO7hxn2tEew1fZAOzj) {
        Intrinsics.checkParameterIsNotNull((Object)frvoqED59Mj96pmO7hxn2tEew1fZAOzj, (String)"instance");
        super("test2", frvoqED59Mj96pmO7hxn2tEew1fZAOzj);
    }

    private static String Method441(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-820260595L ^ 0xCF1BD10D;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1488104043 ^ (long)1488104084);
            int n2 = (int)((long)948791698 ^ (long)948791781);
            cArray2[n] = (char)(cArray[n] ^ ((int)-1341345731L ^ 0xB00CEA36 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

