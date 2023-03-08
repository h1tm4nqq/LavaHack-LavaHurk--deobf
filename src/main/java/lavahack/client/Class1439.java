//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0016\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005?\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u00028\u0000?\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\t\u001a\u00028\u0000?\u0006\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005?\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0082\u000e?\u0006\u0004\n\u0002\u0010\n?\u0006\u000f" }, d2 = { "Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "T", "Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "t", "Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "get", "()Lcom/kisman/cc/util/render/shader/uniform/type/Type;", "set", "(Lcom/kisman/cc/util/render/shader/uniform/type/Type;)Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "kisman.cc" })
public class Class1439
{
    private Class438 Field14743;
    @NotNull
    private final String Field14744;
    private String Field14745 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class1439 Method3412(@NotNull @NotNull final Class438 field14743) {
        Intrinsics.checkParameterIsNotNull((Object)field14743, "t");
        this.Field14743 = field14743;
        return this;
    }
    
    @NotNull
    @NotNull
    public final Class438 Method3413() {
        final Class438 field14743 = this.Field14743;
        if (field14743 == null) {
            Intrinsics.throwNpe();
        }
        return field14743;
    }
    
    @NotNull
    @NotNull
    public final String Method3414() {
        return this.Field14744;
    }
    
    public Class1439(@NotNull @NotNull final String field14744) {
        Intrinsics.checkParameterIsNotNull((Object)field14744, "name");
        this.Field14744 = field14744;
    }
    
    private static String Method3415(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0xE6B ^ 0x11));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
