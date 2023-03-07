//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU;
import lavahack.client.HxNufwqIKdASUlhzDMzyCRUIub26n5S3;
import lavahack.client.LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/module/Debug/SmoothRenderer$Renderer;", "", "()V", "currentPlaceInfo", "Lcom/kisman/cc/features/module/Debug/SmoothRenderer$PlaceInfo;", "lastPlaceInfo", "lastRenderPos", "Lnet/minecraft/util/math/BlockPos;", "lastSelfDamage", "", "lastTargetDamage", "lastUpdateTime", "", "prevPlaceInfo", "scale", "startTime", "onRenderWorld", "", "movingLength", "fadeLength", "placeInfo", "depth", "", "alpha", "reset", "update", "kisman.cc"})
public final class LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf {
    @JvmField
    @Nullable
    public LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9956;
    @JvmField
    @Nullable
    public LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9957;
    @JvmField
    @Nullable
    public LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi Field9958;
    @JvmField
    @Nullable
    public BlockPos Field9959;
    @JvmField
    public long Field9960;
    @JvmField
    public long Field9961;
    @JvmField
    public float Field9962;
    @JvmField
    public float Field9963;
    @JvmField
    public float Field9964;
    private String Field9965 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    public final void Method2204() {
        this.Field9956 = null;
        this.Field9957 = null;
        this.Field9958 = null;
        this.Field9959 = null;
        this.Field9960 = 0L;
        this.Field9961 = 0L;
        this.Field9962 = 0.0f;
        this.Field9963 = 0.0f;
        this.Field9964 = 0.0f;
    }

    public final void Method2205(float f, float f2, @NotNull @NotNull LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, boolean bl, boolean bl2) {
        Intrinsics.checkParameterIsNotNull((Object)lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi, (String)"placeInfo");
        this.Method2206(lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi);
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = this.Field9957;
        if (lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 == null) return;
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2;
        int n = (int)((long)1870168791 ^ (long)1870168791);
        int n2 = (int)270272025L ^ 0x101C0619;
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi4 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3;
        int n3 = (int)((long)-650850298 ^ (long)-650850298);
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi5 = this.Field9958;
        if (lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi5 == null) return;
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi6 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi5;
        int n4 = (int)((long)1815199973 ^ (long)1815199973);
        int n5 = (int)((long)-1369425321 ^ (long)-1369425321);
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi7 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi6;
        int n6 = (int)-634994388L ^ 0xDA26C12C;
        double d = yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8825.Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field9960, f));
        HxNufwqIKdASUlhzDMzyCRUIub26n5S3 hxNufwqIKdASUlhzDMzyCRUIub26n5S3 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi4.Method5099() != null && lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi7.Method5099() != null ? lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi4.Method5099().Method6833(new LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(d), lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi7.Method5099()) : null;
        this.Field9962 = (float)(lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5098() != null ? yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8822.Method845(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field9961, f2)) : yA6FfBWveAENft82JRISn3FwZ8fifzBI$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field8822.Method848(HwXRpSmTvOCdoSs4qUYLM5nbHtSZdjcU.Method4285(this.Field9961, f2)));
        if (hxNufwqIKdASUlhzDMzyCRUIub26n5S3 != null) {
            GlStateManager.pushMatrix();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.popMatrix();
        }
        this.Field9959 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Method5098();
    }

    public final void Method2206(@Nullable @Nullable LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi) {
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
        BlockPos blockPos = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2 != null ? lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi2.Method5098() : null;
        if ((Intrinsics.areEqual((Object)blockPos, (Object)this.Field9959) ^ (int)((long)126874130 ^ (long)126874131)) == 0) return;
        LRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3 = this.Field9956;
        if (lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3 == null) {
            lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3 = this.Field9958;
        }
        this.Field9957 = lRV8bw1T7cSLX0lHwukV3l5Fa0S6T6td$leqS0IyKEB621E1SrHdAcHHAUjScjmKi3;
        this.Field9960 = System.currentTimeMillis();
        if (this.Field9956 == null) {
            this.Field9961 = System.currentTimeMillis();
        }
        this.Field9959 = blockPos;
    }

    private static String Method2207(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-70249838 ^ (long)-70249838);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & (int)((long)-1553620659 ^ (long)-1553620558);
            int n2 = (int)((long)433521553 ^ (long)433521414);
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)-734006639 ^ (long)-734008172) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

