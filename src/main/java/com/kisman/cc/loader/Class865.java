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

import com.kisman.cc.loader.Class1204;
import com.kisman.cc.loader.Class1214;
import com.kisman.cc.loader.LavaHackLoaderCoreMod;
import java.nio.ByteBuffer;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import lavahack.loader.Class122;
import lavahack.loader.Class800;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"com/kisman/cc/loader/LoaderKt$versions$messageProcessor$1", "Lcom/kisman/cc/loader/websockets/IMessageProcessor;", "processMessage", "", "buff", "Ljava/nio/ByteBuffer;", "message", "", "kisman.cc"})
public final class Class865
implements Class122 {
    final Ref.ObjectRef Field11643;
    private int Field11644;

    @Override
    public void Method852(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"message");
        LavaHackLoaderCoreMod.Companion.getLOGGER().info("VersionsList: raw answer is \"" + string + '\"');
        switch (string) {
            case "0": {
                Class1204.Method4854("Invalid arguments of \"getversions\" command!");
                break;
            }
            case "1": {
                Class1204.Method4854("Invalid loader version!");
                break;
            }
            default: {
                if (!StringsKt.startsWith$default((String)string, (String)"2", (boolean)false, (int)2, null)) break;
                Class1204.Method4854("Successfully received version list");
                Collection collection = StringsKt.split$default((CharSequence)((CharSequence)StringsKt.split$default((CharSequence)string, (String[])new String[]{"|"}, (boolean)false, (int)0, (int)6, null).get(1)), (String[])new String[]{"&"}, (boolean)false, (int)0, (int)6, null);
                boolean bl = false;
                Collection collection2 = collection;
                String[] stringArray = collection2.toArray(new String[0]);
                if (stringArray == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Class1204.Method4840(stringArray);
                Class1204.Method4852(true);
            }
        }
        LavaHackLoaderCoreMod.Companion.getLOGGER().info(Class1204.Method4853());
        if (Intrinsics.areEqual((Object)Class1204.Method4853(), (Object)"Successfully received version list") ^ true) {
            Class1214.Method4886();
        }
        Class800 class800 = (Class800)this.Field11643.element;
        if (class800 == null) {
            Intrinsics.throwNpe();
        }
        class800.Method3320();
    }

    @Override
    public void Method853(@NotNull @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkParameterIsNotNull((Object)byteBuffer, (String)"buff");
    }

    Class865(Ref.ObjectRef objectRef) {
        this.Field11643 = objectRef;
    }

    private static String Method3657(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 15;
            cArray2[n] = (char)(cArray[n] ^ (0x75C ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

