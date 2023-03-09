/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.jodah.typetools.TypeResolver
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.Class254;
import net.jodah.typetools.TypeResolver;

public class Class618
implements Class254 {
    private final Class Field10639;
    private final Class254 Field10640;
    private final Predicate[] Field10641;
    private final int Field10642;
    private String Field10643 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SafeVarargs
    @SafeVarargs
    public Class618(Class254 class254, Predicate ... predicateArray) {
        this(class254, 0, predicateArray);
    }

    @SafeVarargs
    @SafeVarargs
    public Class618(Class254 class254, int n, Predicate ... predicateArray) {
        this.Field10640 = class254;
        this.Field10642 = n;
        this.Field10639 = TypeResolver.resolveRawArgument(Class254.class, class254.getClass());
        this.Field10641 = predicateArray;
    }

    public Class Method2651() {
        return this.Field10639;
    }

    public int Method2652() {
        return this.Field10642;
    }

    @Override
    public void Method979(Object object) {
        if (this.Field10641.length > 0) {
            for (Predicate predicate : this.Field10641) {
                if (predicate.test(object)) continue;
                return;
            }
        }
        this.Field10640.Method979(object);
    }
}

