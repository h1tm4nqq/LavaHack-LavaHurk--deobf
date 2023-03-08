//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import java.util.concurrent.locks.*;

public class Class267
{
    public static final Lock Field9188;
    public static final Lock Field9189;
    public static final Lock Field9190;
    private String Field9191 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method1441(final Lock lock, final Runnable runnable) {
        lock.lock();
        runnable.run();
        lock.unlock();
    }
    
    public static Runnable Method1442(final Lock lock, final Runnable runnable) {
        return Class267::Method1443;
    }
    
    private static void Method1443(final Lock lock, final Runnable runnable) {
        Method1441(lock, runnable);
    }
    
    static {
        Field9188 = new ReentrantLock();
        Field9189 = new ReentrantLock();
        Field9190 = new ReentrantLock();
    }
}
