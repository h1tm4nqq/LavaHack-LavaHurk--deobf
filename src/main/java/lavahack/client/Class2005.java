/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lavahack.client.Class1051;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/util/enums/HandRewriteSlotMappings$Companion;", "", "()V", "defaultSlot", "Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "getDefaultSlot", "()Lcom/kisman/cc/util/enums/HandRewriteSlotMappings;", "get", "slot", "", "kisman.cc"})
public final class Class2005 {
    private int Field17196;

    @NotNull
    @NotNull
    public final Class1051 Method7453() {
        return Class1051.Method4291();
    }

    @NotNull
    @NotNull
    public final Class1051 Method7454(int n) {
        Class1051[] class1051Array = Class1051.values();
        int n2 = class1051Array.length;
        int n3 = 0;
        while (n3 < n2) {
            Class1051 class1051 = class1051Array[n3];
            if (class1051.Method4289() == n) {
                return class1051;
            }
            ++n3;
        }
        return this.Method7453();
    }

    private Class2005() {
    }

    public Class2005(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

