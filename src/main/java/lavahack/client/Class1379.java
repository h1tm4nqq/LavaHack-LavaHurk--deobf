/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class42;
import lavahack.client.Class818;
import lavahack.client.Class97;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2={"Lcom/kisman/cc/features/module/render/EntityESPRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "pattern", "Lcom/kisman/cc/settings/util/EntityESPRendererPattern;", "onEnable", "", "onRenderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class Class1379
extends Class42 {
    private final Class818 Field14254 = new Class818(this);
    private String Field14255 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        this.Field14254.Method3477();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method5482(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        this.Field14254.Method3478(renderWorldLastEvent.getPartialTicks());
    }

    public Class1379() {
        super("EntityESPRewrite", Class97.Field8342);
        this.Field14254.Method3475();
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 50;
            cArray2[n] = (char)(cArray[n] ^ (0xE11 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

