//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0019\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0019\u0010\u001d\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\u001f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007\u00a8\u0006&"}, d2={"Lcom/kisman/cc/features/module/movement/SpeedRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "boostFactor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getBoostFactor", "()Lcom/kisman/cc/settings/Setting;", "boostSpeed", "getBoostSpeed", "cap", "getCap", "jumpMovementFactor", "getJumpMovementFactor", "jumpMovementFactorSpeed", "getJumpMovementFactorSpeed", "lagTime", "getLagTime", "mode", "motionXmodifier", "getMotionXmodifier", "motionZmodifier", "getMotionZmodifier", "scaleCap", "getScaleCap", "slow", "getSlow", "strafeSpeed", "getStrafeSpeed", "useMotion", "getUseMotion", "useMotionInAir", "getUseMotionInAir", "useTimer", "getUseTimer", "onEnable", "", "update", "kisman.cc"})
public final class Ffcv07tLImFck2OjGznu2fLGW0hkgJEV
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17137;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17138;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17139;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17140;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17141;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17142;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17143;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17144;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17145;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17146;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17147;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17148;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17149;
    @NotNull
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17150;
    private static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field17151;
    public static final Ffcv07tLImFck2OjGznu2fLGW0hkgJEV Field17152;
    private int Field17153;

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7376() {
        return Field17138;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7377() {
        return Field17139;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7378() {
        return Field17140;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7379() {
        return Field17141;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7380() {
        return Field17142;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7381() {
        return Field17143;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7382() {
        return Field17144;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7383() {
        return Field17145;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7384() {
        return Field17146;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7385() {
        return Field17147;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7386() {
        return Field17148;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7387() {
        return Field17149;
    }

    @NotNull
    @NotNull
    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7388() {
        return Field17150;
    }

    public final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method7389() {
        return Field17151;
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method7390().player == null) return;
        if (Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method7390().world == null) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field17137;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.movement.speed.SpeedModes");
        }
        ((aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8)enum_).Method3949().Method6529();
    }

    @Override
    public void Method45() {
        if (Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method7390().player == null) return;
        if (Ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method7390().world == null) {
            return;
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = Field17137;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"mode");
        Enum enum_ = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.movement.speed.SpeedModes");
        }
        ((aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8)enum_).Method3949().Method6530();
    }

    private Ffcv07tLImFck2OjGznu2fLGW0hkgJEV() {
        super("SpeedRewrite", "Logic-rewrite version of Speed.", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8340);
    }

    static {
        Ffcv07tLImFck2OjGznu2fLGW0hkgJEV ffcv07tLImFck2OjGznu2fLGW0hkgJEV;
        Field17152 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV = new Ffcv07tLImFck2OjGznu2fLGW0hkgJEV();
        Field17137 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Mode", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, aDmeYUB2VnDg9d9L01Dcca8IRra9cIH8.Field12092));
        Field17138 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Timer", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, (boolean)((long)-1497062538 ^ (long)-1497062538)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion X Modifier", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, 0.0, 0.0, Double.longBitsToDouble(0x29D1FF6A0EFEDFF5L ^ 0x1631FF6A0EFEDFF5L), ((int)471935622L ^ 0x1C212A86) != 0));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"register(Setting(\"Motion\u2026s, 0.0, 0.0, 0.5, false))");
        Field17139 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Motion Z Modifier", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, 0.0, 0.0, Double.longBitsToDouble(0x7BAD96331475A319L ^ 0x444D96331475A319L), (boolean)((long)496938349 ^ (long)496938349)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"register(Setting(\"Motion\u2026s, 0.0, 0.0, 0.5, false))");
        Field17140 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Strafe Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, Double.longBitsToDouble(0x28AA4499A16544B8L ^ 0x177827862B6C4666L), Double.longBitsToDouble(0x916ED658B6F2E4BDL ^ 0xAED74FC12F6B7D27L), 1.0, (boolean)((long)-1473420824 ^ (long)-1473420824)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"register(Setting(\"Strafe\u20260.2873, 0.1, 1.0, false))");
        Field17141 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4;
        Field17142 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Slow", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, (boolean)((long)1169176826 ^ (long)1169176826)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Cap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, Double.longBitsToDouble(0x61E3298BAA4917CFL ^ 0x21C7298BAA4917CFL), 0.0, Double.longBitsToDouble((long)51976590 ^ 0x402400000319198EL), (boolean)((long)-427906903 ^ (long)-427906903)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"register(Setting(\"Cap\", \u2026 10.0, 0.0, 10.0, false))");
        Field17143 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5;
        Field17144 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Scale Cap", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, (boolean)((long)-537657483 ^ (long)-537657483)));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Lag Time", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, Double.longBitsToDouble(0xCAC4F099FBDEC82L ^ 0x4CD30F099FBDEC82L), 0.0, Double.longBitsToDouble(0x946E327B5F6463E0L ^ 0xD4E1727B5F6463E0L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"register(Setting(\"Lag Ti\u20261000.0, NumberType.TIME))");
        Field17145 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6;
        Field17146 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Motion", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, (boolean)((long)-220882996 ^ (long)-220882996)));
        Field17147 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Use Motion In Air", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, ((int)-1601369000L ^ 0xA08D0C58) != 0));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jump Movement Factor Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, Double.longBitsToDouble(0xE5B9FB3473DF559EL ^ 0xDA690EF6FC837D68L), Double.longBitsToDouble(0x1918B412C46CD884L ^ 0x269CCEF383C2CCFFL), Double.longBitsToDouble(0xC3D0B4B879CF77D6L ^ 0x83F4B4B879CF77D6L), (boolean)((long)315775602 ^ (long)315775602)));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7, (String)"register(Setting(\"Jump M\u2026.265, 0.01, 10.0, false))");
        Field17148 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD7;
        Field17149 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Jump Movement Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, ((int)-1145828615L ^ 0xBBB40AF9) != 0));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boost Speed", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, Double.longBitsToDouble(0xF5DEC51C2422624L ^ 0x308D19934D1E0ED2L), Double.longBitsToDouble((long)529705243 ^ 0x3F847AE1583CBD60L), Double.longBitsToDouble((long)1646652901 ^ 0x402400006225EDE5L), ((int)2083100598L ^ 0x7C2997B6) != 0));
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8, (String)"register(Setting(\"Boost \u2026.265, 0.01, 10.0, false))");
        Field17150 = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD8;
        Field17151 = ffcv07tLImFck2OjGznu2fLGW0hkgJEV.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Boost Factor", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)ffcv07tLImFck2OjGznu2fLGW0hkgJEV, ((int)-1982658033L ^ 0x89D30A0F) != 0));
    }

    public static final Minecraft Method7390() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method7391(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)-1937768536L ^ 0x8C7FFFA8;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)371040889L ^ 0x161DA286);
            int n2 = (int)-323228967L ^ 0xECBBEACE;
            cArray2[n] = (char)(cArray[n] ^ (((int)-1468579712L ^ 0xA8775DEB) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

