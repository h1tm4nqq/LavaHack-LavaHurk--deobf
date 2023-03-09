/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Lambda
 *  kotlin.jvm.internal.Ref$ObjectRef
 */
package com.kisman.cc.loader;

import com.kisman.cc.loader.Class1204;
import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.util.AccountData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import lavahack.loader.Class1191;
import lavahack.loader.Class800;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"processBytes", "", "bytes", "", "invoke"})
final class Class1731
extends Lambda
implements Function1 {
    final Ref.ObjectRef Field15938;
    final String Field15939;
    final String Field15940;
    final String Field15941;
    private String Field15942 = "TheKisDevs & LavaHack Development owns you";

    public Object invoke(Object object) {
        this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi((byte[])object);
        return Unit.INSTANCE;
    }

    public final void leqS0IyKEB621E1SrHdAcHHAUjScjmKi(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"bytes");
        Class1204.Method4854("Successfully received LavaHack");
        LavaHackLoaderCoreMod.Companion.setLoaded(true);
        Class1204.Method4848(false);
        Class1204.Method4862(byArray);
        Class1191.Method4796();
        Class800 class800 = (Class800)this.Field15938.element;
        if (class800 == null) {
            Intrinsics.throwNpe();
        }
        class800.Method3320();
        AccountData.Field8161.Method2221(this.Field15939);
        AccountData.Field8161.Method2223(this.Field15940);
        String string = this.Field15941;
        AccountData.Companion companion = AccountData.Field8161;
        boolean bl = false;
        int n = Integer.parseInt(string);
        companion.Method2225(n);
        LavaHackLoaderCoreMod.Companion.resume();
    }

    Class1731(Ref.ObjectRef objectRef, String string, String string2, String string3) {
        this.Field15938 = objectRef;
        this.Field15939 = string;
        this.Field15940 = string2;
        this.Field15941 = string3;
        super(1);
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 31;
            cArray2[n] = (char)(cArray[n] ^ (0x1E4C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

