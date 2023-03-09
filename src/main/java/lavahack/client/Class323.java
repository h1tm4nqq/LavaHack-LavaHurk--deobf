/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class1522;

public interface Class323 {
    public void Method1633(Class var1);

    public void Method1634(Object var1);

    public void Method1635(Class var1);

    public void Method1636(Object var1);

    public void Method1637(Object var1);

    default public void Method1638(Object object, Predicate ... predicateArray) {
        Predicate[] predicateArray2 = predicateArray;
        int n = predicateArray2.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.Method1637(object);
                return;
            }
            Predicate predicate = predicateArray2[n2];
            if (!predicate.test(object)) {
                return;
            }
            ++n2;
        }
    }

    public static Class323 Method1639() {
        return new Class1522();
    }
}

