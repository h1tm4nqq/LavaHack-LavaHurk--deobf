/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.function.Supplier;
import kotlin.Metadata;
import lavahack.client.Class941;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n\u00a2\u0006\u0002\b\u0003"}, d2={"<anonymous>", "", "T", "get"})
final class Class728
implements Supplier {
    final Class941 Field11093;
    private int Field11094;

    public Object get() {
        return this.Method3046();
    }

    @NotNull
    @NotNull
    public final String Method3046() {
        return this.Field11093.Method359();
    }

    Class728(Class941 class941) {
        this.Field11093 = class941;
    }
}

