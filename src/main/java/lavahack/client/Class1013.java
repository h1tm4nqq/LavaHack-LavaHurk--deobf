/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package lavahack.client;

import java.util.ArrayList;
import kotlin.Metadata;
import lavahack.client.Class504;
import lavahack.client.Class615;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lcom/kisman/cc/features/nocom/NoComModuleManager;", "", "()V", "modules", "Ljava/util/ArrayList;", "Lcom/kisman/cc/features/module/Module;", "Lkotlin/collections/ArrayList;", "getModules", "()Ljava/util/ArrayList;", "kisman.cc"})
public final class Class1013 {
    @NotNull
    private final ArrayList Field12401 = new ArrayList();
    private int Field12402;

    @NotNull
    @NotNull
    public final ArrayList Method4122() {
        return this.Field12401;
    }

    public Class1013() {
        this.Field12401.add(new Class615());
        this.Field12401.add(new Class504());
    }
}

