/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.collections.ArraysKt
 *  kotlin.io.FilesKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Charsets
 */
package lavahack.loader;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/loader/websockets/data/SocketFile;", "", "file", "Ljava/io/File;", "description", "", "(Ljava/io/File;Ljava/lang/String;)V", "name", "byteArray", "", "(Ljava/lang/String;[BLjava/lang/String;)V", "getByteArray", "()[B", "data", "getData", "getDescription", "()Ljava/lang/String;", "getName", "kisman.cc"})
public final class QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz {
    @NotNull
    private final String Field14751;
    @NotNull
    private final byte[] Field14752;
    @NotNull
    private final String Field14753;
    private String Field14754 = "TheKisDevs & LavaHack Development owns you";

    @NotNull
    @NotNull
    public final byte[] Method5750() {
        String string = "IFILE:" + this.Field14751 + (((int)1935041591L ^ 0x7356642A) << 1) + this.Field14753 + ":IFILE";
        Charset charset = Charsets.UTF_8;
        int n = (int)((long)-1700836882 ^ (long)-1700836882);
        String string2 = string;
        if (string2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray = string2.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"(this as java.lang.String).getBytes(charset)");
        return ArraysKt.plus((byte[])byArray, (byte[])this.Field14752);
    }

    @NotNull
    @NotNull
    public final String Method5751() {
        return this.Field14751;
    }

    @NotNull
    @NotNull
    public final byte[] Method5752() {
        return this.Field14752;
    }

    @NotNull
    @NotNull
    public final String Method5753() {
        return this.Field14753;
    }

    public QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz(@NotNull @NotNull String string, @NotNull @NotNull byte[] byArray, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"description");
        this.Field14751 = string;
        this.Field14752 = byArray;
        this.Field14753 = string2;
    }

    public QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz(@NotNull @NotNull File file, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"file");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"description");
        String string2 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"file.name");
        this(string2, FilesKt.readBytes((File)file), string);
    }

    public QpbgsOqSMNhRV1Z6xLk2RgIXIO8qURxz(File file, String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & ((int)-2140131888L ^ 0x80702DD1) << 1) != 0) {
            string = "";
        }
        this(file, string);
    }

    private static String Method5754(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1837984643L ^ 0x6D8D6B83;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)60863184 ^ (long)60863023);
            int n2 = ((int)-738588747L ^ 0xD3FA0782) << 1;
            cArray2[n] = (char)(cArray[n] ^ (((int)1309137938L ^ 0x4E07C86B) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

