//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\hitmanqq\Documents\Decompiler\mappings"!

//Decompiled by Procyon!

package lavahack.client;

import org.jetbrains.annotations.*;
import kotlin.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 1, 13 }, bv = { 1, 0, 3 }, k = 1, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016?\u0006\b" }, d2 = { "Lcom/kisman/cc/util/enums/ShadersShaders$Snow;", "Lcom/kisman/cc/util/enums/ShadersShaders;", "updateUniforms", "", "pattern", "Lcom/kisman/cc/settings/util/ShadersRendererPattern;", "framebuffer", "Lcom/kisman/cc/util/render/shader/framebuffer/FramebufferShader;", "kisman.cc" })
final class Class879 extends Class2163
{
    private int Field11706;
    
    public void Method1479(@NotNull @NotNull final Class1482 class1482, @NotNull @NotNull final Class134 class1483) {
        Intrinsics.checkParameterIsNotNull((Object)class1482, "pattern");
        Intrinsics.checkParameterIsNotNull((Object)class1483, "framebuffer");
        if (class1482.Method5924().containsKey(this.Method1489())) {
            final Class1621 class1484 = class1482.Method5924().get(this.Method1489());
            for (final Class812 class1485 : this.Method1484()) {
                if (class1485.Method3417() != null) {
                    final Class1621 class1486 = class1484;
                    Boolean value = null;
                    Boolean b = null;
                    Label_0166: {
                        if (class1486 != null) {
                            final HashMap hashMap = (HashMap)class1486.Method6308();
                            if (hashMap != null) {
                                b = (value = hashMap.containsKey(class1485.Method3418()));
                                break Label_0166;
                            }
                        }
                        b = (value = null);
                    }
                    if (value == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!b) {
                        continue;
                    }
                    final Object value2 = ((HashMap)class1484.Method6308()).get(class1485.Method3418());
                    if (value2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(value2, "bind.second[uniform.index]!!");
                    final Class403 class1487 = (Class403)value2;
                    if (class1485.Method3413() instanceof Class1959) {
                        final Class438 method3413 = class1485.Method3413();
                        if (method3413 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeInt");
                        }
                        ((Class1959)method3413).Method648((Object)class1487.Method1984().Method335());
                    }
                    else if (class1485.Method3413() instanceof Class277) {
                        final Class438 method3414 = class1485.Method3413();
                        if (method3414 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                        }
                        ((Class277)method3414).Method648((Object)class1487.Method1984().Method368());
                    }
                    else if (class1485.Method3413() instanceof Class1360) {
                        final Class438 method3415 = class1485.Method3413();
                        if (method3415 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeBool");
                        }
                        ((Class1360)method3415).Method648((Object)class1487.Method1984().Method365());
                    }
                    final Class438 method3416 = class1485.Method3413();
                    final Object value3 = class1483.Method912().get(class1485.Method3414());
                    if (value3 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(value3, "framebuffer.uniformsRaw[uniform.name]!!");
                    method3416.Method646(((Number)value3).intValue());
                }
                else if (this.Method1488() && Intrinsics.areEqual((Object)class1485.Method3414(), (Object)"resolution")) {
                    final Class812 class1488 = class1485;
                    if (class1488 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.Uniform<com.kisman.cc.util.render.shader.uniform.type.types.TypeVec2Float>");
                    }
                    Class1276.Method5111((Class1439)class1488);
                }
                else if (this.Method1487() && Intrinsics.areEqual((Object)class1485.Method3414(), (Object)"texelSize")) {
                    final Class812 class1489 = class1485;
                    if (class1489 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.Uniform<com.kisman.cc.util.render.shader.uniform.type.types.TypeVec2Float>");
                    }
                    final Class1439 class1490 = (Class1439)class1489;
                    Float value4;
                    Float n;
                    if (this.Method1490() == -1) {
                        n = (value4 = 1.0f);
                    }
                    else {
                        final Class438 method3417 = this.Method1484().get(this.Method1490()).Method3413();
                        if (method3417 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                        }
                        n = (value4 = (Float)((Class277)method3417).Method647());
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)value4, "if(radiusIndex == -1) {\n\u2026                        }");
                    final float floatValue = n;
                    Float value5;
                    Float n2;
                    if (this.Method1491() == -1) {
                        n2 = (value5 = 1.0f);
                    }
                    else {
                        final Class438 method3418 = this.Method1484().get(this.Method1491()).Method3413();
                        if (method3418 == null) {
                            throw new TypeCastException("null cannot be cast to non-null type com.kisman.cc.util.render.shader.uniform.type.types.TypeFloat");
                        }
                        n2 = (value5 = (Float)((Class277)method3418).Method647());
                    }
                    Intrinsics.checkExpressionValueIsNotNull((Object)value5, "if(qualityIndex == -1) {\u2026                        }");
                    Class1276.Method5110(class1490, floatValue, (float)n2);
                }
                else {
                    Intrinsics.areEqual((Object)class1485.Method3414(), (Object)"time");
                }
            }
        }
    }
    
    Class879(final String s, final int n) {
        super(s, n, "snow.frag", "Snow", CollectionsKt.listOf((Object[])new Class812[] { new Class812((String)null, Class1276.Method5108(), 0), new Class812((String)null, new Class1439("time").Method3412((Class438)new Class277()), 1), new Class812((String)null, Class1276.Method5112(), 2), new Class812("Mouse", new Class1439("mouse").Method3412((Class438)new Class277()), 3) }), true, true, false, true, 1, -1, -1, (DefaultConstructorMarker)null);
    }
    
    private static String Method1492(final String s) {
        if (s != null) {
            final char[] charArray = s.toCharArray();
            final char[] value = new char[charArray.length];
            for (int i = 0; i < charArray.length; ++i) {
                value[i] = (char)(charArray[i] ^ (0x67DE ^ 0x4C));
            }
            return new String(value);
        }
        throw new NullPointerException("String deobfuscation parameter should not be null");
    }
}
