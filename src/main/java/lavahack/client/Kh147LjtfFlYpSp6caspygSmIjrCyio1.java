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
package lavahack.client;

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

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u0012"}, d2={"Lcom/kisman/cc/websockets/data/SocketFile;", "", "file", "Ljava/io/File;", "description", "", "(Ljava/io/File;Ljava/lang/String;)V", "name", "byteArray", "", "(Ljava/lang/String;[BLjava/lang/String;)V", "getByteArray", "()[B", "data", "getData", "getDescription", "()Ljava/lang/String;", "getName", "kisman.cc"})
public final class Kh147LjtfFlYpSp6caspygSmIjrCyio1 {
    @NotNull
    private final String Field9589;
    @NotNull
    private final byte[] Field9590;
    @NotNull
    private final String Field9591;
    private String Field9592 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final byte[] Method1840() {
        String string = "IFILE:" + this.Field9589 + (((int)-254834908L ^ 0xF0CF8739) << 1) + this.Field9591 + ":IFILE";
        Charset charset = Charsets.UTF_8;
        int n = (int)((long)-1779577937 ^ (long)-1779577937);
        String string2 = string;
        if (string2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] byArray = string2.getBytes(charset);
        Intrinsics.checkExpressionValueIsNotNull((Object)byArray, (String)"(this as java.lang.String).getBytes(charset)");
        return ArraysKt.plus((byte[])byArray, (byte[])this.Field9590);
    }

    @NotNull
    @NotNull
    public final String Method1841() {
        return this.Field9589;
    }

    @NotNull
    @NotNull
    public final byte[] Method1842() {
        return this.Field9590;
    }

    @NotNull
    @NotNull
    public final String Method1843() {
        return this.Field9591;
    }

    public Kh147LjtfFlYpSp6caspygSmIjrCyio1(@NotNull @NotNull String string, @NotNull @NotNull byte[] byArray, @NotNull @NotNull String string2) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        Intrinsics.checkParameterIsNotNull((Object)byArray, (String)"byteArray");
        Intrinsics.checkParameterIsNotNull((Object)string2, (String)"description");
        this.Field9589 = string;
        this.Field9590 = byArray;
        this.Field9591 = string2;
    }

    public Kh147LjtfFlYpSp6caspygSmIjrCyio1(@NotNull @NotNull File file, @NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)file, (String)"file");
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"description");
        String string2 = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"file.name");
        this(string2, FilesKt.readBytes((File)file), string);
    }

    public Kh147LjtfFlYpSp6caspygSmIjrCyio1(File file, String string, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & ((int)-2126606636L ^ 0x813E8ED5) << 1) != 0) {
            string = "";
        }
        this(file, string);
    }

    private static String Method1844(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)100486416 ^ (long)100486416);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-350274295L ^ 0xEB1F3DF6);
            int n2 = (int)((long)821990486 ^ (long)821990447);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1680708742 ^ (long)1680713843) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

