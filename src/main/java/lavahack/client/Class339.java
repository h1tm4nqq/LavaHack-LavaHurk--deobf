/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package lavahack.client;

import com.kisman.cc.event.Class2157;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/event/events/EventArmSwingAnimationEnd;", "Lcom/kisman/cc/event/Event;", "armSwingAnimationEnd", "", "(I)V", "getArmSwingAnimationEnd", "()I", "setArmSwingAnimationEnd", "kisman.cc"})
public final class Class339
extends Class2157 {
    private int Field9396;
    private int Field9397;

    public final int Method1670() {
        return this.Field9396;
    }

    public final void Method1671(int n) {
        this.Field9396 = n;
    }

    public Class339(int n) {
        super(new Object[0]);
        this.Field9396 = n;
    }

    public Class339(int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 1) != 0) {
            n = 0;
        }
        this(n);
    }

    public Class339() {
        this(0, 1, null);
    }
}

