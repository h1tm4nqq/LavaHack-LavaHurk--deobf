/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.common.base.Predicate;
import java.util.Map;

final class rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$1
implements Predicate {
    final Map.Entry Field15603;
    private int Field15604;

    rRiKG9kDyEj7ZfaDzMo7aDZJm7qHnKD1$1(Map.Entry entry) {
        this.Field15603 = entry;
    }

    public boolean Method6356(Comparable comparable) {
        int n;
        if (comparable != null && comparable.equals(this.Field15603.getValue())) {
            n = (int)590420583L ^ 0x23311A66;
            return n != 0;
        }
        n = (int)((long)75140063 ^ (long)75140063);
        return n != 0;
    }

    public boolean Method6357(Object object) {
        return this.Method6356((Comparable)object);
    }
}

