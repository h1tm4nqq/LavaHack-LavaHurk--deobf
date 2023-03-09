/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.AxisAlignedBB
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1024;
import lavahack.client.Class1303;
import lavahack.client.Class187;
import lavahack.client.Class1996;
import lavahack.client.Class419;
import lavahack.client.Class42;
import lavahack.client.Class44;
import lavahack.client.Class815;
import lavahack.client.Class91;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0018\u001a\u00020\u0000H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2={"Lcom/kisman/cc/settings/util/EasingsPattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "group_", "Lcom/kisman/cc/settings/types/SettingGroup;", "mode", "Lcom/kisman/cc/settings/Setting;", "normalMode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "reverseMode", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$EasingReverse;", "init", "mutateBB", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "progress", "", "mutateBlockBB", "pos", "Lnet/minecraft/util/math/BlockPos;", "mutateProgress", "preInit", "kisman.cc"})
public final class Class237
extends Class91 {
    private final Class1996 Field9033;
    private final Class44 Field9034;
    private final Class1303 Field9035;
    private final Class1303 Field9036;
    private String Field9037 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public Class237 Method1307() {
        if (this.Method769() == null) return this;
        Class1996 class1996 = this.Method769();
        if (class1996 == null) return this;
        class1996.Method7406(this.Field9033);
        return this;
    }

    @Override
    public Object Method778() {
        return this.Method1307();
    }

    @NotNull
    @NotNull
    public Class237 Method1308() {
        this.Method780().Method24(this.Field9033);
        this.Method780().Method23(this.Field9034);
        this.Method780().Method25(this.Field9035);
        this.Method780().Method25(this.Field9036);
        return this;
    }

    @Override
    public Object Method779() {
        return this.Method1308();
    }

    public final double Method1309(double d) {
        double d2;
        if (this.Field9034.Method341() == Class419.Field9762) {
            Object object = ((Class187)this.Field9035.Method341()).Method849().Method1726(d);
            Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"normalMode.valEnum.task.doTask(progress)");
            d2 = ((Number)object).doubleValue();
            return d2;
        }
        Object object = ((Class1024)this.Field9036.Method341()).Method849().Method1726(d);
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"reverseMode.valEnum.task.doTask(progress)");
        d2 = ((Number)object).doubleValue();
        return d2;
    }

    @NotNull
    @NotNull
    public final AxisAlignedBB Method1310(@NotNull @NotNull AxisAlignedBB axisAlignedBB, double d) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, (String)"bb");
        AxisAlignedBB axisAlignedBB2 = Class815.Method3450(axisAlignedBB, this.Method1309(d));
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB2, (String)"Rendering.scale(bb, mutateProgress(progress))");
        return axisAlignedBB2;
    }

    @NotNull
    @NotNull
    public final AxisAlignedBB Method1311(@NotNull @NotNull BlockPos blockPos, double d) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, (String)"pos");
        AxisAlignedBB axisAlignedBB = Class815.Method3449(blockPos, this.Method1309(d));
        Intrinsics.checkExpressionValueIsNotNull((Object)axisAlignedBB, (String)"Rendering.scale(pos, mutateProgress(progress))");
        return axisAlignedBB;
    }

    public Class237(@NotNull @NotNull Class42 class42) {
        Class1303 class1303;
        Intrinsics.checkParameterIsNotNull((Object)class42, (String)"module");
        super(class42);
        this.Field9033 = this.Method776(new Class1996(new Class44("Easing", class42)));
        this.Field9034 = this.Field9033.Method7405(new Class44("Easing Mode", class42, Class419.Field9762));
        Class1303 class13032 = new Class1303("Easing Normal Mode", class42, Class187.Field8814).Method5300("Normal");
        Class237 class237 = this;
        boolean bl = false;
        boolean bl2 = false;
        Class1303 class13033 = class13032;
        boolean bl3 = false;
        this.Method774(class13033);
        this.Field9033.Method7407(class13033);
        class237.Field9035 = class1303 = class13032;
        class13032 = new Class1303("Easing Reverse Mode", class42, Class1024.Field12478).Method5300("Reverse");
        class237 = this;
        bl = false;
        bl2 = false;
        class13033 = class13032;
        bl3 = false;
        this.Method774(class13033);
        this.Field9033.Method7407(class13033);
        class237.Field9036 = class1303 = class13032;
    }

    private static String Method781(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 66;
            cArray2[n] = (char)(cArray[n] ^ (0x389A ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

