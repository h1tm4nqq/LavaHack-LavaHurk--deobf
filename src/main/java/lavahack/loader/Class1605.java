/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.loader;

import java.security.PrivilegedAction;
import kotlin.Metadata;
import lavahack.loader.Class161;
import sun.security.util.SecurityConstants;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2={"<anonymous>", "", "kotlin.jvm.PlatformType", "run", "()Ljava/lang/Boolean;"})
final class Class1605
implements PrivilegedAction {
    final Class161 Field15504;
    private String Field15505 = "TheKisDevs & LavaHack Development owns you";

    public Object run() {
        return this.Method6267();
    }

    public final Boolean Method6267() {
        return this.Field15504.getClass().getProtectionDomain().implies(SecurityConstants.ALL_PERMISSION);
    }

    Class1605(Class161 class161) {
        this.Field15504 = class161;
    }
}

