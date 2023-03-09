/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import com.google.common.base.Predicate;
import java.util.Map;

final class Class1625
implements Predicate {
    final Map.Entry Field15603;
    private int Field15604;

    Class1625(Map.Entry entry) {
        this.Field15603 = entry;
    }

    public boolean Method6356(Comparable comparable) {
        if (comparable == null) return false;
        if (!comparable.equals(this.Field15603.getValue())) return false;
        return true;
    }

    public boolean Method6357(Object object) {
        return this.Method6356((Comparable)object);
    }
}

