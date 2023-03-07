/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.jodah.typetools.TypeResolver
 */
package lavahack.client;

import java.util.function.Predicate;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import net.jodah.typetools.TypeResolver;

public class CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt
implements hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt {
    private final Class Field10639;
    private final hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt Field10640;
    private final Predicate[] Field10641;
    private final int Field10642;
    private String Field10643 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @SafeVarargs
    @SafeVarargs
    public CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt2, Predicate ... predicateArray) {
        this(hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt2, (int)1596639443L ^ 0x5F2AC8D3, predicateArray);
    }

    @SafeVarargs
    @SafeVarargs
    public CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt(hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt2, int n, Predicate ... predicateArray) {
        this.Field10640 = hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt2;
        this.Field10642 = n;
        this.Field10639 = TypeResolver.resolveRawArgument(hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt.class, hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt2.getClass());
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
            Predicate[] predicateArray = this.Field10641;
            int n = predicateArray.length;
            for (int i = (int)1989916310L ^ 0x769BB696; i < n; ++i) {
                Predicate predicate = predicateArray[i];
                if (predicate.test(object)) continue;
                return;
            }
        }
        this.Field10640.Method979(object);
    }
}

