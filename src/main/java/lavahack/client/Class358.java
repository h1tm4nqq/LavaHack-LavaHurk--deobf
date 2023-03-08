//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e?\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e?\u0006\u0002\n\u0000?\u0006\f" }, d2 = { "Lcom/kisman/cc/util/thread/kisman/ThreadFactoryBuilder;", "", "()V", "daemon", "", "Ljava/lang/Boolean;", "nameFormat", "", "build", "Ljava/util/concurrent/ThreadFactory;", "setDaemon", "setNameFormat", "kisman.cc" })
public final class Class358
{
    private Boolean Field9502;
    private String Field9503;
    private String Field9504 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class358 Method1797(final boolean b) {
        this.Field9502 = b;
        return this;
    }
    
    @NotNull
    @NotNull
    public final Class358 Method1798(@NotNull @NotNull final String field9503) {
        Intrinsics.checkParameterIsNotNull((Object)field9503, "nameFormat");
        this.Field9503 = field9503;
        return this;
    }
    
    @NotNull
    @NotNull
    public final ThreadFactory Method1799() {
        return (ThreadFactory)new Class1767(this);
    }
    
    public static final Boolean Method1800(final Class358 class358) {
        return class358.Field9502;
    }
    
    public static final void Method1801(final Class358 class358, final Boolean field9502) {
        class358.Field9502 = field9502;
    }
    
    public static final String Method1802(final Class358 class358) {
        return class358.Field9503;
    }
    
    public static final void Method1803(final Class358 class358, final String field9503) {
        class358.Field9503 = field9503;
    }
    
    private static String Method1804(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x66EB ^ 0x67));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
