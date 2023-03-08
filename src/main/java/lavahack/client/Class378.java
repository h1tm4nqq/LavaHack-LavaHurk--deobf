//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.text.*;
import kotlin.*;
import kotlin.collections.*;
import java.nio.charset.*;
import java.io.*;
import kotlin.io.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t?\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\t8F?\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010?\u0006\u0012" }, d2 = { "Lcom/kisman/cc/websockets/data/SocketFile;", "", "file", "Ljava/io/File;", "description", "", "(Ljava/io/File;Ljava/lang/String;)V", "name", "byteArray", "", "(Ljava/lang/String;[BLjava/lang/String;)V", "getByteArray", "()[B", "data", "getData", "getDescription", "()Ljava/lang/String;", "getName", "kisman.cc" })
public final class Class378
{
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
        final String string = "IFILE:" + this.Field9589 + ':' + this.Field9591 + ":IFILE";
        final Charset utf_8 = Charsets.UTF_8;
        final String s = string;
        if (s == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        final byte[] bytes = s.getBytes(utf_8);
        Intrinsics.checkExpressionValueIsNotNull((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return ArraysKt.plus(bytes, this.Field9590);
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
    
    public Class378(@NotNull @NotNull final String field9589, @NotNull @NotNull final byte[] field9590, @NotNull @NotNull final String field9591) {
        Intrinsics.checkParameterIsNotNull((Object)field9589, "name");
        Intrinsics.checkParameterIsNotNull((Object)field9590, "byteArray");
        Intrinsics.checkParameterIsNotNull((Object)field9591, "description");
        this.Field9589 = field9589;
        this.Field9590 = field9590;
        this.Field9591 = field9591;
    }
    
    public Class378(@NotNull @NotNull final File file, @NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)file, "file");
        Intrinsics.checkParameterIsNotNull((Object)s, "description");
        final String name = file.getName();
        Intrinsics.checkExpressionValueIsNotNull((Object)name, "file.name");
        this(name, FilesKt.readBytes(file), s);
    }
    
    public Class378(final File file, String s, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            s = "";
        }
        this(file, s);
    }
    
    private static String Method1844(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x79EA ^ 0x79));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
