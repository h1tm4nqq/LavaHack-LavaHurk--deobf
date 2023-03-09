/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class378;
import lavahack.client.Class417;
import lavahack.client.Class734;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\fR(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2={"Lcom/kisman/cc/websockets/data/SocketMessage;", "", "text", "", "(Ljava/lang/String;)V", "file", "Lcom/kisman/cc/websockets/data/SocketFile;", "(Lcom/kisman/cc/websockets/data/SocketFile;)V", "Ljava/io/File;", "(Ljava/io/File;)V", "byteArray", "", "([B)V", "getByteArray", "()[B", "setByteArray", "value", "getFile", "()Lcom/kisman/cc/websockets/data/SocketFile;", "setFile", "getText", "()Ljava/lang/String;", "setText", "type", "Lcom/kisman/cc/websockets/data/SocketMessage$Type;", "getType", "()Lcom/kisman/cc/websockets/data/SocketMessage$Type;", "Type", "kisman.cc"})
public final class Class1132 {
    @NotNull
    private byte[] Field13137;
    private int Field13138;

    @Nullable
    @Nullable
    public final String Method4620() {
        return Class417.Field9731.Method2042(this.Field13137);
    }

    public final void Method4621(@Nullable @Nullable String string) {
        String string2 = string;
        if (string2 == null) {
            Intrinsics.throwNpe();
        }
        this.Field13137 = Class417.Field9731.Method2043(string2);
    }

    @Nullable
    @Nullable
    public final Class378 Method4622() {
        return Class417.Field9731.Method2041(this.Field13137);
    }

    public final void Method4623(@Nullable @Nullable Class378 class378) {
        Class378 class3782 = class378;
        if (class3782 == null) {
            Intrinsics.throwNpe();
        }
        this.Field13137 = class3782.Method1840();
    }

    @NotNull
    @NotNull
    public final Class734 Method4624() {
        Class734 class734;
        if (Class417.Field9731.Method2039(this.Field13137)) {
            class734 = Class734.Field11111;
            return class734;
        }
        if (Class417.Field9731.Method2040(this.Field13137)) {
            class734 = Class734.Field11110;
            return class734;
        }
        class734 = Class734.Field11112;
        return class734;
    }

    @NotNull
    @NotNull
    public final byte[] Method4625() {
        return this.Field13137;
    }

    public final void Method4626(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"<set-?>");
        this.Field13137 = byArray;
    }

    public Class1132(@NotNull @NotNull byte[] byArray) {
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        this.Field13137 = byArray;
    }

    public Class1132(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"text");
        this(Class417.Field9731.Method2043(string));
    }

    public Class1132(@NotNull @NotNull Class378 class378) {
        Intrinsics.checkParameterIsNotNull((Object)class378, (String)"file");
        this(class378.Method1840());
    }

    public Class1132(@NotNull @NotNull File file) {
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"file");
        this(new Class378(file, null, 2, null));
    }

    private static String Method4627(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 190;
            cArray2[n] = (char)(cArray[n] ^ (0x69C5 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

