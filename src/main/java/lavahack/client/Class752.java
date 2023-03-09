/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.fml.common.ProgressManager$ProgressBar
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class254;
import lavahack.client.Class279;
import lavahack.client.Class884;
import net.minecraftforge.fml.common.ProgressManager;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=3, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\b\u0005"}, d2={"<anonymous>", "", "it", "Lcom/kisman/cc/event/events/client/loadingscreen/progressbar/EventProgressBar;", "kotlin.jvm.PlatformType", "invoke"})
final class Class752
implements Class254 {
    final Class884 Field11201;
    private String Field11202 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method979(Object object) {
        this.Method3136((Class279)object);
    }

    public final void Method3136(Class279 class279) {
        if (Class884.Method3688(this.Field11201) == null) return;
        ProgressManager.ProgressBar progressBar = Class884.Method3688(this.Field11201);
        if (progressBar == null) {
            Intrinsics.throwNpe();
        }
        progressBar.step(class279.Field9217);
    }

    Class752(Class884 class884) {
        this.Field11201 = class884;
    }
}

