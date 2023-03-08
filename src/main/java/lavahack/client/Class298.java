//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

public class Class298
{
    private String Field9296 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public static void Method1558(final Runnable runnable, final long n) {
        for (int n2 = 0; n2 < n; ++n2) {
            Method1560(runnable);
        }
    }
    
    public static Thread Method1559(final Runnable runnable, final long n) {
        final Thread thread = new Thread(Class298::Method1563);
        thread.start();
        return thread;
    }
    
    public static Thread Method1560(final Runnable target) {
        final Thread thread = new Thread(target);
        thread.start();
        return thread;
    }
    
    public static void Method1561(final long n) throws InterruptedException {
        Method1562(n * 1000000L);
    }
    
    public static void Method1562(final long n) throws InterruptedException {
        final long n2 = System.nanoTime() + n;
        long n3 = n;
        do {
            if (n3 > 2000000L) {
                Thread.sleep(0L);
            }
            n3 = n2 - System.nanoTime();
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        } while (n3 > 0L);
    }
    
    private static void Method1563(final long n, final Runnable runnable) {
        for (int n2 = 0; n2 < n; ++n2) {
            runnable.run();
        }
    }
}
