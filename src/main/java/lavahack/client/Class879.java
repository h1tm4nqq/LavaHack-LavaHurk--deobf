/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.TypeCastException
 *  kotlin.jvm.internal.Intrinsics
 */
package lavahack.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import lavahack.client.Class1276;
import lavahack.client.Class134;
import lavahack.client.Class1360;
import lavahack.client.Class1439;
import lavahack.client.Class1482;
import lavahack.client.Class1621;
import lavahack.client.Class1959;
import lavahack.client.Class2163;
import lavahack.client.Class277;
import lavahack.client.Class403;
import lavahack.client.Class438;
import lavahack.client.Class812;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 1, 13}, bv={1, 0, 3}, k=1, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2={"Lcom/kisman/cc/util/enums/ShadersShaders$Snow;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "updateUniforms", "", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "framebuffer", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "kisman.cc"})
final class Class879
extends Class2163 {
    private int Field11706;

    @Override
    public void Method1479(@NotNull @NotNull Class1482 class1482, @NotNull @NotNull Class134 class134) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, (String)"pattern");
        Intrinsics.checkParameterIsNotNull((Object)class134, (String)"framebuffer");
        Object object = class1482.Method5924();
        Object object2 = this.Method1489();
        boolean bl = false;
        Object object3 = object;
        boolean bl2 = false;
        if (!object3.containsKey(object2)) return;
        object = (Class1621)class1482.Method5924().get(this.Method1489());
        Iterator iterator = this.Method1484().iterator();
        while (iterator.hasNext()) {
            object2 = (Class812)iterator.next();
            if (((Class812)object2).Method3417() != null) {
                Boolean bl3;
                Object object4 = object;
                if (object4 != null && (object4 = (HashMap)((Class1621)object4).Method6308()) != null) {
                    object3 = (Map)object4;
                    Integer n = ((Class812)object2).Method3418();
                    boolean bl4 = false;
                    Map map = object3;
                    boolean bl5 = false;
                    bl3 = map.containsKey(n);
                } else {
                    bl3 = null;
                }
                if (bl3 == null) {
                    Intrinsics.throwNpe();
                }
                if (!bl3.booleanValue()) continue;
                Object v = ((HashMap)((Class1621)object).Method6308()).get(((Class812)object2).Method3418());
                if (v == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v, (String)"bind.second[uniform.index]!!");
                object3 = (Class403)v;
                if (((Class1439)object2).Method3413() instanceof Class1959) {
                    Class438 class438 = ((Class1439)object2).Method3413();
                    if (class438 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeInt");
                    }
                    ((Class1959)class438).Method648(((Class403)object3).Method1984().Method335());
                } else if (((Class1439)object2).Method3413() instanceof Class277) {
                    Class438 class438 = ((Class1439)object2).Method3413();
                    if (class438 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                    }
                    ((Class277)class438).Method648(Float.valueOf(((Class403)object3).Method1984().Method368()));
                } else if (((Class1439)object2).Method3413() instanceof Class1360) {
                    Class438 class438 = ((Class1439)object2).Method3413();
                    if (class438 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeBool");
                    }
                    ((Class1360)class438).Method648(((Class403)object3).Method1984().Method365());
                }
                Class438 class438 = ((Class1439)object2).Method3413();
                Object v2 = class134.Method912().get(((Class1439)object2).Method3414());
                if (v2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(v2, (String)"framebuffer.uniformsRaw[uniform.name]!!");
                class438.Method646(((Number)v2).intValue());
                continue;
            }
            if (this.Method1488() && Intrinsics.areEqual((Object)((Class1439)object2).Method3414(), (Object)"resolution")) {
                Object object5 = object2;
                if (object5 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.Uniform<com.kisman.cc.util.render.shader.uniform.type.types.TypeVec2Float>");
                }
                Class1276.Method5111((Class1439)object5);
                continue;
            }
            if (this.Method1487() && Intrinsics.areEqual((Object)((Class1439)object2).Method3414(), (Object)"texelSize")) {
                Float f;
                Float f2;
                Object object6 = object2;
                if (object6 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.Uniform<com.kisman.cc.util.render.shader.uniform.type.types.TypeVec2Float>");
                }
                Class1439 class1439 = (Class1439)object6;
                if (this.Method1490() == -1) {
                    f2 = Float.valueOf(1.0f);
                } else {
                    Class438 class438 = ((Class812)this.Method1484().get(this.Method1490())).Method3413();
                    if (class438 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                    }
                    f2 = (Float)((Class277)class438).Method647();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)f2, (String)"if(radiusIndex == -1) {\n\u2026                        }");
                float f3 = f2.floatValue();
                if (this.Method1491() == -1) {
                    f = Float.valueOf(1.0f);
                } else {
                    Class438 class438 = ((Class812)this.Method1484().get(this.Method1491())).Method3413();
                    if (class438 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                    }
                    f = (Float)((Class277)class438).Method647();
                }
                Intrinsics.checkExpressionValueIsNotNull((Object)f, (String)"if(qualityIndex == -1) {\u2026                        }");
                Class1276.Method5110(class1439, f3, f.floatValue());
                continue;
            }
            Intrinsics.areEqual((Object)((Class1439)object2).Method3414(), (Object)"time");
        }
    }

    Class879(String string, int n) {
    }

    private static String Method1492(String string) {
        if (string == null) throw new NullPointerException("String deobfuscation parameter should not be null");
        char[] cArray = string.toCharArray();
        char[] cArray2 = new char[cArray.length];
        int n = 0;
        while (n < cArray.length) {
            int cfr_ignored_0 = n & 0xFF;
            int n2 = 76;
            cArray2[n] = (char)(cArray[n] ^ (0x67DE ^ n2));
            ++n;
        }
        return new String(cArray2);
    }
}

