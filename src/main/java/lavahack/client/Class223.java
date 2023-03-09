/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraftforge.client.event.RenderWorldLastEvent
 */
package lavahack.client;

import java.util.HashMap;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class166;
import lavahack.client.Class1801;
import lavahack.client.Class254;
import lavahack.client.Class618;
import lavahack.client.Class862;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/subsystem/subsystems/HoleProcessor;", "Lcom/kisman/cc/features/subsystem/SubSystem;", "()V", "holes", "Ljava/util/HashMap;", "Lnet/minecraft/util/math/BlockPos;", "Lcom/kisman/cc/util/world/HoleUtil$HoleInfo;", "Lkotlin/collections/HashMap;", "getHoles", "()Ljava/util/HashMap;", "renderBlock", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventRenderBlock;", "renderWorld", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class Class223
extends Class166 {
    @NotNull
    private static final HashMap Field8962;
    @Class1801
    private static final Class618 Field8963;
    public static final Class223 Field8964;
    private int Field8965;

    @NotNull
    @NotNull
    public final HashMap Method1273() {
        return Field8962;
    }

    @Override
    public void Method1062(@NotNull @NotNull RenderWorldLastEvent renderWorldLastEvent) {
        Intrinsics.checkParameterIsNotNull((Object)renderWorldLastEvent, (String)"event");
        Field8962.clear();
    }

    private Class223() {
        super("Hole Processor");
    }

    static {
        Class223 class223;
        Field8964 = class223 = new Class223();
        Field8962 = new HashMap();
        Field8963 = new Class618((Class254)Class862.Field11637, new Predicate[0]);
    }

    private static String Method1064(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 145;
            cArray2[n] = (char)(cArray[n] ^ (0x6DB6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

