/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class cIFKv6KE2AH068EvI5vAZB99CV2xmSKH {
    long Field9845 = 0xFFFFFFFFFFFFFFFFL & 0xFFFFFFFFFFFFFFFFL;
    private int Field9846;

    public boolean Method2091(double d, TimeUnit timeUnit) {
        int n;
        if ((double)timeUnit.convert(Duration.ofMillis(System.currentTimeMillis() - this.Field9845).toMillis(), timeUnit) >= d) {
            n = (int)1744446394L ^ 0x67FA23BB;
            return n != 0;
        }
        n = (int)((long)271665995 ^ (long)271665995);
        return n != 0;
    }

    public boolean Method2092(long l) {
        int n;
        if (System.currentTimeMillis() - this.Field9845 >= l) {
            n = (int)((long)-1030065945 ^ (long)-1030065946);
            return n != 0;
        }
        n = (int)1553260500L ^ 0x5C94DFD4;
        return n != 0;
    }

    public void Method2093() {
        this.Field9845 = System.currentTimeMillis();
    }
}

