//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003?\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0000H\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0018\u001a\u00020\u0000H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004?\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004?\u0006\u0002\n\u0000?\u0006\u0019" }, d2 = { "Lcom/kisman/cc/settings/util/EasingsPattern;", "Lcom/kisman/cc/settings/util/AbstractPattern;", "module", "Lcom/kisman/cc/features/module/Module;", "(Lcom/kisman/cc/features/module/Module;)V", "group_", "Lcom/kisman/cc/settings/types/SettingGroup;", "mode", "Lcom/kisman/cc/settings/Setting;", "normalMode", "Lcom/kisman/cc/settings/types/SettingEnum;", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$Easing;", "reverseMode", "Lcom/kisman/cc/util/enums/dynamic/EasingEnum$EasingReverse;", "init", "mutateBB", "Lnet/minecraft/util/math/AxisAlignedBB;", "bb", "progress", "", "mutateBlockBB", "pos", "Lnet/minecraft/util/math/BlockPos;", "mutateProgress", "preInit", "kisman.cc" })
public final class Class237 extends Class91
{
    private final Class1996 Field9033;
    private final Class44 Field9034;
    private final Class1303 Field9035;
    private final Class1303 Field9036;
    private String Field9037 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public Class237 Method1307() {
        if (this.Method769() != null) {
            final Class1996 method769 = this.Method769();
            if (method769 != null) {
                method769.Method7406(this.Field9033);
            }
        }
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
    
    public final double Method1309(final double n) {
        double n2;
        if (this.Field9034.Method341() == Class419.Field9762) {
            final Object method1726 = ((Class187)this.Field9035.Method341()).Method849().Method1726(new Object[] { n });
            Intrinsics.checkExpressionValueIsNotNull(method1726, "normalMode.valEnum.task.doTask(progress)");
            n2 = ((Number)method1726).doubleValue();
        }
        else {
            final Object method1727 = ((Class1024)this.Field9036.Method341()).Method849().Method1726(new Object[] { n });
            Intrinsics.checkExpressionValueIsNotNull(method1727, "reverseMode.valEnum.task.doTask(progress)");
            n2 = ((Number)method1727).doubleValue();
        }
        return n2;
    }
    
    @NotNull
    @NotNull
    public final AxisAlignedBB Method1310(@NotNull @NotNull final AxisAlignedBB axisAlignedBB, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)axisAlignedBB, "bb");
        final AxisAlignedBB method3450 = Class815.Method3450(axisAlignedBB, this.Method1309(n));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3450, "Rendering.scale(bb, mutateProgress(progress))");
        return method3450;
    }
    
    @NotNull
    @NotNull
    public final AxisAlignedBB Method1311(@NotNull @NotNull final BlockPos blockPos, final double n) {
        Intrinsics.checkParameterIsNotNull((Object)blockPos, "pos");
        final AxisAlignedBB method3449 = Class815.Method3449(blockPos, this.Method1309(n));
        Intrinsics.checkExpressionValueIsNotNull((Object)method3449, "Rendering.scale(pos, mutateProgress(progress))");
        return method3449;
    }
    
    public Class237(@NotNull @NotNull final Class42 class42) {
        Intrinsics.checkParameterIsNotNull((Object)class42, "module");
        super(class42);
        this.Field9033 = this.Method776(new Class1996(new Class44("Easing", class42)));
        this.Field9034 = this.Field9033.Method7405(new Class44("Easing Mode", class42, Class419.Field9762));
        final Class1303 method5300;
        final Class1303 field9035 = method5300 = new Class1303("Easing Normal Mode", class42, (Enum)Class187.Field8814).Method5300("Normal");
        this.Method774(method5300);
        this.Field9033.Method7407(method5300);
        this.Field9035 = field9035;
        final Class1303 method5301;
        final Class1303 field9036 = method5301 = new Class1303("Easing Reverse Mode", class42, (Enum)Class1024.Field12478).Method5300("Reverse");
        this.Method774(method5301);
        this.Field9033.Method7407(method5301);
        this.Field9036 = field9036;
    }
    
    private static String Method781(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x389A ^ 0x42));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
