/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1276;
import lavahack.client.Class134;
import lavahack.client.Class1360;
import lavahack.client.Class1439;
import lavahack.client.Class1482;
import lavahack.client.Class1694;
import lavahack.client.Class2035;
import lavahack.client.Class2163;
import lavahack.client.Class277;
import lavahack.client.Class438;
import lavahack.client.Class812;
import lavahack.client.Class824;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/ShadersShaders$ItemGlow;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "updateUniforms", "", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "framebuffer", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "kisman.cc"})
final class Class281
extends Class2163 {
    private int Field9222;

    @Override
    public void Method1479(@NotNull @NotNull Class1482 class1482, @NotNull @NotNull Class134 class134) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, (String)"pattern");
        Intrinsics.checkParameterIsNotNull((Object)class134, (String)"framebuffer");
    }

    Class281(String string, int n) {
        Object[] objectArray = new Class812[13];
        objectArray[0] = new Class812(null, Class1276.Method5108(), 0);
        objectArray[1] = new Class812(null, Class1276.Method5109(1.0f, 1.0f), 1);
        objectArray[2] = new Class812(null, Class1276.Method5112(), 2);
        objectArray[3] = new Class812(null, new Class1439("image").Method3412(new Class2035()), 3);
        Class1439 class1439 = new Class1439("color");
        Object object = new Class1694().Method648(new Class824(1.0f, 1.0f, 1.0f));
        Intrinsics.checkExpressionValueIsNotNull((Object)object, (String)"TypeVec3Float().set(Vec3f(1f, 1f, 1f))");
        objectArray[4] = new Class812("Color", class1439.Method3412((Class438)object), 4);
        Class1439 class14392 = new Class1439("divider");
        Object object2 = new Class277().Method648(Float.valueOf(Float.intBitsToFloat(1124859904)));
        Intrinsics.checkExpressionValueIsNotNull((Object)object2, (String)"TypeFloat().set(140f)");
        objectArray[5] = new Class812("Divider", class14392.Method3412((Class438)object2), 5);
        Class1439 class14393 = new Class1439("radius");
        Object object3 = new Class277().Method648(Float.valueOf(1.0f));
        Intrinsics.checkExpressionValueIsNotNull((Object)object3, (String)"TypeFloat().set(1f)");
        objectArray[6] = new Class812("Radius", class14393.Method3412((Class438)object3), 6);
        Class1439 class14394 = new Class1439("maxSample");
        Object object4 = new Class277().Method648(Float.valueOf(Float.intBitsToFloat(1092616192)));
        Intrinsics.checkExpressionValueIsNotNull((Object)object4, (String)"TypeFloat().set(10f)");
        objectArray[7] = new Class812("Max Sample", class14394.Method3412((Class438)object4), 7);
        objectArray[8] = new Class812("Blur", new Class1439("blur").Method3412(new Class1360()), 8);
        objectArray[9] = new Class812("Mix", new Class1439("mixFactor").Method3412(new Class277()), 9);
        objectArray[10] = new Class812("Alpha", new Class1439("minAlpha").Method3412(new Class277()), 10);
        objectArray[11] = new Class812("Image Mix", new Class1439("imageMix").Method3412(new Class277()), 11);
        objectArray[12] = new Class812("Use Image", new Class1439("useImage").Method3412(new Class1360()), 12);
    }

    private static String Method1492(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 242;
            cArray2[n] = (char)(cArray[n] ^ (0x2E26 ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

