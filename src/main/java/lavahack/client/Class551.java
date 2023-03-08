//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.atomic.*;
import java.util.concurrent.*;

public class Class551 implements ThreadFactory
{
    private final ThreadFactory Field10341;
    private final AtomicInteger Field10342;
    private final String Field10343;
    private String Field10344 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public Class551(final String field10343) {
        this.Field10341 = Executors.defaultThreadFactory();
        this.Field10342 = new AtomicInteger(1);
        this.Field10343 = field10343;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = this.Field10341.newThread(runnable);
        thread.setName(this.Field10343 + "-" + this.Field10342);
        return thread;
    }
    
    private static String Method2461(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5AAC ^ 0x75));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
