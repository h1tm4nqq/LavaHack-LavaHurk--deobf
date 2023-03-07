/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.ResourceLocation
 */
package lavahack.client;

import com.kisman.cc.util.IBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2={"Lcom/kisman/cc/util/enums/CapeEnum$Gif;", "Lcom/kisman/cc/util/enums/CapeEnum;", "count", "", "getCount", "()I", "setCount", "(I)V", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "setTimer", "(Lcom/kisman/cc/util/TimerUtils;)V", "location", "Lnet/minecraft/util/ResourceLocation;", "kisman.cc"})
final class GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi
extends GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw {
    @NotNull
    private IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Field15550 = new IBONRcQCNUBg2NBpVpVQf61ykmVfU03E();
    private int Field15551;
    private int Field15552;

    @NotNull
    @NotNull
    public final IBONRcQCNUBg2NBpVpVQf61ykmVfU03E Method6282() {
        return this.Field15550;
    }

    public final void Method6283(@NotNull @NotNull IBONRcQCNUBg2NBpVpVQf61ykmVfU03E iBONRcQCNUBg2NBpVpVQf61ykmVfU03E) {
        Intrinsics.checkParameterIsNotNull((Object)iBONRcQCNUBg2NBpVpVQf61ykmVfU03E, (String)"<set-?>");
        this.Field15550 = iBONRcQCNUBg2NBpVpVQf61ykmVfU03E;
    }

    public final int Method6284() {
        return this.Field15551;
    }

    public final void Method6285(int n) {
        this.Field15551 = n;
    }

    @Override
    @NotNull
    @NotNull
    public ResourceLocation Method6069() {
        if (this.Field15551 > ((int)-1560126273L ^ 0xA3025CAE) << 1) {
            this.Field15551 = (int)((long)1493965322 ^ (long)1493965322);
        }
        ResourceLocation resourceLocation = new ResourceLocation("kismancc:cape/rainbow/cape-" + this.Field15551 + ".png");
        if (!this.Field15550.Method2797(0xD63A0D7L & 0x41855L)) return resourceLocation;
        int n = this.Field15551;
        this.Field15551 = n + (int)((long)1737399902 ^ (long)1737399903);
        this.Field15550.Method2801();
        return resourceLocation;
    }

    GQCHtwrp6JeYnKqhNV7KuQ1v85QZoqcw$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(String string, int n) {
    }

    private static String Method6071(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)1418238940 ^ (long)1418238940);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)990198711 ^ (long)990198600);
            int n2 = (int)-1904539798L ^ 0x8E7B0781;
            cArray2[n] = (char)(cArray[n] ^ ((int)-229350716L ^ 0xF2544B0F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

