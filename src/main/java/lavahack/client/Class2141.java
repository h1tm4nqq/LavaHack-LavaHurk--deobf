//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import net.minecraftforge.client.event.*;
import kotlin.jvm.internal.*;
import net.minecraft.util.math.*;
import kotlin.*;
import net.minecraft.util.text.*;
import com.kisman.cc.util.*;
import net.minecraftforge.fml.common.eventhandler.*;
import java.util.function.*;
import net.minecraft.client.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e?\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004?\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f?\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e?\u0006\u0014" }, d2 = { "Lcom/kisman/cc/features/hud/modules/Speed;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "prevPosX", "", "prevPosZ", "speedUnit", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc" })
public final class Class2141 extends Class1249
{
    private final Class44 Field17796;
    private final Class44 Field17797;
    private final Class44 Field17798;
    @NotNull
    private final Class650 Field17799;
    private double Field17800;
    private double Field17801;
    private String Field17802 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    @NotNull
    @NotNull
    public final Class650 Method7712() {
        return this.Field17799;
    }
    
    public void Method38() {
        super.Method38();
        this.Field17799.Method2801();
    }
    
    @SubscribeEvent
    @SubscribeEvent
    public final void Method7713(@NotNull @NotNull final RenderGameOverlayEvent$Text renderGameOverlayEvent$Text) {
        Intrinsics.checkParameterIsNotNull((Object)renderGameOverlayEvent$Text, "event");
        if (this.Field17799.Method2797(1000L)) {
            this.Field17800 = Method7714().player.prevPosX;
            this.Field17801 = Method7714().player.prevPosZ;
        }
        final double n = Method7714().player.posX - this.Field17800;
        final double n2 = Method7714().player.posZ - this.Field17801;
        final float sqrt = MathHelper.sqrt(n * n + n2 * n2);
        final Class44 field17798 = this.Field17798;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17798, "speedUnit");
        final Enum method341 = field17798.Method341();
        if (method341 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        String str = null;
        switch (Class1946.Field16995[((Class1358)method341).ordinal()]) {
            case 1: {
                final Class44 field17799 = this.Field17798;
                Intrinsics.checkExpressionValueIsNotNull((Object)field17799, "speedUnit");
                final Enum method342 = field17799.Method341();
                if (method342 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)(str = ((Class1358)method342).Method5426().format(sqrt * 20)), "(speedUnit.valEnum as Sp\u2026r.format((distance * 20))");
                break;
            }
            case 2: {
                final Class44 field17800 = this.Field17798;
                Intrinsics.checkExpressionValueIsNotNull((Object)field17800, "speedUnit");
                final Enum method343 = field17800.Method341();
                if (method343 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)(str = ((Class1358)method343).Method5426().format(Math.floor(sqrt / 1000 / Double.longBitsToDouble(4534316178428997170L)))), "(speedUnit.valEnum as Sp\u2026/ 1000) / (0.05 / 3600)))");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        final StringBuilder append = new StringBuilder().append("Speed: ").append(TextFormatting.GRAY).append(str).append(' ');
        final Class44 field17801 = this.Field17798;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17801, "speedUnit");
        final Enum method344 = field17801.Method341();
        if (method344 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        final String string = append.append(((Class1358)method344).Method5427()).toString();
        final double method345 = this.Method267();
        final double method346 = this.Method268();
        final Class44 field17802 = this.Field17796;
        Intrinsics.checkExpressionValueIsNotNull((Object)field17802, "astolfo");
        int n3;
        if (field17802.Method365()) {
            n3 = Class1172.Method4709(100, 100);
        }
        else {
            final Class44 field17803 = this.Field17797;
            Intrinsics.checkExpressionValueIsNotNull((Object)field17803, "color");
            final Class2027 method347 = field17803.Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)method347, "color.colour");
            n3 = method347.Method3626();
        }
        Class1178.Method4745(string, method345, method346, n3);
        this.Method273((double)Class1178.Method4741(string));
        this.Method274((double)Class1178.Method4748());
    }
    
    public Class2141() {
        super("Speed", "Displays your current speed.", true);
        this.Field17796 = this.Method23(new Class44("Astolfo", (Class42)this, true));
        this.Field17797 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
        this.Field17798 = this.Method23(new Class44("Speed Unit", (Class42)this, (Enum)Class1358.Field14187));
        this.Field17799 = new Class650();
        super.Method44((Supplier)new Class1578(this));
    }
    
    public static final Minecraft Method7714() {
        return Class1249.Field13656;
    }
    
    public static final void Method7715(final Minecraft field13656) {
        Class1249.Field13656 = field13656;
    }
    
    public static final Class44 Method7716(final Class2141 class2141) {
        return class2141.Field17798;
    }
    
    private static String Method57(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x5CE8 ^ 0x7D));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
