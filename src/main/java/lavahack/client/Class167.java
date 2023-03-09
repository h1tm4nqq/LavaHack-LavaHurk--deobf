/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lavahack.client.Class1781;

@Deprecated
public final class Class167 {
    private final Queue Field8699 = new LinkedList();
    private final Queue Field8700 = new LinkedList();
    private ExecutorService Field8701 = new ScheduledThreadPoolExecutor(1);
    private String Field8702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method1065(Class1781 class1781) {
        this.Field8699.offer(class1781);
    }

    public void Method1066(Object ... objectArray) {
        if (this.Field8699.isEmpty()) {
            return;
        }
        Class1781 class1781 = (Class1781)this.Field8699.poll();
        this.Field8700.offer(() -> Class167.Method1068(class1781, objectArray));
        if (!this.Field8701.isShutdown()) return;
        if (!this.Field8701.isTerminated()) {
            return;
        }
        this.Field8701.submit(this::Method1067);
    }

    private void Method1067() {
        while (!this.Field8700.isEmpty()) {
            ((Runnable)this.Field8700.poll()).run();
        }
    }

    private static void Method1068(Class1781 class1781, Object[] objectArray) {
        class1781.Method6745(objectArray);
    }
}

