/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 *  kotlin.text.StringsKt
 */
package com.kisman.cc.loader;

import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.nio.ByteBuffer;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import lavahack.loader.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.loader.xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"com/kisman/cc/loader/LoaderKt$versions$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A
implements xthiG5kgsZ7gUpqshm3SOX812RpS42oo {
    final Ref.ObjectRef Field11643;
    private int Field11644;

    @Override
    public void Method852(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionsList: raw answer is \"" + string + (((int)-582042938L ^ 0xDD4EBAD7) << 1));
        switch (string) {
            case "0": {
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Invalid arguments of \"getversions\" command!");
                break;
            }
            case "1": {
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Invalid loader version!");
                break;
            }
            default: {
                if (!StringsKt.startsWith$default((String)string, (String)"2", (boolean)((long)-1589369755 ^ (long)-1589369755), (int)((int)((long)-814858684 ^ (long)-814858683) << 1), null)) break;
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854("Successfully received version list");
                String[] stringArray = new String[(int)158926278L ^ 0x97905C7];
                stringArray[(int)((long)-1317899786 ^ (long)-1317899786)] = "|";
                String[] stringArray2 = new String[(int)533417485L ^ 0x1FCB4E0C];
                stringArray2[(int)((long)1955034116 ^ (long)1955034116)] = "&";
                Collection collection = StringsKt.split$default((CharSequence)((CharSequence)StringsKt.split$default((CharSequence)string, (String[])stringArray, (boolean)((long)420965755 ^ (long)420965755), (int)((int)-1510163672L ^ 0xA5FCBB28), (int)(((int)1492482889L ^ 0x58F57B4A) << 1), null).get((int)((long)-727464313 ^ (long)-727464314))), (String[])stringArray2, ((int)-1783112450L ^ 0x95B7DCFE) != 0, (int)((int)-372064334L ^ 0xE9D2BFB2), (int)((int)((long)-341059440 ^ (long)-341059437) << 1), null);
                int n = (int)((long)-480189566 ^ (long)-480189566);
                Collection collection2 = collection;
                String[] stringArray3 = collection2.toArray(new String[(int)((long)-1007819242 ^ (long)-1007819242)]);
                if (stringArray3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4840(stringArray3);
                leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4852(((int)1556500105L ^ 0x5CC64E88) != 0);
            }
        }
        LavaHackLoaderCoreMod.Companion.getLOGGER().info(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4853());
        if ((Intrinsics.areEqual((Object)leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4853(), (Object)"Successfully received version list") ^ (int)((long)2030785411 ^ (long)2030785410)) != 0) {
            UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4886();
        }
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6)this.Field11643.element;
        if (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 == null) {
            Intrinsics.throwNpe();
        }
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method3320();
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$Ljc0gDTN8WkwPRHY480HpEkScGALG41A(Ref.ObjectRef objectRef) {
        this.Field11643 = objectRef;
    }

    private static String Method3657(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)246877548 ^ (long)246877548);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)611544372 ^ (long)611544523);
            int n2 = (int)((long)-2099618759 ^ (long)-2099618762);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1527609858 ^ (long)-1527610327) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

