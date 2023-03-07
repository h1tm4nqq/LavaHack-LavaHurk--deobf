/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.event;

import com.kisman.cc.event.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2={"Lcom/kisman/cc/event/KismanEventBus;", "Lme/zero/alpine/bus/EventManager;", "()V", "post", "", "event", "", "kisman.cc"})
public final class YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
extends zwWWWaEO7zKr7XG54ZhX4c3PejN1DTzJ {
    private String Field15279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method715(@NotNull @NotNull Object object) {
        Intrinsics.checkParameterIsNotNull((Object)object, (String)"event");
        super.Method715(object);
        if (!(object instanceof Event)) return;
        if (((Event)object).Field17858 == null) return;
        Event event = ((Event)object).Field17858;
        Intrinsics.checkExpressionValueIsNotNull((Object)event, (String)"event.mirrorEvent");
        this.Method715(event);
    }

    private static String Method726(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1246029060L ^ 0xB5BB1AFC;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1593454478 ^ (long)-1593454451);
            int n2 = (int)((long)136983742 ^ (long)136983775) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)1951637463L ^ 0x7453A0F6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

