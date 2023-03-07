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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"Lcom/kisman/cc/features/subsystem/subsystems/HoleProcessor;", "Lcom/kisman/cc/features/subsystem/SubSystem;", "()V", "holes", "Ljava/util/HashMap;", "Lnet/minecraft/util/math/BlockPos;", "Lcom/kisman/cc/util/world/HoleUtil$HoleInfo;", "Lkotlin/collections/HashMap;", "getHoles", "()Ljava/util/HashMap;", "renderBlock", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/EventRenderBlock;", "renderWorld", "", "event", "Lnet/minecraftforge/client/event/RenderWorldLastEvent;", "kisman.cc"})
public final class x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN
extends cSlwoWP3BAZC5Ofp1vdw8CzE2jWFTNgx {
    @NotNull
    private static final HashMap Field8962;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private static final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field8963;
    public static final x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN Field8964;
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

    private x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN() {
        super("Hole Processor");
    }

    static {
        x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN2;
        Field8964 = x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN2 = new x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN();
        Field8962 = new HashMap();
        Field8963 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)x5JRyjT5EQAdZIgzW88ByYDSfJmiCryN$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11637, new Predicate[(int)((long)-304366546 ^ (long)-304366546)]);
    }

    private static String Method1064(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)1338166885L ^ 0x4FC2CE65;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)1351484401L ^ 0x508E030E);
            int n2 = (int)((long)246032707 ^ (long)246032850);
            cArray2[n] = (char)(cArray[n] ^ (((int)738533325L ^ 0x2C052916) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

