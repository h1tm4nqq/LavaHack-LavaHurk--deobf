/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package com.kisman.cc.loader;

import com.kisman.cc.loader.Class1204;
import com.kisman.cc.loader.Class1731;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.loader.Class122;
import lavahack.loader.Class1441;
import lavahack.loader.Class1743;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"com/kisman/cc/loader/LoaderKt$load$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class Class810
implements Class122 {
    final Class1731 Field11452;
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
        Class1204.Method4854(string2);
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
        byte[] byArray = byteBuffer.array();
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"buff.array()");
        Class1441 class1441 = new Class1743(byArray).Method6626();
        if (class1441 == null) {
            Intrinsics.throwNpe();
        }
        this.Field11452.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(class1441.Method5752());
    }

    Class810(Class1731 class1731) {
        this.Field11452 = class1731;
    }

    private static String Method3406(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 2;
            cArray2[n] = (char)(cArray[n] ^ (0x5F69 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

