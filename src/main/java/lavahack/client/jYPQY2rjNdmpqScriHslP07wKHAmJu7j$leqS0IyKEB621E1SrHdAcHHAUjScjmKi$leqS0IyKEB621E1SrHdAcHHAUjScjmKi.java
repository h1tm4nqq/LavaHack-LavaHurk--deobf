/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.function.Consumer;
import lavahack.client.jYPQY2rjNdmpqScriHslP07wKHAmJu7j$1;
import lavahack.client.jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;

class jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
implements Iterator {
    private final int Field12681;
    private int Field12682;
    final jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field12683;
    private int Field12684;

    private jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        this.Field12683 = jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        this.Field12681 = jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1907(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        this.Field12682 = (int)((long)-524856825 ^ (long)-524856825);
    }

    private void Method4315() {
        if (this.Field12681 == jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1907(this.Field12683)) return;
        throw new ConcurrentModificationException();
    }

    @Override
    public boolean hasNext() {
        boolean bl;
        this.Method4315();
        if (this.Field12682 < jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1908(this.Field12683) - ((int)-1835348387L ^ 0x929ACE5C)) {
            bl = (int)-2089402762L ^ 0x83763E77;
            return bl;
        }
        bl = (int)1759296072L ^ 0x68DCBA48;
        return bl;
    }

    public Object next() {
        this.Method4315();
        int n = this.Field12682;
        this.Field12682 = n + ((int)584136238L ^ 0x22D1362F);
        return jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1909(this.Field12683)[n];
    }

    public void forEachRemaining(Consumer consumer) {
        this.Method4315();
        if (consumer == null) {
            throw new NullPointerException();
        }
        while (this.Field12682 < jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1908(this.Field12683) - ((int)961416617L ^ 0x394E0DA8)) {
            int n = this.Field12682;
            this.Field12682 = n + (int)((long)812275239 ^ (long)812275238);
            consumer.accept(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method1909(this.Field12683)[n]);
        }
    }

    jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, jYPQY2rjNdmpqScriHslP07wKHAmJu7j$1 jYPQY2rjNdmpqScriHslP07wKHAmJu7j$1) {
        this(jYPQY2rjNdmpqScriHslP07wKHAmJu7j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
    }
}

