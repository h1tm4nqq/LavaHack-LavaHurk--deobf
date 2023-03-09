/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Objects;

public class Class745 {
    private Object Field11163;
    private Object Field11164;
    private String Field11165 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public Class745(Object object, Object object2) {
        this.Field11163 = object;
        this.Field11164 = object2;
    }

    public Object Method3083() {
        return this.Field11163;
    }

    public void Method3084(Object object) {
        this.Field11163 = object;
    }

    public Object Method3085() {
        return this.Field11164;
    }

    public void Method3086(Object object) {
        this.Field11164 = object;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class745)) {
            return false;
        }
        Class745 class745 = (Class745)object;
        if (!Objects.equals(this.Field11163, class745.Field11163)) return false;
        if (!Objects.equals(this.Field11164, class745.Field11164)) return false;
        return true;
    }
}

