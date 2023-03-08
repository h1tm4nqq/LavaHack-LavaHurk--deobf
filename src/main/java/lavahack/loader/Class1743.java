//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.io.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\b?\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\n\u001a\u00020\u000b?\u0006\u0002\u0010\fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\fR(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e?\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e?\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004R\u0011\u0010\u0017\u001a\u00020\u00188F?\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/loader/websockets/data/SocketMessage;", "", "text", "", "(Ljava/lang/String;)V", "file", "Lcom/kisman/cc/loader/websockets/data/SocketFile;", "(Lcom/kisman/cc/loader/websockets/data/SocketFile;)V", "Ljava/io/File;", "(Ljava/io/File;)V", "byteArray", "", "([B)V", "getByteArray", "()[B", "setByteArray", "value", "getFile", "()Lcom/kisman/cc/loader/websockets/data/SocketFile;", "setFile", "getText", "()Ljava/lang/String;", "setText", "type", "Lcom/kisman/cc/loader/websockets/data/SocketMessage$Type;", "getType", "()Lcom/kisman/cc/loader/websockets/data/SocketMessage$Type;", "Type", "kisman.cc" })
public final class Class1743
{
    @NotNull
    private byte[] Field16005;
    private String Field16006 = "TheKisDevs & LavaHack Development owns you";
    
    @Nullable
    @Nullable
    public final String Method6624() {
        return Class667.Field10831.Method2843(this.Field16005);
    }
    
    public final void Method6625(@Nullable @Nullable final String s) {
        final Class667 field10831 = Class667.Field10831;
        if (s == null) {
            Intrinsics.throwNpe();
        }
        this.Field16005 = field10831.Method2844(s);
    }
    
    @Nullable
    @Nullable
    public final Class1441 Method6626() {
        return Class667.Field10831.Method2842(this.Field16005);
    }
    
    public final void Method6627(@Nullable @Nullable final Class1441 class1441) {
        if (class1441 == null) {
            Intrinsics.throwNpe();
        }
        this.Field16005 = class1441.Method5750();
    }
    
    @NotNull
    @NotNull
    public final r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Method6628() {
        return Class667.Field10831.Method2840(this.Field16005) ? r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.File : (Class667.Field10831.Method2841(this.Field16005) ? r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Text : r3CJWyFzWUiMUlfpgcodi1UeHGI1rWAT$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Bytes);
    }
    
    @NotNull
    @NotNull
    public final byte[] Method6629() {
        return this.Field16005;
    }
    
    public final void Method6630(@NotNull @NotNull final byte[] field16005) {
        Intrinsics.checkParameterIsNotNull((Object)field16005, "<set-?>");
        this.Field16005 = field16005;
    }
    
    public Class1743(@NotNull @NotNull final byte[] field16005) {
        Intrinsics.checkParameterIsNotNull((Object)field16005, "byteArray");
        this.Field16005 = field16005;
    }
    
    public Class1743(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        this(Class667.Field10831.Method2844(s));
    }
    
    public Class1743(@NotNull @NotNull final Class1441 class1441) {
        Intrinsics.checkParameterIsNotNull((Object)class1441, "file");
        this(class1441.Method5750());
    }
    
    public Class1743(@NotNull @NotNull final File file) {
        Intrinsics.checkParameterIsNotNull((Object)file, "file");
        this(new Class1441(file, (String)null, 2, (DefaultConstructorMarker)null));
    }
    
    private static String Method6631(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x3EA8 ^ 0xD5));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
