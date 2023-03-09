//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.entity.EntityPlayerSP
 *  net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1652;
import lavahack.client.Class1796;
import lavahack.client.Class1801;
import lavahack.client.Class1996;
import lavahack.client.Class254;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class618;
import lavahack.client.Class849;
import lavahack.client.Class97;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2={"Lcom/kisman/cc/features/module/player/RotateModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "dPitch", "", "dYaw", "freeLook", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "listener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/TurnEvent;", "noPitchLimit", "rotationLockGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "rotationLockLogic", "rotationLockPitch", "rotationLockPitchValue", "rotationLockYaw", "rotationLockYawValue", "doRotationLock", "", "isFreeLookActive", "", "onCameraSetup", "event", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$CameraSetup;", "onDisable", "onEnable", "update", "RotationLockLogic", "kisman.cc"})
public final class Class895
extends Class42 {
    private final Class44 Field11749 = this.Method23(new Class44("Free Look", (Class42)this, false));
    private final Class1996 Field11750 = this.Method24(new Class1996(new Class44("Rotation Lock", this)));
    private final Class44 Field11751;
    private final Class44 Field11752;
    private final Class44 Field11753;
    private final Class44 Field11754;
    private final Class44 Field11755;
    private final Class44 Field11756;
    private float Field11757;
    private float Field11758;
    @Class1801
    private final Class618 Field11759;
    private String Field11760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field11759);
        this.Field11758 = 0.0f;
        this.Field11757 = 0.0f;
    }

    @Override
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field11759);
    }

    @Override
    public void Method45() {
        if (Class895.Method3726().player == null) return;
        if (Class895.Method3726().world == null) {
            return;
        }
        this.Method3724();
    }

    private final void Method3724() {
        Class44 class44 = this.Field11751;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"rotationLockLogic");
        if (class44.Method341() == Class849.Field11587) return;
        Class44 class442 = this.Field11752;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"rotationLockYaw");
        if (class442.Method365()) {
            EntityPlayerSP entityPlayerSP = Class895.Method3726().player;
            Class44 class443 = this.Field11753;
            Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"rotationLockYawValue");
            entityPlayerSP.rotationYaw = class443.Method368();
        }
        Class44 class444 = this.Field11754;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"rotationLockPitch");
        if (!class444.Method365()) return;
        EntityPlayerSP entityPlayerSP = Class895.Method3726().player;
        Class44 class445 = this.Field11755;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"rotationLockPitchValue");
        entityPlayerSP.rotationPitch = class445.Method368();
    }

    private final boolean Method28() {
        Class44 class44 = this.Field11749;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"freeLook");
        if (class44.Method365()) return true;
        Class44 class442 = this.Field11751;
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"rotationLockLogic");
        if (class442.Method341() == Class849.Field11589) return true;
        return false;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3725(@NotNull @NotNull EntityViewRenderEvent.CameraSetup cameraSetup) {
        Intrinsics.checkParameterIsNotNull((Object)cameraSetup, (String)"event");
        if (!this.Method28()) return;
        cameraSetup.setYaw(cameraSetup.getYaw() + this.Field11757);
        cameraSetup.setPitch(cameraSetup.getPitch() + this.Field11758);
    }

    public Class895() {
        super("RotateModifier", "Extra features of rotation system, like no pitch limit or free look", Class97.Field8341);
        Class44 class44 = new Class44("Rotation Lock Logic", (Class42)this, Class849.Field11587).Method355("Logic");
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"Setting(\"Rotation Lock L\u2026c.None).setTitle(\"Logic\")");
        this.Field11751 = this.Method23(this.Field11750.Method7405(class44));
        Class44 class442 = new Class44("Rotation Lock Yaw", (Class42)this, false).Method355("Yaw");
        Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"Setting(\"Rotation Lock Y\u2026s, false).setTitle(\"Yaw\")");
        this.Field11752 = this.Method23(this.Field11750.Method7405(class442));
        Class44 class443 = new Class44("Rotation Lock Yaw Value", (Class42)this, 0.0, Double.longBitsToDouble(-4582834833314545664L), Double.longBitsToDouble((long)681623330 ^ 0x4066800028A0BF22L), true).Method312(this.Field11752).Method355("Yaw");
        Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"Setting(\"Rotation Lock Y\u2026nLockYaw).setTitle(\"Yaw\")");
        this.Field11753 = this.Method23(this.Field11750.Method7405(class443));
        Class44 class444 = new Class44("Rotation Lock Pitch", (Class42)this, false).Method355("Pitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"Setting(\"Rotation Lock P\u2026 false).setTitle(\"Pitch\")");
        this.Field11754 = this.Method23(this.Field11750.Method7405(class444));
        Class44 class445 = new Class44("Rotation Lock Pitch Value", (Class42)this, 0.0, Double.longBitsToDouble(-4587338432941916160L), Double.longBitsToDouble(4636033603912859648L), true).Method312(this.Field11754).Method355("Pitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"Setting(\"Rotation Lock P\u2026kPitch).setTitle(\"Pitch\")");
        this.Field11755 = this.Method23(this.Field11750.Method7405(class445));
        this.Field11756 = this.Method23(new Class44("No Pitch Limit", (Class42)this, false));
        this.Field11759 = new Class618((Class254)new Class1652(this), new Predicate[0]);
    }

    public static final Minecraft Method3726() {
        return Class42.Field8052;
    }

    public static final void Method3727(Minecraft minecraft) {
        Class42.Field8052 = minecraft;
    }

    public static final boolean Method3728(Class895 class895) {
        return class895.Method28();
    }

    public static final float Method3729(Class895 class895) {
        return class895.Field11757;
    }

    public static final void Method3730(Class895 class895, float f) {
        class895.Field11757 = f;
    }

    public static final float Method3731(Class895 class895) {
        return class895.Field11758;
    }

    public static final void Method3732(Class895 class895, float f) {
        class895.Field11758 = f;
    }

    public static final Class44 Method3733(Class895 class895) {
        return class895.Field11756;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 85;
            cArray2[n] = (char)(cArray[n] ^ (0x5F0E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

