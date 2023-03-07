/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.loader;

import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz;
import lavahack.loader.r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT;
import lavahack.loader.xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"com/kisman/cc/loader/LoaderKt$load$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV
implements xthiG5kgsZ7gUpqshm3SOX812RpS42oo {
    final leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf Field11452;
    private String Field11453 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method852(@NotNull @NotNull String string) {
        String string2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        switch (string) {
            case "0": {
                string2 = "Invalid arguments of \"getpublicjar\" command!";
                break;
            }
            case "1": {
                string2 = "Invalid key or HWID | Loader is outdated!";
                break;
            }
            case "2": {
                string2 = "Key and HWID is valid!";
                break;
            }
            case "3": {
                string2 = "You have no access for selected version!";
                break;
            }
            default: {
                string2 = "Invalid answer of \"getpublicjar\" command";
            }
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854(string2);
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
        byte[] byArray = byteBuffer.array();
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"buff.array()");
        QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz qpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz = new r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT(byArray).Method6626();
        if (qpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz == null) {
            Intrinsics.throwNpe();
        }
        this.Field11452.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(qpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz.Method5752());
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV(leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf) {
        this.Field11452 = leqS0IyKEB621E1SrHdAcHHAUjScjmKi$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
    }

    private static String Method3406(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1640628004 ^ (long)1640628004);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)522360488 ^ (long)522360407);
            int n2 = (int)((long)1386997274 ^ (long)1386997275) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-460837040 ^ (long)-460820423) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

