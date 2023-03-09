/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

public class Class298 {
    private String Field9296 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method1558(Runnable runnable, long l) {
        int n = 0;
        while ((long)n < l) {
            Class298.Method1560(runnable);
            ++n;
        }
    }

    public static Thread Method1559(Runnable runnable, long l) {
        Thread thread = new Thread(() -> Class298.Method1563(l, runnable));
        thread.start();
        return thread;
    }

    public static Thread Method1560(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
        return thread;
    }

    public static void Method1561(long l) throws InterruptedException {
        Class298.Method1562(l * 1000000L);
    }

    public static void Method1562(long l) throws InterruptedException {
        long l2 = System.nanoTime() + l;
        long l3 = l;
        do {
            if (l3 > 2000000L) {
                Thread.sleep(0L);
            }
            l3 = l2 - System.nanoTime();
            if (!Thread.interrupted()) continue;
            throw new InterruptedException();
        } while (l3 > 0L);
    }

    private static void Method1563(long l, Runnable runnable) {
        int n = 0;
        while ((long)n < l) {
            runnable.run();
            ++n;
        }
    }
}

