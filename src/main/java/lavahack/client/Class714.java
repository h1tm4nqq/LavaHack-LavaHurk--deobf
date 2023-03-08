//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005?\u0006\u0002\u0010\u0002J6\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e?\u0006\u0002\n\u0000?\u0006\u0013" }, d2 = { "Lcom/kisman/cc/features/module/combat/autorer/render/AutoRerRenderer;", "Lcom/kisman/cc/util/render/pattern/SlideRendererPattern;", "()V", "lastSelfDamage", "", "lastTargetDamage", "onRenderWorld", "", "movingLength", "fadeLength", "alphaFadeLength", "renderer", "Lcom/kisman/cc/settings/util/RenderingRewritePattern;", "placeInfo", "Lcom/kisman/cc/features/module/combat/autorer/PlaceInfo;", "text", "", "reset", "update", "kisman.cc" })
public final class Class714 extends Class1352
{
    @JvmField
    public float Field11043;
    @JvmField
    public float Field11044;
    private String Field11045 = " TheKisDevs & LavaHack Development owns you, and I am sorry, because it is uncrackable <3";
    
    public void Method2988() {
        super.Method2988();
        this.Field11043 = 0.0f;
        this.Field11044 = 0.0f;
    }
    
    public final void Method3000(final float n, final float n2, final float n3, @NotNull @NotNull final Class1612 class1612, @NotNull @NotNull final Class204 class1613, final boolean b) {
        Intrinsics.checkParameterIsNotNull((Object)class1612, "renderer");
        Intrinsics.checkParameterIsNotNull((Object)class1613, "placeInfo");
        this.Method3001(class1613, class1612);
        Class714 class1614 = this;
        float n4 = n;
        float n5 = n2;
        float n6 = n3;
        Class1612 class1615 = class1612;
        String s4;
        if (b) {
            final StringBuilder sb = new StringBuilder();
            final StringBuilder sb3;
            final StringBuilder sb2 = sb3 = sb;
            final String s = "%.1f";
            final Object[] array = { this.Field11044 };
            final StringBuilder sb4 = sb3;
            final String format = s;
            final Object[] original = array;
            final String format2 = String.format(format, Arrays.copyOf(original, original.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)format2, "java.lang.String.format(this, *args)");
            sb4.append(format2);
            if (sb2.length() > 0) {}
            final StringBuilder sb5 = sb2;
            final String s2 = "%.1f";
            final Object[] array2 = { this.Field11043 };
            final StringBuilder sb6 = sb5;
            final String format3 = s2;
            final Object[] original2 = array2;
            final String format4 = String.format(format3, Arrays.copyOf(original2, original2.length));
            Intrinsics.checkExpressionValueIsNotNull((Object)format4, "java.lang.String.format(this, *args)");
            sb6.append(format4);
            final String string = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull((Object)string, "StringBuilder().apply(builderAction).toString()");
            final String s3 = string;
            class1614 = this;
            n4 = n;
            n5 = n2;
            n6 = n3;
            class1615 = class1612;
            s4 = s3;
        }
        else {
            s4 = null;
        }
        class1614.Method2992(n4, n5, n6, class1615, s4);
    }
    
    public final void Method3001(@NotNull @NotNull final Class204 class204, @NotNull @NotNull final Class1612 class205) {
        Intrinsics.checkParameterIsNotNull((Object)class204, "placeInfo");
        Intrinsics.checkParameterIsNotNull((Object)class205, "renderer");
        this.Method2998(class204.Method1203(), class205);
        if (!Float.isNaN(class204.Method1205()) && !Float.isNaN(class204.Method1207())) {
            this.Field11043 = class204.Method1205();
            this.Field11044 = class204.Method1207();
        }
        else {
            this.Field11043 = 0.0f;
            this.Field11044 = 0.0f;
        }
    }
    
    private static String Method2999(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x4036 ^ 0x36));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
