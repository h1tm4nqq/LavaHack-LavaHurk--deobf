/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.PlatformTask
 */
package lavahack.client;

import com.viaversion.viaversion.api.platform.PlatformTask;
import java.util.concurrent.Future;

public class Class1179
implements PlatformTask {
    private final Future Field13337;
    private int Field13338;

    public Class1179(Future future) {
        this.Field13337 = future;
    }

    public Future leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return this.Field13337;
    }

    public void cancel() {
        this.Field13337.cancel(false);
    }

    public Object getObject() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
}

