/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NfIijxWIgkgw5xManZNJ1n0KAF0kbStD {
    public static final Lock Field9188 = new ReentrantLock();
    public static final Lock Field9189 = new ReentrantLock();
    public static final Lock Field9190 = new ReentrantLock();
    private String Field9191 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public static void Method1441(Lock lock, Runnable runnable) {
        lock.lock();
        runnable.run();
        lock.unlock();
    }

    public static Runnable Method1442(Lock lock, Runnable runnable) {
        return () -> NfIijxWIgkgw5xManZNJ1n0KAF0kbStD.Method1443(lock, runnable);
    }

    private static void Method1443(Lock lock, Runnable runnable) {
        NfIijxWIgkgw5xManZNJ1n0KAF0kbStD.Method1441(lock, runnable);
    }
}

