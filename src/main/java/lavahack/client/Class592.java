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
import lavahack.client.Class1482;
import lavahack.client.Class1887;
import lavahack.client.Class42;
import lavahack.client.Class97;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Class1887
@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/kisman/cc/features/module/render/Shaders;", "Lcom/kisman/cc/features/module/Module;", "()V", "renderer", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "onRenderHand", "", "event", "Lnet/minecraftforge/client/event/RenderHandEvent;", "onRenderWorld", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class Class592
extends Class42 {
    private final Class1482 Field10525 = new Class1482(this).Method5925();
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

    public Class592() {
        super("Shaders", "Uhhhh", Class97.Field8342);
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 247;
            cArray2[n] = (char)(cArray[n] ^ (0x6CDD ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

