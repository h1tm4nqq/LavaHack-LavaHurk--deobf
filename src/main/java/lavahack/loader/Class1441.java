//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import org.jetbrains.annotations.*;
import kotlin.text.*;
import kotlin.*;
import kotlin.collections.*;
import java.nio.charset.*;
import java.io.*;
import kotlin.io.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F?\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/loader/websockets/data/SocketFile;", "", "file", "Ljava/io/File;", "description", "", "(Ljava/io/File;Ljava/lang/String;)V", "name", "byteArray", "", "(Ljava/lang/String;[BLjava/lang/String;)V", "getByteArray", "()[B", "data", "getData", "getDescription", "()Ljava/lang/String;", "getName", "kisman.cc" })
public final class Class1441
{
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
        final String string = "IFILE:" + this.Field14751 + ':' + this.Field14753 + ":IFILE";
        final Charset utf_8 = Charsets.UTF_8;
        final String s = string;
        if (s == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = s.getBytes(utf_8);
        Intrinsics.checkExpressionValueIsNotNull((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return ArraysKt.plus(bytes, this.Field14752);
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
    
    public Class1441(@NotNull @NotNull final String field14751, @NotNull @NotNull final byte[] field14752, @NotNull @NotNull final String field14753) {
        Intrinsics.checkParameterIsNotNull((Object)field14751, "name");
        Intrinsics.checkParameterIsNotNull((Object)field14752, "byteArray");
        Intrinsics.checkParameterIsNotNull((Object)field14753, "description");
        this.Field14751 = field14751;
        this.Field14752 = field14752;
        this.Field14753 = field14753;
    }
    
    public Class1441(@NotNull @NotNull final File file, @NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)file, "file");
        Intrinsics.checkParameterIsNotNull((Object)s, "description");
        final String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)name, "file.name");
        this(name, FilesKt.readBytes(file), s);
    }
    
    public Class1441(final File file, String s, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            s = "";
        }
        this(file, s);
    }
    
    private static String Method5754(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x28F2 ^ 0x6E));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
