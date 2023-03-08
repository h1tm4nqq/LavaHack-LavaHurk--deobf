//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.io.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006?\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\b?\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\n\u001a\u00020\u000b?\u0006\u0002\u0010\fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e?\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\fR(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e?\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0007R(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e?\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0004R\u0011\u0010\u0017\u001a\u00020\u00188F?\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a?\u0006\u001c" }, d2 = { "Lcom/kisman/cc/websockets/data/SocketMessage;", "", "text", "", "(Ljava/lang/String;)V", "file", "Lcom/kisman/cc/websockets/data/SocketFile;", "(Lcom/kisman/cc/websockets/data/SocketFile;)V", "Ljava/io/File;", "(Ljava/io/File;)V", "byteArray", "", "([B)V", "getByteArray", "()[B", "setByteArray", "value", "getFile", "()Lcom/kisman/cc/websockets/data/SocketFile;", "setFile", "getText", "()Ljava/lang/String;", "setText", "type", "Lcom/kisman/cc/websockets/data/SocketMessage$Type;", "getType", "()Lcom/kisman/cc/websockets/data/SocketMessage$Type;", "Type", "kisman.cc" })
public final class Class1132
{
    @NotNull
    private byte[] Field13137;
    private int Field13138;
    
    @Nullable
    @Nullable
    public final String Method4620() {
        return Class417.Field9731.Method2042(this.Field13137);
    }
    
    public final void Method4621(@Nullable @Nullable final String s) {
        final Class417 field9731 = Class417.Field9731;
        if (s == null) {
            Intrinsics.throwNpe();
        }
        this.Field13137 = field9731.Method2043(s);
    }
    
    @Nullable
    @Nullable
    public final Class378 Method4622() {
        return Class417.Field9731.Method2041(this.Field13137);
    }
    
    public final void Method4623(@Nullable @Nullable final Class378 class378) {
        if (class378 == null) {
            Intrinsics.throwNpe();
        }
        this.Field13137 = class378.Method1840();
    }
    
    @NotNull
    @NotNull
    public final Class734 Method4624() {
        return Class417.Field9731.Method2039(this.Field13137) ? Class734.Field11111 : (Class417.Field9731.Method2040(this.Field13137) ? Class734.Field11110 : Class734.Field11112);
    }
    
    @NotNull
    @NotNull
    public final byte[] Method4625() {
        return this.Field13137;
    }
    
    public final void Method4626(@NotNull @NotNull final byte[] field13137) {
        Intrinsics.checkParameterIsNotNull((Object)field13137, "<set-?>");
        this.Field13137 = field13137;
    }
    
    public Class1132(@NotNull @NotNull final byte[] field13137) {
        Intrinsics.checkParameterIsNotNull((Object)field13137, "byteArray");
        this.Field13137 = field13137;
    }
    
    public Class1132(@NotNull @NotNull final String s) {
        Intrinsics.checkParameterIsNotNull((Object)s, "text");
        this(Class417.Field9731.Method2043(s));
    }
    
    public Class1132(@NotNull @NotNull final Class378 class378) {
        Intrinsics.checkParameterIsNotNull((Object)class378, "file");
        this(class378.Method1840());
    }
    
    public Class1132(@NotNull @NotNull final File file) {
        Intrinsics.checkParameterIsNotNull((Object)file, "file");
        this(new Class378(file, null, 2, null));
    }
    
    private static String Method4627(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x69C5 ^ 0xBE));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
