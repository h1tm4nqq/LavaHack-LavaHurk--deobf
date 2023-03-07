/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.network.NetworkPlayerInfo
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.event.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2={"Lcom/kisman/cc/event/events/EventCape;", "Lcom/kisman/cc/event/Event;", "info", "Lnet/minecraft/client/network/NetworkPlayerInfo;", "(Lnet/minecraft/client/network/NetworkPlayerInfo;)V", "getInfo", "()Lnet/minecraft/client/network/NetworkPlayerInfo;", "resLoc", "Lnet/minecraft/util/ResourceLocation;", "getResLoc", "()Lnet/minecraft/util/ResourceLocation;", "setResLoc", "(Lnet/minecraft/util/ResourceLocation;)V", "kisman.cc"})
public final class x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk
extends Event {
    @Nullable
    private ResourceLocation Field15063;
    @NotNull
    private final NetworkPlayerInfo Field15064;
    private int Field15065;

    @Nullable
    @Nullable
    public final ResourceLocation Method6028() {
        return this.Field15063;
    }

    public final void Method6029(@Nullable @Nullable ResourceLocation resourceLocation) {
        this.Field15063 = resourceLocation;
    }

    @NotNull
    @NotNull
    public final NetworkPlayerInfo Method6030() {
        return this.Field15064;
    }

    public x8YwusC03s8tIPGjmLIR6QkgJnUSQfhk(@NotNull @NotNull NetworkPlayerInfo networkPlayerInfo) {
        Intrinsics.checkParameterIsNotNull((Object)networkPlayerInfo, (String)"info");
        super(new Object[(int)1331700887L ^ 0x4F602497]);
        this.Field15064 = networkPlayerInfo;
    }

    private static String Method170(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)108617901 ^ (long)108617901);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-237926000 ^ (long)-237926033);
            int n2 = (int)559843310L ^ 0x215E8799;
            cArray2[n] = (char)(cArray[n] ^ (((int)-65987699L ^ 0xFC111FEC) << 2 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

