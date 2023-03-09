/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Class442 {
    long Field9845 = -1L;
    private int Field9846;

    public boolean Method2091(double d, TimeUnit timeUnit) {
        if (!((double)timeUnit.convert(Duration.ofMillis(System.currentTimeMillis() - this.Field9845).toMillis(), timeUnit) >= d)) return false;
        return true;
    }

    public boolean Method2092(long l) {
        if (System.currentTimeMillis() - this.Field9845 < l) return false;
        return true;
    }

    public void Method2093() {
        this.Field9845 = System.currentTimeMillis();
    }
}

