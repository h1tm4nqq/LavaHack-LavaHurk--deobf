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
import lavahack.client.Class1178;
import lavahack.client.Class516;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/gui/mainmenu/gui/element/elements/TextElement;", "Lcom/kisman/cc/gui/mainmenu/gui/element/AbstractElement;", "text", "", "x", "", "y", "(Ljava/lang/String;DD)V", "getText", "()Ljava/lang/String;", "getX", "()D", "getY", "draw", "", "getHeight", "kisman.cc"})
public final class Class1840
extends Class516 {
    @NotNull
    private final String Field16493;
    private final double Field16494;
    private final double Field16495;
    private int Field16496;

    @Override
    public void Method2379() {
        Class1178.Method4745(this.Field16493, this.Field16494, this.Field16495, -1);
    }

    @Override
    public double Method2380() {
        return Class1178.Method4748();
    }

    @NotNull
    @NotNull
    public final String Method6935() {
        return this.Field16493;
    }

    public final double Method6936() {
        return this.Field16494;
    }

    public final double Method6937() {
        return this.Field16495;
    }

    public Class1840(@NotNull @NotNull String string, double d, double d2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        this.Field16493 = string;
        this.Field16494 = d;
        this.Field16495 = d2;
    }

    private static String Method6938(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 117;
            cArray2[n] = (char)(cArray[n] ^ (0x3371 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

