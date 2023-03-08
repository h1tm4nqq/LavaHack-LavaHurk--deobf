//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.entity.*;
import net.minecraftforge.client.event.*;
import org.jetbrains.annotations.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004?\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u001f" }, d2 = { "Lcom/kisman/cc/features/module/player/RotateModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "dPitch", "", "dYaw", "freeLook", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "listener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/TurnEvent;", "noPitchLimit", "rotationLockGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "rotationLockLogic", "rotationLockPitch", "rotationLockPitchValue", "rotationLockYaw", "rotationLockYawValue", "doRotationLock", "", "isFreeLookActive", "", "onCameraSetup", "event", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$CameraSetup;", "onDisable", "onEnable", "update", "RotationLockLogic", "kisman.cc" })
public final class Class895 extends Class42
{
    private final Class44 Field11749;
    private final Class1996 Field11750;
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
    
    public void Method38() {
        super.Method38();
        Class1796.Field16242.Method706(this.Field11759);
        this.Field11758 = 0.0f;
        this.Field11757 = 0.0f;
    }
    
    public void Method39() {
        super.Method39();
        Class1796.Field16242.Method711(this.Field11759);
    }
    
    public void Method45() {
        if (Method3726().player == null || Method3726().world == null) {
            return;
        }
        this.Method3724();
    }
    
    private final void Method3724() {
        final Class44 field11751 = this.Field11751;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11751, "rotationLockLogic");
        if (field11751.Method341() != Class849.Field11587) {
            final Class44 field11752 = this.Field11752;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11752, "rotationLockYaw");
            if (field11752.Method365()) {
                final EntityPlayerSP player = Method3726().player;
                final Class44 field11753 = this.Field11753;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11753, "rotationLockYawValue");
                player.rotationYaw = field11753.Method368();
            }
            final Class44 field11754 = this.Field11754;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11754, "rotationLockPitch");
            if (field11754.Method365()) {
                final EntityPlayerSP player2 = Method3726().player;
                final Class44 field11755 = this.Field11755;
                Intrinsics.checkExpressionValueIsNotNull((Object)field11755, "rotationLockPitchValue");
                player2.rotationPitch = field11755.Method368();
            }
        }
    }
    
    private final boolean Method28() {
        final Class44 field11749 = this.Field11749;
        Intrinsics.checkExpressionValueIsNotNull((Object)field11749, "freeLook");
        if (!field11749.Method365()) {
            final Class44 field11750 = this.Field11751;
            Intrinsics.checkExpressionValueIsNotNull((Object)field11750, "rotationLockLogic");
            if (field11750.Method341() != Class849.Field11589) {
                return false;
            }
        }
        return true;
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method3725(@NotNull @NotNull final EntityViewRenderEvent$CameraSetup entityViewRenderEvent$CameraSetup) {
        Intrinsics.checkParameterIsNotNull((Object)entityViewRenderEvent$CameraSetup, "event");
        if (this.Method28()) {
            entityViewRenderEvent$CameraSetup.setYaw(entityViewRenderEvent$CameraSetup.getYaw() + this.Field11757);
            entityViewRenderEvent$CameraSetup.setPitch(entityViewRenderEvent$CameraSetup.getPitch() + this.Field11758);
        }
    }
    
    public Class895() {
        super("RotateModifier", "Extra features of rotation system, like no pitch limit or free look", Class97.Field8341);
        this.Field11749 = this.Method23(new Class44("Free Look", (Class42)this, false));
        this.Field11750 = this.Method24(new Class1996(new Class44("Rotation Lock", (Class42)this)));
        final Class1996 field11750 = this.Field11750;
        final Class44 method355 = new Class44("Rotation Lock Logic", (Class42)this, (Enum)Class849.Field11587).Method355("Logic");
        Intrinsics.checkExpressionValueIsNotNull((Object)method355, "Setting(\"Rotation Lock L\u2026c.None).setTitle(\"Logic\")");
        this.Field11751 = this.Method23(field11750.Method7405(method355));
        final Class1996 field11751 = this.Field11750;
        final Class44 method356 = new Class44("Rotation Lock Yaw", (Class42)this, false).Method355("Yaw");
        Intrinsics.checkExpressionValueIsNotNull((Object)method356, "Setting(\"Rotation Lock Y\u2026s, false).setTitle(\"Yaw\")");
        this.Field11752 = this.Method23(field11751.Method7405(method356));
        final Class1996 field11752 = this.Field11750;
        final Class44 method357 = new Class44("Rotation Lock Yaw Value", (Class42)this, 0.0, Double.longBitsToDouble(-4582834833314545664L), Double.longBitsToDouble((long)681623330 ^ 0x4066800028A0BF22L), true).Method312(this.Field11752).Method355("Yaw");
        Intrinsics.checkExpressionValueIsNotNull((Object)method357, "Setting(\"Rotation Lock Y\u2026nLockYaw).setTitle(\"Yaw\")");
        this.Field11753 = this.Method23(field11752.Method7405(method357));
        final Class1996 field11753 = this.Field11750;
        final Class44 method358 = new Class44("Rotation Lock Pitch", (Class42)this, false).Method355("Pitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)method358, "Setting(\"Rotation Lock P\u2026 false).setTitle(\"Pitch\")");
        this.Field11754 = this.Method23(field11753.Method7405(method358));
        final Class1996 field11754 = this.Field11750;
        final Class44 method359 = new Class44("Rotation Lock Pitch Value", (Class42)this, 0.0, Double.longBitsToDouble(-4587338432941916160L), Double.longBitsToDouble(4636033603912859648L), true).Method312(this.Field11754).Method355("Pitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)method359, "Setting(\"Rotation Lock P\u2026kPitch).setTitle(\"Pitch\")");
        this.Field11755 = this.Method23(field11754.Method7405(method359));
        this.Field11756 = this.Method23(new Class44("No Pitch Limit", (Class42)this, false));
        this.Field11759 = new Class618((Class254)new Class1652(this), new Predicate[0]);
    }
    
    public static final Minecraft Method3726() {
        return Class42.Field8052;
    }
    
    public static final void Method3727(final Minecraft field8052) {
        Class42.Field8052 = field8052;
    }
    
    public static final boolean Method3728(final Class895 class895) {
        return class895.Method28();
    }
    
    public static final float Method3729(final Class895 class895) {
        return class895.Field11757;
    }
    
    public static final void Method3730(final Class895 class895, final float field11757) {
        class895.Field11757 = field11757;
    }
    
    public static final float Method3731(final Class895 class895) {
        return class895.Field11758;
    }
    
    public static final void Method3732(final Class895 class895, final float field11758) {
        class895.Field11758 = field11758;
    }
    
    public static final Class44 Method3733(final Class895 class895) {
        return class895.Field11756;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5F0E ^ 0x55));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
