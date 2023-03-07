/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BooleanSupplier;
import lavahack.client.gU27eEqU0J0xUzf3rNOCaPKV53II3mQs;

public class OjCSDzp5kn5BpbvwACM2vDjnF6zsYTmA
implements Runnable {
    private final Queue Field9455 = new LinkedList();
    private BooleanSupplier Field9456 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk(), ()Z)();
    private int Field9457;

    public void Method1766(Runnable runnable) {
        this.Field9455.offer(runnable);
    }

    public void Method1767(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2, Object ... objectArray) {
        this.Field9455.offer(() -> OjCSDzp5kn5BpbvwACM2vDjnF6zsYTmA.Method1778(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2, objectArray));
    }

    public void Method1768() {
        this.Field9455.poll();
        Runnable runnable = (Runnable)this.Field9455.peek();
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public void Method1769() {
        Runnable runnable = (Runnable)this.Field9455.peek();
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public void Method1770() {
        if (!this.Field9456.getAsBoolean()) {
            return;
        }
        this.Method1768();
    }

    @Override
    public void run() {
        if (this.Field9456.getAsBoolean()) {
            this.Method1768();
            return;
        }
        this.Method1769();
    }

    public void Method1771() {
        while (this.Method1773()) {
            this.Method1768();
        }
    }

    public void Method1772() {
        if (!this.Field9456.getAsBoolean()) {
            return;
        }
        this.Method1771();
    }

    public boolean Method1773() {
        int n;
        if (!this.Field9455.isEmpty()) {
            n = (int)((long)-1145292181 ^ (long)-1145292182);
            return n != 0;
        }
        n = (int)((long)-1997410325 ^ (long)-1997410325);
        return n != 0;
    }

    public int Method1774() {
        return this.Field9455.size();
    }

    public void Method1775(BooleanSupplier booleanSupplier) {
        this.Field9456 = booleanSupplier;
    }

    public Runnable[] Method1776() {
        return this.Field9455.toArray(new Runnable[(int)((long)1268185802 ^ (long)1268185802)]);
    }

    public void Method1777() {
        this.Field9455.clear();
    }

    private static void Method1778(gU27eEqU0J0xUzf3rNOCaPKV53II3mQs gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2, Object[] objectArray) {
        gU27eEqU0J0xUzf3rNOCaPKV53II3mQs2.Method6745(objectArray);
    }
}

