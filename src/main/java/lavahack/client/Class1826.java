/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Function;
import lavahack.client.Class42;
import lavahack.client.Class44;

public class Class1826 {
    private final Class44 Field16431;
    private final Function Field16432;
    private final Class42 Field16433;
    private int Field16434;

    public Class1826(Class44 class44, Function function) {
        this.Field16431 = class44;
        this.Field16432 = function;
        this.Field16433 = class44.Field8085;
    }

    public Class1826 Method6876(Object object, Class44 ... class44Array) {
        Class44[] class44Array2 = class44Array;
        int n = class44Array2.length;
        int n2 = 0;
        while (n2 < n) {
            Class44 class44 = class44Array2[n2];
            this.Field16433.Method23(class44.Method313(() -> this.Method6880(object)));
            ++n2;
        }
        return this;
    }

    public Class44 Method6877() {
        return this.Field16431;
    }

    public Function Method6878() {
        return this.Field16432;
    }

    public Class42 Method6879() {
        return this.Field16433;
    }

    private Boolean Method6880(Object object) {
        return this.Field16432.apply(this.Field16431).equals(object);
    }
}

