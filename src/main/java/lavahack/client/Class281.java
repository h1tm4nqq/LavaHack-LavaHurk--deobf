//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/enums/ShadersShaders$ItemGlow;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "updateUniforms", "", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "framebuffer", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "kisman.cc" })
final class Class281 extends Class2163
{
    private int Field9222;
    
    public void Method1479(@NotNull @NotNull final Class1482 class1482, @NotNull @NotNull final Class134 class1483) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, "pattern");
        Intrinsics.checkParameterIsNotNull((Object)class1483, "framebuffer");
    }
    
    Class281(final String s, final int n) {
        final String s2 = "itemglow.frag";
        final String s3 = "Item Glow";
        final Class812[] array = new Class812[13];
        array[0] = new Class812(null, Class1276.Method5108(), 0);
        array[1] = new Class812(null, Class1276.Method5109(1.0f, 1.0f), 1);
        array[2] = new Class812(null, Class1276.Method5112(), 2);
        array[3] = new Class812(null, new Class1439("image").Method3412((Class438)new Class2035()), 3);
        final int n2 = 4;
        final String s4 = "Color";
        final Class1439 class1439 = new Class1439("color");
        final Object method648 = new Class1694().Method648((Object)new Class824(1.0f, 1.0f, 1.0f));
        Intrinsics.checkExpressionValueIsNotNull(method648, "TypeVec3Float().set(Vec3f(1f, 1f, 1f))");
        array[n2] = new Class812(s4, class1439.Method3412((Class438)method648), 4);
        final int n3 = 5;
        final String s5 = "Divider";
        final Class1439 class1440 = new Class1439("divider");
        final Object method649 = new Class277().Method648((Object)Float.intBitsToFloat(1124859904));
        Intrinsics.checkExpressionValueIsNotNull(method649, "TypeFloat().set(140f)");
        array[n3] = new Class812(s5, class1440.Method3412((Class438)method649), 5);
        final int n4 = 6;
        final String s6 = "Radius";
        final Class1439 class1441 = new Class1439("radius");
        final Object method650 = new Class277().Method648((Object)1.0f);
        Intrinsics.checkExpressionValueIsNotNull(method650, "TypeFloat().set(1f)");
        array[n4] = new Class812(s6, class1441.Method3412((Class438)method650), 6);
        final int n5 = 7;
        final String s7 = "Max Sample";
        final Class1439 class1442 = new Class1439("maxSample");
        final Object method651 = new Class277().Method648((Object)Float.intBitsToFloat(1092616192));
        Intrinsics.checkExpressionValueIsNotNull(method651, "TypeFloat().set(10f)");
        array[n5] = new Class812(s7, class1442.Method3412((Class438)method651), 7);
        array[8] = new Class812("Blur", new Class1439("blur").Method3412((Class438)new Class1360()), 8);
        array[9] = new Class812("Mix", new Class1439("mixFactor").Method3412((Class438)new Class277()), 9);
        array[10] = new Class812("Alpha", new Class1439("minAlpha").Method3412((Class438)new Class277()), 10);
        array[11] = new Class812("Image Mix", new Class1439("imageMix").Method3412((Class438)new Class277()), 11);
        array[12] = new Class812("Use Image", new Class1439("useImage").Method3412((Class438)new Class1360()), 12);
        super(s, n, s2, s3, CollectionsKt.listOf((Object[])array), false, true, true, true, 0, 6, -1, (DefaultConstructorMarker)null);
    }
    
    private static String Method1492(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x2E26 ^ 0xF2));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
