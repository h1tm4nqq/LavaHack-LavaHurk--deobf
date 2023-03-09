/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.event;

import com.kisman.cc.event.Class2157;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class80;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/event/KismanEventBus;", "Lme/zero/alpine/bus/EventManager;", "()V", "post", "", "event", "", "kisman.cc"})
public final class Class1561
extends Class80 {
    private String Field15279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method715(@NotNull @NotNull Object object) {
        Intrinsics.checkParameterIsNotNull((Object)object, (String)"event");
        super.Method715(object);
        if (!(object instanceof Class2157)) return;
        if (((Class2157)object).Field17858 == null) return;
        Class2157 class2157 = ((Class2157)object).Field17858;
        Intrinsics.checkExpressionValueIsNotNull((Object)class2157, (String)"event.mirrorEvent");
        this.Method715(class2157);
    }

    private static String Method726(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 194;
            cArray2[n] = (char)(cArray[n] ^ (0x3F21 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

