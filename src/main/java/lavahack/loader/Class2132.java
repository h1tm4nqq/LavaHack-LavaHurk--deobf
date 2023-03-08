//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.loader;

import java.util.concurrent.atomic.*;
import java.util.concurrent.*;

public class Class2132 implements ThreadFactory
{
    private final ThreadFactory Field17693;
    private final AtomicInteger Field17694;
    private final String Field17695;
    private String Field17696 = "TheKisDevs & LavaHack Development owns you";
    
    public Class2132(final String field17695) {
        this.Field17693 = Executors.defaultThreadFactory();
        this.Field17694 = new AtomicInteger(1);
        this.Field17695 = field17695;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = this.Field17693.newThread(runnable);
        thread.setName(this.Field17695 + "-" + this.Field17694);
        return thread;
    }
    
    private static String Method7670(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4DD1 ^ 0x1C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
