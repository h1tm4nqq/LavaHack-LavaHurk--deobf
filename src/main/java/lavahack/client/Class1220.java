/*
 * Decompiled with CFR 0.152.
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class254;
import lavahack.client.Class618;

public class Class1220
extends Class618 {
    private Class Field13536;
    private String Field13537 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SafeVarargs
    @SafeVarargs
    public Class1220(Class clazz, Class254 class254, Predicate ... predicateArray) {
        super(class254, predicateArray);
        this.Field13536 = clazz;
    }

    @SafeVarargs
    @SafeVarargs
    public Class1220(Class clazz, Class254 class254, int n, Predicate ... predicateArray) {
        super(class254, n, predicateArray);
        this.Field13536 = clazz;
    }

    @Override
    public Class Method2651() {
        return this.Field13536;
    }
}

