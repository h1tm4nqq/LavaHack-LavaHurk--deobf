/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/render/blockesp/BlockImplementation;", "Lcom/kisman/cc/util/interfaces/IBlockImplementation;", "block", "Lcom/kisman/cc/util/enums/BlockESPBlocks;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/BlockESPBlocks;Lcom/kisman/cc/features/module/Module;)V", "getBlock", "()Lcom/kisman/cc/util/enums/BlockESPBlocks;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "process", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "kisman.cc"})
public final class tc7iwrZRQCCStOIislXaDGOLupHflkQv
implements D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12057;
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field12058;
    @NotNull
    private final rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89 Field12059;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field12060;
    private String Field12061 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method3473(@NotNull @NotNull BlockPos blockPos) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (this.Field12058.Method3790() && this.Field12059.Method5813().Method5352(blockPos)) {
            n = (int)((long)1807186508 ^ (long)1807186509);
            return n != 0;
        }
        n = (int)((long)1417108743 ^ (long)1417108743);
        return n != 0;
    }

    @Override
    public void Method3474(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Method3473(blockPos)) return;
        this.Field12058.Method3805(blockPos);
    }

    @NotNull
    @NotNull
    public final rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89 Method3919() {
        return this.Field12059;
    }

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method3920() {
        return this.Field12060;
    }

    public tc7iwrZRQCCStOIislXaDGOLupHflkQv(@NotNull @NotNull rxldtdwW9xUI3MOzQtLJzEiPFfPcvb89 rxldtdwW9xUI3MOzQtLJzEiPFfPcvb892, @NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)rxldtdwW9xUI3MOzQtLJzEiPFfPcvb892), (String)"block");
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field12059 = rxldtdwW9xUI3MOzQtLJzEiPFfPcvb892;
        this.Field12060 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field12057 = this.Field12060.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(this.Field12059.toString(), this.Field12060)));
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = (MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this.Field12060).Method773(this.Field12059.name());
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Field12057;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        this.Field12058 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2)).Method3788().Method3789();
    }

    private static String Method3921(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)0x988899E ^ (long)0x988899E);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)2088334078 ^ (long)2088333825);
            int n2 = (int)((long)-1257470104 ^ (long)-1257470155);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-1199399095 ^ (long)-1199397836) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

