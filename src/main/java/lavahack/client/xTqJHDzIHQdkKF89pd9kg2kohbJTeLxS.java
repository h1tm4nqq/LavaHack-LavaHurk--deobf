/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.platform.PlatformTask
 */
package lavahack.client;

import com.viaversion.viaversion.api.platform.PlatformTask;
import java.util.concurrent.Future;

public class xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS
implements PlatformTask {
    private final Future Field13337;
    private int Field13338;

    public xTqJHDzIHQdkKF89pd9kg2kohbJTeLxS(Future future) {
        this.Field13337 = future;
    }

    public Future leqS0IyKEB621E1SrHdAcHHAUjScjmKi() {
        return this.Field13337;
    }

    public void cancel() {
        this.Field13337.cancel(((int)916590728L ^ 0x36A21088) != 0);
    }

    public Object getObject() {
        return this.leqS0IyKEB621E1SrHdAcHHAUjScjmKi();
    }
}

