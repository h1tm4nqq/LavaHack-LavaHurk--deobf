/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lavahack.client.gU27eEqU0J0xUzf3rNOCaPKV53II3mQs;

@Deprecated
public final class fnKmBQhzMw3M6tDD5ZGAAvY3MYbmAx6E {
    private final Queue Field8699 = new LinkedList();
    private final Queue Field8700 = new LinkedList();
    private ExecutorService Field8701 = new ScheduledThreadPoolExecutor((int)-404575532L ^ 0xE7E2AAD5);
    private String Field8702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public void Method1065(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2) {
        this.Field8699.offer(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2);
    }

    public void Method1066(Object ... objectArray) {
        if (this.Field8699.isEmpty()) {
            return;
        }
        gU27eEqU0J0xUzf3rNOCaPKV53II3mQs gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2 = (gU27eEqU0J0xUzf3rNOCaPKV53II3mQs)this.Field8699.poll();
        this.Field8700.offer(() -> fnKmBQhzMw3M6tDD5ZGAAvY3MYbmAx6E.Method1068(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2, objectArray));
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

    private static void Method1068(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2, Object[] objectArray) {
        gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2.Method6745(objectArray);
    }
}

