/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.lang.invoke.LambdaMetafactory;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.BooleanSupplier;
import lavahack.client.Class1781;

public class Class352
implements Runnable {
    private final Queue Field9455 = new LinkedList();
    private BooleanSupplier Field9456 = (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk(), ()Z)();
    private int Field9457;

    public void Method1766(Runnable runnable) {
        this.Field9455.offer(runnable);
    }

    public void Method1767(Class1781 class1781, Object ... objectArray) {
        this.Field9455.offer(() -> Class352.Method1778(class1781, objectArray));
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
        if (this.Field9455.isEmpty()) return false;
        return true;
    }

    public int Method1774() {
        return this.Field9455.size();
    }

    public void Method1775(BooleanSupplier booleanSupplier) {
        this.Field9456 = booleanSupplier;
    }

    public Runnable[] Method1776() {
        return this.Field9455.toArray(new Runnable[0]);
    }

    public void Method1777() {
        this.Field9455.clear();
    }

    private static void Method1778(Class1781 class1781, Object[] objectArray) {
        class1781.Method6745(objectArray);
    }
}

