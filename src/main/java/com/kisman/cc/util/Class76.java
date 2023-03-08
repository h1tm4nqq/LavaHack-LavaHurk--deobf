//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package com.kisman.cc.util;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import lavahack.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016?\u0006\u0006" }, d2 = { "com/kisman/cc/util/AccountDataCheckerKt$check$messageProcessor$1", "Lcom/kisman/cc/websockets/IMessageProcessor;", "processMessage", "", "message", "", "kisman.cc" })
public final class Class76 implements Class649
{
    private String Field8248 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method665(@NotNull @NotNull final String x) {
        Intrinsics.checkParameterIsNotNull((Object)x, "message");
        System.out.println((Object)x);
        if (Intrinsics.areEqual((Object)x, (Object)"2")) {
            Class191.Method1149().clear();
        }
        else {
            Class1796.Field16243.error("Error Code: 0x0002");
            Class1796.Method6791();
        }
    }
    
    Class76() {
    }
    
    private static String Method666(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xFA7 ^ 0x13));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
