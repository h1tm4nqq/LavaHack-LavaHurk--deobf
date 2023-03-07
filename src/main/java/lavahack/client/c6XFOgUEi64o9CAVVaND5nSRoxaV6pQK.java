//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.Vec3d
 */
package lavahack.client;

import com.kisman.cc.util.Ljc0gDTN8WkwPRHY480HpEkScGALG41A;
import com.kisman.cc.util.vl3icpcdb9cWvH39NKe3weWQwVdWO7AV;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk;
import lavahack.client.MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK;
import lavahack.client.WjjBVRrUqJUKhloA7ANknrTEODhuGa0J;
import lavahack.client.ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G;
import lavahack.client.c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.exalTBqSufwHR1VdwyK23X5QNwSlzh5j$leqS0IyKEB621E1SrHdAcHHAUjScjmKi;
import lavahack.client.hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7;
import lavahack.client.k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8;
import lavahack.client.qdws5c2TrWCYwByZ0oQUUWIrq72gJscD;
import lavahack.client.tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8;
import lavahack.client.xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#JX\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#JP\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020&J`\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#J\u0010\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\u0000H\u0016J\b\u0010)\u001a\u00020\u0000H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+H\u0016J\u0016\u0010,\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070-H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2={"Lcom/kisman/cc/settings/util/FadeRenderingRewritePattern;", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "module", "Lcom/kisman/cc/features/module/Module;", "defaultFadeLogic", "Lcom/kisman/cc/util/enums/FadeLogic;", "customFadeLogic", "", "(Lcom/kisman/cc/features/module/Module;Lcom/kisman/cc/util/enums/FadeLogic;Z)V", "filledColorFadeDelay", "Lcom/kisman/cc/settings/Setting;", "filledColorFadeGroup", "Lcom/kisman/cc/settings/types/SettingGroup;", "filledColorFadeLogic", "Lcom/kisman/cc/settings/types/SettingEnum;", "outlineColorFadeDelay", "outlineColorFadeGroup", "outlineColorFadeLogic", "wireColorFadeDelay", "wireColorFadeGroup", "wireColorFadeLogic", "draw", "", "aabb", "Lnet/minecraft/util/math/AxisAlignedBB;", "filledColor1", "Lcom/kisman/cc/util/Colour;", "filledColor2", "outlineColor1", "outlineColor2", "wireColor1", "wireColor2", "mode", "Lcom/kisman/cc/util/render/Rendering$Mode;", "range", "", "distance", "timeStamp", "", "group", "init", "preInit", "prefix", "", "visible", "Ljava/util/function/Supplier;", "kisman.cc"})
public final class c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK
extends MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK {
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field11843;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field11844;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11845;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field11846;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field11847;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11848;
    private final xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl Field11849;
    private final M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk Field11850;
    private final qdws5c2TrWCYwByZ0oQUUWIrq72gJscD Field11851;
    private final hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7 Field11852;
    private final boolean Field11853;
    private String Field11854 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Method3812() {
        super.Method3789();
        if (this.Field11853) {
            this.Method780().Method25(this.Field11844);
            this.Method780().Method25(this.Field11847);
            this.Method780().Method25(this.Field11850);
        }
        this.Method780().Method24(this.Field11843);
        this.Method780().Method23(this.Field11845);
        this.Method780().Method24(this.Field11846);
        this.Method780().Method23(this.Field11848);
        this.Method780().Method24(this.Field11849);
        this.Method780().Method23(this.Field11851);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method3812();
    }

    @Override
    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method3789() {
        return this.Method3812();
    }

    @NotNull
    @NotNull
    public c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Method3813() {
        c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK2 = this;
        int n = (int)((long)-954421967 ^ (long)-954421967);
        int n2 = (int)1680465773L ^ 0x6429DF6D;
        c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK3 = c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK2;
        int n3 = (int)((long)897669768 ^ (long)897669768);
        super.Method3788();
        return c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK2;
    }

    @Override
    public Object Method778() {
        return this.Method3813();
    }

    @Override
    public MQQdJatsLVGeSB19jOnGDqa4fQGqBEjK Method3788() {
        return this.Method3813();
    }

    @NotNull
    @NotNull
    public c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Method3814(@NotNull @NotNull String string) {
        Intrinsics.checkParameterIsNotNull((Object)string, (String)"prefix");
        Object object = super.Method773(string);
        if (object != null) return (c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
    }

    @Override
    public Object Method773(String string) {
        return this.Method3814(string);
    }

    @NotNull
    @NotNull
    public c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Method3815(@NotNull @NotNull Supplier supplier) {
        Intrinsics.checkParameterIsNotNull((Object)supplier, (String)"visible");
        Object object = super.Method771(supplier);
        if (object != null) return (c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
    }

    @Override
    public Object Method771(Supplier supplier) {
        return this.Method3815(supplier);
    }

    @NotNull
    @NotNull
    public c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK Method3816(@NotNull @NotNull xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        Intrinsics.checkParameterIsNotNull((Object)xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2, (String)"group");
        Object object = super.Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2);
        if (object != null) return (c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK)object;
        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.settings.util.FadeRenderingRewritePattern");
    }

    @Override
    public Object Method772(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2) {
        return this.Method3816(xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl2);
    }

    public final void Method3817(@NotNull @NotNull AxisAlignedBB axisAlignedBB, long l, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Enum enum_ = this.Method3765().Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.RenderingRewriteModes");
        }
        this.Method3821(axisAlignedBB, this.Method3806(), this.Method3807(), this.Method3808(), this.Method3809(), this.Method3810(), this.Method3811(), ((k2xS3X9Hiu97q1kXmWdLuKIc9dhkROz8)enum_).Method3273(), l, f, f2);
    }

    public final void Method3818(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, @Nullable @Nullable exalTBqSufwHR1VdwyK23X5QNwSlzh5j.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, long l) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        if (this.Field11853) return;
        if (this.Field11852 != hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7.Field14901) return;
        this.Method3821(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, l, 1.0f, 1.0f);
    }

    public final void Method3819(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, @Nullable @Nullable exalTBqSufwHR1VdwyK23X5QNwSlzh5j.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, float f) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        Vec3d vec3d = tdSm3RmMRb5Kp8aQNd26dKOJur9ncrg8.Field16968.Method6696(axisAlignedBB).Method7191();
        this.Method3820(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, f, (float)Ljc0gDTN8WkwPRHY480HpEkScGALG41A.Field17803.player.getDistance(vec3d.x, vec3d.y, vec3d.z));
    }

    public final void Method3820(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, @Nullable @Nullable exalTBqSufwHR1VdwyK23X5QNwSlzh5j.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        if (this.Field11853) return;
        if (this.Field11852 != hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7.Field14902) return;
        this.Method3821(axisAlignedBB, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, 1L, f, f2);
    }

    public final void Method3821(@NotNull @NotNull AxisAlignedBB axisAlignedBB, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, @NotNull @NotNull vl3icpcdb9cWvH39NKe3weWQwVdWO7AV vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, @Nullable @Nullable exalTBqSufwHR1VdwyK23X5QNwSlzh5j.leqS0IyKEB621E1SrHdAcHHAUjScjmKi leqS0IyKEB621E1SrHdAcHHAUjScjmKi2, long l, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"aabb");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, (String)"filledColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, (String)"filledColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, (String)"outlineColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, (String)"outlineColor2");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, (String)"wireColor1");
        Intrinsics.checkParameterIsNotNull((Object)vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, (String)"wireColor2");
        c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi = new c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi(l, f2, f);
        this.Method3794(axisAlignedBB, c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV2, this.Field11845.Method369(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)this.Field11844.Method341()), c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV3, this.Field11845.Method369(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)this.Field11844.Method341()), c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV4, this.Field11848.Method369(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)this.Field11847.Method341()), c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV5, this.Field11848.Method369(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)this.Field11847.Method341()), c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV6, this.Field11851.Method369(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)this.Field11850.Method341()), c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK$leqS0IyKEB621E1SrHdAcHHAUjScjmKi.leqS0IyKEB621E1SrHdAcHHAUjScjmKi(vl3icpcdb9cWvH39NKe3weWQwVdWO7AV7, this.Field11851.Method369(), (hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7)this.Field11850.Method341()), leqS0IyKEB621E1SrHdAcHHAUjScjmKi2);
    }

    public c6XFOgUEi64o9CAVVaND5nSRoxaV6pQK(@NotNull @NotNull WjjBVRrUqJUKhloA7ANknrTEODhuGa0J wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, @NotNull @NotNull hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo7 hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo72, boolean bl) {
        Intrinsics.checkParameterIsNotNull((Object)wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, (String)"module");
        Intrinsics.checkParameterIsNotNull((Object)((Object)hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo72), (String)"defaultFadeLogic");
        super(wjjBVRrUqJUKhloA7ANknrTEODhuGa0J);
        this.Field11852 = hBz1cXhk8AJFX74Ke0DR0IV7CL0GHVo72;
        this.Field11853 = bl;
        this.Field11843 = this.Method776(this.Method3779().Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        this.Field11844 = this.Method774(this.Field11843.Method7407(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Filled Color Fade Logic", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, this.Field11852).Method5300("Logic")));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Filled Color Fade Delay", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 0.0, 0.0, Double.longBitsToDouble((long)27662910 ^ 0x40C3880001A61A3EL), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2, (String)"Setting(\"Filled Color Fa\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11845 = this.Method775(this.Field11843.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD2));
        this.Field11846 = this.Method776(this.Method3782().Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        this.Field11847 = this.Method774(this.Field11846.Method7407(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Outline Color Fade Logic", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, this.Field11852).Method5300("Logic")));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Outline Color Fade Delay", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 0.0, 0.0, Double.longBitsToDouble(0xD4C7F6DF1E1BBD69L ^ 0x94047EDF1E1BBD69L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3, (String)"Setting(\"Outline Color F\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11848 = this.Method775(this.Field11846.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD3));
        this.Field11849 = this.Method776(this.Method3785().Method7406(new xjMxQu4kQNOzMncWZP5nUX1159T9K8Wl(new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Fade", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J))));
        this.Field11850 = this.Method774(this.Field11849.Method7407(new M5Lq2iwJmjqoQZOEOhulHI2lN3li1Zlk("Wire Color Fade Logic", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, this.Field11852).Method5300("Logic")));
        qdws5c2TrWCYwByZ0oQUUWIrq72gJscD qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4 = new qdws5c2TrWCYwByZ0oQUUWIrq72gJscD("Wire Color Fade Delay", wjjBVRrUqJUKhloA7ANknrTEODhuGa0J, 0.0, 0.0, Double.longBitsToDouble(0x9D17B3499AAD6B97L ^ 0xDDD43B499AAD6B97L), ZL4q1jpYVsiO81b3lM3zViSKEVLCki7G.Field9943).Method355("Delay");
        Intrinsics.checkExpressionValueIsNotNull((Object)qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4, (String)"Setting(\"Wire Color Fade\u2026e.TIME).setTitle(\"Delay\")");
        this.Field11851 = this.Method775(this.Field11849.Method7405(qdws5c2TrWCYwByZ0oQUUWIrq72gJscD4));
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = (int)((long)951951574 ^ (long)951951574);
        while (n < cArray.length) {
            int cfr_ignored_0 = n & ((int)324812685L ^ 0x135C3F72);
            int n2 = (int)((long)-361585490 ^ (long)-361585515) << 1;
            cArray2[n] = (char)(cArray[n] ^ ((int)-1511964688L ^ 0xA5E14E1F ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

