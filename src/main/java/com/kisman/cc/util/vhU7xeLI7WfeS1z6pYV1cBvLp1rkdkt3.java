/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.util;

import com.kisman.cc.util.vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3$1;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B1\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0007B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/util/LinkedColour;", "Lcom/kisman/cc/util/Colour;", "red", "Ljava/util/function/Supplier;", "", "green", "blue", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "alpha", "(Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V", "getAlpha", "()Ljava/util/function/Supplier;", "getBlue", "getGreen", "getRed", "toColour", "kisman.cc"})
public final class vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3
extends vl3icpcdb9cWvH39NKe3weWQwVdWO7AV {
    @NotNull
    private final Supplier Field11629;
    @NotNull
    private final Supplier Field11630;
    @NotNull
    private final Supplier Field11631;
    @NotNull
    private final Supplier Field11632;
    private String Field11633 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final vl3icpcdb9cWvH39NKe3weWQwVdWO7AV Method3637() {
        Object t = this.Field11629.get();
        Intrinsics.checkExpressionValueIsNotNull(t, (String)"red.get()");
        int n = ((Number)t).intValue();
        Object t2 = this.Field11630.get();
        Intrinsics.checkExpressionValueIsNotNull(t2, (String)"green.get()");
        int n2 = ((Number)t2).intValue();
        Object t3 = this.Field11631.get();
        Intrinsics.checkExpressionValueIsNotNull(t3, (String)"blue.get()");
        int n3 = ((Number)t3).intValue();
        Object t4 = this.Field11632.get();
        Intrinsics.checkExpressionValueIsNotNull(t4, (String)"alpha.get()");
        return new vl3icpcdb9cWvH39NKe3weWQwVdWO7AV(n, n2, n3, ((Number)t4).intValue());
    }

    @NotNull
    @NotNull
    public final Supplier Method3638() {
        return this.Field11629;
    }

    @NotNull
    @NotNull
    public final Supplier Method3639() {
        return this.Field11630;
    }

    @NotNull
    @NotNull
    public final Supplier Method3640() {
        return this.Field11631;
    }

    @NotNull
    @NotNull
    public final Supplier Method3641() {
        return this.Field11632;
    }

    public vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3, @NotNull @NotNull Supplier supplier4) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"red");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"green");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"blue");
        Intrinsics.checkParameterIsNotNull((Object)supplier4, (String)"alpha");
        this.Field11629 = supplier;
        this.Field11630 = supplier2;
        this.Field11631 = supplier3;
        this.Field11632 = supplier4;
    }

    public vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3(@NotNull @NotNull Supplier supplier, @NotNull @NotNull Supplier supplier2, @NotNull @NotNull Supplier supplier3) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"red");
        Intrinsics.checkParameterIsNotNull((Object)supplier2, (String)"green");
        Intrinsics.checkParameterIsNotNull((Object)supplier3, (String)"blue");
        this(supplier, supplier2, supplier3, vhU7xeLI7WfeS1z6pYV1cBvLp1rkdkt3$1.Field17657);
    }

    private static String Method3642(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-911439778L ^ 0xC9AC885E;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1159719819 ^ (long)-1159719798);
            int n2 = (int)((long)696790437 ^ (long)696790384);
            cArray2[n] = (char)(cArray[n] ^ (((int)403171347L ^ 0x1807F12C) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

