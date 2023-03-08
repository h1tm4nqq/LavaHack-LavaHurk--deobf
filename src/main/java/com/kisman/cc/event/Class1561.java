//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.event;

import lavahack.client.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016?\u0006\u0007" }, d2 = { "Lcom/kisman/cc/event/KismanEventBus;", "Lme/zero/alpine/bus/EventManager;", "()V", "post", "", "event", "", "kisman.cc" })
public final class Class1561 extends Class80
{
    private String Field15279 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method715(@NotNull @NotNull final Object o) {
        Intrinsics.checkParameterIsNotNull(o, "event");
        super.Method715(o);
        if (o instanceof Class2157 && ((Class2157)o).Field17858 != null) {
            final Class2157 field17858 = ((Class2157)o).Field17858;
            Intrinsics.checkExpressionValueIsNotNull((Object)field17858, "event.mirrorEvent");
            this.Method715(field17858);
        }
    }
    
    private static String Method726(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3F21 ^ 0xC2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
