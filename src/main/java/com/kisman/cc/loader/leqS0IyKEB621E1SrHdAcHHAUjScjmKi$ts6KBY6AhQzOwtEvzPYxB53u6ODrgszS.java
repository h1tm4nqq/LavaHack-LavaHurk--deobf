/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kisman.cc.loader.LavaHackLoaderCoreMod
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 */
package com.kisman.cc.loader;

import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import com.kisman.cc.loader.UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV;
import com.kisman.cc.loader.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import lavahack.loader.qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6;
import lavahack.loader.xthiG5kgsZ7gUpqshm3SOX812RpS42oo;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"com/kisman/cc/loader/LoaderKt$versionCheck$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS
implements xthiG5kgsZ7gUpqshm3SOX812RpS42oo {
    final Ref.ObjectRef Field17106;
    private String Field17107 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method852(@NotNull @NotNull String string) {
        String string2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionCheck: raw answer is \"" + string + (((int)1128246535L ^ 0x433FAD16) << 1));
        switch (string) {
            case "0": {
                string2 = "Invalid arguments of \"checkversion\" command!";
                break;
            }
            case "1": {
                string2 = "Your loader is outdated! Please update it!";
                break;
            }
            case "2": {
                string2 = "Loader is on latest version!";
                break;
            }
            default: {
                string2 = "kill yourself <3";
            }
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4854(string2);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info(leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4853());
        if ((Intrinsics.areEqual((Object)string, (Object)"2") ^ (int)((long)-1530446285 ^ (long)-1530446286)) != 0) {
            UCke3Pxmf8CbZfsSMaRi6TdDNfLAgjjV.Method4886();
        }
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method4850((boolean)((long)943550142 ^ (long)943550143));
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6 qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 = (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS6)this.Field17106.element;
        if (qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62 == null) {
            Intrinsics.throwNpe();
        }
        qch99jTc1BY9W3FpbWqv6Giw1AFyzSS62.Method3320();
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
    }

    leqS0IyKEB621E1SrHdAcHHAUjScjmKi$ts6KBY6AhQzOwtEvzPYxB53u6ODrgszS(Ref.ObjectRef objectRef) {
        this.Field17106 = objectRef;
    }

    private static String Method7319(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)407506027 ^ (long)407506027);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-921369907 ^ (long)-921370062);
            int n2 = (int)((long)1433938379 ^ (long)1433938362);
            cArray2[n] = (char)(cArray[n] ^ (((int)-13079536L ^ 0xFF387529) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

