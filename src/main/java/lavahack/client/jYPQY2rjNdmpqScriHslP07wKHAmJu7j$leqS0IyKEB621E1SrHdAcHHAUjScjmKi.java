/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import lavahack.client.jYPQY2rjNdmpqScriHslP07wKHAmJu7j$1;
import lavahack.client.jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import org.jetbrains.annotations.NotNull;

class jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends AbstractQueue
implements Queue {
    private Object[] Field9643;
    private int Field9644;
    private int Field9645;
    private String Field9646 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    private jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Object[] objectArray, int n) {
        this.Field9643 = objectArray;
        this.Field9644 = n;
        this.Field9645 = (int)((long)-214455822 ^ (long)-214455822);
    }

    private jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Object[] objectArray) {
        this(objectArray, objectArray.length);
    }

    private void Method1906(int n) {
        if (this.Field9644 + n < this.Field9643.length) {
            return;
        }
        int n2 = this.Field9643.length << ((int)1475091359L ^ 0x57EC1B9E);
        Object[] objectArray = new Object[n2];
        System.arraycopy(this.Field9643, (int)((long)889766259 ^ (long)889766259), objectArray, (int)((long)-2146334550 ^ (long)-2146334550), this.Field9644);
        this.Field9643 = objectArray;
    }

    @Override
    @NotNull
    @NotNull
    public Iterator iterator() {
        return new jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(this, null);
    }

    @Override
    public int size() {
        return this.Field9644;
    }

    public boolean offer(Object object) {
        this.Method1906((int)((long)-1710318652 ^ (long)-1710318651));
        int n = this.Field9644;
        this.Field9644 = n + ((int)700597349L ^ 0x29C24464);
        this.Field9643[n] = object;
        this.Field9645 += (int)((long)1644324760 ^ (long)1644324761);
        return (int)((long)-1513611070 ^ (long)-1513611069) != 0;
    }

    public Object poll() {
        Object object = this.Field9643[this.Field9644 -= (int)((long)1588970181 ^ (long)1588970180)];
        this.Field9643[this.Field9644] = null;
        this.Field9645 += (int)((long)1029736805 ^ (long)1029736804);
        return object;
    }

    public Object peek() {
        return this.Field9643[this.Field9644 - ((int)-1284914921L ^ 0xB369C116)];
    }

    jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(Object[] objectArray, jYPQY2rjNdmpqScriHslP07wKHAmJu7j$1 jYPQY2rjNdmpqScriHslP07wKHAmJu7j$1) {
        this(objectArray);
    }

    static int Method1907(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9645;
    }

    static int Method1908(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9644;
    }

    static Object[] Method1909(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        return jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field9643;
    }
}

