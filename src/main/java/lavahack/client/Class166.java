/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  net.minecraftforge.fml.common.gameevent.TickEvent$ClientTickEvent
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1320;
import lavahack.client.Class1796;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\rH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2={"Lcom/kisman/cc/features/subsystem/SubSystem;", "Lme/zero/alpine/listener/Listenable;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "init", "", "renderWorld", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "update", "Lnet/minecraftforge/fml/common/gameevent/TickEvent$ClientTickEvent;", "kisman.cc"})
public abstract class Class166
implements Class1320 {
    @NotNull
    private final String Field8697;
    private String Field8698 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method1060() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        Class1796.Field16242.Method705(this);
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1061(@NotNull @NotNull TickEvent.ClientTickEvent clientTickEvent) {
        Intrinsics.checkParameterIsNotNull((Object)clientTickEvent, (String)"event");
    }

    @SubscribeEvent
    @SubscribeEvent
    public void Method1062(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
    }

    @NotNull
    @NotNull
    public final String Method1063() {
        return this.Field8697;
    }

    public Class166(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"name");
        this.Field8697 = string;
    }

    private static String Method1064(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 203;
            cArray2[n] = (char)(cArray[n] ^ (0x6CC7 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

