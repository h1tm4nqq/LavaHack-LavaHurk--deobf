//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  net.minecraft.util.math.Vec2f
 */
package lavahack.client;

import com.kisman.cc.util.Class2142;
import com.kisman.cc.util.Class886;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1439;
import lavahack.client.Class1469;
import lavahack.client.Class1959;
import lavahack.client.Class438;
import net.minecraft.util.math.Vec2f;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=2, d1={"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001\u00a8\u0006\u000b"}, d2={"resolution", "Lcom/kisman/cc/util/render/shader/uniform/Uniform;", "Lcom/kisman/cc/util/render/shader/uniform/type/types/TypeVec2Float;", "uniform", "resolutionUniform", "texelUniform", "radius", "", "quality", "textureUniform", "Lcom/kisman/cc/util/render/shader/uniform/type/types/TypeInt;", "kisman.cc"})
public final class Class1276 {
    private String Field13753 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";

    @NotNull
    @NotNull
    public static final Class1439 Method5108() {
        return new Class1439("texture").Method3412(new Class1959());
    }

    @NotNull
    @NotNull
    public static final Class1439 Method5109(float f, float f2) {
        Class1439 class1439 = new Class1439("texelSize");
        Object object = new Class1469().Method648(new Vec2f(1.0f / (float)Class2142.Field17803.displayWidth * (f * f2), 1.0f / (float)Class2142.Field17803.displayHeight * (f * f2)));
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"TypeVec2Float().set(Vec2\u2026(radius * quality)\n    ))");
        return class1439.Method3412((Class438)object);
    }

    @NotNull
    @NotNull
    public static final Class1439 Method5110(@NotNull @NotNull Class1439 class1439, float f, float f2) {
        Intrinsics.checkParameterIsNotNull((Object)class1439, (String)"uniform");
        ((Class1469)class1439.Method3413()).Method648(new Vec2f(1.0f / (float)Class2142.Field17803.displayWidth * (f * f2), 1.0f / (float)Class2142.Field17803.displayHeight * (f * f2)));
        return class1439;
    }

    @NotNull
    @NotNull
    public static final Class1439 Method5111(@NotNull @NotNull Class1439 class1439) {
        Intrinsics.checkParameterIsNotNull((Object)class1439, (String)"uniform");
        ((Class1469)class1439.Method3413()).Method648(new Vec2f((float)Class886.Method3707().getScaledWidth(), (float)Class886.Method3707().getScaledHeight()));
        return class1439;
    }

    @NotNull
    @NotNull
    public static final Class1439 Method5112() {
        Class1439 class1439 = new Class1439("resolution");
        Object object = new Class1469().Method648(new Vec2f((float)Class886.Method3707().getScaledWidth(), (float)Class886.Method3707().getScaledHeight()));
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"TypeVec2Float().set(Vec2\u2026edHeight.toFloat()\n    ))");
        return class1439.Method3412((Class438)object);
    }

    private static String Method5113(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 158;
            cArray2[n] = (char)(cArray[n] ^ (0x3E6E ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

