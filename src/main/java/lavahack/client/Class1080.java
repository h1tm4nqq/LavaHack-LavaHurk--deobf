//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 3)
public final class Class1080
{
    private String Field12819 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public static ThreadFactory Method4357(final Class651 class651) {
        return new Class358().Method1797(true).Method1798("LavaHack-Thread-%d").Method1799();
    }
    
    @NotNull
    @NotNull
    public static ExecutorService Method4358(final Class651 class651) {
        final ExecutorService cachedThreadPool = Executors.newCachedThreadPool(class651.Method2358());
        Intrinsics.checkExpressionValueIsNotNull((Object)cachedThreadPool, "Executors.newCachedThreadPool(factory)");
        return cachedThreadPool;
    }
    
    private static String Method4359(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5EF5 ^ 0xED));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
