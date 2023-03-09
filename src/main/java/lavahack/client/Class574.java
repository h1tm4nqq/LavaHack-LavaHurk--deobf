/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.Objects;

public class Class574 {
    private final Object Field10444;
    private final Object Field10445;
    private int Field10446;

    public Class574(Object object, Object object2) {
        this.Field10444 = object;
        this.Field10445 = object2;
    }

    public Object Method2522() {
        return this.Field10444;
    }

    public Object Method2523() {
        return this.Field10445;
    }

    public boolean equals(Object object) {
        if (!(object instanceof Class574)) {
            return false;
        }
        Class574 class574 = (Class574)object;
        if (!Objects.equals(this.Field10444, class574.Field10444)) return false;
        if (!Objects.equals(this.Field10445, class574.Field10445)) return false;
        return true;
    }
}

