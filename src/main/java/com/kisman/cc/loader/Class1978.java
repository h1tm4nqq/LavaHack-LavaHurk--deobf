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

import com.kisman.cc.loader.Class1204;
import com.kisman.cc.loader.Class1214;
import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import lavahack.loader.Class122;
import lavahack.loader.Class800;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"com/kisman/cc/loader/LoaderKt$versionCheck$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class Class1978
implements Class122 {
    final Ref.ObjectRef Field17106;
    private String Field17107 = "TheKisDevs & LavaHack Development owns you";

    @Override
    public void Method852(@NotNull @NotNull String string) {
        String string2;
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionCheck: raw answer is \"" + string + '\"');
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
        Class1204.Method4854(string2);
        LavaHackLoaderCoreMod.Companion.getLOGGER().info(Class1204.Method4853());
        if (Intrinsics.areEqual((Object)string, (Object)"2") ^ true) {
            Class1214.Method4886();
        }
        Class1204.Method4850(true);
        Class800 class800 = (Class800)this.Field17106.element;
        if (class800 == null) {
            Intrinsics.throwNpe();
        }
        class800.Method3320();
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
    }

    Class1978(Ref.ObjectRef objectRef) {
        this.Field17106 = objectRef;
    }

    private static String Method7319(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 113;
            cArray2[n] = (char)(cArray[n] ^ (0x3272 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

