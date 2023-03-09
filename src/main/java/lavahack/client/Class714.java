/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmField
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.BlockPos
 */
package lavahack.client;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1352;
import lavahack.client.Class1612;
import lavahack.client.Class204;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/kisman/cc/features/module/combat/autorer/render/AutoRerRenderer;", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "()V", "lastSelfDamage", "", "lastTargetDamage", "onRenderWorld", "", "movingLength", "fadeLength", "alphaFadeLength", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "placeInfo", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "text", "", "reset", "update", "kisman.cc"})
public final class Class714
extends Class1352 {
    @JvmField
    public float Field11043;
    @JvmField
    public float Field11044;
    private String Field11045 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @Override
    public void Method2988() {
        super.Method2988();
        this.Field11043 = 0.0f;
        this.Field11044 = 0.0f;
    }

    public final void Method3000(float f, float f2, float f3, @NotNull @NotNull Class1612 class1612, @NotNull @NotNull Class204 class204, boolean bl) {
        String string;
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        Intrinsics.checkParameterIsNotNull((Object)class204, (String)"placeInfo");
        this.Method3001(class204, class1612);
        Class714 class714 = this;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        Class1612 class16122 = class1612;
        if (bl) {
            Class1612 class16123 = class16122;
            float f7 = f6;
            float f8 = f5;
            float f9 = f4;
            Class714 class7142 = class714;
            boolean bl2 = false;
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl3 = false;
            boolean bl4 = false;
            StringBuilder stringBuilder2 = stringBuilder;
            boolean bl5 = false;
            CharSequence charSequence = "%.1f";
            Object[] objectArray = new Object[]{Float.valueOf(this.Field11044)};
            StringBuilder stringBuilder3 = stringBuilder2;
            boolean bl6 = false;
            String string2 = String.format((String)charSequence, Arrays.copyOf(objectArray, objectArray.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)string2, (String)"java.lang.String.format(this, *args)");
            String string3 = string2;
            stringBuilder3.append(string3);
            charSequence = stringBuilder2;
            boolean bl7 = false;
            boolean bl8 = charSequence.length() > 0;
            charSequence = "%.1f";
            Object[] objectArray2 = new Object[]{Float.valueOf(this.Field11043)};
            stringBuilder3 = stringBuilder2;
            bl6 = false;
            String string4 = String.format((String)charSequence, Arrays.copyOf(objectArray2, objectArray2.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)string4, (String)"java.lang.String.format(this, *args)");
            string3 = string4;
            stringBuilder3.append(string3);
            String string5 = stringBuilder.toString();
            Intrinsics.checkExpressionValueIsNotNull((Object)string5, (String)"StringBuilder().apply(builderAction).toString()");
            String string6 = string5;
            class714 = class7142;
            f4 = f9;
            f5 = f8;
            f6 = f7;
            class16122 = class16123;
            string = string6;
        } else {
            string = null;
        }
        class714.Method2992(f4, f5, f6, class16122, string);
    }

    public final void Method3001(@NotNull @NotNull Class204 class204, @NotNull @NotNull Class1612 class1612) {
        Intrinsics.checkParameterIsNotNull((Object)class204, (String)"placeInfo");
        Intrinsics.checkParameterIsNotNull((Object)class1612, (String)"renderer");
        BlockPos blockPos = class204.Method1203();
        this.Method2998(blockPos, class1612);
        float f = class204.Method1205();
        boolean bl = false;
        if (!Float.isNaN(f)) {
            f = class204.Method1207();
            bl = false;
            if (!Float.isNaN(f)) {
                this.Field11043 = class204.Method1205();
                this.Field11044 = class204.Method1207();
                return;
            }
        }
        this.Field11043 = 0.0f;
        this.Field11044 = 0.0f;
    }

    private static String Method2999(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 54;
            cArray2[n] = (char)(cArray[n] ^ (0x4036 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

