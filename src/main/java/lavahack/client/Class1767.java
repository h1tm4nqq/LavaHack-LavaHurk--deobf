//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.atomic.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3, d1 = { "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n?\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Ljava/lang/Thread;", "it", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread" })
final class Class1767 implements ThreadFactory
{
    final Class358 Field16078;
    private String Field16079 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    @Override
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = Executors.defaultThreadFactory().newThread(runnable);
        Intrinsics.checkExpressionValueIsNotNull((Object)thread, "Executors.defaultThreadFactory().newThread(it)");
        final Thread thread2 = thread;
        if (Class358.Method1800(this.Field16078) != null) {
            final Thread thread3 = thread2;
            final Boolean method1800 = Class358.Method1800(this.Field16078);
            if (method1800 == null) {
                Intrinsics.throwNpe();
            }
            thread3.setDaemon(method1800);
        }
        if (Class358.Method1802(this.Field16078) != null) {
            final Thread thread4 = thread2;
            final StringCompanionObject instance = StringCompanionObject.INSTANCE;
            final Locale root = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull((Object)root, "Locale.ROOT");
            final Locale locale = root;
            final String method1801 = Class358.Method1802(this.Field16078);
            if (method1801 == null) {
                Intrinsics.throwNpe();
            }
            final String s = method1801;
            final Object[] array = { new AtomicLong(0L).getAndIncrement() };
            final Thread thread5 = thread4;
            final Locale l = locale;
            final String format = s;
            final Object[] original = array;
            final String format2 = String.format(l, format, Arrays.copyOf(original, original.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(locale, format, *args)");
            thread5.setName(format2);
        }
        return thread2;
    }
    
    Class1767(final Class358 field16078) {
        this.Field16078 = field16078;
    }
    
    private static String Method6714(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x7C6B ^ 0xC9));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
