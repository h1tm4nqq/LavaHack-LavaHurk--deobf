/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import lavahack.client.Class1061;
import lavahack.client.Class1452;
import org.jetbrains.annotations.NotNull;

class Class390
extends AbstractQueue
implements Queue {
    private Object[] Field9643;
    private int Field9644;
    private int Field9645;
    private String Field9646 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private Class390(Object[] objectArray, int n) {
        this.Field9643 = objectArray;
        this.Field9644 = n;
        this.Field9645 = 0;
    }

    private Class390(Object[] objectArray) {
        this(objectArray, objectArray.length);
    }

    private void Method1906(int n) {
        if (this.Field9644 + n < this.Field9643.length) {
            return;
        }
        int n2 = this.Field9643.length << 1;
        Object[] objectArray = new Object[n2];
        System.arraycopy(this.Field9643, 0, objectArray, 0, this.Field9644);
        this.Field9643 = objectArray;
    }

    @Override
    @NotNull
    @NotNull
    public Iterator iterator() {
        return new Class1061(this, null);
    }

    @Override
    public int size() {
        return this.Field9644;
    }

    public boolean offer(Object object) {
        this.Method1906(1);
        this.Field9643[this.Field9644++] = object;
        ++this.Field9645;
        return true;
    }

    public Object poll() {
        Object object = this.Field9643[--this.Field9644];
        this.Field9643[this.Field9644] = null;
        ++this.Field9645;
        return object;
    }

    public Object peek() {
        return this.Field9643[this.Field9644 - 1];
    }

    Class390(Object[] objectArray, Class1452 class1452) {
        this(objectArray);
    }

    static int Method1907(Class390 class390) {
        return class390.Field9645;
    }

    static int Method1908(Class390 class390) {
        return class390.Field9644;
    }

    static Object[] Method1909(Class390 class390) {
        return class390.Field9643;
    }
}

