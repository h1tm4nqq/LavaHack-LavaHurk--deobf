//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.client.Minecraft
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.text.TextFormatting
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Text
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 */
package lavahack.client;

import com.kisman.cc.util.Class2027;
import com.kisman.cc.util.Class650;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1172;
import lavahack.client.Class1178;
import lavahack.client.Class1249;
import lavahack.client.Class1358;
import lavahack.client.Class1578;
import lavahack.client.Class1946;
import lavahack.client.Class42;
import lavahack.client.Class44;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2={"Lcom/kisman/cc/features/hud/modules/Speed;", "Lcom/kisman/cc/features/hud/HudModule;", "()V", "astolfo", "Lcom/kisman/cc/settings/Setting;", "kotlin.jvm.PlatformType", "color", "prevPosX", "", "prevPosZ", "speedUnit", "timer", "Lcom/kisman/cc/util/TimerUtils;", "getTimer", "()Lcom/kisman/cc/util/TimerUtils;", "onEnable", "", "onRender", "event", "Lnet/minecraftforge/client/event/RenderGameOverlayEvent$Text;", "kisman.cc"})
public final class Class2141
extends Class1249 {
    private final Class44 Field17796 = this.Method23(new Class44("Astolfo", (Class42)this, true));
    private final Class44 Field17797 = this.Method23(new Class44("Color", (Class42)this, new Class2027(255, 255, 255, 255)));
    private final Class44 Field17798 = this.Method23(new Class44("Speed Unit", (Class42)this, Class1358.Field14187));
    @NotNull
    private final Class650 Field17799 = new Class650();
    private double Field17800;
    private double Field17801;
    private String Field17802 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public final Class650 Method7712() {
        return this.Field17799;
    }

    @Override
    public void Method38() {
        super.Method38();
        this.Field17799.Method2801();
    }

    @SubscribeEvent
    @SubscribeEvent
    public final void Method7713(@NotNull @NotNull RenderGameOverlayEvent.Text text) {
        int n;
        String string;
        Intrinsics.checkParameterIsNotNull((Object)text, (String)"event");
        if (this.Field17799.Method2797(1000L)) {
            this.Field17800 = Class2141.Method7714().player.prevPosX;
            this.Field17801 = Class2141.Method7714().player.prevPosZ;
        }
        double d = Class2141.Method7714().player.posX - this.Field17800;
        double d2 = Class2141.Method7714().player.posZ - this.Field17801;
        float f = MathHelper.sqrt((double)(d * d + d2 * d2));
        Class44 class44 = this.Field17798;
        Intrinsics.checkExpressionValueIsNotNull((Object)class44, (String)"speedUnit");
        Enum enum_ = class44.Method341();
        if (enum_ == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        switch (Class1946.Field16995[((Class1358)enum_).ordinal()]) {
            case 1: {
                Class44 class442 = this.Field17798;
                Intrinsics.checkExpressionValueIsNotNull((Object)class442, (String)"speedUnit");
                Enum enum_2 = class442.Method341();
                if (enum_2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
                }
                String string2 = ((Class1358)enum_2).Method5426().format(Float.valueOf(f * (float)20));
                string = string2;
                Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"(speedUnit.valEnum as Sp\u2026r.format((distance * 20))");
                break;
            }
            case 2: {
                Class44 class443 = this.Field17798;
                Intrinsics.checkExpressionValueIsNotNull((Object)class443, (String)"speedUnit");
                Enum enum_3 = class443.Method341();
                if (enum_3 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
                }
                double d3 = (double)(f / (float)1000) / Double.longBitsToDouble(4534316178428997170L);
                DecimalFormat decimalFormat = ((Class1358)enum_3).Method5426();
                boolean bl = false;
                double d4 = Math.floor(d3);
                String string3 = decimalFormat.format(d4);
                string = string3;
                Intrinsics.checkExpressionValueIsNotNull((Object)string3, (String)"(speedUnit.valEnum as Sp\u2026/ 1000) / (0.05 / 3600)))");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        String string4 = string;
        StringBuilder stringBuilder = new StringBuilder().append("Speed: ").append(TextFormatting.GRAY).append(string4).append(' ');
        Class44 class444 = this.Field17798;
        Intrinsics.checkExpressionValueIsNotNull((Object)class444, (String)"speedUnit");
        Enum enum_4 = class444.Method341();
        if (enum_4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.enums.SpeedUnits");
        }
        String string5 = stringBuilder.append(((Class1358)enum_4).Method5427()).toString();
        double d5 = this.Method267();
        double d6 = this.Method268();
        Class44 class445 = this.Field17796;
        Intrinsics.checkExpressionValueIsNotNull((Object)class445, (String)"astolfo");
        if (class445.Method365()) {
            n = Class1172.Method4709(100, 100);
        } else {
            Class44 class446 = this.Field17797;
            Intrinsics.checkExpressionValueIsNotNull((Object)class446, (String)"color");
            Class2027 class2027 = class446.Method339();
            Intrinsics.checkExpressionValueIsNotNull((Object)class2027, (String)"color.colour");
            n = class2027.Method3626();
        }
        Class1178.Method4745(string5, d5, d6, n);
        this.Method273(Class1178.Method4741(string5));
        this.Method274(Class1178.Method4748());
    }

    public Class2141() {
        super("Speed", "Displays your current speed.", true);
        super.Method44(new Class1578(this));
    }

    public static final Minecraft Method7714() {
        return Class1249.Field13656;
    }

    public static final void Method7715(Minecraft minecraft) {
        Class1249.Field13656 = minecraft;
    }

    public static final Class44 Method7716(Class2141 class2141) {
        return class2141.Field17798;
    }

    private static String Method57(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 125;
            cArray2[n] = (char)(cArray[n] ^ (0x5CE8 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

