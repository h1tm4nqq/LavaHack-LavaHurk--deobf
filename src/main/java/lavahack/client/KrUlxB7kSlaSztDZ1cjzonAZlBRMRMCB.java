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
import lavahack.client.CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt;
import lavahack.client.F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa;
import lavahack.client.KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf;
import lavahack.client.KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt;
import lavahack.client.leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.EntityViewRenderEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2={"Lcom/kisman/cc/features/module/player/RotateModifier;", "Lcom/kisman/cc/features/module/Module;", "()V", "dPitch", "", "dYaw", "freeLook", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "listener", "Lme/zero/alpine/listener/Listener;", "Lcom/kisman/cc/event/events/TurnEvent;", "noPitchLimit", "rotationLockGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "rotationLockLogic", "rotationLockPitch", "rotationLockPitchValue", "rotationLockYaw", "rotationLockYawValue", "doRotationLock", "", "isFreeLookActive", "", "onCameraSetup", "event", "Lnet/minecraftforge/client/event/EntityViewRenderEvent$CameraSetup;", "onDisable", "onEnable", "update", "RotationLockLogic", "kisman.cc"})
public final class KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB
extends WjjBVRrUqJUKhloA7ANknrTEODhuGa0J {
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11749 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Free Look", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-857622971 ^ (long)-857622971)));
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field11750 = this.Method24(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Lock", this)));
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11751;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11752;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11753;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11754;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11755;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11756;
    private float Field11757;
    private float Field11758;
    @F3RUJ4pqKqExz7WB5oipQI42Y4NfLlLa
    private final CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt Field11759;
    private String Field11760 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method38() {
        super.Method38();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method706(this.Field11759);
        this.Field11758 = 0.0f;
        this.Field11757 = 0.0f;
    }

    @Override
    public void Method39() {
        super.Method39();
        leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field16242.Method711(this.Field11759);
    }

    @Override
    public void Method45() {
        if (KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3726().player == null) return;
        if (KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3726().world == null) {
            return;
        }
        this.Method3724();
    }

    private final void Method3724() {
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11751;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"rotationLockLogic");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method341() == KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11587) return;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field11752;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"rotationLockYaw");
        if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method365()) {
            EntityPlayerSP entityPlayerSP = KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3726().player;
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = this.Field11753;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"rotationLockYawValue");
            entityPlayerSP.rotationYaw = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4.Method368();
        }
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = this.Field11754;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"rotationLockPitch");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5.Method365()) return;
        EntityPlayerSP entityPlayerSP = KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method3726().player;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = this.Field11755;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"rotationLockPitchValue");
        entityPlayerSP.rotationPitch = qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6.Method368();
    }

    private final boolean Method28() {
        int n;
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = this.Field11749;
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"freeLook");
        if (!qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2.Method365()) {
            qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = this.Field11751;
            Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"rotationLockLogic");
            if (qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3.Method341() != KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11589) {
                n = (int)((long)1031069232 ^ (long)1031069232);
                return n != 0;
            }
        }
        n = (int)((long)-517565544 ^ (long)-517565543);
        return n != 0;
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method3725(@NotNull @NotNull EntityViewRenderEvent.CameraSetup cameraSetup) {
        Intrinsics.checkParameterIsNotNull((Object)cameraSetup, (String)"event");
        if (!this.Method28()) return;
        cameraSetup.setYaw(cameraSetup.getYaw() + this.Field11757);
        cameraSetup.setPitch(cameraSetup.getPitch() + this.Field11758);
    }

    public KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB() {
        super("RotateModifier", "Extra features of rotation system, like no pitch limit or free look", qQsb6s7p9s2mO0qNTfMhaY3YQsyB7U4P.Field8341);
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Lock Logic", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.Field11587).Method355("Logic");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Rotation Lock L\u2026c.None).setTitle(\"Logic\")");
        this.Field11751 = this.Method23(this.Field11750.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Lock Yaw", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, (boolean)((long)-359088162 ^ (long)-359088162)).Method355("Yaw");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Rotation Lock Y\u2026s, false).setTitle(\"Yaw\")");
        this.Field11752 = this.Method23(this.Field11750.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Lock Yaw Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0xCADCC5E0B6553FE2L ^ 0xABA45E0B6553FE2L), Double.longBitsToDouble((long)681623330 ^ 0x4066800028A0BF22L), ((int)1094414610L ^ 0x413B7113) != 0).Method312(this.Field11752).Method355("Yaw");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Rotation Lock Y\u2026nLockYaw).setTitle(\"Yaw\")");
        this.Field11753 = this.Method23(this.Field11750.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Lock Pitch", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1337549511L ^ 0xB0469D39) != 0).Method355("Pitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5, (String)"Setting(\"Rotation Lock P\u2026 false).setTitle(\"Pitch\")");
        this.Field11754 = this.Method23(this.Field11750.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD5));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Rotation Lock Pitch Value", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, 0.0, Double.longBitsToDouble(0x7306AFC29B9FA4ABL ^ 0xB3502FC29B9FA4ABL), Double.longBitsToDouble(0x192CBF8D71507BEAL ^ 0x597A3F8D71507BEAL), (boolean)((long)1935088626 ^ (long)1935088627)).Method312(this.Field11754).Method355("Pitch");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6, (String)"Setting(\"Rotation Lock P\u2026kPitch).setTitle(\"Pitch\")");
        this.Field11755 = this.Method23(this.Field11750.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD6));
        this.Field11756 = this.Method23(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("No Pitch Limit", (WjjBVRrUqJUKhloA7ANknrTEODhuGa0J)this, ((int)-1945189053L ^ 0x8C0EC543) != 0));
        this.Field11759 = new CWbHmUEXMBlBn6yy1FNsdHDsxUN4RrYt((hb5tz3bI7hH2ondwVV1qsjfgyxSY9bQt)new KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB$YlFSugLHQAjzunVBKfamPjSRsvHTy3jf(this), new Predicate[(int)((long)687505596 ^ (long)687505596)]);
    }

    public static final Minecraft Method3726() {
        return WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052;
    }

    public static final void Method3727(Minecraft minecraft) {
        WjjBVRrUqJUKhloA7ANknrTEODhuGa0J.Field8052 = minecraft;
    }

    public static final boolean Method3728(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB) {
        return krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Method28();
    }

    public static final float Method3729(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB) {
        return krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Field11757;
    }

    public static final void Method3730(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB, float f) {
        krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Field11757 = f;
    }

    public static final float Method3731(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB) {
        return krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Field11758;
    }

    public static final void Method3732(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB, float f) {
        krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Field11758 = f;
    }

    public static final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Method3733(KrUlxB7kSlaSztDZ1cjzonAZlBRMRMCB krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB) {
        return krUlxB7kSlaSztDZ1cjzonAZlBRMRMCB.Field11756;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)-568248196 ^ (long)-568248196);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)-101682257L ^ 0xF9F07350);
            int n2 = (int)-1165261730L ^ 0xBA8B840B;
            cArray2[n] = (char)(cArray[n] ^ ((int)((long)1670938302 ^ (long)1670926649) << 1 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

