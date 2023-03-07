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
import lavahack.client.CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I;
import lavahack.client.D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/kisman/cc/features/module/render/xray/BlockImplementation;", "Lcom/kisman/cc/util/interfaces/IBlockImplementation;", "block", "Lcom/kisman/cc/util/enums/XRayBlocks;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/util/enums/XRayBlocks;Lcom/kisman/cc/features/module/Module;)V", "getBlock", "()Lcom/kisman/cc/util/enums/XRayBlocks;", "group", "Lcom/kisman/cc/settings/types/SettingGroup;", "kotlin.jvm.PlatformType", "getModule", "()Lcom/kisman/cc/features/module/Module;", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "process", "", "pos", "Lnet/minecraft/util/math/BlockPos;", "valid", "", "kisman.cc"})
public final class tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4
implements D0pXhJZVaWbHnj5YhJoLNx9ToiussNYC {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field12698;
    private final MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Field12699;
    @NotNull
    private final CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I Field12700;
    @NotNull
    private final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Field12701;
    private String Field12702 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public boolean Method3473(@NotNull @NotNull BlockPos blockPos) {
        int n;
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (this.Field12699.Method3790() && this.Field12700.Method2906().Method6698(blockPos)) {
            n = (int)((long)1863907125 ^ (long)1863907124);
            return n != 0;
        }
        n = (int)-1725981224L ^ 0x991F9DD8;
        return n != 0;
    }

    @Override
    public void Method3474(@NotNull @NotNull BlockPos blockPos) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        if (!this.Method3473(blockPos)) return;
        this.Field12699.Method3805(blockPos);
    }

    @NotNull
    @NotNull
    public final CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I Method4325() {
        return this.Field12700;
    }

    @NotNull
    @NotNull
    public final WjjBVRrUqJUKhloA7ANknrTEODhuGa0J Method4326() {
        return this.Field12701;
    }

    public tnEuLwlsmI2K9Htk0vEdXHWkJjX721u4(@NotNull @NotNull CJgIA7TB8tBzfi0mBL2u6P69hVSyW45I cJgIA7TB8tBzfi0mBL2u6P69hVSyW45I, @NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J) {
        Intrinsics.checkParameterIsNotNull((Object)((Object)cJgIA7TB8tBzfi0mBL2u6P69hVSyW45I), (String)"block");
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        this.Field12700 = cJgIA7TB8tBzfi0mBL2u6P69hVSyW45I;
        this.Field12701 = wjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
        this.Field12698 = this.Field12701.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD(this.Field12700.name(), this.Field12701)));
        MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK = (MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)new MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK(this.Field12701).Method773(this.Field12700.name());
        xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2 = this.Field12698;
        Intrinsics.checkExpressionValueIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        this.Field12699 = ((MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK)mQQdJatsLVGeSB19jOnGDqa4fQGqBEjK.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2)).Method3788().Method3789();
    }

    private static String Method4327(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-101244662L ^ 0xF9F7210A;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)1553532180 ^ (long)1553532395);
            int n2 = (int)((long)1523630202 ^ (long)1523630207) << 3;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1444162059L ^ 0xA9EB90A4 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

