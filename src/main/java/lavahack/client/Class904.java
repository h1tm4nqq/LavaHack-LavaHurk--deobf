//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004?\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016?\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\n" }, d2 = { "Lcom/kisman/cc/util/thread/kisman/suppliers/ThreaddedSupplier;", "T", "Lcom/kisman/cc/util/thread/kisman/GlobalThreads;", "get0", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get1", "Lcom/kisman/cc/util/thread/kisman/ThreadSafeValue;", "get", "()Ljava/lang/Object;", "kisman.cc" })
public class Class904 implements Class651
{
    private final Class489 Field11827;
    private final Function0 Field11828;
    private String Field11829 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @Nullable
    @Nullable
    public Object Method3751() {
        this.Method2359().submit((Runnable)new Class1428(this));
        return this.Field11827.Method2269();
    }
    
    public Class904(@NotNull @NotNull final Function0 field11828) {
        Intrinsics.checkParameterIsNotNull((Object)field11828, "get0");
        this.Field11828 = field11828;
        this.Field11827 = new Class489((Object)null);
    }
    
    @NotNull
    @NotNull
    public ThreadFactory Method2358() {
        return Class1080.Method4357((Class651)this);
    }
    
    @NotNull
    @NotNull
    public ExecutorService Method2359() {
        return Class1080.Method4358((Class651)this);
    }
    
    public static final Class489 Method3752(final Class904 class904) {
        return class904.Field11827;
    }
    
    public static final Function0 Method3753(final Class904 class904) {
        return class904.Field11828;
    }
    
    private static String Method3754(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x25FC ^ 0x40));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
