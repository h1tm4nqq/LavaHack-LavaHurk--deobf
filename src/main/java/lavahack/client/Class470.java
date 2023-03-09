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
import lavahack.client.Class1047;
import lavahack.client.Class1266;
import lavahack.client.Class1811;
import lavahack.client.Class187;
import lavahack.client.Class840;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2={"Lcom/kisman/cc/features/module/Debug/SmoothRenderer$Renderer;", "", "()V", "currentPlaceInfo", "Lcom/kisman/cc/features/module/Debug/SmoothRenderer$PlaceInfo;", "lastPlaceInfo", "lastRenderPos", "Lnet/minecraft/util/math/BlockPos;", "lastSelfDamage", "", "lastTargetDamage", "lastUpdateTime", "", "prevPlaceInfo", "scale", "startTime", "onRenderWorld", "", "movingLength", "fadeLength", "placeInfo", "depth", "", "alpha", "reset", "update", "kisman.cc"})
public final class Class470 {
    @JvmField
    @Nullable
    public Class1266 Field9956;
    @JvmField
    @Nullable
    public Class1266 Field9957;
    @JvmField
    @Nullable
    public Class1266 Field9958;
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

    public final void Method2205(float f, float f2, @NotNull @NotNull Class1266 class1266, boolean bl, boolean bl2) {
        Intrinsics.checkParameterIsNotNull((Object)class1266, (String)"placeInfo");
        this.Method2206(class1266);
        Class1266 class12662 = this.Field9957;
        if (class12662 == null) return;
        Class1266 class12663 = class12662;
        boolean bl3 = false;
        boolean bl4 = false;
        Class1266 class12664 = class12663;
        boolean bl5 = false;
        Class1266 class12665 = this.Field9958;
        if (class12665 == null) return;
        Class1266 class12666 = class12665;
        boolean bl6 = false;
        boolean bl7 = false;
        Class1266 class12667 = class12666;
        boolean bl8 = false;
        double d = Class187.Field8825.Method845(Class1047.Method4285(this.Field9960, f));
        Class1811 class1811 = class12664.Method5099() != null && class12667.Method5099() != null ? class12664.Method5099().Method6833(new Class840(d), class12667.Method5099()) : null;
        this.Field9962 = (float)(class1266.Method5098() != null ? Class187.Field8822.Method845(Class1047.Method4285(this.Field9961, f2)) : Class187.Field8822.Method848(Class1047.Method4285(this.Field9961, f2)));
        if (class1811 != null) {
            GlStateManager.pushMatrix();
            GlStateManager.color((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GlStateManager.popMatrix();
        }
        this.Field9959 = class1266.Method5098();
    }

    public final void Method2206(@Nullable @Nullable Class1266 class1266) {
        Class1266 class12662 = class1266;
        BlockPos blockPos = class12662 != null ? class12662.Method5098() : null;
        if (!(Intrinsics.areEqual((Object)blockPos, (Object)this.Field9959) ^ true)) return;
        Class1266 class12663 = this.Field9956;
        if (class12663 == null) {
            class12663 = this.Field9958;
        }
        this.Field9957 = class12663;
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
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 151;
            cArray2[n] = (char)(cArray[n] ^ (0x3C0A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

