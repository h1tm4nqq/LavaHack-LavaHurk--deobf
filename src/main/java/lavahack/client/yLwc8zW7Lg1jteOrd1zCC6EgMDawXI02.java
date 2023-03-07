/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderHandEvent
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@YntYRq4dlAtRq1bxuEHDIM9kFWFb4jHz
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/render/Shaders;", "Lcom/kisman/cc/features/module/Module;", "()V", "renderer", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "onRenderHand", "", "event", "Lnet/minecraftforge/client/event/RenderHandEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class yLwc8zW7Lg1jteOrd1zCC6EgMDawXI02
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh Field10525 = new GtblxmdXrOz1ETXFTxPJkkfSolzpOFYh(this).Method5925();
    private int Field10526;

    @SubscribeEvent
    @SubscribeEvent
    public final void Method2570(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method2571(@NotNull @NotNull RenderHandEvent renderHandEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderHandEvent, (String)"event");
        renderHandEvent.setCanceled(this.Field10525.Method5928());
    }

    public yLwc8zW7Lg1jteOrd1zCC6EgMDawXI02() {
        super("Shaders", "Uhhhh", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8342);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-1718609879 ^ (long)-1718609879);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)530733499 ^ (long)530733380);
            int n2 = (int)-384320279L ^ 0xE917BC1E;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)417982144 ^ (long)417958429) ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

