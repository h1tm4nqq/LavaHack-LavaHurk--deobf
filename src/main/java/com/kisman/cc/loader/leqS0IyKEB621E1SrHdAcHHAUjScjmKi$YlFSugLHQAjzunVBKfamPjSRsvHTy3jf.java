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

import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import com.kisman.cc.util.AccountData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import lavahack.loader.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.loader.vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, d2={"processBytes", "", "bytes", "", "invoke"})
final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf
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
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Successfully received LavaHack");
        LavaHackLoaderCoreMod.Companion.setLoaded(((int)1914821444L ^ 0x7221DB45) != 0);
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4848((boolean)((long)1458510957 ^ (long)1458510957));
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4862(byArray);
        vyW9vRV2f2w4J1b94egeWDRZaB6Qg1yi.Method4796();
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6)this.Field15938.element;
        if (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 == null) {
            Intrinsics.throwNpe();
        }
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method3320();
        AccountData.Field8161.Method2221(this.Field15939);
        AccountData.Field8161.Method2223(this.Field15940);
        String string = this.Field15941;
        AccountData.Companion companion = AccountData.Field8161;
        int n = (int)-385255989L ^ 0xE90975CB;
        int n2 = Integer.parseInt(string);
        companion.Method2225(n2);
        LavaHackLoaderCoreMod.Companion.resume();
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(Ref.ObjectRef objectRef, String string, String string2, String string3) {
        this.Field15938 = objectRef;
        this.Field15939 = string;
        this.Field15940 = string2;
        this.Field15941 = string3;
        super((int)((long)645461968 ^ (long)645461969));
    }

    private static String a(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)41179535 ^ (long)41179535);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-944017476 ^ (long)-944017597);
            int n2 = (int)((long)1688241949 ^ (long)1688241922);
            cArray2[n] = (char)(cArray[n] ^ (((int)580733989L ^ 0x229D4BB6) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

