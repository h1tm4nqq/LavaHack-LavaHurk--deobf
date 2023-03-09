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
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class467;
import lavahack.client.Class961;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0019\u0010\u0017\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\u0019\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0019\u0010\u001d\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\u001f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0019\u0010!\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007\u00a8\u0006&"}, d2={"Lcom/kisman/cc/features/module/movement/SpeedRewrite;", "Lcom/kisman/cc/features/module/Module;", "()V", "boostFactor", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "getBoostFactor", "()Lcom/kisman/cc/settings/Setting;", "boostSpeed", "getBoostSpeed", "cap", "getCap", "jumpMovementFactor", "getJumpMovementFactor", "jumpMovementFactorSpeed", "getJumpMovementFactorSpeed", "lagTime", "getLagTime", "mode", "motionXmodifier", "getMotionXmodifier", "motionZmodifier", "getMotionZmodifier", "scaleCap", "getScaleCap", "slow", "getSlow", "strafeSpeed", "getStrafeSpeed", "useMotion", "getUseMotion", "useMotionInAir", "getUseMotionInAir", "useTimer", "getUseTimer", "onEnable", "", "update", "kisman.cc"})
public final class Class1989
extends Class42 {
    private static final Class44 Field17137;
    private static final Class44 Field17138;
    @NotNull
    private static final Class44 Field17139;
    @NotNull
    private static final Class44 Field17140;
    @NotNull
    private static final Class44 Field17141;
    private static final Class44 Field17142;
    @NotNull
    private static final Class44 Field17143;
    private static final Class44 Field17144;
    @NotNull
    private static final Class44 Field17145;
    private static final Class44 Field17146;
    private static final Class44 Field17147;
    @NotNull
    private static final Class44 Field17148;
    private static final Class44 Field17149;
    @NotNull
    private static final Class44 Field17150;
    private static final Class44 Field17151;
    public static final Class1989 Field17152;
    private int Field17153;

    public final Class44 Method7376() {
        return Field17138;
    }

    @NotNull
    @NotNull
    public final Class44 Method7377() {
        return Field17139;
    }

    @NotNull
    @NotNull
    public final Class44 Method7378() {
        return Field17140;
    }

    @NotNull
    @NotNull
    public final Class44 Method7379() {
        return Field17141;
    }

    public final Class44 Method7380() {
        return Field17142;
    }

    @NotNull
    @NotNull
    public final Class44 Method7381() {
        return Field17143;
    }

    public final Class44 Method7382() {
        return Field17144;
    }

    @NotNull
    @NotNull
    public final Class44 Method7383() {
        return Field17145;
    }

    public final Class44 Method7384() {
        return Field17146;
    }

    public final Class44 Method7385() {
        return Field17147;
    }

    @NotNull
    @NotNull
    public final Class44 Method7386() {
        return Field17148;
    }

    public final Class44 Method7387() {
        return Field17149;
    }

    @NotNull
    @NotNull
    public final Class44 Method7388() {
        return Field17150;
    }

    public final Class44 Method7389() {
        return Field17151;
    }

    @Override
    public void Method38() {
        super.Method38();
        if (Class1989.Method7390().player == null) return;
        if (Class1989.Method7390().world == null) {
            return;
        }
        Class44 class44 = Field17137;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mode");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.movement.speed.SpeedModes");
        }
        ((Class961)enum_).Method3949().Method6529();
    }

    @Override
    public void Method45() {
        if (Class1989.Method7390().player == null) return;
        if (Class1989.Method7390().world == null) {
            return;
        }
        Class44 class44 = Field17137;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"mode");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.features.module.movement.speed.SpeedModes");
        }
        ((Class961)enum_).Method3949().Method6530();
    }

    private Class1989() {
        super("SpeedRewrite", "Logic-rewrite version of Speed.", Class97.Field8340);
    }

    static {
        Class1989 class1989;
        Field17152 = class1989 = new Class1989();
        Field17137 = class1989.Method23(new Class44("Mode", (Class42)class1989, Class961.Field12092));
        Field17138 = class1989.Method23(new Class44("Use Timer", (Class42)class1989, false));
        Class44 class44 = class1989.Method23(new Class44("Motion X Modifier", (Class42)class1989, 0.0, 0.0, Double.longBitsToDouble(4602678819172646912L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"register(Setting(\"Motion\u2026s, 0.0, 0.0, 0.5, false))");
        Field17139 = class44;
        Class44 class442 = class1989.Method23(new Class44("Motion Z Modifier", (Class42)class1989, 0.0, 0.0, Double.longBitsToDouble(4602678819172646912L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"register(Setting(\"Motion\u2026s, 0.0, 0.0, 0.5, false))");
        Field17140 = class442;
        Class44 class443 = class1989.Method23(new Class44("Strafe Speed", (Class42)class1989, Double.longBitsToDouble(4598847156609680094L), Double.longBitsToDouble(4591870180066957722L), 1.0, false));
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"register(Setting(\"Strafe\u20260.2873, 0.1, 1.0, false))");
        Field17141 = class443;
        Field17142 = class1989.Method23(new Class44("Slow", (Class42)class1989, false));
        Class44 class444 = class1989.Method23(new Class44("Cap", (Class42)class1989, Double.longBitsToDouble(0x4024000000000000L), 0.0, Double.longBitsToDouble((long)51976590 ^ 0x402400000319198EL), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"register(Setting(\"Cap\", \u2026 10.0, 0.0, 10.0, false))");
        Field17143 = class444;
        Field17144 = class1989.Method23(new Class44("Scale Cap", (Class42)class1989, false));
        Class44 class445 = class1989.Method23(new Class44("Lag Time", (Class42)class1989, Double.longBitsToDouble(4647503709213818880L), 0.0, Double.longBitsToDouble(4652007308841189376L), Class467.Field9943));
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"register(Setting(\"Lag Ti\u20261000.0, NumberType.TIME))");
        Field17145 = class445;
        Field17146 = class1989.Method23(new Class44("Use Motion", (Class42)class1989, false));
        Field17147 = class1989.Method23(new Class44("Use Motion In Air", (Class42)class1989, false));
        Class44 class446 = class1989.Method23(new Class44("Jump Movement Factor Speed", (Class42)class1989, Double.longBitsToDouble(4598445435522918646L), Double.longBitsToDouble(4576918229304087675L), Double.longBitsToDouble(0x4024000000000000L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"register(Setting(\"Jump M\u2026.265, 0.01, 10.0, false))");
        Field17148 = class446;
        Field17149 = class1989.Method23(new Class44("Jump Movement Factor", (Class42)class1989, false));
        Class44 class447 = class1989.Method23(new Class44("Boost Speed", (Class42)class1989, Double.longBitsToDouble(4598445435522918646L), Double.longBitsToDouble((long)529705243 ^ 0x3F847AE1583CBD60L), Double.longBitsToDouble((long)1646652901 ^ 0x402400006225EDE5L), false));
        Intrinsics.checkExpressionValueIsNotNull((Object)class447, (String)"register(Setting(\"Boost \u2026.265, 0.01, 10.0, false))");
        Field17150 = class447;
        Field17151 = class1989.Method23(new Class44("Boost Factor", (Class42)class1989, false));
    }

    public static final Minecraft Method7390() {
        return Class42.Field8052;
    }

    public static final void Method7391(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 23;
            cArray2[n] = (char)(cArray[n] ^ (0x3AD6 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

