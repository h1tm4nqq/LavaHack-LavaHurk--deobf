/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.function.Consumer;
import lavahack.client.Class1452;
import lavahack.client.Class390;

class Class1061
implements Iterator {
    private final int Field12681;
    private int Field12682;
    final Class390 Field12683;
    private int Field12684;

    private Class1061(Class390 class390) {
        this.Field12683 = class390;
        this.Field12681 = Class390.Method1907(class390);
        this.Field12682 = 0;
    }

    private void Method4315() {
        if (this.Field12681 == Class390.Method1907(this.Field12683)) return;
        throw new ConcurrentModificationException();
    }

    @Override
    public boolean hasNext() {
        this.Method4315();
        if (this.Field12682 >= Class390.Method1908(this.Field12683) - 1) return false;
        return true;
    }

    public Object next() {
        this.Method4315();
        return Class390.Method1909(this.Field12683)[this.Field12682++];
    }

    public void forEachRemaining(Consumer consumer) {
        this.Method4315();
        if (consumer == null) {
            throw new NullPointerException();
        }
        while (this.Field12682 < Class390.Method1908(this.Field12683) - 1) {
            consumer.accept(Class390.Method1909(this.Field12683)[this.Field12682++]);
        }
    }

    Class1061(Class390 class390, Class1452 class1452) {
        this(class390);
    }
}

